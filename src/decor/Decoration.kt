package decor

data class Decoration(val rocks: String) {
}

class Choice {
    companion object {
        var name: String = "lyric"
        fun showDescription(name: String) = println("My favorite $name")
    }
}

fun makeDecorations() {
    println(Choice.name)
    Choice.showDescription("pick")
    Choice.showDescription("selection")

//    val decoration1 = Decoration("granite")
//    println(decoration1)
//
//    val decoration2 = Decoration("slate")
//    println(decoration2)
//
//    val decoration3 = Decoration("slate")
//    println(decoration3)
//
//    println(decoration1.equals(decoration2))
//    println(decoration3.equals(decoration2))
}

fun main() {
    makeDecorations()
}
