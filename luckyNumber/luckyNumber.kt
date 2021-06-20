fun main() {
    val myFirstDice = Dice(6)
    val rollResult = myFirstDice.roll()
    val luckyNumber = 4
    when (rollResult) {
        luckyNumber -> println("You win!")
        1 -> println("Oh no, try again! You rolled a 1!")
        2 -> println("This time it is a 2, try again!")
        3 -> println("You rolled a 3! Try again.")
        5 -> println("5 is close but no cigar, try again!")
        6 -> println("You rolled a 6, darn! Try again.")
    }
}

class Dice (val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}