package app;

import java.util.ArrayList;
import java.util.List;
import model.Barang;

public class main {
    public static void main(String[] args) {
        Barang keyboard = new Barang("BRG-001", "Keyboard USB", 10);
        Barang mouse = new Barang ("BRG-002", "Mouse USB", 8);
        
        List<Barang> daftarBarang = new ArrayList<Barang>();
        daftarBarang.add(keyboard);
        daftarBarang.add(mouse);
        
        System.out.println("DATA AWAL");
        tampilkan(daftarBarang);
        
        keyboard.pinjam(3);
        keyboard.kembalikan(2);
        
        System.out.println("SETELAH TRANSAKSI CONTOH");
        tampilkan(daftarBarang);
        
        try {
            keyboard.pinjam(100);
        } catch (IllegalArgumentException e) {
            System.out.println("Gagal: " + e.getMessage());
        }
        
        System.out.println("Keyboard tersedia : " 
                + keyboard.getJumlahTersedia());
    
}
    private static void tampilkan(List<Barang> daftarBarang) {
        for (Barang barang : daftarBarang) {
            System.out.println(barang.getKode () + " | " 
                    + barang.getNama() + " | tersedia: " 
                    + barang.getJumlahTersedia());
        }
        
    }
    
}
