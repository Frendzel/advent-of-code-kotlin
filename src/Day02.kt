/**
 * Rock - A, X -> 1 point
 * Paper - B, Y -> 2 points
 * Scissors - C, Z -> 3 points
 *
 * Won -> 6
 * Draw -> 3
 * Lose -> 0
 */
private val gameToPoints: Map<String, Int> =
        mapOf(
                "A X" to 1 + 3,
                "A Y" to 2 + 6,
                "A Z" to 3 + 0,
                "B X" to 1 + 0,
                "B Y" to 2 + 3,
                "B Z" to 3 + 6,
                "C X" to 1 + 6,
                "C Y" to 2 + 0,
                "C Z" to 3 + 3
        )

/**
 * Rock - A
 * Paper - B
 * Scissors - C
 *
 * X - need to lose
 * Y - need to draw
 * Z - need to win
 */
private val resultToGame: Map<String, String> =
        mapOf(
                "A X" to "A Z",
                "A Y" to "A X",
                "A Z" to "A Y",
                "B X" to "B X",
                "B Y" to "B Y",
                "B Z" to "B Z",
                "C X" to "C Y",
                "C Y" to "C Z",
                "C Z" to "C X"
        )

fun main() {


    fun part1(input: List<String>): Int {
        return input.sumOf { s: String -> gameToPoints[s]!! }
    }

    fun part2(input: List<String>): Int {
        return input.sumOf { s: String -> gameToPoints[resultToGame[s]]!! }
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
    val part1 = part1(testInput)
    println(part1)
    check(part1 == 14297)

    val part2 = part2(testInput)
    println(part2)
    check(part2 == 10498)
}
