package challenges

import utils.readInput

fun main() {
    fun part1(games: List<String>): Int = games
        .map {
            round -> when(round) {

                "A X" -> 4
                "A Y" -> 8
                "A Z" -> 3
                "B X" -> 1
                "B Y" -> 5
                "B Z" -> 9
                "C X" -> 7
                "C Y" -> 2
                "C Z" -> 6
                else -> 0
            }
        }.sum()

    fun part2(games: List<String>): Int = games
        .map {
            round -> when(round) {
                "A X" -> 3
                "A Y" -> 4
                "A Z" -> 8
                "B X" -> 1
                "B Y" -> 5
                "B Z" -> 9
                "C X" -> 2
                "C Y" -> 6
                "C Z" -> 7
                else -> 0
            }
        }.sum()

    val testGames = readInput("Day02_test")
    val games = readInput("Day02")

    // part 1
    check(part1(testGames) == 15)
    println(part1(games))

    // part 2
    check(part2(testGames) == 12)
    println(part2(games))
}
