package com.example.ai36

fun main() {
    println("Hello World")

    // Variables
    val age = 10
    println("Age: $age")

    val firstName = "Sandis"
    val lastName = "Prajapati"
    println("Name: $firstName $lastName")
    println("Length of first name: ${firstName.length}")

    // Arrays
    val address = arrayOf("Ktm", "Pokhara", "Bhaktapur")
    address[2] = "Thamel"
    println("Updated Address: ${address[2]}")

    // ArrayList
    val data = arrayListOf(1, 2, "Ram")
    println("Data ArrayList: $data")

    val cities = arrayListOf("Ktm", "Chitwan", "Pokhara")
    println("Cities: $cities")

    // Loop
    for (i in 0..5) {
        println("Number: $i")
    }

    // Type Conversion
    val num1 = 10
    val num2: Double = num1.toDouble()
    println("Converted to Double: $num2")

    // Function
    calculate(10, 5)

    // ArrayList

    val name = arrayListOf("Sandis", "ram", "shyam")
    name.add("hari")
    name.add(4, "Sita")

    name.remove("shyam")
    name.removeAt(0)

    println(name)

    val mixArrayList = arrayListOf<Any>("hello", 5, 2.0)
    println(mixArrayList[0])
    println(mixArrayList[1])
    println(mixArrayList[2])

    // Calling other functions:
    displayList()
    displayLists()
    setExample()
    mapExample()
    accessImmutableMap()
    accessMutableMap()
    arithmeticOperations()
    unaryOperators()
    relationalOperators()
}

// Function definitions

fun calculate(a: Int, b: Int) {
    val sum = a + b
    println("Sum: $sum")
}

fun displayList() {
    val numbers = listOf("one", "two", "three", "four")
    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers[2]}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\": ${numbers.indexOf("two")}")
}

fun displayLists() {
    val lst = listOf("one", "two", "three")
    println("Immutable list:")
    for (i in lst.indices) {
        println(lst[i])
    }

    val mutableLst = mutableListOf("one", "two", "three")
    mutableLst.add("Four")
    println("Mutable list:")
    for (i in mutableLst.indices) {
        println(mutableLst[i])
    }
}

fun setExample() {
    val numbers = setOf(1, 2, 3, 4)
    for (element in numbers) {
        println(element)
    }

    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}")
}

fun mapExample() {
    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "China" to "Beijing",
        "India" to "New Delhi"
    )

    println("All keys: ${countriesCapitals.keys}")
    println("All values: ${countriesCapitals.values}")
    println("Capital of Nepal is: ${countriesCapitals["Nepal"]}")
}

fun accessImmutableMap() {
    val studentMarks = mapOf(
        "ram" to 45,
        "shyam" to 45,
        "hari" to 45,
        "gita" to 45
    )

    println("Enter student name: ")
    val input: String = readln().lowercase()
    println(studentMarks[input])
}

fun accessMutableMap() {
    val studentMarks = mutableMapOf(
        "ram" to 45,
        "shyam" to 45,
        "hari" to 45,
        "gita" to 45
    )

    studentMarks["ram"] = 60
    studentMarks["sabin"] = 80

    println("Enter student name: ")
    val input: String = readln().lowercase()
    println(studentMarks[input])
}

fun arithmeticOperations() {
    val num1 = 10.6
    val num2 = 5.0

    println("num1 + num2 = ${num1 + num2}")
    println("num1 - num2 = ${num1 - num2}")
    println("num1 * num2 = ${num1 * num2}")
    println("num1 / num2 = ${num1 / num2}")
    println("num1 % num2 = ${num1 % num2}")

    val x = 20
    val y = 4
    var z = 0

    z = x + y
    println("z = x + y = $z")
    z += x
    println("z += x = $z")
    z -= x
    println("z -= x = $z")
    z *= x
    println("z *= x = $z")
    z /= x
    println("z /= x = $z")
    z %= x
    println("z %= x = $z")
}

fun unaryOperators() {
    var number = 7.6
    val isCheck = true
    println("+number = ${+number}")
    println("-number = ${-number}")
    println("++number = ${++number}")
    println("--number = ${--number}")
    println("!isCheck = ${!isCheck}")
}

fun relationalOperators() {
    val a = 5
    val b = 5

    println("a == b : ${a == b}")
    println("a != b : ${a != b}")
    println("a < b : ${a < b}")
    println("a > b : ${a > b}")
    println("a >= b : ${a >= b}")
    println("a <= b : ${a <= b}")
}