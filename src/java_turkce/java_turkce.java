package java_turkce;
import java.util.*;
public class java_turkce {
	public static void main(String[] args) {
		
		/*switch (sayi) {
		
		case 1:
			System.out.println("Bir");
		break;
		case 2:
			System.out.println("Iki");
		break;
		case 3:
			System.out.println("Uc");
		break;
		case 4:
			System.out.println("Dort");
		break;
		default:
			System.out.println("Gecersiz Sayi");
		*/
		Scanner scan = new Scanner (System.in);
		int bakiye = 1000;
		
		
		System.out.println("1: Bakiye Goruntule");
		System.out.println("2: Para Yatirma");
		System.out.println("3: Para Cekme");
		System.out.println("4: Sistemden Cikis");
		
		int islem = scan.nextInt();
		
		switch (islem) {
		case 1:
			System.out.println("Bakiyeniz: "+bakiye+ " tl dir.");
			break;
		case 2:
			System.out.println("Ne kadar yatiracaksiniz");
			int miktar = scan.nextInt();
			bakiye += miktar;
			System.out.println("Bakiyeniz: "+bakiye+ " tl dir.");
			break;
		case 3:
			System.out.println("Ne kadar cekeceksiniz");
			miktar = scan.nextInt();
			bakiye -= miktar;
			System.out.println("Bakiyeniz: "+bakiye+ " tl dir.");
			break;
		case 4:
			System.out.println("Sistemden Cikiliyor...");
			break;
		default:
			System.out.println("Gecersiz Islem...");
			break;
		}
	}

}
