import java.util.Scanner;


public class MainApps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        upahModel model = new upahModel();
        upahDao dao = new upahDao();
        System.out.println("Masukan nama karyawan : ");
        model.setNama(input.next());
        System.out.println("Masukan jam kerja : ");
        model.setJamKerja(input.nextInt());
        System.out.println("Masukan Base Pay : ");
        model.setBasePay(input.nextDouble());


        dao.hitungUpah(model);
    }
}
