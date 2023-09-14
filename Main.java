package HW2;

public class Main {
    public static void main(String[] args) {
        //sum();
        //isPositiveOrNegative();
        //isNegative();
        //printWordNTimes();
        isLeapYear();
    }


    public static boolean sum() {
        int num1 = 10;
        int num2 = 10;
        int sum = num1 + num2;
        {
            if (sum > 10 && sum <= 20) {
                System.out.println(true);
            } else{
                System.out.println(false);
            }
        }
        return false;
    }

    public static void isPositiveOrNegative() {
        int x = -1;
        if (x >=0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean isNegative() {
        int x = -1;
        if (x < 0){
            System.out.println(true); }
            else{
                System.out.println(false);
        }
        return false;
    }

    public static void printWordNTimes() {
        String word = "Wassup";
        for (int j = 0; j < 5; j++) {
            System.out.println(word);
        }
    }

        public static void isLeapYear() {
            int year = 2024; //введите год для проверки

            boolean isLeap = false;

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                isLeap = true;
            }

            if (isLeap) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }







}

