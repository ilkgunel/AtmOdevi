import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class SifreDegisikligi extends DegiskenlerVeIslemler implements MusteriIslemMetotlari{
	String yeniSifre;
	public SifreDegisikligi(String isim,String sifre)
	{
		this.isim=isim;
		this.sifre=sifre;
	}
	@Override
	public void sifreDegistir()
    {
    	
	    try{
	    	BufferedReader br=new BufferedReader(new FileReader(dosya));
		    String satir=br.readLine();
		    
		    while(satir!=null)
		    {
		    	if(satir.contains(isim)&&satir.contains(sifre))
		    	{
		    		
		    		System.out.println("Yeni Şifreyi Giriniz:");
		    	        yeniSifre=girdi.nextLine();
		    		
		    	    BufferedReader br1=new BufferedReader(new FileReader(dosya));
		    	    String satir1;
		    	    ArrayList<String> dosyaIcerigi=new ArrayList<String>();
		    	    satir1=br1.readLine();
		    	    while(satir1!=null)
		    	    {
		    	    	dosyaIcerigi.add(satir1);
		    	    	satir1=br1.readLine();
		    	    }
		    	    
		    	    for(int i=0;i<dosyaIcerigi.size();i++)
		    	    {
		    	    	if(dosyaIcerigi.get(i).contains(isim)&&dosyaIcerigi.get(i).contains(sifre))
		    	    	{
                                        
		    	    		dosyaIcerigi.set(i, dosyaIcerigi.get(i).replace(sifre, yeniSifre));
		    	    		break;
		    	    	}
		    	    }
		    	    
		    	    FileWriter fw=new FileWriter(dosya);
		    	    BufferedWriter bw=new BufferedWriter(fw);
		    	    for(int i=0;i<dosyaIcerigi.size();i++)
		    	    {
		    	    	bw.write(dosyaIcerigi.get(i));
                        bw.newLine();
		    	    }
		    	    bw.close();
                            satir=br.readLine();
		    	}
		    	else
		    	{
		    		satir=br.readLine();
		    	}
		    }
		    }
		    catch(Exception ex)
		    {
		    	System.err.println(ex);
		    }
    }
}
