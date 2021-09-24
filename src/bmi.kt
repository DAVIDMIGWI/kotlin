fun main(){
    //find body mass index
    //formula weight/height/squared


    println("Body mass index")
    val weight: Int = 62;
    val height: Double = 1.7;
    var bmi: Double=0.0;

    bmi = (weight/(height*height)).toDouble()
    println("Your BMI is $bmi")


}