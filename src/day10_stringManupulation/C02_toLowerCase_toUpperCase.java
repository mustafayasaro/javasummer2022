package day10_stringManupulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {
        String str = "Beni psikopata baglamayin";
        System.out.println(str.toUpperCase()); // BENI PSIKOPATA BAGLAMAYIN
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr"))); // BENİ PSİKOPATA BAGLAMAYİN
        /*
        Eger buyuk-kucuk harf donusumunde local bir dili esas almak isterseniz
        bu method kullanilabilir
         */
    }
}