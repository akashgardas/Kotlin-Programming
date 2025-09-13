interface FishColor {
    val color: String
}

//abstract class AquariumFish: FishAction {
//    abstract val color: String
//    override fun eat() = println("yum")
//}

// interface delegation
object GoldColor: FishColor {
    override val color = "gold"
}

class Shark: FishColor, FishAction {
    override val color = "grey"
    override fun eat() {
        println("Hunt and eat fish")
    }
}

// interface delegation
class Plecostomus: FishColor by GoldColor, FishAction{
//    override val color = "gold"
    override fun eat() {
        println("Eat Algae")
    }
}

interface FishAction {
    fun eat()
}
