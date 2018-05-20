
/**
 * Created by Luis Santiago on 14/05/18.
 */


fun main (args: Array<String>){
    var a = 1
    val s1 = "a is $a"
    println(s1)
    a = 2
    val s2 = "${s1.replace("is" , "was")} , but now is $a"
    println(s2)
    convert("6" , "5")
    getStringLength("Hello , My name is ....")

    val listOfItems = listOf("Hello" , "Carl" , "Nothing new" , "Hey" , "How are ya")
    // the traditional way
    for (items in listOfItems) {
        println(items)
    }

    //We can do it the other way
    for (index in listOfItems.indices){
        println("The number of item is $index and the message is ${listOfItems[index]}")
    }


    //while loops
    val items = listOf("Bananas" , "Apples" , "Juice" , "Liex")
    var index = 0

    while (index < items.size){
        println("I eat ${items[index]} every $index")
        index ++
    }

    describe("Hey ya'll")

    //ranges
    //for 1 to 10
    for (x in 1..10){
        println(x)
    }

    // steps in which
    for (x in 1..10 step 2) print(x)


    // steps in which goes downside
    for (x in 9 downTo 6 step 3) print(x)


    val names = listOf("Luis","Alberto","Santiago","Martin","Alexander")

    names.filter {it.startsWith("a") }.map { it.toUpperCase()}

}


fun describe(obj : Any) : String{
    when(obj){
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String ->"Not a String"
        else -> "Unknown"
    }

    return ""
}

fun parseInt(arg : String) : Int?{
    return null
}

fun convert(arg1 : String , arg2 : String){
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    if(x !=null && y !=null){
        println(x * y)
    }else{
        print("Neither x and y is a number")
    }
}


fun getStringLength(obj : Any) : Int?{

    if (obj is String){
        //it is a string
        return obj.length
    }

    return null
}