fun main() {
    println("Hello, world!\n")

    // val → read-only
    val popcorn = 5
    val hotdog = 7

    // var → mutable
    var customers = 10
    customers = 8

    // String Template
    println("There are $customers customers")
    println("There are ${hotdog - 1} hotdogs")

    // +=, -=, *=, /=, %=
    customers += 2
    println("There are $customers customers\n")

    // Basic Types
    val number: Int = 100
    val isEnabled: Boolean = true
    val separator: Char = ','
    val message: String = "Congratulations :)"

    // Type Inference
    val age = 23
    val pi = 3.14

    // 변수를 선언하고 나중에 초기화할 수 있음
    val variable: Int
    variable = 5
    println("variable = $variable\n")

    // 리스트
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println("readOnlyShapes = $readOnlyShapes")
    println("The first shape is ${readOnlyShapes.first()}") // ${readOnlyShapes[0]}
    println("The last shape is ${readOnlyShapes.last()}")
    println("circle in readOnlyShapes: ${"circle" in readOnlyShapes}")
    println("This list has ${readOnlyShapes.count()} items")

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    shapes.add("triangle")
    shapes.remove("circle")
    println("shapes = $shapes\n")

    // 집합
    val readOnlyFruit = setOf("apple", "banana", "banana", "cherry", "cherry")
    println("readOnlyFruit = $readOnlyFruit")

    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry")
    fruit.add("apple")
    fruit.remove("cherry")
    println("fruit = $fruit\n")

    // 맵
    val readOnlyJuice = mapOf("apple" to 100, "kiwi" to 150, "orange" to 100)
    println("readOnlyJuice = $readOnlyJuice")
    println("사과 주스 가격: ${readOnlyJuice["apple"]}")
    println("200 in readOnlyJuice.values: ${200 in readOnlyJuice.values}")

    val juice: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 150, "orange" to 100)
    juice["cherry"] = 200
    juice.remove("kiwi")
    println("juice = $juice\n")
}
