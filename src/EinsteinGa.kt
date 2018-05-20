import java.util.*

var maxPopulation: Int = 5500;

fun main(args: Array<String>) {
    init();
}

fun init() {
    var population: Population = Population(LinkedList());
    population.createInitialPopulation(maxPopulation);

    var result = "1413322412535444125535321";
    var index = 0;
    var verificator = 0;
    var lastFitness = 0;

    while (true) {
        population = initCrossOver(population);
        var best = population.list.get(0).subjectValue;
        var resultFitness = 0;
        for (i in 0 until result.length) {
            if (best.get(i).equals(result.get(i))) {
                resultFitness++;
            }
        }

        System.out.println("Geração " + index + " RFitness " + resultFitness + " | " + population.list.get(0).calculateFitness() + " | " + population.list.get(0).toString());
        if (population.list.get(0).calculateFitness() == 20) {
            System.out.println("Achou o resultado")
            var subject = population.list.get(0).subjectValue;
            var resultToString = "\nHouse 1 Color: " + Color.getNameByCode(Integer.parseInt(subject.get(0).toString())) + " Nationality: " +
                    Nationality.getNameByCode(Integer.parseInt(subject.get(1).toString())) + " Drink: " +
                    Drink.getNameByCode(Integer.parseInt(subject.get(2).toString())) + " Smoke: " +
                    Smoke.getNameByCode(Integer.parseInt(subject.get(3).toString())) + " Animal: " +
                    Animal.getNameByCode(Integer.parseInt(subject.get(4).toString())) +

                    "\nHouse 2 Color: " + Color.getNameByCode(Integer.parseInt(subject.get(5).toString())) + " Nationality: " +
                    Nationality.getNameByCode(Integer.parseInt(subject.get(6).toString())) + " Drink: " +
                    Drink.getNameByCode(Integer.parseInt(subject.get(7).toString())) + " Smoke: " +
                    Smoke.getNameByCode(Integer.parseInt(subject.get(8).toString())) + " Animal: " +
                    Animal.getNameByCode(Integer.parseInt(subject.get(9).toString())) +

                    "\nHouse 3 Color: " + Color.getNameByCode(Integer.parseInt(subject.get(10).toString())) + " Nationality: " +
                    Nationality.getNameByCode(Integer.parseInt(subject.get(11).toString())) + " Drink: " +
                    Drink.getNameByCode(Integer.parseInt(subject.get(12).toString())) + " Smoke: " +
                    Smoke.getNameByCode(Integer.parseInt(subject.get(13).toString())) + " Animal: " +
                    Animal.getNameByCode(Integer.parseInt(subject.get(14).toString())) +

                    "\nHouse 4 Color: " + Color.getNameByCode(Integer.parseInt(subject.get(15).toString())) + " Nationality: " +
                    Nationality.getNameByCode(Integer.parseInt(subject.get(16).toString())) + " Drink: " +
                    Drink.getNameByCode(Integer.parseInt(subject.get(17).toString())) + " Smoke: " +
                    Smoke.getNameByCode(Integer.parseInt(subject.get(18).toString())) + " Animal: " +
                    Animal.getNameByCode(Integer.parseInt(subject.get(19).toString())) +

                    "\nHouse 5 Color: " + Color.getNameByCode(Integer.parseInt(subject.get(20).toString())) + " Nationality: " +
                    Nationality.getNameByCode(Integer.parseInt(subject.get(21).toString())) + " Drink: " +
                    Drink.getNameByCode(Integer.parseInt(subject.get(22).toString())) + " Smoke: " +
                    Smoke.getNameByCode(Integer.parseInt(subject.get(23).toString())) + " Animal: " +
                    Animal.getNameByCode(Integer.parseInt(subject.get(24).toString()));

            System.out.println(resultToString);

            break
        } else {
            if (lastFitness != population.list.get(0).calculateFitness()) {
                lastFitness = population.list.get(0).calculateFitness();
                verificator = 0;
            } else {
                verificator++;
            }
        }

        if (verificator == 500) {
            init();
            break
        }

        index++;

    }
}

fun initCrossOver(population: Population): Population {

    var random: Random = Random();
    var sorted = population.list.sortedByDescending { it.calculateFitness() }
    var newPopulation: Population = Population(LinkedList());
    var populationCross: Population = Population(LinkedList<Subject>(sorted));

    //elitismo
    newPopulation.list.add(sorted.get(0));
    newPopulation.list.add(sorted.get(1));
    newPopulation.list.add(sorted.get(2));
    newPopulation.list.add(sorted.get(3));
    newPopulation.list.add(sorted.get(4));


    while (newPopulation.list.size < maxPopulation) {
        var selected = selectToTournament(populationCross);

        var son1: Subject;
        var son2: Subject;
        if (true) {
            var sons = crossover(selected.get(1), selected.get(0))
            son1 = sons.get(0);
            son2 = sons.get(1);

            son1.mutate();
            son1.mutate();
            son1.mutate();
            son1.mutate();
            son1.mutate();
            son1.mutate();


            son2.mutate();
            son2.mutate();
            son2.mutate();
            son2.mutate();
            son2.mutate();
            son2.mutate();


        } else {
            son1 = selected.get(0);
            son2 = selected.get(1);
        }

        newPopulation.list.add(son1);
        newPopulation.list.add(son2);
    }

    return newPopulation;
}

fun crossover(subject1: Subject, subject2: Subject): LinkedList<Subject> {
    val r = Random()

    //sorteia o ponto de corte
    val pontoCorte1 = r.nextInt(subject1.subjectValue.length / 2 - 2) + 1
    val pontoCorte2 = r.nextInt(subject1.subjectValue.length / 2 - 2) + subject1.subjectValue.length / 2

    val sons = LinkedList<Subject>()

    //pega os genes dos pais
    val genePai1 = subject1.subjectValue
    val genePai2 = subject2.subjectValue

    var geneFilho1: String
    var geneFilho2: String

    //realiza o corte,
    geneFilho1 = genePai1.substring(0, pontoCorte1)
    geneFilho1 += genePai2.substring(pontoCorte1, pontoCorte2)
    geneFilho1 += genePai1.substring(pontoCorte2, genePai1.length)

    geneFilho2 = genePai2.substring(0, pontoCorte1)
    geneFilho2 += genePai1.substring(pontoCorte1, pontoCorte2)
    geneFilho2 += genePai2.substring(pontoCorte2, genePai2.length)

    //cria o novo indivíduo com os genes dos pais
    var son1: Subject = Subject();
    son1.subjectValue = geneFilho1;
    var son2: Subject = Subject();
    son2.subjectValue = geneFilho2;

    sons.add(son1);
    sons.add(son2);

    return sons
}

fun selectToTournament(population: Population): LinkedList<Subject> {
    var random: Random = Random();
    var elegible: Int = (maxPopulation / 4).toInt();
    var element1 = random.nextInt(elegible);
    var element2 = random.nextInt(elegible);

    if (element1 < 0) {
        element1 = 0;
    } else if (element1 > maxPopulation - 1) {
        element1 = maxPopulation - 1;
    }

    if (element2 < 0) {
        element2 = 0;
    } else if (element2 > maxPopulation - 1) {
        element2 = maxPopulation - 1;
    }

    var selected1 = population.list.get(element1);
    var selected2 = population.list.get(element2);

    var selecteds: LinkedList<Subject> = LinkedList();
    selecteds.add(selected1);
    selecteds.add(selected2);

    return selecteds;
}