## 배열의 선언
``` kotlin
fun main() {
  val arr: Array<Int> = arrayOf(1,2,3,4);
}
```
kotlin에서의 배열은 Array클래스를 기반으로 만들어짐  
primitive type 값을 담을 IntArray, ShortArray 등이 선언되어 있음  
Array 클래스는 IntArray 등에 비해 메모리를 많이 소모함  
``` kotlin
fun main() {
  val arr: IntArray = intArrayOf(1,2,3,4);
}
```
  
또는 단순히 Array 클래스의 생성자를 호출해 배열을 만들 수 있음
``` kotlin
fun main() {
  val arr: Array<Int> = Array(4, {0});
  // 길이 4의 Int형이며 0으로 채워진 배열 선언
}
```
  
## 배열요소에 접근
getter/setter 메소드가 선언되어 있지만 [] 표기법으도 접근가능함
``` kotlin
fun main() {
  val arr: Array<Int> = arrayOf(1,2,3);

  val firstElement: Int = arr.get(0);
  val firstElement2: Int = arr[0];
  // 위 두 라인은 같은 의미

  arr.set(0, 2);
  arr[0] = 2;
}
```
  
+ 연산자자로 배열을 concatenate 하는것이 가능함
``` kotlin
val arr: IntArray = intArrayOf(1,2,3);
val arr2: IntArray = intArrayOf(4,5,6);

val arr3: IntArray = arr + arr2;
// arr3 = [1, 2, 3, 4, 5, 6];
```
  
## 콜백함수
```kotlin
val arr: Array<Int> = Array(4, {i -> (i * i)});
```
위 코드에서 arr은 0, 1, 4, 9로 구성됨  
자바스크립트에서 사용하는 콜백함수와 같은 개념을 지원함  
  


