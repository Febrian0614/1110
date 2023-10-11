//caught_speeding
fun caughtSpeeding(speed: Int, isBirthday: Boolean): Int {
    var actualSpeed = speed

    if (isBirthday) {
        actualSpeed -= 5
    }

    if (actualSpeed <= 60) {
        return 0
    } else if (actualSpeed in 61..80) {
        return 1
    } else {
        return 2
    }
}

fun main() {
    println(caughtSpeeding(60, false))
    println(caughtSpeeding(65, false))
    println(caughtSpeeding(65, true))
}
