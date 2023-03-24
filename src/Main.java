public class Main {
    public static void main(String[] args) {
        String[] guests = new String[4];
        System.out.println(guests[0]);
        System.out.println(guests[1]);
        System.out.println(guests[2]);
        System.out.println(guests[3]);

        System.out.println("-----------------------");

        guests[1] = "Anna";
        System.out.println(guests[0]);
        System.out.println(guests[1]);
        System.out.println(guests[2]);
        System.out.println(guests[3]);

        System.out.println("-----------------------");

        int numbers[] = new int[3];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println("-----------------------");

        boolean[] booleans = new boolean[3];
        System.out.println(booleans[0] + ", " + booleans[1] + ", " + booleans[2]);
        System.out.println(booleans[0]);
        System.out.println(booleans[1]);
        System.out.println(booleans[2]);

        System.out.println("-----------------------");

        double[] doubles = new double[3];
        System.out.println(doubles[0]);
        System.out.println(doubles[0] + ", " + doubles[1] + ", " + doubles[2]);
        System.out.println(doubles[0] + "    " + doubles[1]);

        System.out.println("-----------------------");

        char[] charles = new char[2];
        System.out.println((int) charles[1]);  // Приведение типов к инту
        System.out.println(charles[0]);

        System.out.println("-----------------------");

        int[] points = {5, 6, 8, -11};// можно записать: int points[] = {5,6,8,-11};
        System.out.println(points[0]);
        System.out.println(points[1]);
        System.out.println(points[2]);

        System.out.println(points[0] + ", " + points[1]  + ", " + points[2] + ", " + points[3]);

        System.out.println("-----------------------");


    }

}
