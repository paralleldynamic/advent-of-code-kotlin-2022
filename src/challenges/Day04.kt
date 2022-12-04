package challenges

import utils.readInput

private const val LABEL = "Day04"

fun checkContains(sections: List<String>): Boolean {
    val (first_lower, first_upper) = sections.first().split("-").map { bound -> bound.toInt() }
    val (second_lower, second_upper) = sections.last().split("-").map { bound -> bound.toInt() }
    return (first_lower <= second_lower && first_upper >= second_upper)
            || (first_lower >= second_lower && first_upper <= second_upper)
}

fun checkOverlap(sections: List<String>): Boolean {
    val (first_lower, first_upper) = sections.first().split("-").map { bound -> bound.toInt() }
    val (second_lower, second_upper) = sections.last().split("-").map { bound -> bound.toInt() }
    return second_lower <= first_upper && first_lower <= second_upper
}

fun main() {
    fun part1(sections: List<String>): Int = sections
        .map { pair -> pair.split(",") }
        .map { sections -> checkContains(sections) }
        .count { it }

    fun part2(sections: List<String>): Int = sections
        .map { pair -> pair.split(",") }
        .map { sections -> checkContains(sections) || checkOverlap(sections) }
        .count { it }

    // Reading input
    val testSections = readInput("${LABEL}_test")
    val sections = readInput(LABEL)

    // Part 1
    check(part1(testSections) == 2)
    println(part1(sections))

    // Part 2
    check(part2(testSections) == 4)
    println(part2(sections))
}
