import java.util.*;

public class Murajaah {

    public static void main(String[] args) {

        Random ayatRandom = new Random();

// Jangkauan nomor yang diacak yaitu (0-140)
        int n = ayatRandom.nextInt(141);

// Jika ingin mendapatkan jangkauan yang sesuai dengan angka yang dimasukkan di class random
// Maka variabel n harus ditambah dengan 1
        n += 1;

// Sebelum n ditambah 1, maka jangkauan angka yang diacak adalah dari 0-140
// Setelah n ditambah 1, maka jangkauan angka yang diacak adalah dari 1-141

        System.out.println("Bacakan surah Al-Baqarah ayat " + n);

    }

}
