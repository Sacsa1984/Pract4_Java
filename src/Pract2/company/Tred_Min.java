package Pract2.company;

import java.util.Arrays;
import java.util.Scanner;

public class Tred_Min implements Runnable {

        Scanner scanner = new Scanner(System.in);
        public int []arr;
        public  int min;
        @Override
        public void run() {
            NewArr arr=new NewArr();
            min= Arrays.stream(arr.MyArr()).min().getAsInt();
            System.out.print("Минимальное  число массива"+min+" ");

        }

}
