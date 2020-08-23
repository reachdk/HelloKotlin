package Aquarium

fun main (args: Array<String>){
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length}" +
            "Width: ${myAquarium.width}" +
            "Height: ${myAquarium.height}"
    )
    myAquarium.height = 80
    println("Height: ${myAquarium.height}")

    println("volume: ${myAquarium.volume} liters")
    myAquarium.volume = 200
    println("Length: ${myAquarium.length}" +
            "Width: ${myAquarium.width}" +
            "Height: ${myAquarium.height}"
    )


}
