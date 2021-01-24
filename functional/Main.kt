fun print(body: (a: Int, b: Int) -> Int ) {
	println(body(5, 6))
}

fun callPrint() {
	fun sum(a: Int, b: Int) = a + b
	fun mul(a: Int, b: Int) = a * b

	// using lambda as body
	print({a, _ -> a})

	print(::sum)
	print(::mul)
}

// no nested Function() instance in java code
// with 'inline' keyword
inline fun doSomething(body: () -> Unit) {
	body()
}

fun callInline() {
	doSomething({ println("Hello") })
}

fun main() {
	callPrint()
	callInline()
}
