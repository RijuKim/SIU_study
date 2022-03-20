// range
for (value in 0..3) {
    println("반복")
}

// range + step
for (value in 0..5 step (2)) {//0->2->4
    println("사과")
}

// progression + downTO
for (value in 5 downTo 0) {
    println("포도")
}

//

val numbers = listOf<Int>(0, 1, 2, 3)
for (number in numbers) {
    println(number)
}
for (i in 0..numbers.size){
    println("반복3")
}
for (i in 0 until numbers.size){//0..3
    println("반복4")
}
for ((index, number) in numbers.withIndex()){
    println("" + index+"  |  "+number)
}

//foreach
//for문을 대체가능
numbers.forEach { number-> //이름을 지정하지 않으면 기본값은 it이다
    println(number)
}
