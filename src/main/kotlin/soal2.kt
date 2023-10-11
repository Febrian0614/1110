//date_fashion
fun dateFashion(you: Int, date: Int): Int {
    if (you <= 2 || date <= 2) {
        return 0
    }

    if (you >= 8 || date >= 8) {
        return 2
    }

    return 1
}

fun main() {
    println(dateFashion(5, 10))
    println(dateFashion(5, 2))
    println(dateFashion(5, 5))
}