package belajaroverloading;

public class ContohOverloading {
    public void jumlah(int a, int b){
        System.out.println("Jumlah 2 angka = " + (a+b));
    }
    
    //jumlah parameter berbeda
    public void jumlah(int a, int b, int c){
        System.out.println("Jumlah 3 angka = " + (a+b+c));
    }
    
    //tipe data parameter berbeda
    public void jumlah(double a, int b){
        System.out.println("Jumlah 2 angka (double+int)= " + (a+b));
    }
    
    //urutan tipe data berbeda
    public void jumlah(int b, double a){
        System.out.println("Jumlah 2 angka (int+double)= " + (a+b));
    }
}
