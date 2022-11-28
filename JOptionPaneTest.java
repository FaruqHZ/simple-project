import javax.swing.JOptionPane;

// Author @sumbul

public class JOptionTest {
    public static void main(String[] args) {

        String nama, NIM, jurusan, kelas;
        int semester;
        double uts, uas, nilaiAkhir;

// tab atau pop-up yang pertama muncul
        nama = JOptionPane.showInputDialog("Masukkan Nama : ");
        NIM = JOptionPane.showInputDialog("Masukkan NIM : ");
        jurusan = JOptionPane.showInputDialog("Masukkan Jurusan : ");
        kelas = JOptionPane.showInputDialog("Masukkan Kelas : ");
        semester = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Semester : "));

        uts = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai UTS :"));
        uas = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai UAS :"));

// tab atau pop-up yang muncul setelah kita menginput nilai atau data di pop-up pertama
        nilaiAkhir = (uts + uas) / 2;

        JOptionPane.showMessageDialog(null,
                "Nama : " + nama +
                        "\nNIM : " + NIM +
                        "\nJurusan : " + jurusan +
                        "\nKelas : " + kelas +
                        "\nSemester : " + semester +
                        "\nNilai UTS : " + uts +
                        "\nNilai UAS : " + uas +
                        "\nNilai Akhir : " + nilaiAkhir);
    }
}
