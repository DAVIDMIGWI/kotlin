import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter Your Marks: ")
    val marks: Double = scanner.nextDouble()
    //println("Your marks are $marks")

    if (marks < 30){
        println("failed")
    }
    else if(marks in 30.0..50.0){
        println("Average")
    }
    else if(marks in 51.0..70.0){
        println("Passed")
    }
    else if(marks in 71.0..100.0){
        println("Excellent")}
    else {
        println("Invalid marks")}





}