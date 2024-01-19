import java.util.OptionalInt

class Mouse(_name:String="The Mouse"):Animal(_name){
    override fun makeASound(){
        squeak()
    }
    private fun squeak() {
        println("$animalName said squeak!")
    }
    private var cheese = 0

    private fun StealCheese(x: Int) {
        cheese += x
    }

    private fun EatCheese()
    {
        cheese -= 1
    }
}