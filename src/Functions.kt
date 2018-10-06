import java.util.Random

fun main(args : Array<String>){
    println("Hello , ${args[0]}")
    feedTheFish()
}

fun feedTheFish(){
    val day = randomDay()
    val food = getFood(day)
    print("Today is $day and the fish eat $food")
}

fun randomDay() : String{
    val week = listOf("Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday" , "Sunday")
    return week[Random().nextInt(week.size)]
}

fun getFood(day : String) :String{
    return when (day){
        "Monday" -> "Pizza"
        else -> "Hot dog"
    }
}