public class Main {
    public static void main(String[] args) {
        dz4PrintColor();

    }

    public static void printHello() {
        System.out.print("Hello ");

    }
    public static void printWorld() {

        System.out.println("World!");
    }
    public static void Cat() {
        System.out.println(
                "           _..---...,\"\"-._ ,/}/)\n" +
                "        .'' ,     ``..'   (/-< \n" +
                "       / _       {         )     \\\n" +
                "    ;   _ `. `. <     a(             \n" +
                " ,'  ( \\ ) `. \\ __.._ .: y\n" +
                " ( <\\_-) )'-.____...\\ `._ //-'\n" +
                " `. `-' /      -._))) `-._)))\n" +
                "   `...' ");

    }
    public static void printThreeWords() {
        System.out.println("orange");;
        System.out.println("banana");
        System.out.println("apple");
    }
    public static void checkSumSign() {
        int a = 5;
        int b = 5000;
        int c = a + b;
        if (c > 0) {
            System.out.print("Сумма положительная");
        } else {
        System.out.print("Сумма отрицательная");}
    }
    public static void dz4PrintColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("RED");
        } else if ( value >0 && value <= 100 ) {
            System.out.println("YELLOW");
        } else {
            System.out.println("GREEN");
        }
    }
}