package Pract2.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static  Object locker=new Object();
    public static void main(String[] args) throws IOException {


        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
            while ( true ) {
                System.out.println("Вібор задания 1-4 выход 0 ");
                int selection = scanner3.nextInt();
                switch (selection) {
                    case 1:
                    {
                        Tred_Nax Max1=new Tred_Nax();
                        Thread Tred_Nax=new Thread( Max1);
                        Tred_Min Min=new Tred_Min();
                        Thread Tred_Min=new Thread(Min);

                        Tred_Nax.start();
                        Tred_Min.start();
                        try {
                            Tred_Nax.join();
                            Tred_Min.join();
                        }
                        catch (InterruptedException ex)
                        {
                            System.out.println(ex.getMessage());
                        }
                        break;
                    }
                    case 2:
                    {

                            Sym symma=new Sym();
                            Thread Tred_Sum=new Thread(symma);

                           Sred_Aref sredn=new Sred_Aref();
                           Thread Thred_Sre=new Thread(sredn);

                            Tred_Sum.start();

                        try {
                             Tred_Sum.join();
                            sredn.Sum=symma.Sym;
                            sredn.Saiz=symma.Saiz;


                            if (Thred_Sre.isAlive()!=true)
                            {
                                Thred_Sre.start();

                            }

                            Thred_Sre.join();
                            System.out.println(sredn.toString());
                        }
                        catch (InterruptedException ex)
                        {
                            System.out.println(ex.getMessage());
                        }
                        break;
                    }
                    case 3: {
                        String s = "";
                        NewArr path = new NewArr();
                        s = path.MyMetod();
                        FileReader file = new FileReader(s);

                        scanner = new Scanner(file);

                        ArrayList<Integer> FileNumbers = new ArrayList<>();

                        while (scanner.hasNextLine()) {
                            String[] numbers = scanner.nextLine().split(" ");
                            for (String num : numbers) {
                                FileNumbers.add(Integer.parseInt(num));
                            }
                        }

                        file.close();
                        Wrait_Ewent EvenThread = new Wrait_Ewent(FileNumbers);
                        Thread Thread_Wrait_Ewent=new Thread(EvenThread);
                        Writ_not_ewent NonEvenThread = new Writ_not_ewent(FileNumbers);
                       Thread Thread_Writ_not_ewent=new Thread(NonEvenThread);

                        Thread_Wrait_Ewent.start();
                        Thread_Writ_not_ewent.start();

                        try {
                            Thread_Wrait_Ewent.join();
                            Thread_Writ_not_ewent.join();
                        }
                        catch (InterruptedException ex)
                        {
                            System.out.println(ex.getMessage());
                        }

                       System.out.println("Even: " + EvenThread.Counter() + "\n" +
                               "NonEven: " + NonEvenThread.Counter());
                        break;
                    }
                    case 4:{



                        String s = "";
                        NewArr path = new NewArr();
                        s = path.MyMetod();


                        System.out.print("Введите слово для поиска ");
                        String Word = scanner.nextLine();

                        FileReader file = new FileReader(s);

                        scanner = new Scanner(file);

                        ArrayList<String> FileWords = new ArrayList<>();

                        while(scanner.hasNextLine()){
                            String[] words = scanner.nextLine().split(" ");
                            for(String word: words){
                                FileWords.add(word);
                            }
                        }

                        file.close();

                        Poisc_Worold foundWord = new Poisc_Worold(Word, FileWords);
                        Thread Thread_foundWord = new Thread(foundWord);
                        Thread_foundWord.start();

                        try{
                            Thread_foundWord.join();
                        }
                        catch (InterruptedException ex){
                            ex.fillInStackTrace();
                        }

                        System.out.println("Слово " + Word + " найдено " + foundWord.Counter() + " раз.");
                        break;
                    }

                    case 0: {
                        System.exit(1);
                        break;
                    }
                    default: {
                        System.out.println("не коректные данные");
                    }

                }


            }


    }
}
