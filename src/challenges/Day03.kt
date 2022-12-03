package challenges

import utils.readInput

private const val LABEL = "Day03"

fun main() {
    fun part1(rucksacks: List<String>): Int {
        return rucksacks.size
    }

    fun part2(rucksacks: List<String>): Int {
        return rucksacks.size
    }

    // Reading input
    val testRucksacks = readInput("${LABEL}_test")
    val rucksacks = readInput(LABEL)

    // Part 1
    check(part1(testRucksacks) == 1)
    println(part1(rucksacks))

    // Part 2
    check(part2(testRucksacks) == 1)
    println(part2(rucksacks))
}
