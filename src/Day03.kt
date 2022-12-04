fun String.intersectedItems(): Set<Char> =
        listOf(
                substring(0..length / 2),
                substring(length / 2)
        ).intersectedItems()

fun Char.priority(): Int =
        when (this) {
            in 'a'..'z' -> (this.code - 97) + 1
            in 'A'..'Z' -> (this.code - 65) + 27
            else -> throw IllegalArgumentException("Letter in wrong range: $this")
        }

fun List<String>.intersectedItems(): Set<Char> =
        map { it.toSet() }
                .reduce { left, right -> left intersect right }

fun main() {

    fun part1(input: List<String>): Int =
            input.sumOf { it.intersectedItems().map(Char::priority).first() }

    fun part2(input: List<String>): Int =
            input.chunked(3).sumOf { it -> it.intersectedItems().sumOf { it.priority() } }

    val testInput = readInput("Day03_test")
    val part1 = part1(testInput)
    println(part1)
    check(part1 == 7845)

    val part2 = part2(testInput)
    println(part2)
    check(part2 == 2790)
}
