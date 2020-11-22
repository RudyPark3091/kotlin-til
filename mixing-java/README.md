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
  
## Command Line Usage
IDE의 도움을 받지 않고 터미널에서 자바와 코틀린을 섞어 사용하는 방법은 아래와 같다.  
User.kt 에서 클래스를 선언한다.  
``` kotlin
// User.kt
class User(var id: Int, var name: String)
```
다음으로 선언한 클래스를 사용할 메인함수를 정의한다.  
``` java
public class Main {
  public static void main(String[] args) {
    User user = new User(1, "RudyPark");
    System.out.println(user.getId());
    System.out.println(user.getName());
  }
}
```
선언한 파일들을 컴파일한다.  
이때 코틀린 파일을 먼저 컴파일하는데, 형식은 jar로 지정한다.  
``` Shell
kotlinc User.kt -include-runtime -d User.jar
// Windows 에선
kotlinc.bat User.kt -include-runtime -d "PATH\User.jar"
```
이때 -include-runtime 옵션을 줘서 kotlin runtime 환경을 포함해 자바 환경에서 실행가능하도록 한다.  
  
kotlin 파일을 컴파일한 뒤 자바 파일을 컴파일한다.  
``` java
// 컴파일
javac -cp .:PATH_TO_JARFILE/User.jar Main.java

// 컴파일된 class파일 실행
// java 11 이상에선 컴파일없이 바로 실행가능 (Main 대신 Main.java 입력)
java -cp .:PATH_TO_JARFILE/User.jar Main
```
실행할 시 객체를 만들때 지정한 parameter대로 1, RudyPark가 출력됨.  
  
## Mixing Advantage?
왜 굳이 다른 두 언어를 섞어서 사용하나에는 여러 답변이 있겠지만, 가장 큰 이유는 생산성.  
자바에서 Lombok 라이브러리를 사용할 수도 있지만, kotlin으로 클래스 선언 한줄이면 알아서 getter/setter까지 만들어줌.  
또한 java에는 없는 `data class`를 사용해 추가 기능도 간단히 구현할 수 있으므로 안 쓸 이유가 없음.  
그냥 java 대신 kotlin을 통으로 쓰는게 마음에 들지만... 레거시 시스템이 있으니 어쩔수없음.  
