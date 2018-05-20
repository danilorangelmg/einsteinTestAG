enum class Drink private constructor(var description: String?, var code: Int?) {

    DRINK_WATER("WATER", 1),
    DRINK_COFFEE("COFFEE", 2),
    DRINK_BEER("BEER", 3),
    DRINK_TEA("TEA", 4),
    DRINK_MILK("MILK", 5);


    companion object {

        fun getNameByCode(code: Int): String? {
            for (enumType in Drink.values()) {
                if (enumType.code == code) {
                    return enumType.description
                }
            }
            return ""
        }

        fun getEnum(code: Int): Drink? {
            for (enumType in Drink.values()) {
                if (enumType.code == code) {
                    return enumType
                }
            }

            return null
        }
    }


}
