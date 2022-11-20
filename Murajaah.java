import java.util.*;

// nama public class sesuai dengan nama file java yang kita buat
public class Murajaah {

    public static void main(String[] args) {

        Random ayatRandom = new Random();

// jangkauan nomor yang diacak yaitu (0-140)
        int n = ayatRandom.nextInt(141);

// jika ingin mendapatkan jangkauan yang sesuai dengan angka yang dimasukkan di class random
// maka variabel n harus ditambah dengan 1
        n += 1;

// sebelum n ditambah 1, maka jangkauan angka yang diacak adalah dari 0-140
// setelah n ditambah 1, maka jangkauan angka yang diacak adalah dari 1-141

        System.out.println("Bacakan surah Al-Baqarah ayat " + n);

    }
}
