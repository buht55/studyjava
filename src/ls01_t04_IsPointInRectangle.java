import java.util.Scanner;

/**
 * Created by dperedera on 016 16.06.2016.
 */
public class ls01_t04_IsPointInRectangle {
    public static void main(String[] args) {
        ls01_t04_Point a = new ls01_t04_Point();
        ls01_t04_Point b = new ls01_t04_Point();
        ls01_t04_Point c = new ls01_t04_Point();
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите координаты первой точки: ");
        a.x = scn.nextDouble();
        a.y = scn.nextDouble();
        System.out.println("Введите координаты второй точки: ");
        b.x = scn.nextDouble();
        b.y = scn.nextDouble();
        ls01_t04_Point min = new ls01_t04_Point();
        ls01_t04_Point max = new ls01_t04_Point();
        if(a.x>b.x){
            min.x=b.x;
            max.x=a.x;
        }
        else{
            min.x=a.x;
            max.x=b.x;
        }
        if(a.y>b.y){
            min.y=b.y;
            max.y=a.y;
        }
        else{
            min.y=a.y;
            max.y=b.y;
        }
        System.out.println("Введите координаты третьей точки: ");
        c.x = scn.nextDouble();
        c.y = scn.nextDouble();
        if((c.x>=min.x && c.x <=max.x) && (c.y>=min.y && c.y <=max.y)){
            System.out.println("Указанная точка лежит  внутри прямоугольника.");
        }
        else{
            System.out.println("Указанная точка не лежит  внутри прямоугольника.");
        }
    }

}
