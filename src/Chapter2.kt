fun main(){
    println("What's the weather like today?")
    val mood: String? = readLine()
    println(whatShouldIDoToday(mood))
}

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
