package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        // membuat objek
        Matematika lana = new Matematika(2, 3);

        System.out.println("Hasil penjumlahan: " + lana.setPenjumlahan());
        System.out.println("Hasil pengurangan: " + lana.setPengurangan());
        System.out.println("Hasil perkalian: " + lana.setPerkalian());
        System.out.println("Hasil pembagian: " + lana.setPembagian());
    }
}
