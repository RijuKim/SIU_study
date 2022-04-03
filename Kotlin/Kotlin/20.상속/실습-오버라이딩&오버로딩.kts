//오버로딩
class Sum {
    fun sum(): Int {
        return 10
    }

    fun sum(number1: Int): Int {
        return number1 + 10
    }

    fun sum(number1: Int, number2: Int): Int {
        return number1 + number2 + 10
    }
}

val sum = Sum()
println(sum.sum())
println(sum.sum(10))
println(sum.sum(10, 10))

//오버라이딩
open class Warrior1(var name: String, var power: Int, var type: String) { //부모클래스, 슈퍼클래스
    open fun attack() {
        println("공격")
    }

    open fun getDefensePower(): Int {
        return 10
    }
}

class DefenseWarrior1 constructor(name: String, power: Int) : Warrior1(name, power, "골렘") {
    fun defense() {
        println("방어")
    }

    override fun attack() {
        //super.attack() //슈퍼클래스의 attack 함수
        println("파이어")
    }

    override fun getDefensePower(): Int {
        //return 15
        val defaultWarriorDefensePower: Int = super.getDefensePower()
        return defaultWarriorDefensePower + 5
    }
}

val defenseWarrior = DefenseWarrior1("홍길동", 100)
defenseWarrior.attack()
defenseWarrior.getDefensePower()