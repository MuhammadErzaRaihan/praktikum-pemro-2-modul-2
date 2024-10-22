package praktikum2.soal3; 
 
//Pada baris ini terjadi kesalahan karena harusnya public class berupa Pegawai
//public class Employee 
public class Pegawai{ 
    public String nama; 
    
 //pada baris ini memang tidak ada pesan error , tetapi ini mempengaruhi dalam memanggil method
    //dan data yang disimpannya , 'char' hanya bisa menyimpan 1 karakter, sedangkan string
    // bisa menyimpan >1 karakter , sehingga perlu adanya ubahan pada tipe data 'asal'
    //public char asal;
    public String asal;
    public String jabatan; 
    public int umur; 
 
    public String getNama() { 
        return nama; 
    } 
 
    public String getAsal() { 
        return asal;
    } 
 
  //terdapat error karena tidak ada parameter pada method
    //public void setJabatan() {
    public void setJabatan(String j) { 
    	
        this.jabatan = j;
        
    } 
 } 