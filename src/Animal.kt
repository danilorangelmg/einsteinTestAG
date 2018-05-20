enum class Animal private constructor(var description: String?, var code: Int?) {

    ANIMAL_DOG("DOG", 1),
    ANIMAL_HORSE("HORSE", 2),
    ANIMAL_CAT("CAT", 3),
    ANIMAL_BIRD("BIRD", 4),
    ANIMAL_FISH("FISH", 5);


    companion object {

        fun getNameByCode(code: Int): String? {
            for (enumType in Animal.values()) {
                if (enumType.code == code) {
                    return enumType.description
                }
            }
            return ""
        }

        fun getEnum(code: Int): Animal? {
            for (enumType in Animal.values()) {
                if (enumType.code == code) {
                    return enumType
                }
            }

            return null
        }
    }


}
