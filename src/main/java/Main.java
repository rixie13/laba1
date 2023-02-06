import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
        System.out.println("Лейнерт Яна");
       System.out.println(difference(23, 45));
       Scanner scanner = new Scanner(System.in);
       System.out.println("введите первое число");
       int value1= scanner.nextInt();
       System.out.println("введите второе число");
       int value2 = scanner.nextInt();
       System.out.println("введите третье число");
       int value3 = scanner.nextInt();
       int result  = sum(value1, value2, value3);
       System.out.println("Сумма чисел = " + result);

       System.out.println("Введите радиус окружности в сантиметрах:");
       int radius = scanner.nextInt();
       double area = calculateCircleArea(radius);
      double length = calculateCircleLength(radius);
       System.out.println("Площадь круга: " + area +  " см.кв.");
       System.out.println("Длина окружности: " + length +  " см.");



   }
    public static int difference(int a, int b) {
       return a-b;
    }
    public static int sum(int value1, int value2, int value3 ) {
       return value1 + value2 + value3;
    }

    public static final double PI = 3.14;
    public static double calculateCircleArea(int radius) {

        return PI * radius * radius;
    }
    public static double calculateCircleLength(int radius) {
        return 2 * PI * radius;
    }


}
