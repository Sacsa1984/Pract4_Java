package Pract2.company;

import java.util.Arrays;

public class Sred_Aref implements Runnable {
    public double Sred_Aref;
    public int Sum;
    public int Saiz;

    public double getSred_Aref() {
        return Sred_Aref;
    }

    public void setSred_Aref(double sred_Aref) {
        Sred_Aref = sred_Aref;
    }

    public int getSum() {
        return Sum;
    }

    public void setSum(int sum) {
        Sum = sum;
    }

    public int getSaiz() {
        return Saiz;
    }

    public void setSaiz(int saiz) {
        Saiz = saiz;
    }

    @Override
    public String toString() {
        return "Sred_Aref{" +
                "Sred_Aref=" + Sred_Aref +
                ", Sum=" + Sum +
                ", Saiz=" + Saiz +
                '}';
    }

    @Override
    public void run() {
        synchronized(Main.locker) {
try {
    this.Sred_Aref = this.Sum / this.Saiz;
}
catch (Exception e) {

    System.out.println(e.getMessage());
}
        }
    }
}
