package Array

import java.util.*

// To find Largest Number in Array
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

    //Alternatively we can also use max() method of Arrays Class
    // to find Largest Array Element
    var Largest_number = intArray.max()

    //Print Array elements
    println("Array : ${intArray.contentToString()} ")

    //Print smallest value of Array
    println("Smallest Element of Array is : $Largest_number")
}
