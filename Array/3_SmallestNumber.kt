package Array

import java.util.*

// To find smallest Number in Array
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

    //Alternatively we can also use min() method of Arrays Class
    //in kotlin to find minimum Array Element
    var smallest_number = intArray.min()

    //Print Array elements
    println("Array : ${intArray.contentToString()} ")

    //Print smallest value of Array
    println("Smallest Element of Array is : $smallest_number")
}
