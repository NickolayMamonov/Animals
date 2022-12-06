fun main(){
    val vet = Vet()
    val animals = arrayOf(
        Dog("meat","dog house"),
        Cat("fish","river"),
        Horse("grass","field"))
    for (i in animals){
        vet.treatAnimal(i)
    }
}