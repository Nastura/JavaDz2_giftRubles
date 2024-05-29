public class Main {
    public static void main(String[] args) {

        int balance = 1000;
        int replenishment = 7000;


        if (replenishment >= 1000) {
            int gift = replenishment / 100;
            int finalBalance = gift + replenishment + balance;
            System.out.println("Счет пополнен на " + replenishment + "руб.");
            System.out.println("Получено " + gift + " подарочных рублей.");
            System.out.println("На Вашем счету " + finalBalance + "руб.");
        } else {
            int finalBalance = replenishment + balance;
            System.out.println("Счет пополнен на " + replenishment + "руб.");
            System.out.println("На Вашем счету " + finalBalance + "руб.");
        }

    }
}