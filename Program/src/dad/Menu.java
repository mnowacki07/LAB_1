package dad;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
	public void menu() {
		Txt txt = new Txt();
		Reader url = new Reader();
		while(true){
		System.out.println("URL czy TXT?");
		@SuppressWarnings("resource")
		Scanner klawiatura = new Scanner(System.in);
		String b = klawiatura.nextLine();
		switch (b) {
		case "URL":
			System.out.println("podaj adres www");
			try {
				url.getData(url.reading4);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("wszystkie linki/liczba linkow/wybor linku/cale zrodlo");
			@SuppressWarnings("unused")
			Scanner klawiatura4 = new Scanner(System.in);
			String b4 = klawiatura.nextLine();
			switch (b4) {
			case "wszystkie linki":
				url.all();
				break;
			case "liczba linkow":
				url.count();
				break;
			case "wybor linku":
				System.out.println("Jaki numer?");
				Scanner klawiatura5 = new Scanner(System.in);
				int b5 = klawiatura5.nextInt();
				System.out.println(url.lista1.get(b5 - 1));
				break;
			case "cale zrodlo":
				System.out.println("ponow adres");
				try {
					url.getAll(url.reading5);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			}  
			url.lista1.clear();
			break; 
			
		case "TXT":
			System.out.println("wszystkie linki/liczba linkow/wybor linku/cale zrodlo");
			Scanner klawiatura1 = new Scanner(System.in);
			String b1 = klawiatura1.nextLine();
			switch (b1) {
			case "wszystkie linki":
				txt.wszystko();
				break;
			case "liczba linkow":
				txt.liczba();
				break;
			case "wybor linku":
				System.out.println("Jaki numer?");
				Scanner klawiatura2 = new Scanner(System.in);
				int b2 = klawiatura2.nextInt();
				System.out.println(txt.lista.get(b2 - 1));
				break;
			case "cale zrodlo":
				txt.cale();
				break;
			}
			break;
		}

	} 
		
} 
}