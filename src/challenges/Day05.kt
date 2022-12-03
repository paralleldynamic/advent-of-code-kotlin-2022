package challenges

import utils.readInput

private const val LABEL = "Day05"

fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // Reading input
    val testInput = readInput("{$LABEL}_test")
    val input = readInput(LABEL)

    // Part 1
    check(part1(testInput) == 1)
    println(part1(input))

    // Part 2
    check(part2(testInput) == 1)
    println(part2(input))
}
