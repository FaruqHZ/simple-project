// author @muhammadfaruq.hz
// author @hfdzrhmn_

// memanggil Scanner dari library
// fungsi Scanner adalah untuk mengambil input dari pengguna
import java.util.Scanner;

// nama public class sesuai dengan nama file java yang kita buat
// dalam kasus ini adalah Latihan.java
public class Latihan {
    public static void main(String[] args) {

        // CARA MENGINISIALISASI SCANNER
        // mengetik tipe data-nya yaitu "Scanner"
        // membuat nama variabel dari Scanner, dalam kasus ini "input" setelah "Scanner"
        // untuk nama variabel dari Scanner bisa kita buat sesuka hati kita
        // setelah itu sama dengan(=)
        // diteruskan dengan "new Scanner(System.in);" memang default syntax-nya
        Scanner input = new Scanner(System.in);

        // String, int, double adalah sebagai tipe data
        // sedangkan nama, kelas, nim, jurusan, nilai, nilaiAbjad dan semester
        // itu merupakan nama variabel dari tipe data-nya dan diketik setelah tipe data
        // nama variabel dari tipe data, bisa kita buat sesuai keinginan kita
        String nama, kelas, nim, jurusan, nilaiAbjad;
        int semester;
        double nilai;

        // CARA MENGGUNAKAN SCANNER - yang dibawah sout
        // ketik nama dari variabel tipe data-nya, dalam kasus ini yaitu; nama, nim, kelas, dll
        // setelah itu sama dengan(=)
        // masukkan nama variabel dari tipe data Scanner tadi, dalam kasus ini yaitu "input"
        // diikuti dengan titik(.) lalu function-nya
        // kalau dalam Scanner ini, function-nya adalah; .nextInt(), .nextLine(), .nextLong(), dll
        // sesuai dengan tipe data dari variabel tadi
        // untuk tipe data String, itu bisa menggunakan .nextLine() dan .next(), perbedaannya seperti println dan print
        System.out.print("masukkan nama: ");
        nama = input.nextLine();
        System.out.print("masukkan NIM: ");
        nim = input.nextLine();
        System.out.print("masukkan jurusan: ");
        jurusan = input.nextLine();
        System.out.print("masukkan kelas: ");
        kelas = input.nextLine();

        System.out.print("masukkan semester: ");
        semester = input.nextInt();

        System.out.print("masukkan nilai: ");
        nilai = input.nextDouble();

        // CARA MEMANGGIL HASIL INPUT DARI PENGGUNA
        // yaitu tinggal mengetik kembali nama variabel-nya, dalam kasus ini yaitu; nama, nim, jurusan, dll
        System.out.println("=======================");
        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Jurusan     : " + jurusan);
        System.out.println("Kelas       : " + kelas);
        System.out.println("Semester    : " + semester);

        // CARA PERCABANGAN / IF STATEMENT
        // mengetik "if"
        // dilanjutkan dengan membuka kurung biasa (...), dan memasukkan logika didalamnya dengan menggunakan operasi logika
        // setelah memasukkan logika-nya, buka kurung kurawal {...} dan menuliskan program didalamnya jika logika tadi bernilai true
        // contoh cara membaca koding dibawah, yaitu

        // (if) jika "nilai" yang dimasukkan pengguna lebih dari sama dengan 0 dan dibawah 50, maka value dari "nilaiAbjad"-nya "E"
        // atau yang diprint nanti oleh "nilaiAbjad" nya adalah "E" begitu juga seterusnya
        // (else if) tapi jika "nilai" yang dimasukkan pengguna lebih dari sama dengan 50 dan kurang dari 60, maka value-nya "D"
        // (else if) tapi jika "nilai" yang dimasukkan pengguna lebih dari sama dengan 60 dan kurang dari 70, maka value-nya "C"
        // (else if) tapi jika "nilai" yang dimasukkan pengguna lebih dari sama dengan 70 dan kurang dari 75, maka value-nya "B-"
        // (else if) tapi jika "nilai" yang dimasukkan pengguna lebih dari sama dengan 75 dan kurang dari 80, maka value-nya "B"
        // (else if) tapi jika "nilai" yang dimasukkan pengguna lebih dari sama dengan 80 dan kurang dari 85, maka value-nya "B+"
        // (else if) tapi jika "nilai" yang dimasukkan pengguna lebih dari sama dengan 85 dan kurang dari 90, maka value-nya "A-"
        // (else if) tapi jika "nilai" yang dimasukkan pengguna lebih dari sama dengan 90 dan kurang dari 95, maka value-nya "A"
        // (else) dan jika "nilai" yang dimasukkan pengguna selain dari syarat diatas, maka value-nya "A+"
        
        if (nilai >= 0 && nilai < 50) {
            nilaiAbjad = "E";
        } else if (nilai >= 50 && nilai < 60) {
            nilaiAbjad = "D";
        } else if (nilai >= 60 && nilai < 70) {
            nilaiAbjad = "C";
        } else if (nilai >= 70 && nilai < 75) {
            nilaiAbjad = "B-";
        } else if (nilai >= 75 && nilai < 80) {
            nilaiAbjad = "B";
        } else if (nilai >= 80 && nilai < 85) {
            nilaiAbjad = "B+";
        } else if (nilai >= 85 && nilai < 90) {
            nilaiAbjad = "A-";
        } else if (nilai >= 90 && nilai < 95) {
            nilaiAbjad = "A";
        } else {
            nilaiAbjad = "A+";
        }

        System.out.println("Nilai       : " + nilai + " = " + nilaiAbjad);

        // sama seperti diatas, tetapi untuk yang dibawah ini kemungkinannya cuma 2
        // jadi, jika nilai di dalam (if) nya true maka System akan menjalankan program di dalam kurung kurawalnya si (if)
        // tapi, jika nilai di dalam (if) nya false maka System akan menjalankan program di dalam kurung kurawalnya si (else)
        
        // cara membaca kodingan dibawah ini yaitu
        
        // (if) jika nilai yang dimasukkan oleh pengguna lebih dari sama dengan 70, maka System akan print "Kelulusan: Anda Lulus"
        // (else) dan jika nilai yang dimasukkan oleh pengguna, selain dari yang diatas, maka System akan print "Kelulusan: Anda Tidak Lulus"

        if (nilai >= 70){
            System.out.println("Kelulusan   : Anda Lulus");
        }else {
            System.out.println("Kelulusan   : Anda Tidak Lulus");
        }
    }
}
