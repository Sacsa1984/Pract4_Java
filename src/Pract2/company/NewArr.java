package Pract2.company;

import java.util.Arrays;
import java.util.Scanner;

public class NewArr {
    public int arr[];
    public int Saiz;
    public static String str_Rez;

    public String getStr_Rez() {
        return str_Rez;
    }

    public void setStr_Rez(String str_Rez) {
        this.str_Rez = str_Rez;
    }
    public NewArr() {
    }

    public NewArr(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getSaiz() {
        return Saiz;
    }

    public void setSaiz(int saiz) {
        Saiz = saiz;
    }

    @Override
    public String toString() {
        return "NewArr{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public int[] MyArr()//метод создания нвого массива
    { Scanner scanner = new Scanner(System.in);
        arr=new int[5];
        for (int i=0;i<arr.length;i++)
        {System.out.println("Введите любое число ");

            arr[i]=scanner.nextInt();
        }
        this.Saiz=arr.length;
        return arr;
    }
    public String MyMetod()//метод полученя пути при вводе с консоли
    {
        String Dan = null;

        System.out.println("Введите путь к файлу");

        Scanner scan = new Scanner(System.in);
        Dan = scan.nextLine();
        this.str_Rez = Dan.replaceAll("\\\\", "\\\\\\\\").trim();

        System.out.println(str_Rez);

        return str_Rez;
    }
}
