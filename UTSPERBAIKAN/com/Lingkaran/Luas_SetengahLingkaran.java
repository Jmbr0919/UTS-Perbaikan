package UTSPERBAIKAN.com.Lingkaran;

/**
 *
 * @author jembar
 */
public class Luas_SetengahLingkaran implements UTSPERBAIKAN.com.BangunDatar.BangunDatar {
     double jari2;
    double luasSetengahLingkaran;

    public Luas_SetengahLingkaran(double diameter) {
        this.jari2 = diameter / 2;
    }

    @Override
    public void luas() {
        luasSetengahLingkaran = jari2 * jari2 * 3.14 * 0.5;
    }

    @Override
    public double getLuas() {
        return luasSetengahLingkaran;
    }
}
