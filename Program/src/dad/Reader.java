package dad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reader {
	List<String> lista1 = new ArrayList<String>();
	String reading4;
	String reading5;
	
	public void getData(String address) throws Exception {

		@SuppressWarnings("resource")
		Scanner odczyt4 = new Scanner(System.in);
		reading4 = odczyt4.nextLine();
		final URL url = new URL(reading4);
		final URLConnection urlConnection = url.openConnection();
		final BufferedReader in = new BufferedReader(new InputStreamReader(
				urlConnection.getInputStream()));
		String inputLine;

		while ((inputLine = in.readLine()) != null) {

			Pattern p = Pattern.compile("href=\"(.*?)\"");
			Matcher z = p.matcher(inputLine);

			while (z.find()) {
				String grupa = z.group(1);
				lista1.add(grupa);
			}
		}

	}

	public void all() {
		for (int i = 0; i < lista1.size(); i++)
			System.out.println(lista1.get(i));
	}

	public void count() {
		System.out.println(lista1.size());
	}

	public void getAll(String adress) throws IOException {

		@SuppressWarnings("resource")
		Scanner odczyt4 = new Scanner(System.in);
		reading5 = odczyt4.nextLine();
		final URL url = new URL(reading5);
		final URLConnection urlConnection = url.openConnection();
		final BufferedReader in = new BufferedReader(new InputStreamReader(
				urlConnection.getInputStream()));

		String inputLine2;

		while ((inputLine2 = in.readLine()) != null) {

			System.out.println(inputLine2);
		}

	} 
	
}