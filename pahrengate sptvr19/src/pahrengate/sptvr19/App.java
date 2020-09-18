/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pahrengate.sptvr19;

import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    private Scanner scanner = new Scanner(System.in);
    public void run(){
        System.out.println("Конвертер градусов Цельсия в градусы по Фаренгейту.");
        System.out.print("Введите градусы по Цельсию: ");
        double gradC = scanner.nextDouble();
        System.out.print("По Фаренгейту это: ");
        double gradF = gradC * 9 / 5 +32;
        System.out.printf("%.2f%n",gradF);
    }
}
