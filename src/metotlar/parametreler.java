package metotlar;

public class parametreler {

	public static void main(String[] args) {
		
		menuGoster();
		sayilariTopla(10,15);
		sayilariTopla(3,5);
		sayilariTopla(4,7);
		
		int sayi=5;
		sayiyiDegistir(sayi);
		System.out.println("sayinin değeri:"+ sayi);
		
		System.out.println("fark:" + sayilarinFarkiniBul(10, 6));
		
		int donulenDeger=sayilarinFarkiniBul(10, 6);
		
		sayilarinFarkiniBul(10,6);
		
		//parametre almayan ve geriye değer döndüren metot örneği
		double rastgeleSayi = Math.random();
		System.out.println("rastgele sayı:"+ rastgeleSayi);
		System.out.println("rastgele sayı:"+ Math.random());
		
	}
    //Geriye değer döndüren parametreli metot
	public static int sayilarinFarkiniBul(int a, int b) {
		
		System.out.println("sayıların farkı:" + (a-b));
		
		return (a-b);
	}

	public static void sayiyiDegistir(int x) {
		
		x=x+10;
		System.out.println("gönderilen sayının 10 fazlası:" +x);
	}

	public static void sayilariTopla(int birinciSayi, int ikinciSayi) {
		
		
		
		
	}
    
	//parametre almayan ve geriye değer döndürmeyen metot
	public static void menuGoster() {
		
		System.out.println("******MENU*****");
		System.out.println("1-iki sayının toplamını bul:");
		System.out.println("2-iki sayının farkını bul:");
		System.out.println("3-iki sayının çarpımını bul:");
		System.out.println("4-iki sayının bölümünü bul:");
	}

}
