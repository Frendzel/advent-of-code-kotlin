fun main() {

    fun part1(input: List<String>): Int =
            input.size

    fun part2(input: List<String>): Int =
            input.size

    val testInput = readInput("Day04_test")
    val part1 = part1(testInput)
    println(part1)
    check(part1 == 0)

    val part2 = part2(testInput)
    println(part2)
    check(part2 == 0)
}
