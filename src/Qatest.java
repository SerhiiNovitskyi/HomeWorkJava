import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Qatest {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int z = 0;
        System.out.println("Введите X: ");
        int x = in.nextInt(); //add days
        System.out.println("Введите Y: ");
        int y = in.nextInt(); //add hours

        System.out.println("Вычеслаем степени чисел:" );
        method1(x,y,z);
        System.out.println("Выводим дату и время с измениением дня и часов");
        calculateDate(x,y);
    }
    public static void method1(int x, int y, int z) {

        System.out.println("X в степени Y равно " + Math.pow(x, y)); // x^y
        System.out.println("X + Y равно " + (x + y));
        System.out.println("\n");
        for (int i = 0; i < y; i++) {
            z += x;
            System.out.println(z + " na shagy " + i);
        }
        System.out.println("\n");

    }
    public static void calculateDate(int x, int y) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH,x);
        cal.add(Calendar.HOUR_OF_DAY,y);
        SimpleDateFormat dateFormat = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");
        System.out.println("Изменненая дата " + dateFormat.format( cal.getTime() ) );

        System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "." + cal.get(Calendar.MONTH) + "." + cal.get(Calendar.YEAR) + "-" + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE));

    }







}
