package praktikum2.soal3; 
 
public class Soal3Main { 
    public static void main(String[] args) { 
        Pegawai p1 = new Pegawai(); 
        //pada baris ini terjadi error karena kurangnya titik koma(;)
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel"; 
        p1.setJabatan ("Assasin");
        //baris ini terdapat 1 atribut yang kosong yaitu umur , sehingga kita akan tambahkan
        p1.umur = 17;
 
        System.out.println("Nama Pegawai: " + p1.getNama()); 
        System.out.println("Asal: " + p1.getAsal()); 
        System.out.println("Jabatan: " + p1.jabatan); 
        System.out.println("Umur: " + p1.umur); 
 } 
}