import java.util.Scanner;
public class Lab1 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in); // задание 3
        System.out.print("Введите число 1 ");
        int a = in.nextInt();
        System.out.print("Введите число 2 ");
        int b = in.nextInt();
        System.out.print("Введите число 3 ");
        int c = in.nextInt();
        System.out.print("Введите число 4 ");
        int d = in.nextInt();
        System.out.print("Введите число 5 ");
        int e = in.nextInt();
        int max, min;

        if (a <= b) {
            min = a;
        }
        else {
            min = b;
        }
        if (min > c){
            min = c;
        }
        if (min > d){
            min = d;
        }
        if (min > e){
            min = e;
        }

        if (a >= b){
            max = a;
        }
        else{
            max = b;
        }
        if (max < c){
            max = c;
        }
        if (max < d){
            max = d;
        }
        if (max < e){
            max = e;
        }

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);


        System.out.print("Введите число месяца "); //задание 4
        int n = in.nextInt();
        String seas;
        switch (n) {
            case 12, 1, 2: seas = "Зима за окном";
                    break;
            case 3, 4, 5: seas = "Весна наступила";
                    break;
            case 6, 7, 8: seas = "Лето пришло";
                    break;
            case 9, 10, 11: seas = "За окном осень";
                    break;
            default: seas = "Ошибка: неверное число месяца";
                    break;
        }
        System.out.println(seas);
    }
}
