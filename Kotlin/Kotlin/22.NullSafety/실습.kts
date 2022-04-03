//?
val number: Int = 10 //Non-Nullable Int
val number: Int? = null//Nullable Int

//!!
//->정말 필요한 경우에만 사용하기
val nullableNumberList: List<Int?> = listOf<Int?>(1, 2, 3, 4, 5)
var result: Int = 0
nullableNumberList.forEach {
    result += it!! //null임을 개발자가 보장하지만 실제 null이 있을 경우 에러 발생
}

//?. (safe call)
val text: String? = null
println(text?.length)
//println(text.length)  -> NullPorintException이 발생해야 함

// !!.
//println(text!!.length)

// as?
open class Apple(var type: String, var sweetness: Int, var years: Int) {
    open fun eat() {
        println("사과를 먹는다")
    }
}

class AppleJuice constructor(type: String, sweetness: Int) : Apple(type, sweetness, 3) {
    fun blending() {
        println("사과를 간다")
    }
}

val appleJuice = AppleJuice("", 100)
val apple = appleJuice as Apple
println(apple.sweetness)

// ?: 엘비스 연산
val text2: String? = "123"
val nullText: String? = null

val len1: Int = if (text2 != null) text2.length else 0
var len2: Int = text2?.length ?: 0
