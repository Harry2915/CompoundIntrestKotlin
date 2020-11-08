package harish.hibare.compoundintrestkotlin

import java.util.*


fun main(args: Array<String>) {


    val scanner = Scanner(System.`in`)


    print("Enter Principal Amount : ")
    val principalAmount = scanner.nextDouble()


    print("Enter Rate of Interest : ")
    val rateOfInterest = scanner.nextDouble()


    print("Enter Time : ")
    val time = scanner.nextDouble()


    val compoundInterest = principalAmount.toDouble() * Math.pow((1 + rateOfInterest.toDouble()/100.00),time.toDouble())

    println("Compound Interest is :$compoundInterest")
}