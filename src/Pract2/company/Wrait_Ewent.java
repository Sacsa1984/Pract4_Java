package Pract2.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Wrait_Ewent implements Runnable
{
    private ArrayList<Integer> Numbers;
    private int EvenCounter = 0;

    public Wrait_Ewent(ArrayList<Integer> Numbers){
        this.Numbers = Numbers;
    }

    @Override
    public void run() {
        FileWriter FileEven = null;

        try {
            FileEven = new FileWriter("EvenNumbers.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(Integer num: Numbers){
            if(num.intValue()%2 == 0){
                EvenCounter++;
                try {
                    FileEven.write(num.intValue() + " ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            continue;
        }

        try {
            FileEven.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int Counter(){ return EvenCounter; }


}
