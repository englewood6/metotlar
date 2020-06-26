package metotlar;

import java.util.Scanner;

public class MetotOrnek {

	public static void main(String[] args) {
	
		int kullaniciSecimi=-1;
		
		/*while(kullaniciSecimi != 0) {
			kullaniciSecimi=	menuGoster();
		}*/
		for(;;) {
			kullaniciSecimi=menuGoster();
		
			if(kullaniciSecimi ==0) {
				break;
			}
			Scanner s=new Scanner(System.in);
			System.out.println("Birinci sayıyı girin :");
			int birinciSayi= s.nextInt();
			System.out.println("İkinci sayıyı girin :");
			int ikinciSayi= s.nextInt();
			
			switch (kullaniciSecimi) {
			
			case 1 :ikiSayiyiCarp(birinciSayi,ikinciSayi);
				break;
				
			case 2: int toplam=ikiSayininToplaminiBul(birinciSayi,ikinciSayi);
			System.out.println("İki sayının toplamı:"+ toplam);	
			break;
			
			case 3: ikiSayininKuvvetiniBul(birinciSayi,ikinciSayi);
			break;
			
			case 4: ikiDoubleSayininToplaminiBul(birinciSayi,ikinciSayi);
			
			double toplamDouble=ikiDoubleSayininToplaminiBul(birinciSayi, ikinciSayi);
			System.out.println("İki double sayının toplamı :"+ toplamDouble);
			break;
			
			case 5 : String sonuc= isaretiBelirle(-5);
			System.out.println("sonuc: "+  sonuc);
			break;
			
			
			

			
			}
		}
		
	}
	
	private static String isaretiBelirle(int i) {
		
		if(i>0) {
		return "Pozitif";
	}
		else if(i==0) {
			return " Sayı sıfır";
	}
		else if(i<0) {
			return "Negatif";
		}
		else 
			return "";
			
			
		}
	
	public static double ikiDoubleSayininToplaminiBul(int birinciSayi, int ikinciSayi) {
		
		return birinciSayi+ikinciSayi;
		
	}

	public static void ikiSayininKuvvetiniBul(int birinciSayi, int ikinciSayi) {
		
		double sonuc=Math.pow(birinciSayi, ikinciSayi);
		System.out.println("sayıların kuvveti :" +sonuc);
		
	}

	public static int ikiSayininToplaminiBul(int birinciSayi, int ikinciSayi) {
		
		int toplam=birinciSayi+ikinciSayi;
		
		return toplam;
	}

	public static void ikiSayiyiCarp(int birinciSayi, int ikinciSayi) {
		System.out.println("Sayıların çarpımı:"+ birinciSayi*ikinciSayi);
		
	}

	public static int menuGoster() {
		
		System.out.println("**********MENU*******");
		System.out.println("1-İki sayının çarpımını bul");
		System.out.println("2-İki sayının toplamını bul");
		System.out.println("3-İki sayının kuvvetini bul");
		System.out.println("4-İki double sayının toplamını bul");
		System.out.println("Çıkmak için 0 tuşlayınız:");
        
		Scanner s =new Scanner(System.in);
		int secim=s.nextInt();
		
		return secim;
	}

}
