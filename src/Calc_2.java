import java.util.Scanner;

/**
 * Created by dperedera on 010 10.06.2016.
 */
public class Calc_2 {
    public static void main(String[] args){
        int a,b,c;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        a = scn.nextInt();
        System.out.println("Введите Второе число: ");
        b = scn.nextInt();
        System.out.println("Сумма: " + (a+b));
        System.out.println("Произведение: " + (a*b));
        System.out.println("Частное: " + ((double)a / (double)b));
        System.out.println("Остаток от деления: " + (a % b));
        System.out.println("Большее из этих двух чисел: " + (a>b?a:b));
    }
}
