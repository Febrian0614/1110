//helo_name
fun helloName(name: String): String {
    return  "Hello $name"
}

fun main() {
    val name1 ="Bob"
    val name2 ="Alice"
    val name3 ="X"

    println(helloName(name1))
    println(helloName(name2))
    println(helloName(name3))
}