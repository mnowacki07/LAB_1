package dad;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Txt {
 static List<String> lista = new ArrayList<String>(); 
	
    public void work() {     
        File txt = new File("tekst.txt");
        try {
            @SuppressWarnings("resource")
			BufferedReader odczytaj = new BufferedReader(new FileReader(txt));
            String line =null; 
            while ((line = odczytaj.readLine()) != null) { 
            	
            	 Pattern p = Pattern.compile("href=\"(.*?)\"");
                 Matcher z = p.matcher(line);
                   
                 while (z.find()) {
                	 String grupa = z.group(1); 
                	 lista.add(grupa);
                      
                       
                          }  
               
                } 
           
       
        } catch (IOException e) {
            e.printStackTrace();
        }
    } 
    public void wszystko(){ 
    	for(int i=0 ;i<lista.size();i++) 
    	System.out.println(lista.get(i));  
        
    } 
    
    public void liczba(){ 
    	System.out.println(lista.size());
    } 
    
    public void cale(){  
    	File txt = new File("tekst.txt");
        try {
            @SuppressWarnings("resource")
			BufferedReader odczytaj = new BufferedReader(new FileReader(txt));
            String line =null; 
                
            while ((line = odczytaj.readLine()) != null) { 
            	
            	System.out.println(line);
                                      }  
                 
                }  
        catch (IOException e) {
            e.printStackTrace();
        }
    	
    }
} 
