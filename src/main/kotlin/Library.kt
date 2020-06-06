

class Library {
    var numOFBook = 3
    var listBook:MutableList<String> = mutableListOf("Gone Girl", "Murder On The Orient Express", "The Unexpected Guest")

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


    init {
        println("If the available books are empty, Kindly wait for someone to donate :P")
    }


}
