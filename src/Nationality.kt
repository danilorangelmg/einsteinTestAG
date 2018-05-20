enum class Nationality private constructor(var description: String?, var code: Int?) {

    NATIONALITY_GERMANY("GERMANY", 1),
    NATIONALITY_DANISH("DANISH", 2),
    NATIONALITY_ENGLISH("ENGLISH", 3),
    NATIONALITY_NORWEGIAN("NORWEGIAN", 4),
    NATIONALITY_SWEDISH("SWEDISH", 5);


    companion object {

        fun getNameByCode(code: Int): String? {
            for (enumType in Nationality.values()) {
                if (enumType.code == code) {
                    return enumType.description
                }
            }
            return ""
        }

        fun getEnum(code: Int): Nationality? {
            for (enumType in Nationality.values()) {
                if (enumType.code == code) {
                    return enumType
                }
            }

            return null
        }
    }

}
