//100보다 작은 숫자를 넣어주면, 1씩 증가시키고 100이 되면 종료되는 함수
fun increaseOne(number:Int){
    var myNumber: Int = number
    while (myNumber<100) {
        myNumber++
        println("확인용")
    }
    return
}

increaseOne(90)