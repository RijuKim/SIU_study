//Scope

var number: Int = 1
fun changeNumber() {
    var internalNumber: Int = 2
    number = 20 // 하위 스코프에서 상위 멤버에 접근 가능
    var number: String = "재정의" //하위 스코프에서 상위 멤버를 재정의 할 수 있다
    println(number)
}
changeNumber()
println(number)

//internalNumber = 30 상위 스코프에서 하위 스코프 멤버에 접근할 수 없다
//하위 -> 상위 접근가능
//상위 -> 하위 접근 불가 (사실상 하위는 독립적)

//접근제한자
class Numbers(private var number: Int = 10) {
    fun changeNumber() {
        this.number = 100 //Numbers라는 스코프 안에 존재하기 때문에 number에 접근/변경할 수 있음
    }

    fun whatIsNumber(): Int {
        return this.number
    }
}

val numbers = Numbers()
println(numbers.whatIsNumber())
//println(numbers.number) -> Numbers 밖에 존재하기 때문에 number에 접근/변경할 수 없음
//numbers.number = 100 -> Numbers 밖에 존재하기 때문에 number에 접근/변경할 수 없음
numbers.changeNumber()
println(numbers.whatIsNumber())