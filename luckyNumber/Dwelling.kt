import kotlin.math.PI

fun main() {
    val squareCabin = SquareCabin(6, 50.0)
    
    with(squareCabin){
    println("\nSquare Cabin\n============")
    println("Capacity: ${capacity}")
    println("Material: ${buildingMaterial}")
    println("Has room? ${hasRoom()}")
    println("Floor area: %.2f".format(floorArea()))
    }
   
   val roundHut = RoundHut(3, 10.0)
   
   with(roundHut){
       println("\nRound Hut\n=========")
       println("Material: ${buildingMaterial}")
       println("Capacity: ${capacity}")
       println("Has room? ${hasRoom()}")
       println("Floor area: %.2f".format(floorArea()))
   }
   
   val roundTower = RoundTower(4, 15.5)
   
   with(roundTower){
       println("\nRound Tower\n==========")
       println("Material: ${buildingMaterial}")
       println("Capacity: ${capacity}")
       println("Has room? ${hasRoom()}")
       println("Floor area: %.2f".format(floorArea()))
   }
}

abstract class Dwelling(private var residents: Int) {
    
    abstract val buildingMaterial: String
    abstract val capacity: Int
    
    abstract fun floorArea(): Double
    
    fun hasRoom(): Boolean {
        return residents < capacity
    } 
}

class SquareCabin(residents: Int, val length: Double) : Dwelling(residents) {
    override val buildingMaterial = "Wood"
    override val capacity = 6
    
    override fun floorArea(): Double {
        return length * length
    }
}

open class RoundHut(residents: Int, val radius: Double) : Dwelling(residents) {
    override val buildingMaterial = "Straw"
    override val capacity = 4
    
    override fun floorArea(): Double {
        return PI * radius * radius
    }
}

class RoundTower(residents: Int, 
                 val floors: Int = 2) : RoundHut(residents, radius) {
    				override val buildingMaterial = "Stone"
    				override val capacity = 4 * floors
    
    				override fun floorArea(): Double {
                        return super.floorArea() * floors
                    }
}