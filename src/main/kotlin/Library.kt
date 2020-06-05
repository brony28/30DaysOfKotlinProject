

class Library {
    var numOFBook = 0
    var listBook:MutableList<String> = mutableListOf()

    fun giveBook(name: String){
         println("Name of Book: $name")
        numOFBook = numOFBook+1
        listBook.add(name)

    }

    fun takeBook(name: String){
        println("Book Taken: $name")
        numOFBook = numOFBook-1
        listBook.remove(name)
    }


}