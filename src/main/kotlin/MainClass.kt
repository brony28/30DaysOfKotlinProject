
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

//https://www.youtube.com/watch?v=oObg8ovE78Q
//https://www.youtube.com/watch?v=Ux-BoW8h6BA


fun choiceAction(lib: Library){
    while (choice!=EXIT){
        greetUser()
        displayNoOfBooks(lib)
        choice= readLine()!!.toInt()

        if(choice == GIVEBOOK){
            val giveB = giveBookToLib()
            lib.giveBook(giveB)
        } else if (choice == TAKEBOOK){
            val takeB = takeBookFromLib()
            lib.takeBook(takeB)
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
    println("Current No of Book Available : ${lib.numOFBook}")
    println("Available Books are : ${lib.listBook}")
}

fun giveBookToLib(): String{
    print("What is the name of the Book")
    val giveBookName = readLine()!!.toString()
    return giveBookName
}

fun takeBookFromLib(): String{
    print("Which book do you want? ")
    val takeBookName = readLine()!!.toString()
    return takeBookName
}