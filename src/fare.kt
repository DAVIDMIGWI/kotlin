import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter distance in kilometers :")
    val distance: Double = scanner.nextDouble()

    val cost1:Double = 5.00
    val cost2:Double = 8.00
    val cost3:Double = 10.00
    val cost4:Double = 12.00

    if(distance <= 100){
        val total:Double = distance*cost1
        println("Total amount is $total")
    }
    else if (distance in 101.0 .. 500.0){
        val total:Double = distance*cost2
        println("Total amount is $total")
    }
    else if (distance in 501.0 .. 1000.0){
        val total:Double = distance*cost3
        println("Total amount is $total")
    }
    else if
            (distance >= 1001.0)
    {
        val total:Double = distance*cost4
        println("Total amount is $total")
    }
    else
        println("invalid")
}
