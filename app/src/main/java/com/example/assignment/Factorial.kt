package com.example.assignment

fun  main() {
    //6*5*4*3*2*1 = 720
    println("Enter your value")
var value = readln()
   var factorial =  factorial(value.toInt())
    println("factorial of $value is $factorial")
}
fun factorial(value: Int) :Long{
 return if (value==1||value==0){
     1
}else{
      value.toLong() * factorial(value-1)
 }
}
