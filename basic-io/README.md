## Hello World
``` kotlin
fun main(args: Array<String>) {
  println("Hello World");
}
```
프로그램의 메인 진입점은 main함수 (함수형 패러다임 지원)  
함수선언 -> fun 키워드  
*콘솔 출력: println() 함수*  
  
#### 개행없는 출력
``` kotlin
print("Hello ");
print("World");
 ```
출력결과: Hello World (끝에도 개행없음)
  
## 변수선언
``` kotlin
fun main(args: Array<String>) {
  val a = 0;
  val b = 1;

  println(a);
  println(b);
}
```
var 또는 val 키워드로 변수선언  
val -> 수정할 수 없는 값(불변): value  
 만약 값을 변경할 시 컴파일 에러 발생  
 변수가 참조하는 객체의 내부 변수는 변경 가능  
var -> 수정할 수 있는 값(가변): variable  
   
변수 선언시에 값을 초기화하여 타입 추론이 가능하면 타입 선언을 하지않아도 됨  
하지만 선언시 초기화하지 않는다면 타입선언을 해줘야함  
  
#### 문자열 템플릿
``` kotlin
fun main(args: Array<String>) {
  val a = 0;
  val b = 1;

  println("a is $a");
  println("b is $b");
  println("a + b is ${a + b}");
}
```
$ 문자를 이용해 문자열 템플릿을 사용 가능  
  
## Standard input
``` kotlin
fun main(args: Array<String>) {
  var input = readLine(); --- (1)
  var input2 = readLine()!! --- (2)
  var input2 = readLine()? --- (3)
}
```
(1): 가장 기본적인 input method - 반환형은 String type  
(2): !!을 붙이면 변수가 NULL 값이 아님을 명시
(3): ?을 붙이면 변수가 NULL 일 시에 NULL을 반환
  
## Input으로부터 타입 캐스팅
``` kotlin
import java.util.Scanner;

fun main(args: Array<String>) {
  val sc = Scanner(System.`in`);
  var number: Int = sc.nextInt(); --- (1)
  var number2: Int = readLine()!!.toInt() --- (2)

  println("through Scanner class: $number");
  println("through toInt() method: $number2");
}
```
자바의 Scanner 클래스를 가져와 사용하거나, built-in toInt()메소드를 사용해 형변환 가능  

