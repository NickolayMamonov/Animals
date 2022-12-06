class Dog(food: String, location: String) : Animal(food, location) {
    override fun makeNoise() {
        println("WOOF! WOOF! WOOF!")
    }
    override fun eat() {
        println("Dog eat $food in $location.")
    }
}