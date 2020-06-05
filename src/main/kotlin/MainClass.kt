import kotlin.system.exitProcess

val TAKEBOOK = 1
val GIVEBOOK = 2
val EXIT = 3
var choice:Int = TAKEBOOK
//Global variables

fun main(args: Array<String>){

//    val listOfLib = listOf(Library(),Library(),null)
//    for (e in listOfLib){
//        val countbook:Int? = e?.numOFBook
//        println("Book Count: $countbook")
//    } // Implementation of nullable values!!



    println("Welcome To Rony's Library")
    val lib:Library = Library()  //created a class lib

    choiceAction(lib)  //function arguement is an object, inorder to get access to the properties and methods

}




fun choiceAction(lib: Library){
    while (choice!=EXIT){

        displayNoOfBooks(lib)
        greetUser()
        choice= readLine()!!.toInt()


        when(choice){
            GIVEBOOK -> {val giveB = giveBookToLib()
                            lib.giveBook(giveB)}
            TAKEBOOK -> {val takeB = takeBookFromLib()
                            lib.takeBook(takeB)}
            EXIT -> exitProcess(1)
            else -> println("Select Proper Option!")
        }


    }
}

fun greetUser(){
    println("Choose the option:")
    println("1. Take Book")
    println("2. Give Book")
    println("3. Exit")
}

fun displayNoOfBooks(lib: Library) {
    println("")
    println("Current No of Book Available : ${lib.numOFBook}")
    println("Available Books are : ${lib.listBook}")
    println("= = = = = = = = = = = = = = = =  = = = =")
}

fun giveBookToLib(): String{
    println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-")
    print("What is the name of the Book : ")
    val giveBookName = readLine()!!.toString()
    return giveBookName
}

fun takeBookFromLib(): String{
    println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-")
    print("Which book do you want? ")
    val takeBookName = readLine()!!.toString()
    return takeBookName
}

