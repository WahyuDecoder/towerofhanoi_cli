package hanoi;
import java.util.Scanner;
public class hanoi {
    public static void shift(int n, String menaraAwal, String menaraBantu, String menaraAkhir)
    {
        //fungsi dari f(n)=2n-1
        if (n == 0)
        {
            return;
        }
        shift(n - 1, menaraAwal, menaraAkhir, menaraBantu);
        System.out.println("Move \"" + n + "\" from " + menaraAwal + " --> " + menaraAkhir);
        shift(n - 1, menaraBantu, menaraAwal, menaraAkhir);
    }
    public static void main(String[] args)
    {
        System.out.print("Masukan Jumlah Piringan Yang Anda Inginkan: ");
        Scanner scanner = new Scanner(System.in);
        int jumlahPiringan = scanner.nextInt();
        shift(jumlahPiringan, "Menara1", "Menara2", "Menara3");
    }
}
