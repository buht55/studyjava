import java.util.Scanner;

/**
 * Created by dperedera on 016 16.06.2016.
 */
public class ls01_t03_CalcDouble {
    public static void main (String[] args)
    {
        double a,b;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        a = scn.nextDouble();
        System.out.println("Введите второе число: ");
        b = scn.nextDouble();
        System.out.println("Сумма: " + (a+b));
        System.out.println("Произведение: " + (a*b));
        System.out.println("Большее из этих двух чисел: " + (a>b?a:b));
    }
}
