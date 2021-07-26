package Pract2.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writ_not_ewent implements Runnable{
    private ArrayList<Integer> Numbers;
    private int NonEvenCounter = 0;

    public Writ_not_ewent(ArrayList<Integer> Numbers){
        this.Numbers = Numbers;
    }

    @Override
    public void run() {
        FileWriter FileNonEven = null;

        try {
            FileNonEven = new FileWriter("NonEvenNumbers.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(Integer num: Numbers){
            if(num.intValue()%2 != 0){
                NonEvenCounter++;
                try {
                    FileNonEven.write(num.intValue() + " ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            continue;
        }

        try {
            FileNonEven.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   public int Counter(){ return NonEvenCounter; }
}
