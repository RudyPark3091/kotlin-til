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

fun main(args: Array<String>) {
	var str = "Lorem ipsum 1234"
	var regex = """\w""".toRegex()
	var matchResult = regex.find(str)
	walkThrough(matchResult)
	// L, o, r, e, m, i, p, s, u, m, 1, 2, 3, 4
	// \w: 영어, 숫자, _를 의미 - [A-Za-z0-9_] 와 같은 효과
	// \w+으로 실행시 Lorem, ipsum, 1234

	regex = """\d+""".toRegex()
	matchResult = regex.find(str)
	walkThrough(matchResult)
	// 1234
	// \d: 숫자를 의미

	regex = """\a+""".toRegex()
	matchResult = regex.find(str)
	walkThrough(matchResult)
	// 1234
	// \d: 숫자를 의미

	regex = """\w+\s""".toRegex()
	matchResult = regex.find(str)
	walkThrough(matchResult)
	// Lorem , ipsum 
	// ** Lorem(공백), ipsum(공백)을 출력
	// \s: 스페이스, 탭, 폼 피드, 줄바꿈 등을 포함한 공백문자를 의미
}
