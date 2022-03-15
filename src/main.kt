fun main(){
    names()
    towns()
    num()
    var x =threeNames(arrayOf("Tanyasi", "lucy","Sharon"))
    println(x.contentToString())
}
fun names(){
    var students = arrayOf("Tanyasis", "Lucy", "Jane", "Ann")
    println(students.contentToString())

}
fun towns(){
  var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    cities.sortedArray().forEach { location ->
  println(location.capitalize())
    }
}
fun num(){
    var number = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = (number[1] +number[4])
    println(sum)
    println(number.indexOf(158))
    println(number.sortedArray().contentToString())
}
fun threeNames(name:Array<String>):Array<String> {
return name
}
