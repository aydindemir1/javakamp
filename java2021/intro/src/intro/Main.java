package intro;

public class Main {

	public static void main(String[] args) {

		// camelCase
		// don't repeat yourself
		String internetSubeButonu = "internet şubeye gir";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;

		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun) {
			System.out.println("dolar düştü resmi");
		} else if (dolarBugun > dolarDun) {
			System.out.println("dolar yükseldi resmi");
		} else {
			System.out.println("dolar eşittir resmi");
		}

		String kredi1 = "hızlı kredi";
		String kredi2 = "mutlu emekli kredisi";
		String kredi3 = "konut kredisi";
		String kredi4 = "çirtçi kredisi";
		String kredi5 = "msb kredisi";
		String kredi6 = "meb kredisi";
		String kredi7 = "kültür bakanlığı kredisi";

		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);

		String[] krediler = { "hızlı kredi", "mutlu emekli kredisi", "konut kredisi", "çirtçi kredisi", "msb kredisi",
				"meb kredisi", "kültür bakanlığı kredisi" };
		
		System.out.println("--------------------------------");
		
		// foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}

		System.out.println("-------------------------------");
		
		for(int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		String sehir1 = "ankara";
		String sehir2 = "istanbul";
		sehir1 = sehir2;
		sehir2 = "izmir";
		System.out.println(sehir1);
	}

}
