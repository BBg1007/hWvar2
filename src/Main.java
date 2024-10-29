public class Main {
    public static void main(String[] args) {
        //Task1

        System.out.println("Задание 1:");
        System.out.println();

        byte v1 = 122;
        System.out.println("Значение переменной v1 с типом byte равно " + v1);
        short v2 = 30000;
        System.out.println("Значение переменной v2 с типом short равно " + v2);
        int v3 = 7000000;
        System.out.println("Значение переменной v3 с типом int равно " + v3);
        long v4 = -9147483647L;
        System.out.println("Значение переменной v4 с типом long равно " + v4);

        float v5 = (float) -27.6452577;
        System.out.println("Значение переменной v5 с типом float равно " + v5);
        double v6 = 10000000000.987;
        System.out.println("Значение переменной v6 с типом float равно " + v6);

        //Task2

        float f = 27.12f;
        long l = 987678965549L;
        float f1 = 2.786f;
        short s = 569;
        short s1 = -159;
        short s2 = 27897;
        byte b1 = 67;

        //Task3
        System.out.println();
        System.out.println("Задание 3:");
        System.out.println();

        byte pplAs = 27;
        byte pplLp = 23;
        byte pplEa = 30;
        short ppr = 480;
        byte pprPerPpl = (byte) (ppr/(pplAs + pplEa + pplLp));
        System.out.println("На каждого ученика рассчитано "+ pprPerPpl +" листов бумаги.");


        //Task4
        System.out.println();
        System.out.println("Задание 4:");
        System.out.println();

        byte bottlePerMin = 8;
        short bottlePer20Min = (short) (bottlePerMin*20);
        short bottlePer3hour = (short) (bottlePerMin * 60 * 3);
        int bottlePer3day =  (bottlePerMin * 1440*3);
        int bottlePerMonth = (bottlePer3day*10);
        System.out.println("За 20 минут машина произвела "+bottlePer20Min+ " штук бутылок");
        System.out.println("За 1 час машина произвела "+bottlePer3hour+" штук бутылок");
        System.out.println("За 3 дня машина произвела " +bottlePer3day+" штук бутылок");
        System.out.println("За 1 месяц машина произвела "+bottlePerMonth+" штук бутылок");


        //Task5
        System.out.println();
        System.out.println("Задание 5:");
        System.out.println();

        byte paintW = 2;
        byte paintB = 4;
        byte paintPerClass = (byte) (paintB + paintW);
        byte paintNeeded = 120;
        byte classQuantity = (byte) (paintNeeded / paintPerClass);
        byte paintWtotal = (byte) (paintW*classQuantity);
        byte paintBtotal = (byte) (paintB*classQuantity);
        System.out.println("В школе, где "+classQuantity+" классов, нужно "+paintWtotal+" банок белой краски и "+paintBtotal+ " банок коричневой краски.");

        //Task6
        System.out.println();
        System.out.println("Задание 6:");
        System.out.println();

        byte bananaPerServ = 80;
        byte milkPerServ = 105;
        byte iceCreamPerServ = 100;
        byte eggPerServ = 70;
        short bananaW = (short) (bananaPerServ*5);
        short milkW = (short) (milkPerServ*2);
        short iceCreamW = (short) (iceCreamPerServ*2);
        short eggW = (short) (eggPerServ*4);
        short weightTotalG = (short) (bananaW+milkW+iceCreamW+eggW);
        float weightTotalK = (float) (weightTotalG/1000.0);
        System.out.println("Вес завтрака "+weightTotalG+" грамм.");
        System.out.println("Вес завтрака "+weightTotalK+" килограмм.");

        //Task7
        System.out.println();
        System.out.println("Задание 7:");
        System.out.println();


        short looseWeightTotal = 7000;
        short looseWeightRateMin = 250;
        short looseWeightRateMax = 500;
        byte timeRateMin = (byte) (looseWeightTotal/looseWeightRateMin);
        System.out.println("Необходимое ко-во дней при минимальном темпе "+timeRateMin);
        byte timeRateMax = (byte) (looseWeightTotal/looseWeightRateMax);
        System.out.println("Необходимое ко-во дней при максимальном темпе "+timeRateMax);
        byte timeAverage = (byte) ((timeRateMax+timeRateMin)/2);
        System.out.println("Необходимое ко-во дней при среднем темпе "+timeAverage);

        //Task8
        System.out.println();
        System.out.println("Задание 8:");
        System.out.println();

        int salaryM = 67760;
        int salaryD = 83690;
        int salaryK = 76230;
        int salaryMinc = (int) (salaryM*1.1);
        int salaryMdiff = salaryMinc*12-salaryM*12;
        System.out.println("Маша теперь получает "+salaryMinc+" рублей. Годовой доход вырос на " +salaryMdiff+" рублей.");
        int salaryDinc = (int) (salaryD*1.1);
        int salaryDdiff = salaryDinc*12-salaryD*12;
        System.out.println("Денис теперь получает "+salaryDinc+" рублей. Годовой доход вырос на " +salaryDdiff+" рублей.");
        int salaryKinc = (int) (salaryK*1.1);
        int salaryKdiff = salaryKinc*12-salaryK*12;
        System.out.println("Кристина теперь получает "+salaryKinc+" рублей. Годовой доход вырос на " +salaryKdiff+" рублей.");
    }
}