import java.util.Scanner;

/**
 * Created by dperedera on 010 10.06.2016.
 */
public class ls01_t02_Calc {
    public static void main(String[] args){
        int a,b;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        a = scn.nextInt();
        System.out.println("Введите Второе число: ");
        b = scn.nextInt();
        System.out.println("Сумма: " + (a+b));
        System.out.println("Произведение: " + (a*b));
        System.out.println("Частное: " + (a / b));
        System.out.println("Остаток от деления: " + (a % b));
        System.out.println("Большее из этих двух чисел: " + (a>b?a:b));
    }
}