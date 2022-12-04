fun main() {
    fun part1(input: List<String>): Int =
            input.joinToString(",")
                    .split(",,")
                    .map { it.split(",").sumOf(String::toInt) }
                    .maxOf { it }

    fun part2(input: List<String>): Int =
            input.joinToString(",")
                    .split(",,")
                    .map { it.split(",").sumOf(String::toInt) }
                    .sortedDescending()
                    .take(3)
                    .sum()

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    val part1 = part1(testInput)
    println(part1)
    check(part1 == 67450)

    val part2 = part2(testInput)
    println(part2)
    check(part2 == 199357)
}
