import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter units:")
    val units: Double = scanner.nextDouble()

    //units = float(input("Enter your units:-"))
    //if units < 50:
   // total = units * 0.5
    //print("Kindly pay",total,"Rs")
   // print("Inc. surcharge", total + 10)

   // elif units > 50 and units <=150:
    //pay1 = 50 * 0.5
   // pay2 = units - 50 * 1
    //total = pay1 + pay2
    //print("pay",total)
    //print("Inc. surcharge", total + 10)

    //elif units > 150 and units < 250:
   // pay1 = 50 * 0.5
   // pay2 = 100 * 1
   // pay3 = units - 150 * 1.2
    //total = pay3 +pay1 +pay2
   // print("Kindly pay", total, "Rs")
   // print("Inc. surcharge", total + 10)

    //else:
    //pay1 = 50 * 0.5
   // pay2 = 100 * 1
   // pay3 = 100 * 1.2
    //pay4 = units - 250 * 1.5
    //total = pay3 + pay1 + pay2 + pay4
   // print("Kindly pay", total, "Rs")
   // print("Inc. surcharge", total + 10)


    val pay1:Double = 50.0*0.5
    val pay2:Double = 100*1.0
    val pay3:Double = 100*1.2

    val R1:Double = 0.5
    val R2:Double = 1.0
    val R3:Double = 1.2
    val R4:Double = 1.5



    if(units <= 50){
        val total:Double = units*0.50
        print("Total amount  is $total Rs")
    }
    else if (units in 51.0 .. 150.0){
        val total:Double = units - 50*R2 + 50*R1
        print("Total amount is $total Rs")
    }
    else if (units in 151.0 ..250.0){

        val total:Double = pay1 + pay2 + (units-150)*R3
        print("Total amount  is $total Rs")
    }
    else if (units > 250.0){
        val total:Double = pay1 + pay2 + pay3 + (units-250)*R4
        print("Total amount is $total Rs")
    }


}

