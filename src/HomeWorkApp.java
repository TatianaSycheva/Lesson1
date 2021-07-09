public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
    private static void printThreeWords(){
        System.out.println("Метод printThreeWords():");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println("");
        System.out.println("");
    }

    private static void checkSumSign(){
        System.out.println("Метод checkSumSign():");
        int a = 1;
        int b = 5;
        int sum = a + b;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");
        }
        System.out.println("");
        System.out.println("");
    }

    private static void printColor(){
        System.out.println("Метод printColor():");
        int value = 200;
        if (value <= 0){
            System.out.println("Красный");
        }else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        }else {
            System.out.println("Зеленый");
        }
        System.out.println("");
        System.out.println("");
    }

    private static void compareNumbers(){
        System.out.println("Метод compareNumbers():");
        int a = 0;
        int b = 10;
        if (a >= b){
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
        System.out.println("");
        System.out.println("");
    }
}
