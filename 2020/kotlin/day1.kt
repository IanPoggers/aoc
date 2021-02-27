import java.io.File


private fun part1(input: List<Int>): Int {
    //input.forEach { input.mapTo(input, { it ) }
    var out = 0;
    for (num1 in input) {
        for (num2 in input) {
            if (num1 + num2 == 2020) {
                out = num1 * num2
            }
        }
    }
    return out
}

private fun part2(input: List<Int>): Int {
    var out = 0
    for (num1 in input) {
        for (num2 in input) {
            for (num3 in input) {
                if (num1 + num2 + num3 == 2020) {
                    out = num1 * num2 * num3
                }
            }
        }
    }
    return out
}

fun day1() {
    val input = File("2020/input/day3").readLines().map { it.toInt() };

    println(part1(input))
    println(part2(input))
}