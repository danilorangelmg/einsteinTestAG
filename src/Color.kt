enum class Color private constructor(var description: String?, var code: Int?) {

    COLOR_YELLOW("YELLOW", 1),
    COLOR_BLUE("BLUE", 2),
    COLOR_WHITE("WHITE", 3),
    COLOR_GREEN("GREEN", 4),
    COLOR_RED("RED", 5);


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
