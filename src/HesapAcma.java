import java.io.*;
public class HesapAcma extends DegiskenlerVeIslemler {
	Double bakiye=0.0;
	
	public HesapAcma(String isim,String sifre)
	{
		this.isim=isim;
		this.sifre=sifre;
	}
	
   public void hesapAc()
   {
	System.out.println("Hesap Açma İşlemi:");
	System.out.println("İsminizi Giriniz:");
	isim=girdi.nextLine();
	System.out.println("Soyisminizi Giriniz:");
	soyisim=girdi.nextLine();
	System.out.println("Şifrenizi Giriniz:");
	sifre=girdi.nextLine();
	System.out.println("Bakiyenizi Giriniz:");
	bakiye=girdi.nextDouble();
	
	try{
	if(!dosya.exists())
	    {
		dosya.createNewFile();
		}
	FileWriter fw=new FileWriter(dosya,true);
        BufferedWriter bw=new BufferedWriter(fw);
    bw.write(isim);
    bw.write(" ");
    bw.write(soyisim);
    bw.write(" ");
    bw.write(sifre);
    bw.write(" ");
    bw.write(Double.toString(bakiye));
    bw.newLine();
    bw.close();
	}
	catch(Exception e)
	{
		System.err.print(e);
	}
}
}
