package pboif2.pkg10119052.latihan39.nilaiterbesardanterkecil;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * nilai terbesar dan terkecil mahasiswa
 * 
 */

public class Nilai {
   private final List<Integer> nilai = new ArrayList();
    private int mahasiswa, terbesar, terkecil;
    
    public void setNilai(int nilai) {
        this.nilai.add(nilai);
    }

    public void setMahasiswa(int mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public int getMahasiswa() {
        return mahasiswa;
    }
    
    private void hitungNilaiTerbesar(int idx) {
        if(terbesar < nilai.get(idx))
            terbesar = nilai.get(idx);
    }
    
    private void hitungNilaiTerkecil(int idx) {
        if(terkecil > nilai.get(idx))
            terkecil = nilai.get(idx);
    }

    public void tampilNilai() {
        System.out.println();
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        
        terbesar = nilai.get(0);
        terkecil = nilai.get(0);
        
        for(int i = 0; i < nilai.size(); i++) {
            hitungNilaiTerbesar(i);
            hitungNilaiTerkecil(i);
            System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " = "
                    + nilai.get(i));
        }
        
        // output hasil
        System.out.println("\nNilai Terbesar adalah " + terbesar);
        System.out.println("Nilai Terkecil adalah " + terkecil);
    } 
}
