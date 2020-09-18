import java.util.Scanner;
/*
 * By Rishat Sultanov
 Градусы по Фаренгейту = (градусы по Цельсию x 1.8) + 32
Соответственно, из 'F в 'C можно перевести по следующей формуле:
Градусы по Цельсию = (градусы по Фаренгейту - 32) / 1.8 
 */
public class Trans {
    public static void main(String[] args) {
        int a;
        int d = 32;
        double c = 0;
        double b = 1.8;
        String s1, s2;
        System.out.println("Введите градусы по цельсии:");
        a = new Scanner(System.in).nextInt();
        System.out.println("Ваши градусы в Фаренгейтах:" + c);
        c = a * b + d;
    }
}