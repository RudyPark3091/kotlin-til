## Java와 함께 사용하기
코틀린으로 작성한 함수를 command line에서 자바와 함께 사용하려면
``` kotlin
// kotlin - Function.kt
fun printInfo() {
  println("Hello World");
}

fun main() {
  printInfo();
}
```
  
``` java
// java - Main.java
public class main {
  public static void main(String[] args) {
    Function.printInfo();
  }
}

// 출력결과: Hello World
```
위와 같이 가능하다.  
이때 코틀린 파일 상단에 다음과 같이 어노테이션을 사용하면 자바에서 호출할 이름을 지정하는것이 가능하다.  
  
``` kotlin
@file:JvmName("MyFunction");
...
```
  
``` java
...
  MyFunction.printInfo();
...
```
