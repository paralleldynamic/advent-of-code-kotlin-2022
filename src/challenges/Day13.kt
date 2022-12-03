package challenges

import utils.readInput

const val challengeLabel: String = "Day03"

fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // Reading input
    val testInput = readInput("{$challengeLabel}_test")
    val input = readInput(challengeLabel)

    // Part 1
    check(part1(testInput) == 1)
    println(part1(input))

    // Part 2
    check(part2(testInput) == 1)
    println(part2(input))
}
