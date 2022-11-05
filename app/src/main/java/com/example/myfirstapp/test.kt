package com.example.myfirstapp

class Person(val name: String, val age: Int = 20){
}

fun main (){
    val p = Person("Jhon")
    print(p.age)
}