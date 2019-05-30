import java.util.Scanner;

/**
 * Created by OUT-Akopyan-SR on 24.05.2019.
 */
public class Program {
    public static void main(String[] args) {
        System.out.println("Введите текст с пробелами");
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();


        if (s1.length() > s2.length()) {
            System.out.println(s1);
        }
        if (s2.length() > s1.length()) {
            System.out.println(s2);
        }
        else{
            System.out.println("Стороки равны");
        }


    }
}