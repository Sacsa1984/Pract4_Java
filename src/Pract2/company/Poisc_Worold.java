package Pract2.company;

import java.util.ArrayList;

public class Poisc_Worold implements Runnable{
    private String Word;
    private int FoundWordCounter = 0;
    private ArrayList<String> Words;

    public Poisc_Worold(String Word, ArrayList<String> Words){
        this.Word = Word;
        this.Words = Words;
    }

    @Override
    public void run(){
        for(String word: Words){
            if(word.contains(Word)){
                FoundWordCounter++;
            }
            continue;
        }
    }

    public int Counter(){ return FoundWordCounter; }
}
