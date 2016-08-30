//import jdk.nashorn.internal.parser.Scanner;
import java.util.Scanner;

/**
 * Created by dperedera on 017 17.06.2016.
 * 30.08.2016
 * Ввести массив из N целых чисел и найти сумму чисел, их произведение,
 * минимальное, максимальное  и среднее значение.
 * Среднее значение вычислить как вещественное число.
 */
public class ls01_t05_Array {
    public static void main(String[] args){

        String strIn;
        System.out.println("Введите массив из целых чисел, разделенных пробелом");
        Scanner sc = new Scanner(System.in);
        strIn = sc.nextLine();
        String strArr[] = strIn.split(" ");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }

    }
}
