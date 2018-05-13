/**
 * Created by arrai on 5/13/2018.
 */
public class upahDao {
    public static void hitungUpah(upahModel model){

        if (model.getJamKerja() <= 40) {
            model.setGaji(model.getJamKerja() * model.getBasePay() ) ;
            System.out.println("Gaji : " + model.getGaji());
        } else if (model.getJamKerja() > 40 && model.getJamKerja() <= 60) {
            model.setGaji((model.getBasePay()*40 + ((model.getJamKerja() - 40)*(1.5 + model.getBasePay() ))));
            System.out.println("Gaji : " + model.getGaji());
        } else {
            System.out.println("Data Yang Di Input Salah");
        }

    }
}
