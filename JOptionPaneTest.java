// author @muhammadfaruq.hz

// memanggil JOptionPane dari source
// fungsi JOptionPane sama seperti Scanner adalah untuk mengambil input dari pengguna
// bedanya kalo JOptionPane outputnya berupa "Tab Dialog" atau "Pop-Up"
import javax.swing.JOptionPane; //syntax untuk memanggil JOptionPane

public class JOptionTest {
    public static void main(String[] args) {

        String nama, NIM, jurusan, kelas;
        int semester;
        double uts, uas, nilaiAkhir;

// ============================ tab atau pop-up yang pertama muncul untuk mengambil nilai yang diinput pengguna ============================

// syntax atau kodingannya, yaitu
// 'nama variabel' + '=' + 'JOptionPane.showInputDialog("...");'
// 'nama variabel' dalam kasus kodingan kita ini yaitu 'nama', 'NIM', 'jurusan', 'kelas', 'semester', 'uts', 'uas', 'nilaiAkhir'

// untuk variabel yang tipe datanya 'String', maka kodingannya langsung 'JOptionPane.showInputDialog("...");' atau tidak diparse terlebih dahulu
// seperti contoh dalam kasus ini variabel 'nama, NIM, jurusan, kelas' yang bertipe data 'String' maka kodingannya langsung 'JOptionPane.showInputDialog("...");'

// tapi, untuk variabel yang tipe datanya selain 'String' maka kodingannya harus diparse terlebih dahulu baru setelahnya ditulis 'JOptionPane.showInputDialog'
// seperti contoh dalam kasus ini variabel 'semester' yang bertipe data 'int' maka kodingannya harus diparse terlebih dahulu
// dan variabel 'uts, uas, nilaiAkhir' yang bertipe data 'double' maka kodingannya juga harus diparse terlebih dahulu
// dengan cara
// 'jenis tipe data' + dilanjutkan dengan titik '.' 'Parse+jenis tipe data' baru dimasukkan kodingan '(JOptionPane.showInputDialog("..."));'

// kodingan untuk me-parse-kan variabel yang tipe datanya 'int' berbeda dengan kodingan untuk me-parse-kan variabel yang tipe datanya 'double'
// perbedaan kodingannya hanya terletak pada jenis tipe datanya saja

        nama = JOptionPane.showInputDialog("Masukkan Nama : "); // ini untuk yang bertipe data 'String' maka kodingannya langsung 'JOptionPane.showInputDialog("...");'
        NIM = JOptionPane.showInputDialog("Masukkan NIM : ");
        jurusan = JOptionPane.showInputDialog("Masukkan Jurusan : ");
        kelas = JOptionPane.showInputDialog("Masukkan Kelas : ");
        
        semester = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Semester : "));  // ini untuk yang bertipe data selain 'String' maka kodingannya terlebih dahulu diparse-kan, dengan cara
        // 'jenis tipe data' '.' + 'Parse+jenis tipe data' -ingat untuk penulisan tipe datanya, huruf pertamanya itu kapital yak- bisa dilihat pada contoh kodingan kita di atas
        // 'Integer' sebagai jenis tipe data, dilanjutkan dengan titik '.'
        // 'parseInt' sebagai parse+jenis tipe data, baru kemudian dilanjutkan dengan buka kurung
        // dan didalam buka kurung tadi kemudian dilanjutkan 'JOptionPane.showInputDialog("...");
        // sehingga final kodingannya bisa dilihat pada variabel 'semester' diatas

        uts = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai UTS :"));  // ini untuk yang bertipe data selain 'String' maka kodingannya terlebih dahulu diparse
        uas = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai UAS :"));  // 'jenis tipe data' '.' + 'Parse+jenis tipe data' - ingat (lagi) untuk penulisan tipe datanya, huruf pertamanya itu kapital yak- bisa dilihat pada contoh kodingan kita di samping
        // 'Double' sebagai jenis tipe data, dilanjutkan dengan titik '.'
        // 'parseDouble' sebagai parse+jenis tipe data, baru kemudian dilanjutkan dengan buka kurung
        // dan didalam buka kurung tadi kemudian dilanjutkan 'JOptionPane.showInputDialog("...");
        // sehingga final kodingannya bisa dilihat pada variabel 'uts', 'uas' diatas

        nilaiAkhir = (uts + uas) / 2; // untuk yang ini sebenarnya cuma inisialisasi variabel biasa, seperti yang sudah kita pelajari sebelumnya (bukan materi khusus JOptionPane)

        
// dan untuk menampilkan nilai yang sudah diinputkan pengguna
// kodingan JOption-nya berbeda dengan yang pertama tadi
// bedanya yaitu, pada 'showInputDialog' dengan 'showMessageDialog'
        
// kalau 'showInputDialog' itu digunakan untuk mengambil nilai yang diinput oleh pengguna
// seperti yang kita bahas diawal tadi atau kodingan yang berada di bawah comment 'tab atau pop-up yang pertama muncul untuk mengambil nilai yang diinput pengguna'
        
// sedangkan 'showMessageDialog' itu digunakan untuk menampilkan nilai yang sudah diinputkan oleh pengguna
// seperti yang akan kita bahas kali ini atau kodingan yang berada di bawah comment 'tab atau pop-up yang muncul untuk menampilkan nilai yang sudah diinput oleh pengguna'
        
// ============================ tab atau pop-up yang muncul untuk menampilkan nilai yang sudah diinput oleh pengguna ============================
        
        JOptionPane.showMessageDialog(null,"Nama : " + nama + // ini adalah syntax atau kodingannya, yaitu 'JOptionPane.showMessageDialog(null, ...) -null jangan sampai lupa yak, di awal dalam kurung-
                        "\nNIM : " + NIM +                    // di dalam kurung, itu ditulis apa yang akan mau kita tampilkan nantinya pada pop-up 'showMessageDialog'
                        "\nJurusan : " + jurusan +            // seperti contoh, pada kasus ini kita akan menampilkan nilai yang sudah kita inputkan di 'showInputDialog' tadi
                        "\nKelas : " + kelas +                // maka kita akan menulis beberapa kata dan akan memanggil variabel tempat nilai yang kita input tadi
                        "\nSemester : " + semester +          // disini untuk membuat baris baru atau 'enter' maka kita memakai syntax '\n' bisa dilihat pada kodingan di samping
                        "\nNilai UTS : " + uts +              // setiap kita ingin membuat baris baru tetapi tetap dalam 1 kode, maka kita harus menulis syntax '\n' diawal kata yang akan kita enterkan
                        "\nNilai UAS : " + uas +              // dan '\n' ditulis didalam tanda kutip dua "\n..." bukan diluarnya
                        "\nNilai Akhir : " + nilaiAkhir);     // untuk '\n' sebenarnya diluar pembahasan JOptionPane, bisa dipakai ataupun tidak
                                                              // intinya jika ingin me-enter atau baris baru maka caranya menulis syntax tersebut di dalam tanda kutip dua
        
        // dari baris ke-1 hingga baris ke-8 itu sebenarnya cuma 1 kode
        // sama seperti 'sout', 'JOptionPane.showMessageDialog' juga berisi nilai yang akan ditampilkan, dimana nantinya di dalamnya terdapat variabel-variabel yang akan kita panggil dan teks-teks yang akan kita tampilkan
        
        // kalau seperti kasus kodingan kita diatas, biasanya kita akan memakai 1 'sout' untuk 1 variabel (tidak semua sih, tapi karena kasus kodingan kita seperti yang dapat dilihat di atas, maka biasanya 1 'sout' untuk 1 variabel)
        // contoh 
        // System.out.println("Nama : " + nama);
        // System.out.println("NIM : " + NIM);
        
        // tetapi, kenapa di 'JOptionPane.showMessageDialog' hanya digunakan sekali saja?
        // karena 'JOptionPane.showMessageDialog' akan menampilkan output berupa pop-up
        // jadi, kalau kita tulis kodingannya satu-satu seperti 'sout'
        // maka, output-nya itu nantinya akan keluar satu-satu
        
        // contoh
        // JOptionPane.showMessageDialog(null,"Nama : " + nama);
        // JOptionPane.showMessageDialog(null,"NIM : " + NIM);
        
        // maka, nanti output-nya akan keluar satu-satu, karena beliau itu berbentuk pop-up
        // jadi, setelah pop-up untuk variabel 'nama' itu muncul, kita harus meng-klik tombol "ok" terlebih dahulu, baru kemudian pop-up untuk variabel 'NIM' akan muncul
        // intinya, ia tidak akan muncul serentak seperti 'sout', melainkan satu per satu
        // itulah mengapa kita hanya menggunakan satu kodingan 'JOptionPane.showMessageDialog(null, ...)' untuk semua variabel
        // dan itulah mengapa kita memakai syntax '\n' untuk membuat baris baru yang masih dalam satu kodingan
    }
}
