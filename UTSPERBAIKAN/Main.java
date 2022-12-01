package UTSPERBAIKAN;

import UTSPERBAIKAN.com.Lingkaran.Luas_SetengahLingkaran;
import UTSPERBAIKAN.com.PersegiPanjang.Luas_PersegiPanjang;
/**
 *
 * @author jembar
 */
public class Main {
      public static void main(String[] args){
        double luas_arsir;
        Luas_PersegiPanjang persegiPanjang1=new Luas_PersegiPanjang(12,7);
        Luas_SetengahLingkaran setengahLingkaran1=new Luas_SetengahLingkaran(12);

        persegiPanjang1.luas();
        setengahLingkaran1.luas();
        luas_arsir=persegiPanjang1.getLuas()-setengahLingkaran1.getLuas();
        System.out.println("Luas Persegi Panjang = "+persegiPanjang1.getLuas());
        System.out.println("Luas Setengah Lingkaran = "+setengahLingkaran1.getLuas());
        System.out.println("");
        System.out.println("Luas Arsir = "+luas_arsir);
    }
}
