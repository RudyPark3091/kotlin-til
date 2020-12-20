// 정규식 탐색 결과 출력함수
fun walkThrough(matchResult: MatchResult?) {
	var m = matchResult
	if (m?.value != null) {
		print("${m.value}, ")
	}

	while (m?.next() != null) {
		m = m.next()
		print("${m?.value}, ")
	}
	println()
}

// POSIX 표준 정규식
fun main(args: Array<String>) {
	var str = "babaabaaabaaaab"
	var regex = """a*b""".toRegex()
	var matchResult = regex.find(str)
	walkThrough(matchResult)
	// b, ab, aab, aaab, aaaab
	// *: 0회 이상 반복

	regex = """a+b""".toRegex()
	matchResult = regex.find(str)
	walkThrough(matchResult)
	// ab, aab, aaab, aaaab
	// +: 1회 이상 반복

	regex = """a?b""".toRegex()
	matchResult = regex.find(str)
	walkThrough(matchResult)
	// b, ab, ab, ab, ab
	// ?: 0회 또는 1회

	regex = """a{2,3}b""".toRegex()
	matchResult = regex.find(str)
	walkThrough(matchResult)
	// aab, aaab, aaab
	// ** 쉼표 다음에 공백이 있으면 안됨 **
	// {m,n}: m회이상 n회 이하 반복
	// {m,}: m회이상 반복
	// {m}: 정확히 m회 반복

	regex = """a.b""".toRegex()
	matchResult = regex.find(str)
	walkThrough(matchResult)
	// aab, aab, aab
	// .: 문자 하나를 의미

	// target string 변경
	str = "Asd ASdf 1234"

	regex = """[a-z]""".toRegex()
	matchResult = regex.find(str)
	walkThrough(matchResult)
	// s, d, d, f
	// []: 문자 셋을 의미 -> [abcd]a 는 aa, ba, ca, da를 모두 포함
	// 여기서는 a to z, 영어 소문자를 의미

	regex = """[A-Za-z]""".toRegex()
	matchResult = regex.find(str)
	walkThrough(matchResult)
	// A, s, d, A, S, d, f
	// 대문자, 소문자를 의미 - [A-z]와 같은 의미

	regex = """[0-9]""".toRegex()
	matchResult = regex.find(str)
	walkThrough(matchResult)
	// 1, 2, 3, 4
	// 숫자를 의미
}
