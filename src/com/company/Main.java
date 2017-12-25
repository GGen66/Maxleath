package com.company;

import java.util.Scanner;
import java.lang.String;
public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);                  //обьявляем ввод данных
        System.out.println("Задайте кол-во слов");
        int sizearray = scan.nextInt();                     //указываем размер массива с клавиатуры
        String[] slova = new String[sizearray];            //создаем массив slova размерностью sizearray  указанной выше
        System.out.println("введите слов "+ sizearray +"шт");
        for (int i = 0; i < sizearray; i++)             //цикл на заполнение массива, до тех пор пока не будут введены все слова.
        {
            slova[i] = scan.next() ;                   //собственно заполнение масива по i-му номеру масива
        }
        int i, Max = 0, MaxLength = 0;                //задаем переменные. Max - позиция в массиве MaxLength - кол-во символов в словах
        for (i = 0; i < slova.length; ++i)            //Цикл прохода по массиву. Кол-во проходов = slova.length (кол-во слов в массиве)
            if ( slova[i].length() > MaxLength) {     //условие проверки: больше ли кол-во букв в i-ом слове массива чем в
                Max = i;                               // переменной MaxLength. Если да то в iMax записывается позиция в массиве
            }                                            //и кол-во букв в MaxLength
        System.out.println("word = " + slova[Max]);    //Вывод на печать максимального значения из масcива


    }
}

