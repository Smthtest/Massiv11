public class Homework11 {
    public static void main(String[] args) {
        String guests[] = new String[6];
        guests[0] = "Петр Петров";

        guests = new String[5];

        guests[0] = "Петр Петров";

        guests[1] = "Иван Иванов";

        guests[2] = "Федор Федоров";

        int gifts[] = new int[5];

        guests[3] = "Корней Корнеич";

        guests[4] = "Дим Димыч";

        gifts = new int[]{2000, 3000, 4000, 5000, 6000};

        System.out.println("1. " + guests[0] + " - " + gifts[0]);
        System.out.println("2. " + guests[1] + " - " + gifts[1]);
        System.out.println("3. " + guests[2] + " - " + gifts[2]);
        System.out.println("4. " + guests[3] + " - " + gifts[3]);
        System.out.println("5. " + guests[4] + " - " + gifts[4]);


    }

}
