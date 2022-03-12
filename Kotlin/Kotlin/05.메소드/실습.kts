fun plusNumbers(first_num: Int, second_num Int): Int {

    val result: Int = first_num + second_num
    return result
}

plusNumbers(first_num = 10, second_num = 20) //->30
plusNumbers(10, 20) //->30

val result: Int = plusNumbers(first_num = 5, second_num=7)
println(result)