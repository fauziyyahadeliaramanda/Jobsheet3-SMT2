package Praktikum03;

public class ContohForeach10 {
    public static void main (String[] args){
        int[] daftarNilai = new int[5];
        daftarNilai[0] = 7;
        daftarNilai[1] = 3;
        daftarNilai[2] = 8;
        daftarNilai[3] = 2;
        daftarNilai[4] = 1;

        //looping menggunakan for-each
        for(int nilai : daftarNilai){
            System.out.println(nilai);
        }
    }
}
