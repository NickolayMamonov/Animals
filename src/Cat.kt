class Cat(food: String, location: String) : Animal(food, location) {
    override fun makeNoise() {
        println("Meow!")
    }
    override fun eat() {
        println("Cat eat $food in $location")
    }
}