

class Library {
    var numOFBook = 2
    var listBook:MutableList<String> = mutableListOf("Gone Girl", "Murder On The Orient Express")

    fun giveBook(name: String){
         println("Name of Book : $name")
        numOFBook = numOFBook+1
        listBook.add(name)

    }

    fun takeBook(name: String){
        if (name in listBook){
            println("Book Taken : $name")
            numOFBook = numOFBook-1
            listBook.remove(name)
        }else{
            println("xxxxxxxxxxxxxxxxxxx")
            println("Book not present")
            println("xxxxxxxxxxxxxxxxxxx")
        }
    }


    init { // init is called when the object is called.
        println("If the available books are empty, Kindly wait for someone to donate :P")
    }


}
