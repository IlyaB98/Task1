public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
            byte a = 11;
            short b = 101;
            int c = 120;
            long d = 43L;

            float e = 12.4f;
            double f = 1123.334;

            char p = '+';
            boolean h = true;
        }

    public static void task2() {
        double weightBoxer1 = 78.2;
        double weightBoxer2 = 82.7;

        double totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес боксеров = " + totalWeight + " кг");

        double differenceWeight = Math.abs(weightBoxer1 - weightBoxer2);
        System.out.println("Разница между весами бойцов " + differenceWeight + " кг");
    }

    public static void task3() {
        int banana = 5;
        int bananaWeight = 80;

        int milk = 200;
        int milkWeight = 105;

        int iceCream = 2;
        int iceCreamWeight = 100;

        int rawEggs = 4;
        int rawEggsWeight = 70;

        int weightGr = (banana * bananaWeight) + ((milk / 100) * milkWeight) + (iceCream * iceCreamWeight) + (rawEggs * rawEggsWeight);
        System.out.println("Вес спорт-завтрака в граммах = " + weightGr);

        double weightKg = (double) weightGr / 1000;
        System.out.println("Вес спорт-завтрака в килограммах = " + weightKg);
    }

    public static void task4() {
        int plan = 7;
        int dayPlan1 = 250;
        int dayPlan2 = 500;
        int planGr = plan * 1000;

        int minDays = planGr / dayPlan1;
        int maxDays = planGr / dayPlan2;

        int averageDay = (minDays + maxDays) / 2;
        System.out.println("Eсли спортсмен будет терять каждый день по " + dayPlan1 + " грамм, то для похудения на " + plan + " килограмм, потребуется " + minDays + " дней.");
        System.out.println("Eсли спортсмен будет терять каждый день по " + dayPlan2 + " грамм, то для похудения на " + plan + " килограмм, потребуется " + maxDays + " дней.");
        System.out.println("Среднее количество дней для похудения на " + plan + " кг, " + averageDay + " день.");
    }

    public static void task5() {
        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;

        int percent = 10;
        double increaseIndex = percent / (100 * 1.0);

        int newSalaryMasha = (int) (salaryMasha + (salaryMasha * increaseIndex));
        int newSalaryDenis = (int) (salaryDenis + (salaryDenis * increaseIndex));
        int newSalaryKristina = (int) (salaryKristina + (salaryKristina * increaseIndex));

        int differenceMashaSalary = (newSalaryMasha - salaryMasha) * 12;
        int differenceDenisSalary = (newSalaryDenis - salaryDenis) * 12;
        int differenceKristinaSalary = (newSalaryKristina - salaryKristina) * 12;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceMashaSalary + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differenceDenisSalary + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + differenceKristinaSalary + " рублей.");
    }
}