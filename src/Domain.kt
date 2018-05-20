import java.util.*

class Subject() {
    var subjectValue: String = "";

    init {
        subjectValue = ""
       generateSubjectValue();
    }

    override fun toString(): String {
        return subjectValue;
    }

    fun generateSubjectValue() {
        var random: Random = Random();
        while (subjectValue.length < 25) {
            var value = random.nextInt(5) + 1;
            subjectValue += value;
        }
    }

    fun calculateFitness(): Int {

        //        /*
//
//        Rules
//
//        O Norueguês vive na primeira casa.
//        O Inglês vive na casa Vermelha.
//        O Sueco tem Cachorros como animais de estimação.
//        O Dinamarquês bebe Chá.
//        A casa Verde fica do lado esquerdo da casa Branca.
//        O homem que vive na casa Verde bebe Café.
//        O homem que fuma Pall Mall cria Pássaros.
//        O homem que vive na casa Amarela fuma Dunhill.
//        O homem que vive na casa do meio bebe Leite.
//        O homem que fuma Blends vive ao lado do que tem Gatos.
//        O homem que cria Cavalos vive ao lado do que fuma Dunhill.
//        O homem que fuma BlueMaster bebe Cerveja.
//        O Alemão fuma Prince.
//        O Norueguês vive ao lado da casa Azul.
//
//        O homem que fuma Blends é vizinho do que bebe Água.
//        */


        var house1Color: Int = Integer.parseInt(subjectValue.get(0).toString())
        var house1Nationality: Int = Integer.parseInt(subjectValue.get(1).toString())
        var house1Drink: Int =Integer.parseInt(subjectValue.get(2).toString())
        var house1Smoke: Int = Integer.parseInt(subjectValue.get(3).toString())
        var house1Animal: Int = Integer.parseInt(subjectValue.get(4).toString())

        var house2Color: Int = Integer.parseInt(subjectValue.get(5).toString())
        var house2Nationality: Int = Integer.parseInt(subjectValue.get(6).toString())
        var house2Drink: Int = Integer.parseInt(subjectValue.get(7).toString())
        var house2Smoke: Int = Integer.parseInt(subjectValue.get(8).toString())
        var house2Animal: Int = Integer.parseInt(subjectValue.get(9).toString())

        var house3Color: Int = Integer.parseInt(subjectValue.get(10).toString())
        var house3Nationality: Int = Integer.parseInt(subjectValue.get(11).toString())
        var house3Drink: Int = Integer.parseInt(subjectValue.get(12).toString())
        var house3Smoke: Int = Integer.parseInt(subjectValue.get(13).toString())
        var house3Animal: Int = Integer.parseInt(subjectValue.get(14).toString())

        var house4Color: Int = Integer.parseInt(subjectValue.get(15).toString())
        var house4Nationality: Int = Integer.parseInt(subjectValue.get(16).toString())
        var house4Drink: Int = Integer.parseInt(subjectValue.get(17).toString())
        var house4Smoke: Int = Integer.parseInt(subjectValue.get(18).toString())
        var house4Animal: Int = Integer.parseInt(subjectValue.get(19).toString())

        var house5Color: Int = Integer.parseInt(subjectValue.get(20).toString())
        var house5Nationality: Int = Integer.parseInt(subjectValue.get(21).toString())
        var house5Drink: Int = Integer.parseInt(subjectValue.get(22).toString())
        var house5Smoke: Int = Integer.parseInt(subjectValue.get(23).toString())
        var house5Animal: Int = Integer.parseInt(subjectValue.get(24).toString())

        var totalFitness: Int = 0;

        if (house1Nationality == Nationality.NATIONALITY_NORWEGIAN.code) {
            totalFitness+=1;
            //        O Norueguês vive na primeira casa.
//        System.out.println("1")
        }

        if (house1Color == Color.COLOR_RED.code && house1Nationality == Nationality.NATIONALITY_ENGLISH.code
                || house2Color == Color.COLOR_RED.code && house2Nationality == Nationality.NATIONALITY_ENGLISH.code
                || house3Color == Color.COLOR_RED.code && house3Nationality == Nationality.NATIONALITY_ENGLISH.code
                || house4Color == Color.COLOR_RED.code && house4Nationality == Nationality.NATIONALITY_ENGLISH.code
                || house5Color == Color.COLOR_RED.code && house5Nationality == Nationality.NATIONALITY_ENGLISH.code) {

            //        O Inglês vive na casa Vermelha.
            totalFitness+=1;
//        System.out.println("2")

        }

        if (house1Animal == Animal.ANIMAL_DOG.code && house1Nationality == Nationality.NATIONALITY_SWEDISH.code
                || house2Animal == Animal.ANIMAL_DOG.code && house2Nationality == Nationality.NATIONALITY_SWEDISH.code
                || house3Animal == Animal.ANIMAL_DOG.code && house3Nationality == Nationality.NATIONALITY_SWEDISH.code
                || house4Animal == Animal.ANIMAL_DOG.code && house4Nationality == Nationality.NATIONALITY_SWEDISH.code
                || house5Animal == Animal.ANIMAL_DOG.code && house5Nationality == Nationality.NATIONALITY_SWEDISH.code) {

            //        O Sueco tem Cachorros como animais de estimação.
            totalFitness+=1;
//        System.out.println("3")
        }

        if (house1Drink == Drink.DRINK_TEA.code && house1Nationality == Nationality.NATIONALITY_DANISH.code
                || house2Drink == Drink.DRINK_TEA.code && house2Nationality == Nationality.NATIONALITY_DANISH.code
                || house3Drink == Drink.DRINK_TEA.code && house3Nationality == Nationality.NATIONALITY_DANISH.code
                || house4Drink == Drink.DRINK_TEA.code && house4Nationality == Nationality.NATIONALITY_DANISH.code
                || house5Drink == Drink.DRINK_TEA.code && house5Nationality == Nationality.NATIONALITY_DANISH.code) {

            //        O Dinamarquês bebe Chá.
            totalFitness+=1;
//        System.out.println("4")
        }

        if (house2Color == Color.COLOR_GREEN.code && house3Color == Color.COLOR_WHITE.code
                || house3Color == Color.COLOR_GREEN.code && house4Color == Color.COLOR_WHITE.code
                || house4Color == Color.COLOR_GREEN.code && house5Color == Color.COLOR_WHITE.code) {

            //        A casa Verde fica do lado esquerdo da casa Branca.
            totalFitness+=1;
//        System.out.println("5")
        }

        if (house1Color == Color.COLOR_GREEN.code && house1Drink == Drink.DRINK_COFFEE.code
                || house2Color == Color.COLOR_GREEN.code && house2Drink == Drink.DRINK_COFFEE.code
                || house3Color == Color.COLOR_GREEN.code && house3Drink == Drink.DRINK_COFFEE.code
                || house4Color == Color.COLOR_GREEN.code && house4Drink == Drink.DRINK_COFFEE.code
                || house5Color == Color.COLOR_GREEN.code && house5Drink == Drink.DRINK_COFFEE.code) {

            //        O homem que vive na casa Verde bebe Café.
            totalFitness+=1;
//        System.out.println("6")
        }

        if (house1Smoke == Smoke.SMOKE_PALLMALL.code && house1Animal == Animal.ANIMAL_BIRD.code
                || house2Smoke == Smoke.SMOKE_PALLMALL.code && house2Animal == Animal.ANIMAL_BIRD.code
                || house3Smoke == Smoke.SMOKE_PALLMALL.code && house3Animal == Animal.ANIMAL_BIRD.code
                || house4Smoke == Smoke.SMOKE_PALLMALL.code && house4Animal == Animal.ANIMAL_BIRD.code
                || house5Smoke == Smoke.SMOKE_PALLMALL.code && house5Animal == Animal.ANIMAL_BIRD.code) {

            //        O homem que fuma Pall Mall cria Pássaros.
            totalFitness+=1;
//        System.out.println("7")
        }

        if (house1Color == Color.COLOR_YELLOW.code && house1Smoke == Smoke.SMOKE_DUNHIL.code
                || house2Color == Color.COLOR_YELLOW.code && house2Smoke == Smoke.SMOKE_DUNHIL.code
                || house3Color == Color.COLOR_YELLOW.code && house3Smoke == Smoke.SMOKE_DUNHIL.code
                || house4Color == Color.COLOR_YELLOW.code && house4Smoke == Smoke.SMOKE_DUNHIL.code
                || house5Color == Color.COLOR_YELLOW.code && house5Smoke == Smoke.SMOKE_DUNHIL.code) {
//        O homem que vive na casa Amarela fuma Dunhill.
            totalFitness+=1;
//        System.out.println("8")
        }

        if (house3Drink == Drink.DRINK_MILK.code) {
            totalFitness+=1;
            //        O homem que vive na casa do meio bebe Leite.
//        System.out.println("9")
        }

        if (house1Smoke == Smoke.SMOKE_BLENDS.code && house2Animal == Animal.ANIMAL_CAT.code
                || house2Smoke == Smoke.SMOKE_BLENDS.code && house3Animal == Animal.ANIMAL_CAT.code
                || house3Smoke == Smoke.SMOKE_BLENDS.code && house4Animal == Animal.ANIMAL_CAT.code
                || house4Smoke == Smoke.SMOKE_BLENDS.code && house5Animal == Animal.ANIMAL_CAT.code
                || house5Smoke == Smoke.SMOKE_BLENDS.code && house4Animal == Animal.ANIMAL_CAT.code
                || house4Smoke == Smoke.SMOKE_BLENDS.code && house3Animal == Animal.ANIMAL_CAT.code
                || house3Smoke == Smoke.SMOKE_BLENDS.code && house2Animal == Animal.ANIMAL_CAT.code
                || house2Smoke == Smoke.SMOKE_BLENDS.code && house1Animal == Animal.ANIMAL_CAT.code) {

            //        O homem que fuma Blends vive ao lado do que tem Gatos.
            totalFitness+=1;
//        System.out.println("10")
        }

        if (house1Smoke == Smoke.SMOKE_DUNHIL.code && house2Animal == Animal.ANIMAL_HORSE.code
                || house2Smoke == Smoke.SMOKE_DUNHIL.code && house3Animal == Animal.ANIMAL_HORSE.code
                || house3Smoke == Smoke.SMOKE_DUNHIL.code && house4Animal == Animal.ANIMAL_HORSE.code
                || house4Smoke == Smoke.SMOKE_DUNHIL.code && house5Animal == Animal.ANIMAL_HORSE.code
                || house5Smoke == Smoke.SMOKE_DUNHIL.code && house4Animal == Animal.ANIMAL_HORSE.code
                || house4Smoke == Smoke.SMOKE_DUNHIL.code && house3Animal == Animal.ANIMAL_HORSE.code
                || house3Smoke == Smoke.SMOKE_DUNHIL.code && house2Animal == Animal.ANIMAL_HORSE.code
                || house2Smoke == Smoke.SMOKE_DUNHIL.code && house1Animal == Animal.ANIMAL_HORSE.code) {

            //        O homem que cria Cavalos vive ao lado do que fuma Dunhill.
            totalFitness+=1;
//        System.out.println("11")
        }

        if (house1Smoke == Smoke.SMOKE_BLUEMASTER.code && house1Drink == Drink.DRINK_BEER.code
                || house2Smoke == Smoke.SMOKE_BLUEMASTER.code && house2Drink == Drink.DRINK_BEER.code
                || house3Smoke == Smoke.SMOKE_BLUEMASTER.code && house3Drink == Drink.DRINK_BEER.code
                || house4Smoke == Smoke.SMOKE_BLUEMASTER.code && house4Drink == Drink.DRINK_BEER.code
                || house5Smoke == Smoke.SMOKE_BLUEMASTER.code && house5Drink == Drink.DRINK_BEER.code) {
//          O homem que fuma BlueMaster bebe Cerveja.
            totalFitness+=1;
//        System.out.println("12")
        }

        if (house1Smoke == Smoke.SMOKE_PRINCE.code && house1Nationality == Nationality.NATIONALITY_GERMANY.code
                || house2Smoke == Smoke.SMOKE_PRINCE.code && house2Nationality == Nationality.NATIONALITY_GERMANY.code
                || house3Smoke == Smoke.SMOKE_PRINCE.code && house3Nationality == Nationality.NATIONALITY_GERMANY.code
                || house4Smoke == Smoke.SMOKE_PRINCE.code && house4Nationality == Nationality.NATIONALITY_GERMANY.code
                || house5Smoke == Smoke.SMOKE_PRINCE.code && house5Nationality == Nationality.NATIONALITY_GERMANY.code) {

            //        O Alemão fuma Prince.
            totalFitness+=1;
//        System.out.println("13")
        }

        if (house1Nationality == Nationality.NATIONALITY_NORWEGIAN.code && house2Color == Color.COLOR_BLUE.code
                || house2Nationality == Nationality.NATIONALITY_NORWEGIAN.code && house3Color == Color.COLOR_BLUE.code
                || house3Nationality == Nationality.NATIONALITY_NORWEGIAN.code && house4Color == Color.COLOR_BLUE.code
                || house4Nationality == Nationality.NATIONALITY_NORWEGIAN.code && house5Color == Color.COLOR_BLUE.code
                || house5Nationality == Nationality.NATIONALITY_NORWEGIAN.code && house4Color == Color.COLOR_BLUE.code
                || house4Nationality == Nationality.NATIONALITY_NORWEGIAN.code && house3Color == Color.COLOR_BLUE.code
                || house3Nationality == Nationality.NATIONALITY_NORWEGIAN.code && house2Color == Color.COLOR_BLUE.code
                || house2Nationality == Nationality.NATIONALITY_NORWEGIAN.code && house1Color == Color.COLOR_BLUE.code) {
//        O Norueguês vive ao lado da casa Azul.
//        System.out.println("14")
            totalFitness+=1;

        }

        if (house1Smoke == Smoke.SMOKE_BLENDS.code && house2Drink == Drink.DRINK_WATER.code
                || house2Smoke == Smoke.SMOKE_BLENDS.code && house3Drink == Drink.DRINK_WATER.code
                || house3Smoke == Smoke.SMOKE_BLENDS.code && house4Drink == Drink.DRINK_WATER.code
                || house4Smoke == Smoke.SMOKE_BLENDS.code && house5Drink == Drink.DRINK_WATER.code
                || house5Smoke == Smoke.SMOKE_BLENDS.code && house4Drink == Drink.DRINK_WATER.code
                || house4Smoke == Smoke.SMOKE_BLENDS.code && house3Drink == Drink.DRINK_WATER.code
                || house3Smoke == Smoke.SMOKE_BLENDS.code && house2Drink == Drink.DRINK_WATER.code
                || house2Smoke == Smoke.SMOKE_BLENDS.code && house1Drink == Drink.DRINK_WATER.code) {
//        System.out.println("15")
            totalFitness+=1;
        }

        if (house1Color != house2Color && house1Color != house3Color && house1Color != house4Color && house1Color != house5Color
                && house2Color != house3Color && house2Color != house4Color && house2Color != house5Color
                && house3Color != house4Color && house3Color != house5Color
                && house4Color != house5Color) {
            totalFitness+=1;
        }

        if (house1Nationality != house2Nationality && house1Nationality != house3Nationality && house1Nationality != house4Nationality && house1Nationality != house5Nationality
                && house2Nationality != house3Nationality && house2Nationality != house4Nationality && house2Nationality != house5Nationality
                && house3Nationality != house4Nationality && house3Nationality != house5Nationality
                && house4Nationality != house5Nationality) {
            totalFitness+=1;
        }

        if (house1Drink!= house2Drink && house1Drink != house3Drink && house1Drink != house4Drink && house1Drink != house5Drink
                && house2Drink != house3Drink && house2Drink != house4Drink && house2Drink != house5Drink
                && house3Drink != house4Drink && house3Drink != house5Drink
                && house4Drink != house5Drink) {
            totalFitness+=1;
        }

        if (house1Smoke!= house2Smoke && house1Smoke != house3Smoke && house1Smoke != house4Smoke && house1Smoke != house5Smoke
                && house2Smoke != house3Smoke && house2Smoke != house4Smoke && house2Smoke != house5Smoke
                && house3Smoke != house4Smoke && house3Smoke != house5Smoke
                && house4Smoke != house5Smoke) {
            totalFitness+=1;
        }

        if (house1Animal!= house2Animal && house1Animal != house3Animal && house1Animal != house4Animal && house1Animal != house5Animal
                && house2Animal != house3Animal && house2Animal != house4Animal && house2Animal != house5Animal
                && house3Animal != house4Animal && house3Animal != house5Animal
                && house4Animal != house5Animal) {
            totalFitness+=1;
        }


        return totalFitness
    }

    fun mutate() {
        val r = Random()
        //se for mutar, cria um gene aleatório
        if (r.nextDouble() <= 0.3) {
            val caracteres = subjectValue;
            var geneNovo = ""
            val posAleatoria = r.nextInt(subjectValue.length)
            for (i in 0 until subjectValue.length) {
                if (i == posAleatoria) {
                    var value = r.nextInt(5) + 1;
                    geneNovo += caracteres.get(value)
                } else {
                    geneNovo += subjectValue.get(i)
                }

            }
            this.subjectValue = geneNovo
        }
    }

}

data class Population(val list: LinkedList<Subject>) {

    fun createInitialPopulation(populationSize: Int) {
        while (list.size < populationSize) {
            var subject: Subject = Subject();
            list.add(subject);
        }
    }

}