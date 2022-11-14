public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Задание 1");
        int leftSocks = 15;
        System.out.println("Значение переменной leftSocks с типом int равно " +leftSocks);
        byte rightSocks = 18;
        System.out.println("Значение переменной rightSocks с типом byte равно " +rightSocks);
        short redHat = 93;
        System.out.println("Значение переменной redHat с типом short равно " +redHat);
        long christmasTree = 357;
        System.out.println("Значение переменной christmasTree с типом long равно " +christmasTree);
        float coordinateX = 45.12345f;
        System.out.println("Значение переменной coordinateX с типом float равно " +coordinateX);
        double coordinateY = 12.123456789;
        System.out.println("Значение переменной coordinateY с типом double равно " +coordinateY);

        //task2
        System.out.println("Задание 2");
        float meaning1 = 27.12f;
        long meaning2 = 987678965549L;
        byte meaning3 = 2;
        short meaning4 = 786;
        boolean meaning5 = meaning3 >= meaning4;
        short meaning6 = 569;
        short meaning7 = -159;
        short meaning8 = 27897;
        byte meaning9 = 67;
        System.out.println(meaning1);
        System.out.println(meaning2);
        System.out.println(meaning3);
        System.out.println(meaning4);
        System.out.println(meaning5);
        System.out.println(meaning6);
        System.out.println(meaning7);
        System.out.println(meaning8);
        System.out.println(meaning9);
        int meaning10 = 153897;
        double meaning11 = 33.33333333334;
        char meaning12 = 37;
        System.out.println(meaning10);
        System.out.println(meaning11);
        System.out.println(meaning12);

        //task3
        System.out.println("Задание 3");
        short teacherLyudmilaPavlovna = 23;
        short teacherAnnaSergeyevna = 27;
        short teacherEkaterinaAndreevna = 30;
        short totalStudent = (short) (teacherLyudmilaPavlovna + teacherAnnaSergeyevna + teacherEkaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " +480/totalStudent +" листов бумаги");

        //task4
        System.out.println("Задание 4");
        int bottlesPerMinute = 16/2;
        int minutesToDays = 60 * 24;
        System.out.println("За 20 минут машина произвела бутылок " +bottlesPerMinute*20 +" штук");
        System.out.println("За сутки машина произвела бутылок " +bottlesPerMinute*minutesToDays +" штук");
        System.out.println("За 3 дня машина произвела бутылок " +bottlesPerMinute*minutesToDays*3 +" штук");
        System.out.println("За 1 месяц, если 30 дней в месяце, машина произвела бутылок " +bottlesPerMinute*minutesToDays*30 +" штук");
        System.out.println("За 1 месяц, если 31 день в месяце, машина произвела бутылок " +bottlesPerMinute*minutesToDays*31 +" штук");

        //task5
        System.out.println("Задание 5");
        int totalPaint = 120;
        int whitePaintClass = 2;
        int brownPaintClass = 4;
        int totalClass = totalPaint/(whitePaintClass+brownPaintClass);
        System.out.println("В школе, где " +totalClass +" классов, нужно " +whitePaintClass*totalClass +" банок белой краски и " +brownPaintClass*totalClass +" банок коричневой краски");
    }
}