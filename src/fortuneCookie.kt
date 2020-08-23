import java.lang.Math.random

fun main(args: Array<String>) {
    var fortune: String = ""
    while (!fortune.contains("Take it easy")) {
        fortune = getFortune(getBday())
        println("\nYour fortune is: $fortune")
    }
}

fun getBday(): Int{
    print("Enter your birthday:")
    return readLine()?.toIntOrNull() ?:1
}

fun getFortune(birthday: Int): String {
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

