package latihanenkapsulasi;

public class LatihanEnkapsulasi {

    private String namaMahasiswa;
    private int umur;

    // Constructor
    public LatihanEnkapsulasi(String namaMahasiswa, int umur) {
        this.namaMahasiswa = namaMahasiswa;
        this.umur = umur;
    }

    // Mengambil nama
    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    // Memasukan/ mengubah nama
    public void setNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }

    // Mengambil umur
    public int getUmur() {
        return umur;
    }

    // Memasukan/ mengubah umur
    public void setUmur(int umur) {
        this.umur = umur;
    }

    public static void main(String[] args) {

//      Memasukkan nilai nama dan umur
        LatihanEnkapsulasi mhs = new LatihanEnkapsulasi("Rama", 20);

        // Memanggil nama
        System.out.println("Nama mahasiswa: " + mhs.getNamaMahasiswa());

        // Memanggil umur
        System.out.println("Umur mahasiswa: " + mhs.getUmur());

        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("");

        // Mengubah nilai nama
        mhs.setNamaMahasiswa("Michael");

        // Mengubah umur
        mhs.setUmur(25);

        System.out.println("Data berhasil diubah:");
        System.out.println("Nama mahasiswa: " + mhs.getNamaMahasiswa());
        System.out.println("Umur mahasiswa: " + mhs.getUmur());

    }

}
