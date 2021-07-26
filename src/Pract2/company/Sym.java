package Pract2.company;

import java.util.Arrays;

public class Sym implements Runnable{
    public int Sym;
    public int Saiz;

    public Sym() {
    }

    public int getSym() {
        return Sym;
    }

    public void setSym(int sym) {
        Sym = sym;
    }

    public int getSaiz() {
        return Saiz;
    }

    public void setSaiz(int saiz) {
        Saiz = saiz;
    }

    @Override
    public String toString() {
        return "Sym{" +
                "Sym=" + Sym +
                ", Saiz=" + Saiz +
                '}';
    }

    @Override
    public void run() {
        synchronized(Main.locker) {
            NewArr arr = new NewArr();
          this.Sym = Arrays.stream(arr.MyArr()).sum();
           this.Saiz=arr.getSaiz();

        }
    }
}
