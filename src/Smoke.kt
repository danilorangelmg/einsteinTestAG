enum class Smoke private constructor(var description: String?, var code: Int?) {

    SMOKE_BLENDS("BLENDS", 1),
    SMOKE_BLUEMASTER("BLUEMASTER", 2),
    SMOKE_DUNHIL("DUNHIL", 3),
    SMOKE_PALLMALL("PALLMALL", 4),
    SMOKE_PRINCE("PRINCE", 5);


    companion object {

        fun getNameByCode(code: Int): String? {
            for (enumType in Smoke.values()) {
                if (enumType.code == code) {
                    return enumType.description
                }
            }
            return ""
        }

        fun getEnum(code: Int): Smoke? {
            for (enumType in Smoke.values()) {
                if (enumType.code == code) {
                    return enumType
                }
            }

            return null
        }
    }


}
