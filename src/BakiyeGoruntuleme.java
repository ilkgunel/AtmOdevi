import java.util.*;
import java.io.*;
public class BakiyeGoruntuleme  extends DegiskenlerVeIslemler{
	
	public BakiyeGoruntuleme(String isim,String sifre)
	{
		this.isim=isim;
		this.sifre=sifre;
	}
	
    public void bakiyeBilgisi()
    {
	    
	    try{
	    BufferedReader br=new BufferedReader(new FileReader(dosya));
	    String satir=br.readLine();
	    while(satir!=null)
	    {
	    	if(satir.contains(isim)&&satir.contains(sifre)){
	    		StringTokenizer st = new StringTokenizer(satir);
	            for(int i=1;i<=3;i++){
	    		st.nextToken();
	    		}
	            System.out.println("Bakiyeniz:"+st.nextToken());
	            break;
	    	}
	    	else
	    		satir=br.readLine();
	    }
	    }
	    catch(Exception ex)
	    {
	    	System.err.println(ex);
	    }
    }
}
