fun main() {

    fun part1(input: List<String>) = input
            .map { it.split(",") }
            .map {
                val first = it[0].split("-")
                val firstRange = IntRange(first[0].toInt(), first[1].toInt())
                val second = it[1].split("-")
                val secondRange = IntRange(second[0].toInt(), second[1].toInt())
                (firstRange.contains(secondRange.first) && firstRange.contains(secondRange.last)) ||
                        (secondRange.contains(firstRange.first) && secondRange.contains(firstRange.last))
            }.count { it }

    fun part2(input: List<String>): Int = input
            .map { it.split(",") }
            .map {
                val first = it[0].split("-")
                val firstRange = IntRange(first[0].toInt(), first[1].toInt())
                val second = it[1].split("-")
                val secondRange = IntRange(second[0].toInt(), second[1].toInt())
                (firstRange.contains(secondRange.first) || firstRange.contains(secondRange.last)) ||
                        (secondRange.contains(firstRange.first) || secondRange.contains(firstRange.last))
            }.count { it }

    val testInput = readInput("Day04_test")
    val part1 = part1(testInput)
    println(part1)
    check(part1 == 490)

    val part2 = part2(testInput)
    println(part2)
    check(part2 == 921)
}