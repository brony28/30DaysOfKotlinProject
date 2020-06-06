import kotlin.system.exitProcess

val TAKEBOOK = 1
val GIVEBOOK = 2
val EXIT = 3
var choice:Int = TAKEBOOK
//Global variables



fun main(args: Array<String>){

    val lib:Library = Library()  //created a class lib      //MAIN OBJECT
    val centralLib:Library = Library()   //created a class lib

    println("\nLibraries:\n 1. RBK Library (open)\n 2. Central Library (closed)\n 3. Mini Library (UA)\n")
    val listOfLib = listOf(lib,centralLib,null) //null value in List
    for ((i,e) in listOfLib.withIndex()){
        val countbook:Int? = e?.numOFBook //
        println("Book Count in Lib${i+1} : $countbook")
    }
    // Implementation of nullable values!!


    println("\nChecking Out RBK Library\n")

    choiceAction(lib)  //function arguement is an object, inorder to get access to the properties and methods of thr class

}




fun choiceAction(lib: Library){
    println("Welcome To Rony's Library")
    while (choice!=EXIT){

        displayNoOfBooks(lib)
        greetUser()
        choice= readLine()!!.toInt() //User Input //null pointer exception if its not Int

        when(choice){ //When opertaor
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
    val giveBookName = readLine()!!.toString() ////null pointer exception if its not String
    return giveBookName
}

fun takeBookFromLib(): String{
    println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-")
    print("Which book do you want? ")
    val takeBookName = readLine()!!.toString() ////null pointer exception if its not String
    return takeBookName
}

