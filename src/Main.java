public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Задача №1.");
        byte a = 100;
        short b = 1000;
        int c = 200000;
        long d = 100000000;
        float e = 3.5f;
        double f = 35.4;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
        // System.out.println("Задача №2.");
        byte gf = 67;
        short ga = -159;
        int gs = 569;
        int gd = 27897;
        long gg = 987678965549L;
        float gh = 27.12f;
        double ge = 2.786;
        System.out.println("Задача №3.");
        byte lud = 23;
        byte ann = 27;
        byte eka = 30;
        short list = 480;
        byte sk = (byte) (lud + ann + eka);
        byte kol = (byte) (list / sk);
        System.out.println("На каждого ученика рассчитано " + kol + " листов бумаги");
        System.out.println("Задача №4.");
        short cht = ((20 / 2) * 16);
        int sut = ((1440 / 2) * 16);
        int tsut = (((1440 * 3) / 2) * 16);
        int mes = (((720 * 60) / 2) * 16);
        System.out.println("За 20 минут машина произвела " + cht + " штук бутылок");
        System.out.println("За сутки машина произвела " + sut + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + tsut + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + mes + " штук бутылок");
        System.out.println("Задача №5.");
        byte klass = 120 / (2 + 4);
        byte ligt = (byte) (klass * 2);
        byte dark = (byte) (klass * 4);
        System.out.println("В школе, где " + klass + " классов, нужно " + ligt + " банок белой краски и " + dark + " банок коричневой краски.");
        System.out.println("Задача №6.");
        short bananas = 5 * 80;
        short milk = 105 * 2;
        short ice = 100 * 2;
        short egg = 70 * 4;
        short healthyBreakfast = (short) ((bananas + milk) + (ice + egg));
        float healthyBreakfast2 = (float) (healthyBreakfast / 1000f);
        System.out.println("При приготовлении утренненго завтрака у нас получается " + healthyBreakfast + " грамм или " + healthyBreakfast2 + " килограмм.");
        System.out.println("Задача №7.");
        short min = 7000 / 250;
        short max = 7000 / 500;
        System.out.println("Если худеть по 250 грамм в день, то нам понадобится " + min + " дней, а если худеть по 500 грамм в день, то потребуется " + max + " дней.");
        System.out.println("Задача №8.");
        int masha = (int) ((67760 * 0.1) + 67760);
        int mashag = (int) ((masha * 12) - (67760 * 12));
        int denis = (int) ((83690 * 0.1) + 83690);
        int denisg = (int) ((denis * 12) - (83690 * 12));
        int kristina = (int) ((76230 * 0.1) + 76230);
        int kristinag = (int) ((kristina * 12) - (76230 * 12));
        System.out.println("Маша теперь получает " + masha + " рублей. Годовой доход вырос на " + mashag + " рублей");
        System.out.println("Денис теперь получает " + denis + " рублей. Годовой доход вырос на " + denisg + " рублей");
        System.out.println("Кристина теперь получает " + kristina + " рублей. Годовой доход вырос на " + kristinag + " рублей");

    }
}