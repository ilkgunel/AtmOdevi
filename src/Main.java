import java.util.Scanner;

public class Main extends DegiskenlerVeIslemler {
	public static void main(String[] args) {
		Main m=new Main();
		m.basla();
	}
	public void basla()
	{
		System.out.println("ATM Otomasyon Hizmetine Hoşgeldiniz.");
		System.out.println("Lütfen Gerçekleştirmek İstediğiniz İşlemin Numarasını Giriniz:");
		System.out.println("1:Hesap Açma");
		System.out.println("2:Bakiye Görüntüleme");
		System.out.println("3:Şifre Değişikliği");
		System.out.println("4:Hesaba Para Yatırma");
		System.out.println("5:Hesaptan Para Çekme");
		System.out.println("6:Çıkış");
		
		Scanner girdi=new Scanner(System.in);
		String secenek=girdi.nextLine();
		switch(secenek)
		{
		case "1":System.out.print("Sadece İsminizi Giriniz:");
	     	     isim=girdi.nextLine();
	     	     System.out.print("Şifrenizi Giriniz:");
	     	     sifre=girdi.nextLine();
				 HesapAcma ha=new HesapAcma(isim,sifre);
		         ha.hesapAc();
		         basla();
		         break;
		
		case "2":System.out.print("Sadece İsminizi Giriniz:");
	    	     isim=girdi.nextLine();
	    	     System.out.print("Şifrenizi Giriniz:");
	    	     sifre=girdi.nextLine();
			     BakiyeGoruntuleme bg=new BakiyeGoruntuleme(isim,sifre);
			     bg.bakiyeBilgisi();
			     basla();
			     break;
		
		case "3":System.out.print("Sadece İsminizi Giriniz:");
	     	     isim=girdi.nextLine();
	     	     System.out.print("Şifrenizi Giriniz:");
	     	     sifre=girdi.nextLine();
	     	     SifreDegisikligi sd=new SifreDegisikligi(isim,sifre);
		       	 sd.sifreDegistir();
		       	 basla();
		       	 break;
		
		case "4":System.out.print("Sadece İsminizi Giriniz:");
	             isim=girdi.nextLine();
	             System.out.print("Şifrenizi Giriniz:");
	             sifre=girdi.nextLine();
	             ParaYatirmaCekme parayatir=new ParaYatirmaCekme(isim,sifre);
		         parayatir.paraYatir();
		         basla();
		         break;
		case "5":System.out.print("Sadece İsminizi Giriniz:");
	     		 isim=girdi.nextLine();
	     		 System.out.print("Şifrenizi Giriniz:");
	     		 sifre=girdi.nextLine();
	     		 ParaYatirmaCekme paracek=new ParaYatirmaCekme(isim,sifre);
		         paracek.paraCekme();
		         basla();
		         break;
		       
		case "6":System.out.println("Çıkış Yapıldı");
		         break;
		
		default:System.err.println("Geçersiz Giriş!");
		basla();
		break;
		}
		
	}
}
