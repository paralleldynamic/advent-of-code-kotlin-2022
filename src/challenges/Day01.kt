package challenges

import utils.splitInput

fun main() {
    fun countElfInventory(input: List<String>): List<Int> = input
            .map{ elf -> elf.trim().split("\n") }
            .map{ bundle -> bundle.map{ s -> s.toInt() } }
            .map{ bundle -> bundle.sum() }

    fun part1(elves: List<Int>): Int = elves.max()

    fun part2(elves: List<Int>): Int = elves
        .sortedDescending()
        .subList(0, 3)
        .sum()

    // Part 1
    val testInput = splitInput("Day01_test")
    val testElves = countElfInventory(testInput)
    check(part1(testElves) == 24000)

    val input = splitInput("Day01")
    val elves = countElfInventory(input)
    println(part1(elves))

    // Part 2
    check(part2(testElves) == 45000)
    println(part2(elves))
}
