package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        int[] boka = new int[18];
        Random rnd = new Random();
        for(int i=0;i<boka.length;i++)
        {
            boka[i]=rnd.nextInt(); } //создан массив с рандомными элементами

        System.out.println("Элементы массива: ");
        for (int element : boka) {
            System.out.print(element + ", "); } //показ элементов на экране

            var min = boka[0]; //пусть первое значение будет наименьшим
            for (int num : boka) { //цикл сравнения
                if (num < min) {
                    min = num;
                } }

                System.out.print("=> Минимальный элемент массива = " + min); //нахождение наименьшего элемента


                double sum = 0;
                for (int j : boka) { //цикл для нахождения суммы всех элементов
                    sum = sum + j;
                }

                sum = sum / boka.length; //нахождение среднего арифметического
                System.out.println(" и среднее арифметическое = " + sum);

        System.out.println("Сумма минимального элемента и среднего арифметического = " + (min + sum));
            }


    }