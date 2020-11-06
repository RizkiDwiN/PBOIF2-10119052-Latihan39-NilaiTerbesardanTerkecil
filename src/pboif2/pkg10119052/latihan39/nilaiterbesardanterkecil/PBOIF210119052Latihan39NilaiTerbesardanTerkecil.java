package pboif2.pkg10119052.latihan39.nilaiterbesardanterkecil;
import java.util.Scanner;
/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * nilai terbesar dan terkecil mahasiswa
 * 
 */
public class PBOIF210119052Latihan39NilaiTerbesardanTerkecil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Nilai nilai = new Nilai();
        Petugas petugas = new Petugas();
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil "
                + "Nilai Mahasiswa=====");
  
        System.out.print("Masukkan Nama Petugas : ");
        petugas.setNama(scanner.next());
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        nilai.setMahasiswa(scanner.nextInt());
        
        for(int i = 0; i < nilai.getMahasiswa(); i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+(i+1)+" = ");
            nilai.setNilai(scanner.nextInt());
        }
        
        nilai.tampilNilai();
        System.out.println("Petugas : " + petugas.getNama());
    }
    
}
