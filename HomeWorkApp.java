package HW1;

public class HomeWorkApp {
    public static void main(String[] args) {
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a = 5;
        int b = a * 2;
        if (a + b >0) {
            System.out.print("Сумма положительная");
        }    else
            System.out.print("Сумма отрицательная");
    }

    public static void printColor(){
        int value = 100;
        if (value <= 0) {
            System.out.print("RED");
        } else if (value > 0 && value <= 100) {
            System.out.print("YELLOW");
        } else {
            System.out.print("GREEN");
        }
        }

        public static void compareNumbers(){
        int a = 10;
        int b = 35;
        if (a >= b) {
            System.out.print("a>=b");
        } else {
            System.out.print("a<b");
            }
        }


    }