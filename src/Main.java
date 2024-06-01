public class Main {
    public static void main(String[] args) {
        //Задача 1
        //Ну по-любому ведь имеется в виду инициализировать, а не объявить...
        int sampleInt = 1234567890;
        byte sampleByte = 123;
        short sampleShort = 12345;
        float sampleFloat = 0.1234567f;
        double sampleDouble = 0.123456789101112f;
        System.out.println("Значение переменной sampleInt с типом int равно " + sampleInt);
        System.out.println("Значение переменной sampleByte с типом byte равно " + sampleByte);
        System.out.println("Значение переменной sampleShort с типом short равно " + sampleShort);
        System.out.println("Значение переменной sampleFloat с типом float равно " + sampleFloat);
        System.out.println("Значение переменной sampleDouble с типом double равно " + sampleDouble);

        //Задача 2
        float a = 27.12f;
        long b = 987_678_965_549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        //Задача 3
        byte teacher1Students = 23;
        byte teacher2Students = 27;
        byte teacher3Students = 30;
        short sheetsBought = 480;
        int sheetsPerStudent = sheetsBought / (teacher1Students + teacher2Students + teacher3Students);
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

        //Задача 4
        byte bottlesPer2Minute = 16;
        int machinePowerPerMinute = bottlesPer2Minute / 2;
        int bottlesPer20Minute = machinePowerPerMinute * 20;
        int bottlesPerDay = machinePowerPerMinute * 60 * 24;
        int bottlesPer3Days = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerDay * 30;
        System.out.println("За 20 минут машина произвела " + bottlesPer20Minute + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок");

        //Задача 5
        byte paintNeededOverall = 120;
        byte paintPerRoomWhite = 2;
        byte paintPerRoomBrown = 4;
        int paintPerRoomOverall = paintPerRoomWhite + paintPerRoomBrown;
        int rooms = paintNeededOverall / paintPerRoomOverall;
        int paintNeededWhite = paintPerRoomWhite * rooms;
        int paintNeededBrown = paintPerRoomBrown * rooms;
        System.out.println("В школе, где " + rooms + " классов, нужно " + paintNeededWhite + " банок белой краски и "
                + paintNeededBrown + " банок коричневой краски.");

        //Задача 6
        byte bananaPieceWeightGr = 80;
        byte milk100mlWeightGr = 105;
        byte icePieceWeightGr = 100;
        byte eggPieceWeightGr = 70;
        int superBreakfastWeightGr = bananaPieceWeightGr * 5 + milk100mlWeightGr * 2 + icePieceWeightGr * 2
                + eggPieceWeightGr * 4;
        float superBreakfastWeightKg = superBreakfastWeightGr / 1000f;
        System.out.println("Общий вес завтрака составляет " + superBreakfastWeightGr + " грамм, или "
                + superBreakfastWeightKg + " килограмм");

        //Задача 7
        byte weightKgToLoose = 7;
        int timeMinEffort = weightKgToLoose * 1000 / 250;
        int timeMaxEffort = weightKgToLoose * 1000 / 500;
        int timeAverage = (timeMaxEffort + timeMinEffort) / 2;
        System.out.println("В лучшем случае спортсмен похудеет за " + timeMaxEffort + " дней; максимум за "
                + timeMinEffort + " дней. В среднем потребуется " + timeAverage + " день");

        //Задача 8
        int mashaSalaryOld = 67760;
        int denisSalaryOld = 83690;
        int chrisSalaryOld = 76230;
        int mashaSalaryNew = (int) (mashaSalaryOld * 1.1f);
        int denisSalaryNew = (int) (denisSalaryOld * 1.1f);
        int chrisSalaryNew = (int) (chrisSalaryOld * 1.1f);
        int mashaAnnualOld = mashaSalaryOld * 12;
        int denisAnnualOld = denisSalaryOld * 12;
        int chrisAnnualOld = chrisSalaryOld * 12;
        int mashaAnnualNew = mashaSalaryNew * 12;
        int denisAnnualNew = denisSalaryNew * 12;
        int chrisAnnualNew = chrisSalaryNew * 12;
        int mashaAnnualDelta = mashaAnnualNew - mashaAnnualOld;
        int denisAnnualDelta = denisAnnualNew - denisAnnualOld;
        int chrisAnnualDelta = chrisAnnualNew - chrisAnnualOld;
        System.out.println("Маша теперь получает " + mashaSalaryNew + " рублей в месяц, годовой доход вырос на "
                + mashaAnnualDelta + " рублей");
        System.out.println("Денис теперь получает " + denisSalaryNew + " рублей в месяц, годовой доход вырос на "
                + denisAnnualDelta + " рублей");
        System.out.println("Кристина теперь получает " + chrisSalaryNew + " рублей в месяц, годовой доход вырос на "
                + chrisAnnualDelta + " рублей");
    }
}