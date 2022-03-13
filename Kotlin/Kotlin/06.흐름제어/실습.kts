//if
val number1: Int = 20

if (number1 == 10) {//조건식은 무조건 true 혹은 false로 결과가 나와야한다
    //위 조건을 만족하는 경우
    println("10 입니다")
} else if (number1 == 20) {
    //위 조건을 만족하는 경우
    println("20 입니다")
} else {
    //위 2가지 조건을 모두 만족하지 않는 경우
    println("10, 20 둘다 아닙니다")
}

//if문을 간단하게 사용하는 경우
if (number1 == 10) println("10 입니다")
else if (number1 == 20) println("20 입니다")
else if (number1 == 30) println("30 입니다")
else if (number1 == 50) println("50 입니다")
else println("10, 20 둘다 아닙니다")

//if문을 이용한 변수 선언
val number2: Int = 10 + 20 //우항에는 값이 오면 된다 -> 식이 와도 된다
val number3: Int = if (number2 > 30) 40 else 50 //여기서 if는 식으로 취급
println(number3)

//표현과 식
//표현
// -어떤 것을 표현하기 위해서 사용하는 문법적인 요소
// -val, var, Int, Short -> 키워드
//식
// -값을 만들어 낸다
// -10+20, 10*20

//when
//대상을 정해두고 케이스를 나눈다
//자바의 switch 대신
val number4: Int = 5
val number5: String = "안녕하세요"
when (number4) {
    5 -> {
        println("5 입니다")
    }
    6 -> {
        println("6 입니다")
    }
    else -> {
        println("5와 6 둘다 아닙니다")
    }
}

//when문을 간단하게 사용하는 경우
when (number4) {
    5 -> println("5입니다")
    6 -> println("6입니다")
    else -> println("모르겠습니다")
}

//when은 타입을 맞춰줄 필요가 없다
when (number4) {
   4 -> println("number is 4")
   //"안녕하세요" -> println("hello")
   //is Boolean -> println("boolean")
}

when (number4){
    in 1..10-> println("number is in 1..10") //number4 in 1..10 -> Boolean
    in 20..30-> println("number is in 1..10")
    in 40..60-> println("number is in 1..10")
}