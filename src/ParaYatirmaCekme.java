import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class ParaYatirmaCekme extends DegiskenlerVeIslemler implements ParaIslemMetodlari{
	Double mevcutBakiye,yeniBakiye,yatırılacakPara,cekilecekPara;
	
	public ParaYatirmaCekme(String isim,String sifre)
	{
		this.isim=isim;
		this.sifre=sifre;
	}
	
    @Override
	public void paraYatir()
{
	try{
		BufferedReader br=new BufferedReader(new FileReader(dosya));
		String satir=br.readLine();
		while(satir!=null)
	    {
	    	if(satir.contains(isim)&&satir.contains(sifre))
	    	{
	    		System.out.println("Yatırmak İstediğiniz Para Miktarını Giriniz:");
	    		yatırılacakPara=girdi.nextDouble();
	    		
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
	    	    		StringTokenizer st = new StringTokenizer(satir);
	    	            for(int j=1;j<=3;j++){
	    	    		st.nextToken();
	    	    		}
	    	            mevcutBakiye=Double.parseDouble(st.nextToken());
	    	            System.out.println(mevcutBakiye);
	    	            yeniBakiye=mevcutBakiye+yatırılacakPara;
	    	            System.out.println(yeniBakiye);
	    	    		dosyaIcerigi.set(i, dosyaIcerigi.get(i).replace(mevcutBakiye.toString(), yeniBakiye.toString()));
	    	    		System.out.println(dosyaIcerigi.get(i));
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
		System.out.println(ex);
	}
}
    
    @Override
    public void paraCekme()
    {
    	try{
    		BufferedReader br=new BufferedReader(new FileReader(dosya));
    		String satir=br.readLine();
    		while(satir!=null)
    	    {
    	    	if(satir.contains(isim)&&satir.contains(sifre))
    	    	{
    	    		System.out.println("Çekmek İstediğiniz Para Miktarını Giriniz:");
    	    		cekilecekPara=girdi.nextDouble();
    	    		
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
    	    	    		StringTokenizer st = new StringTokenizer(satir);
    	    	            for(int j=1;j<=3;j++){
    	    	    		st.nextToken();
    	    	    		}
    	    	            mevcutBakiye=Double.parseDouble(st.nextToken());
    	    	            System.out.println(mevcutBakiye);
    	    	            if(cekilecekPara>mevcutBakiye)
    	    	            {
    	    	            	System.out.println("Yetersiz Bakiye");
    	    	            	System.out.println("Bakiyeniz:"+mevcutBakiye);
    	    	            }
    	    	            else
    	    	            {
    	    	            yeniBakiye=mevcutBakiye-cekilecekPara;
    	    	            System.out.println(yeniBakiye);
    	    	    		dosyaIcerigi.set(i, dosyaIcerigi.get(i).replace(mevcutBakiye.toString(), yeniBakiye.toString()));
    	    	    		System.out.println(dosyaIcerigi.get(i));
    	    	            }
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
    		System.out.println(ex);
    	}
    	
    }
}
