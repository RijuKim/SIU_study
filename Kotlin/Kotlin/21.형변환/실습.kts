//기본자료형의 타입 캐스팅
val number: Int = 10
val numberString: String = number.toString()
val stringToNumber: Int = numberString.toInt()
println(numberString)
println(stringToNumber)

val numberF: Double = 10.5
val numberFString: String = numberF.toString()
val numberFInt: Int = numberF.toInt()
println(numberFString)
println(numberFInt)

//-> to 타입이 오는 함수를 이용해서 형 변환을 한다

//상속한 클래스 간의 캐스팅
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

//is
//-타입 체크, true or false가 리턴됨
//-스마트 캐스팅을 해줌
val apple: Apple = AppleJuice("풋사과", 60)
//if문 실행 시 var는 변경될 수 있기 때문에 사용불가, val로만 선언해야 함
println(apple.eat())
//println(apple.blending()) blend는 사용불가 blend 기능을 포기하고 apple 기능이 되었기 때문
if (apple is AppleJuice) {
    println("YES")
    //스마트 캐스팅
    // -> 내가 만든 apple을 if 블럭 안에서는 AppleJuice로 사용 가능하게 해줌
    apple.blending()
}

//as
//  -지정한 타입으로 캐스팅을 시도하고, 불가느안 경우에는 예외 발생

val apple2: AppleJuice = apple as AppleJuice
apple2.blending()