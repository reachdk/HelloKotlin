import java.util.*

fun main(args: Array<String>) {
    //var fortune: String
    //println("Hello, ${args[0]}")
    //dayOfWeek()
    //fried()
    //println("yeehaw, ${args[1].toInt()}")
    //timeofday(args[1].toInt())
    //var bday = getBirthday()
    //when (bday) {
    //    in 1..10 -> println("Hee haaw, fortunately")
    //    in 28..31 -> println("hoo hoo hoo, unfortunately")
    //    else -> println(getFortuneCookie(bday))

    //fitmorefish
    print(fitMoreFish(9.0, listOf(1,1,3), 3))
}

fun fitMoreFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true) :Boolean{
    return (if (!hasDecorations) (tankSize-currentFish.sum()) else (.8*tankSize - currentFish.sum())) > fishSize
}


    fun getFortuneCookie(birthday: Int): String{
    var fortunes: List<String> = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )


    return fortunes[birthday.rem(fortunes.size)]
}

fun getBirthday(): Int{
    print("Enter your birthday:")
    return readLine()?.toIntOrNull() ?:1
}


fun dayOfWeek(){
    println("What day is it today?")
    var day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    var todayIs: String =
    when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Whoa, time travelling!"
    }
    println("Today is $todayIs")
}

fun fried(){
    val temp = 10
    val isHOt = temp > 50
    print("It is $isHOt")
}

fun timeofday(currHour: Int){
    //print(currHour)
    print(if(currHour < 12) { print("Good Morning") } else {print("good afternoon")})
}
