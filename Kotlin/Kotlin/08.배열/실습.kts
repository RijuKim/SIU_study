//배열을 선언하는 방법 (1)
val array1 = arrayOf(true, "Hi", 0, 2.2, null)
val array2 = arrayOf<Int?>(1, 2, 3, null)
val array3 = intArrayOf(1, 2, 3, 4, 5)

//배열을 선언하는 방법 (2)
var array4 = Array(10, { 0 }) //command 누르고 마우스 클릭하면 함수정의로 이동
println(array4[0])
println(array4[2])
println(array4[6])
var array5 = IntArray(10, { 0 })

//배열을 선언하는 방법 (3)
var array6 = Array<Int>(10, { 0 })
var array7 = Array <String>(10, { "" })

var array8 = arrayOf<Int>(10, 20, 30, 40)
println(array8[2])
println(array8.get(2))

array8[0] = 100
println(array8[0])

array8.set(0, 200)
println(array8.get(0))


//배열의 인자로 변수를 넣는 방법 / 배열의 값을 변수의 값으로 할당하는 방법
val examScore1: Int = 100
val examScore2: Int = 90
val examScore3: Int = 80
val examScores = arrayOf<Int>(examScore1, examScore2, examScore3)

val examScore4=examScores[0]
println(examScore4)