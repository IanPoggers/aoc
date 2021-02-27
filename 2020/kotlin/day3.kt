import java.io.File

private fun part2(input: List<String>): Int {
    val width = input[0].length
    val count = { x: Int, y: Int ->
        var pos = Pair(0, 0)
        var ctr = 0
        while (pos.second < input.size) {
            if (input[pos.second][pos.first] == '#') ctr++
            pos = Pair((pos.first + x) % width, (pos.second + y))
        }
        ctr
    }
    return count(1, 1) * count(3, 1) * count(5, 1) * count(7, 1) * count(1, 2)
}

private fun part1(input: List<String>): Int {
    var xpos = 0
    val width = input[0].length
    return input.count {
        (it[xpos] == '#').also { xpos = (xpos + 3) % width }
    }
}

fun day3() {
    val input = File("2020/input/day3").readLines()

    println(part1(input))
    println(part2(input))
}