public class Main {
    public static void main(String[] args) {

        int balance = 50;
        int condition = 100;
        int payment = 1001;

        int bonus;
        if (payment > 1000) {
            bonus = payment / condition;
        } else {
            bonus = 0;
        }
        System.out.println(" Ваш бонус: " + bonus);
        System.out.println(" Ваш баланс: " + (balance + payment + bonus));

    }
}
