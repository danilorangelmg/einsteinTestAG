enum class Type private constructor(var description: String?, var code: Int?) {

    COLOR_YELLOW("COLOR", 1),
    COLOR_BLUE("NATIONALITY", 2),
    COLOR_WHITE("DRINK", 3),
    COLOR_GREEN("SMOKE", 4),
    COLOR_RED("ANIMAL", 5);


    companion object {

        fun getNameByCode(code: Int): String? {
            for (enumType in Color.values()) {
                if (enumType.code == code) {
                    return enumType.description
                }
            }
            return ""
        }

        fun getEnum(code: Int): Color? {
            for (enumType in Color.values()) {
                if (enumType.code == code) {
                    return enumType
                }
            }

            return null
        }
    }
}
