/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osnovq.programming;

import java.util.Random;

/**
 *
 * @author user
 */
class Task3 {

    public void run() {
        System.out.println("-------Задача 3 --------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        Random random = new Random();
        int rnum = 0;
        rnum = 0;
        int min = 100;
        int max = 0;
        int sum = 0;
        //Создаём массив чётных целых чисел.
        int [] numbers = new int [20];
        for (int i = 0; i < numbers.length; i++) {
            while (true) {
                rnum = random.nextInt(99-0+1)+0;
                if(rnum % 2 == 0) {
                    numbers[i] = rnum;
                    break;
                }
            }
            if (numbers[i] < max)max = numbers[i];
            if (numbers[i] > max)max = numbers[i];
            sum+= numbers[i];
            System.out.printf("%4d", numbers[i]);
        }
        System.out.println();
        System.out.println("Среднее арифметическое без учёта минимального(+min+) и максимального(+max+)");
        System.out.println((double)(sum-min-max)/(numbers.length - 2));
    }
}