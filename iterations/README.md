## 반복문
for, while, do-while문이 있음  
``` kotlin
fun main() {
  for (i in 1..10) {
    println(i);
  }
}
```
1부터 10까지 정수를 출력하는 예제  
  
## for Loop
자바의 for문은 선언문; 조건문; 증감식 의 구조였지만 kotlin에서는 in 키워드를 사용해 range로 표현  
또한 파이썬과 같이 배열요소에 대한 iteration 가능
``` kotlin
fun main() {
  val arr: Array<Int> = arrayOf(1,2,3,4);
  for (item in arr) {
    println(item);
  }
}
```
  
## while Loop
while/ do-while 문은 자바와 동일하게 동작
``` kotlin
fun main() {
  var i = 1;
  while (i <= 10) {
    println(i);
    i++;
  }
}
```
``` kotlin
fun main() {
  var i = 1;
  do {
    println(i);
    i++;
  } while (i <= 10)
}
```
