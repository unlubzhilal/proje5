package day37;

public class Corolla extends Toyota {

	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayısı = 4;
	String üretimYeri = "Türkiye";

	public static void main(String[] args) {

		Corolla araba1 = new Corolla();
      System.out.println(araba1.çalışıyorMu);
	System.out.println(araba1.tekerSayısı);
      Toyota araba2 = new Corolla();
System.out.println(araba2.çalışıyorMu);
System.out.println(araba2.tekerSayısı);
	Araba arb3 = new Corolla();
	System.out.println(arb3.çalışıyorMu);
	}

}
