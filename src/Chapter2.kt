import kotlin.random.Random

fun main(){
    println("What's the weather like today?")
    val mood: String? = readLine()
    println(whatShouldIDoToday(mood))
    println(rollDice)
    println("Gimme a number: ")
    val sides: String = readLine().toString()
    println(rollDice1(sides.toInt()))
    println(rollDice2(sides.toInt()))
    println("Gimme another number: ")
    val rand: String = readLine().toString()
    gameplay(rollDice2(rand.toInt()))
}

//====== Roll Dice exercise ======

val rollDice = { Random.nextInt(12) + 1}
val rollDice1 = { sides: Int -> if (sides == 0) 0 else Random.nextInt(sides) + 1}
val rollDice2: (Int) -> Int = { sides: Int -> if (sides == 0) 0 else Random.nextInt(sides) + 1}

fun gameplay(diceRoll: Int) {
    //do something with the dice roll
    println(diceRoll)
}

// what should I do today?

fun whatShouldIDoToday(mood: String?, weather: String = "sunny", temp: Int = 24):String {
    fun surfing(mood:String?, weather: String) = mood == "happy" && weather == "sunny"
    fun tea(mood:String?, weather: String) = mood == "sad" && weather == "sunny"
    fun fish(mood:String?, weather: String) = mood == "contemplative" && weather == "overcast"
    fun swim(mood:String?, weather: String, temp: Int) = mood == "indifferent" && weather == "balmy" && temp == 35
    return(
        when {
            surfing(mood, weather) -> "go surfing"
            tea(mood, weather) -> "sit at home with a cup of tea and read a book"
            fish(mood, weather) -> "go fishing"
            swim(mood, weather, temp) -> "go swim"
            else -> "sing a song"

        })

}

