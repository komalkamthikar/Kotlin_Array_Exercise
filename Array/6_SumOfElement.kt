package Array

import java.util.*

fun main(args: Array<String>) {
    //Input Stream
    val scan = Scanner(System.`in`)

    //Input Array Size
    print("Enter number of elements in the array: ")
    val size = scan.nextInt()

    //Create Integer array of Given size
    val intArray = IntArray(size)

    //Input array elements
    println("Enter Arrays Elements:")
    for (i in intArray.indices) {
        print("intArray[$i] : ")
        intArray[i] = scan.nextInt()
    }

    fun sumArray(): Int {
        var sum = 0
        for (number in intArray) {
            sum += number
        }
        return sum
    }
    println("Array : ${intArray.contentToString()} ")

    //Print smallest value of Array
    println("Sum of Element in the Array is : ${sumArray()}")
}