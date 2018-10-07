package com.easylabs;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        // menu
        int d = 0;
        while (true) {
            System.out.println("1. Дан массив из целых чисел A(n), где n=1,25. Необходимо\n" +
                    "поменять местами его максимальный и минимальный элемент.\n" +
                    "2. Дан массив из целых чисел B(n), где n=1,25. Необходимо\n" +
                    "упорядочить массив по возрастанию.\n" +
                    "3. Дан массив из целых чисел С(n), где n=1,20. Необходимо\n" +
                    "найти среднее значение и вывести его на консоль.\n" +
                    "4. Дан массив из целых чисел D(n), где n=1,30. Посчитайте\n" +
                    "сумму четных и нечетных элементов массива.\n" +
                    "5. Напишите программу, выводящую на консоль таблицу 3х5\n" +
                    "случайных элементов (a(i,j)< 10).\n" +
                    "6. Измените программу 1 так, чтобы она выводила на консоль\n" +
                    "еще и максимальный элемент (с помощью описания нового метода,\n" +
                    "например maxX()).\n" +
                    "7. Даны 5 строк s1, s2, s3, s4 и s5, на основе условия: если\n" +
                    "строка s4 равна строке s5, нужно сложить строки s1 и s2, иначе\n" +
                    "нужно сложить строки s1 и s3.");

            System.out.println("Выберите номер задачи:");
            d = scan.nextInt();
            if (d == 1)
                zadanie1();
            else if (d == 2)
                zadanie2();
            else if (d == 3)
                zadanie3();
            else if (d == 4)
                zadanie4();
            else if (d == 5)
                zadanie5();
            else if (d == 6)
                zadanie6();
            else if (d == 7)
                zadanie7();
            else
                System.out.println("Error input");

        }
    }

    private static void zadanie1() {
        int n=25;
        int A[] = new int[n];

        Random rand =new Random();
        for (int i = 0; i < n; i++) {
            A[i]=rand.nextInt(100);
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i]+ " ");
        }
        System.out.println();

        int Max =0;
        int MaxI=0;
        int Min=100;
        int MinI=0;
        int t=0;

        for (int i = 0; i < n; i++) {
            if(A[i]>Max){
                Max=A[i];
                MaxI=i;
            }
        }
        for (int i = 0; i <n ; i++) {
            if (A[i]<Min){
                Min=A[i];
                MinI=i;
            }
        }

        t=Max;
        A[MaxI]=Min;
        A[MinI]=t;
        System.out.println("Результат:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i]+ " ");
        }
        System.out.println();

    }
    private static void zadanie2() {
        int n = 25;
        int[] B= new int[n];
        Random rand =new Random();
        for (int i = 0; i < n; i++) {
            B[i]=rand.nextInt(100);
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(B[i]+ " ");
        }
        System.out.println();

        int temp=0;
        for (int i = n - 1; i >= 0; i--)
            for (int j = 0; j < i; j++) {
                if (B[j] > B[j + 1]) {
                    temp = B[j + 1];
                    B[j + 1] = B[j];
                    B[j] = temp;
                }
            }
        System.out.println("Результат:");
        for (int i = 0; i < n; i++) {
            System.out.print(B[i]+ " ");
        }
        System.out.println();
    }
    private static void zadanie3() {
        int n=20;
        int[] C=new int[n];
        double summa=0;
        double sred=0;

        Random rand =new Random();
        for (int i = 0; i < n; i++) {
            C[i]=rand.nextInt(100);
        }

        System.out.println("Исходный массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(C[i]+ " ");
        }

        for (int i = 0; i <n ; i++) {
            summa+=C[i];
        }
        sred=summa/n;
        System.out.println("Среднее значение в массиве ="+ sred);

    }
    private static void zadanie4() {
        int n =30;
        int[] D=new int[n];
        int Even = 0;
        int Odd = 0;
        Random rand =new Random();
        for (int i = 0; i < n; i++) {
            D[i]=rand.nextInt(100);
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(D[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if(D[i]%2==0)
                Even++;
            else
                Odd++;
        }
        System.out.println("Количество чётных:"+Even+"\nКоличество нечётных:"+Odd);

    }
    private static void zadanie5() {
        int[][] a=new int[3][5];
        Random rand =new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j]=rand.nextInt(100);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
            // System.out.print("\t");
        }
    }
    private static void zadanie6() {
        int n=25;
        int A[] = new int[n];

        Random rand =new Random();
        for (int i = 0; i < n; i++) {
            A[i]=rand.nextInt(100);
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i]+ " ");
        }
        System.out.println();

        int Max =0;
        int MaxI=0;
        int Min=100;
        int MinI=0;
        int t=0;

        for (int i = 0; i < n; i++) {
            if(A[i]>Max){
                Max=A[i];
                MaxI=i;
            }
        }
        for (int i = 0; i <n ; i++) {
            if (A[i]<Min){
                Min=A[i];
                MinI=i;
            }
        }

        t=Max;
        A[MaxI]=Min;
        A[MinI]=t;
        System.out.println("Результат:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i]+ " ");
        }
        System.out.println();
        getMax(Max);

    }
    private static void zadanie7() {
        Scanner scan = new Scanner(System.in);
        String str1=new String();
        String str2=new String();
        String str3=new String();
        String str4=new String();
        String str5=new String();
        String strSumm="";

        System.out.print(" Заполните  строку 1:");
        str1=scan.next();
        System.out.print(" Заполните  строку 2:");
        str2=scan.next();
        System.out.print(" Заполните  строку 3:");
        str3=scan.next();
        System.out.print(" Заполните  строку 4:");
        str4=scan.next();
        System.out.print(" Заполните  строку 5:");
        str5=scan.next();

        if (str4.equals(str5))
            strSumm = str1.concat(str2);
        else
            strSumm = str1.concat(str3);;

        System.out.println("Результат:"+strSumm);
    }
    private static void getMax(int max){
        System.out.println("Максимальный элемент:"+max);
    }

}