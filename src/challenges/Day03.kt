package challenges

import utils.readInput

private const val LABEL = "Day03"
private const val SCORES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"

fun scoreCompartments(rucksack: String): Int {
    val mid: Int = rucksack.length / 2
    val (first, second) = rucksack.chunked((mid)).map{ compartment -> compartment.toSet() }
    val commonItem = first.intersect(second)
    return SCORES.indexOf(commonItem.first()) + 1 // item values are 1-indexed
}

fun main() {
    fun part1(rucksacks: List<String>): Int = rucksacks.sumOf {
            rucksack -> scoreCompartments(rucksack)
    }

    fun part2(rucksacks: List<String>): Int = rucksacks.chunked(3)
        .map { elfGroup ->
            elfGroup.map { rucksack ->
                rucksack.toSet()
            }.reduce { badges, rucksack ->
                badges.intersect(rucksack)
            }
        }.sumOf { badge ->
            SCORES.indexOf(badge.first()) + 1
        }

    // Reading input
    val testRucksacks = readInput("${LABEL}_test")
    val rucksacks = readInput(LABEL)
//
//    // Part 1
    check(part1(testRucksacks) == 157)
    println(part1(rucksacks))
//
//    // Part 2
    check(part2(testRucksacks) == 70)
    println(part2(rucksacks))
}
