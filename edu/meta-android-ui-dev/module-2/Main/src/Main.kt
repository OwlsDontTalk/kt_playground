fun main() {

    println("===== BASIC VARIABLES =====")

    val immutableInt: Int = 10
    var mutableInt: Int = 20

    println(immutableInt)
    println(mutableInt)

    mutableInt += 5
    println(mutableInt)

    val name: String = "Alex"
    val age: Int = 25
    val height: Double = 1.80
    val isStudent: Boolean = true

    println("Name: $name, Age: $age, Height: $height, Student: $isStudent")

    println("\n===== ARITHMETIC OPERATIONS =====")

    val a = 10
    val b = 3

    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)

    println("\n===== COMPARISON OPERATORS =====")

    println(a > b)
    println(a < b)
    println(a >= b)
    println(a <= b)
    println(a == b)
    println(a != b)

    println("\n===== LOGICAL OPERATORS =====")

    val finishedHomework = true
    val cleanedRoom = true
    val passedMathExam = false

    val canPlayGames = finishedHomework && cleanedRoom
    val canEatSweets = finishedHomework && passedMathExam
    val isHappy = finishedHomework || passedMathExam
    val isSad = !isHappy

    println(canPlayGames)
    println(canEatSweets)
    println(isHappy)
    println(isSad)

    println("\n===== IF / ELSE =====")

    if (age >= 18) {
        println("Adult")
    } else {
        println("Minor")
    }

    val result = if (age > 20) "Older than 20" else "20 or younger"
    println(result)

    println("\n===== WHEN =====")

    val grade = 4

    when (grade) {
        5 -> println("Excellent")
        4 -> println("Good")
        3 -> println("Average")
        2 -> println("Bad")
        else -> println("Unknown grade")
    }

    println("\n===== RANGES =====")

    for (i in 1..5) {
        println(i)
    }

    for (i in 5 downTo 1) {
        println(i)
    }

    for (i in 1 until 5) {
        println(i)
    }

    println("\n===== LOOPS =====")

    var counter = 0
    while (counter < 3) {
        println("While: $counter")
        counter++
    }

    var counter2 = 0
    do {
        println("Do-While: $counter2")
        counter2++
    } while (counter2 < 3)

    println("\n===== FOR LOOP =====")

    for (i in 0..10 step 2) {
        println(i)
    }

    println("\n===== BREAK & CONTINUE =====")

    for (i in 1..10) {
        if (i == 5) continue
        if (i == 9) break
        println(i)
    }

    println("\n===== FUNCTIONS =====")

    println(sum(3, 4))
    println(multiply(5, 6))
    printUserInfo("Bob", 30)

    println("\n===== NULLABLE TYPES =====")

    var nullableName: String? = "John"
    println(nullableName?.length)

    nullableName = null
    println(nullableName?.length ?: "Name is null")

    println("\n===== SMART CAST =====")

    val something: Any = "Hello Kotlin"

    if (something is String) {
        println(something.length)
    }

    println("\n===== DATA CLASS =====")

    val user1 = User("Alice", 22)
    val user2 = User("Alice", 22)

    println(user1)
    println(user1 == user2)

    println("\n===== LIST =====")

    val numbers = listOf(1, 2, 3, 4, 5)
    for (n in numbers) {
        println(n)
    }

    val mutableNumbers = mutableListOf(1, 2, 3)
    mutableNumbers.add(4)
    mutableNumbers.remove(2)
    println(mutableNumbers)

    println("\n===== SET =====")

    val uniqueNumbers = setOf(1, 1, 2, 3, 3)
    println(uniqueNumbers)

    println("\n===== MAP =====")

    val scores = mapOf(
        "Math" to 90,
        "English" to 85,
        "Science" to 95
    )

    for ((subject, score) in scores) {
        println("$subject -> $score")
    }

    println("\n===== REPEAT =====")

    repeat(5) {
        println("Repeat index: $it")
    }

    println("\n===== STRING FUNCTIONS =====")

    val text = "Kotlin Programming"
    println(text.uppercase())
    println(text.lowercase())
    println(text.contains("gram"))
    println(text.replace("Kotlin", "Java"))

    println("\n===== BASIC OOP =====")

    val dog = Dog("Buddy")
    dog.bark()
    dog.sleep()

    println("\n===== END OF DEMO =====")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun multiply(a: Int, b: Int): Int = a * b

fun printUserInfo(name: String, age: Int) {
    println("User name: $name, age: $age")
}

data class User(
    val name: String,
    val age: Int
)

class Dog(private val name: String) {

    fun bark() {
        println("$name says: Woof!")
    }

    fun sleep() {
        println("$name is sleeping")
    }
}
