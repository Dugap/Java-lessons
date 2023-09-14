package Lesson2;

public class Main {
    public static void main(String[] args) {
        //int a = sum(10,15);
        //System.out.println(a);
        //greeting("Didar");
        //savings();
        //happyBDay();
        sum();

    }

    public static void goFlex() {
        boolean isSunny = true;
        boolean isHomiesNearby = true;
        if (isSunny && isHomiesNearby) {
            System.out.println("I really Happy and go hustle");
        }
        else if (isSunny || isHomiesNearby) {
            System.out.println("I just happy");
        } else {
            System.out.println("Babysitting in da house");
        }
    }

    public static void daysOfTheWeek() {
        String dayoftheWeek = "Friday";
        if (dayoftheWeek.equals("Monday")) {
            System.out.println("Начало недели");
        } else if (dayoftheWeek.equals("Tuesday")) {
            System.out.println("Вторник, Второй день недели");
        } else if (dayoftheWeek.equals("Wednesday")) {
            System.out.println("Среда, Третий день недели");
        } else if (dayoftheWeek.equals("Thhursday")) {
            System.out.println("Четверг, четвертый день недели");
        } else if (dayoftheWeek.equals("Friday")) {
            System.out.println("Пятница, конец рабочей недели");
        } else if (dayoftheWeek.equals("Saturday")) {
            System.out.println("Суббота, выходной");
        } else if (dayoftheWeek.equals("Sunday")) {
            System.out.println("Завтра на работу");
        }
    }

        public static void days() {
            String dayOfTheWeekTwo = "Monday";
            switch (dayOfTheWeekTwo) {

            case "Monday":
                System.out.println("Понедельник");
                break;
            case "Tuesday":
                System.out.println("Вторник");
                break;
            case "Wednesday":
                System.out.println("Среда");
                break;
            case "Thursday":
                System.out.println("Четверг");
                break;
            case "Friday":
                System.out.println("Пятница");
                break;
            case "Sunday":
                System.out.println("Суббота");
                break;
            case "Saturday":
                System.out.println("Воскресенье");
                break;
                default://default как else только для switch
                    System.out.println("Invalid input"); //При неправильном вводе выйдет надпись "Неправильный ввод"
            }
        }
         public static int sum() {
        int num1 = 5;
        int num2 = 10;
            int result = num1 + num2;
            return result;
         }
         public static void greeting(String name) {
             System.out.println("Assalamu Alaykum " + name);
         }

         public static void savings(){
             int month = 0;
             int savings = 0;
             int save = 25000;
             boolean isActive = true;
             while (savings <1000000) {
                 savings += save;
                 month++;
                 System.out.println("Прошёл месяц");
                 System.out.println(savings);
                 System.out.println("Месяцев " + month);
             }

         }

         public static void happyBDay() {
             int goal = 0;
             for (int kumyz = 10; kumyz > goal; kumyz--) {
                 for (int minute = 0; minute < 5; minute++) {
                     System.out.println("Активная игра");
                 }
                 System.out.println("Осталось кумыза " + kumyz);
             }

             for (int i = 0; i < 10; i++) {
                 for (int j = 0; j < 10; j++) {
                     System.out.print((i + 1) * (j + 1) + "  ");

                 }
                 System.out.println();
             }
         }

}
