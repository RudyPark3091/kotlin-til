import java.util.Scanner;

fun main(args: Array<String>) {
  val sc = Scanner(System.`in`);

  print("num1: ");
  var num1: Int = readLine()!!.toInt();

  print("num2: ");
  var num2: Int = sc.nextInt();
  println("num1 + num2 = ${num1 + num2}");
}
