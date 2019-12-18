package com.company;

import java.util.Scanner;


    public class Main {
        /*public static void arry_input()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter length of String array");
            int length = sc.nextInt();
            Integer[] array = new Integer[length];
            System.out.println("Please enter array elements");
            for (int i = 0; i < length; i++) {
                array[i] = sc.nextInt();
            }
        }*/
        // Nu am stiut cum declar variabilele global sa  le pot folosi si in main()
        public static void Dice(Integer[] array,int length)
        {
            int girls=0;
            for(int i=0;i<length-1;i++)
            {
                if(array[i]<6)
                {
                    girls++;
                }
            }
            if(array[length-1] ==6)
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println(++girls);
            }
        }
        public static void main (String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter length of String array");
            int length = sc.nextInt();
            Integer[] array = new Integer[length];
            System.out.println("Please enter array elements");
            for (int i = 0; i < length; i++) {
                array[i] = sc.nextInt();
            }
            Dice(array,length);
        }

    }