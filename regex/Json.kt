fun main(args: Array<String>) {
	var jsonData = """
	{
		"name": "RudyPark3091"
	}
	"""

	// () 안으로 감싸면 그룹화
	// 아래 정규식에서 그룹 두개를 지정함
	var regex = """\{\s*"(\w+)"\s*:\s*"(\w+)"\s*\}""".toRegex()
	var matchResult = regex.find(jsonData)

	// 비구조화 할당 또는 구조 분해 할당 이라 함
	// MatchResult 객체의 destructured는 정규 표현식 그룹을 반환
	val (key, value) = matchResult!!.destructured

	println("key " + key)
	println("value " + value) 
	println()

	jsonData = """
{
	"name": "HM",
	"alias": "RudyPark3091",
	"lang": "kotlin"
}
	"""

	// replace문을 사용하면 json형식 string을 한줄로 압축할 수 있음
	println("raw json string " + jsonData)
	var shortJson = jsonData.replace("\\s*".toRegex(), "")
	println("shortened json string " + shortJson)
}
