abstract class AquariumFish: FishAction {
    abstract val color: String
    override fun eat() = println("yum")
}

class Shark: AquariumFish(), FishAction {
    override val color = "grey"
    override fun eat() {
        println("Hunt and eat fish")
    }
}

class Plecostomus: AquariumFish(), FishAction {
    override val color = "gold"
    override fun eat() {
        println("Eat Algae")
    }
}

interface FishAction {
    fun eat()
}
