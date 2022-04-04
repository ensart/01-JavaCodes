package day15_methodCreation;

public class C04 {
    // main method olmadan da bir class olusturulabilir
    // Ancak bu class direk calismaz
    // sadece depo gorevi gorur
    // baska class'lardan kullanilabilecek method veya variable'lari barindirir

    public static void dortHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);

        System.out.println("girdiginiz kelimedeki harf sayisi : 4" );
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }

    public static void ucHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);

        System.out.println("girdiginiz kelimedeki harf sayisi : 3" );
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }

}
