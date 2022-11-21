package Array

import java.util.*

// To find second largest Number in Array
fun main(args: Array<String>) {
    val numbers= arrayOf(4,5,6,2,1)
    // to find Second Largest Array Element
    var first=Int.MIN_VALUE
    var second=Int.MIN_VALUE

    for(i in numbers ){

        if(i>first){
            second=first
            first=i
        }
        else if(i !=first && i>second){
            second=i
        }

    }

    //Print Array elements
    println("Array : ${numbers.contentToString()} ")

    //Print second largest number in Array

    println("Second largest element in the array is : $second")
}













