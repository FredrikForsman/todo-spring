package se.fredf.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import java.lang.RuntimeException

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)

//    helloWhen("anything string")
//    helloWhen('b')
//    helloWhen(1)

//    iAmLooping(listOf("Giovanni Giorgio", "Missy", "Kiwi"))
//    lambda(listOf("Giovanni Giorgio", "Missy", "Kiwi"))

//    variables()

//    collections()

//    println(Fredrik.THIS_IS_A_INT)
}

fun hello(anything: Any) {
    if (anything is String) {
        println("Anything is a string: $anything")
    } else if (anything is Int) {
        println("Anything is a Int: $anything")
    }
}

fun helloWhen(anything: Any) {
    when(anything) {
        is String -> println("Anything is a string: $anything")
        else -> println("Anyting is a what what? ${anything.javaClass}")
    }
}

fun iAmLooping(cats: List<String>) {

    for (cat in cats) {
        println("I am a cat: $cat")
    }
}

fun lambda(cats: List<String>) {
    cats.sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println("I am a cat: $it") }
}

fun variables() {
    val two = 2
//    val fourBillion = 4000000000

    println("Two is what: ${two::class.java}")
//    println("fourBillion is what: ${fourBillion.javaClass}")

    val almostPi = 3.15
    println("almostPi is: ${almostPi.javaClass}")
}

fun collections() {
    val list = listOf("Banana", "Apple")
    list.plus("Kiwi")
    list.minus("Banana")

    println("the list contains: $list")

    val map = hashMapOf<String, String>("hej" to "hej", "hej" to "då")
    map["då"] = "hej"
//    println("the has map contains: $map")
}


// static, constructor code (init)
class Fredrik constructor(name: String) {

    companion object {
        const val THIS_IS_A_INT = 1
    }
}

interface rotate {
    val rotateX: Int
}

class Circle: rotate {
    override val rotateX: Int = 1
}

class Square(override val rotateX: Int = 1) : rotate