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