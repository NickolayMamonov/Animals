class Horse(food: String, location: String) : Animal(food, location) {
    override fun makeNoise() {
        println("I-i-i-i-i")
    }
    override fun eat() {
        println("Horse eat $food in $location.")
    }
}