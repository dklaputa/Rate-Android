package mushare.org.rate.data;

/**
 * Created by dklap on 1/5/2017.
 */

public class Settings {
    private static String baseCurrencyCid;

    public static String getBaseCurrencyCid() {
        return baseCurrencyCid;
    }

    public static Currency getBaseCurrency() {
        if (baseCurrencyCid == null) return null;
        else return CurrenciesList.get(baseCurrencyCid);
    }

    public static void setBaseCurrencyCid(String baseCurrencyCid) {
        Settings.baseCurrencyCid = baseCurrencyCid;
    }
}
