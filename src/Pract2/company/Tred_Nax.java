package Pract2.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Tred_Nax implements Runnable {
    Scanner scanner = new Scanner(System.in);
 public   int max;
    @Override
    public void run() {
        NewArr arr=new NewArr();

           max= Arrays.stream(arr.MyArr()).max().getAsInt();
        System.out.print("Максимальное число массива"+max+" ");

    }
}
