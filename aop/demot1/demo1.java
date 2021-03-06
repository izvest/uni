import java.util.Scanner;
import java.lang.Math;

import java.io.BufferedReader;
import java.io.FileReader;

public class demo1{
	
	public static void main(String[] args){
		try{
			Scanner lukija = new Scanner(System.in);
			System.out.print("Valitse demotehtava: ");
			int demo = lukija.nextInt();
			lukija.nextLine();
			System.out.println("------------------------");
			if (demo == 1){
				String s1 = args[0];
				String s2 = args[1];
				String s3 = args[2];
				System.out.println("------------------------");
				System.out.print("Lyhin merkkijono: ");
				if ((s1.length() < s2.length())&&(s1.length() < s3.length())){
					System.out.println(s1);
				}
				else if ((s2.length() < s1.length())&&(s2.length() < s3.length())){
					System.out.println(s2);
				}
				else{System.out.println(s3);}
			}
			else if (demo == 2){
				System.out.print("Syntymavuotesi: ");
				int svuosi = lukija.nextInt();
				String ika;
				if (2015 - svuosi < 18){ika = "Alaikainen";}
				else {ika = "Taysi-ikainen";}
				System.out.println("------------------------");
				System.out.println("Vuoden 2015 lopussa olit: " + ika);
			}
			else if (demo == 3){
				try (BufferedReader br = new BufferedReader(new FileReader("demo13.java"))) {
					String line = null;
					while ((line = br.readLine()) != null) {
						System.out.println(line);
					}
				}
				catch(Exception e){System.out.println("Jokin meni vikaan. Vastaus erillisessa tiedostossa. ks. demo1.3.java");}
			}
			else if (demo == 4){
				System.out.print("Sahkopostiosoitteesi: ");
				String mail = lukija.nextLine();
				int mp = mail.indexOf('@');
				int pit = mail.length();
				String dom = mail.substring(mp+1,pit);
				System.out.println("------------------------");
				System.out.println("Sahkopostiosoitteesi domain -osa: " + dom);
			}
			else if (demo == 5){
				System.out.println("Ratkaistaan 2. asteen yhtälö, joka muotoa ax²+bx+c=0, jossa a, b ja c kokonaislukuja");
				System.out.println("------------------------");
				System.out.print("a:n arvo:: ");
				int a = lukija.nextInt();
				System.out.print("b:n arvo: ");
				int b = lukija.nextInt();
				System.out.print("Lausekkeen vakiotermi c : ");
				int c = lukija.nextInt();
				double disk = b*b-4*a*c;
				System.out.println("------------------------");
				if (disk >= 0 && a != 0){
					System.out.println("Juuri no. 1: " + (-b+Math.sqrt(disk))/(2*a));
					System.out.println("Juuri no. 2: " + (-b-Math.sqrt(disk))/(2*a));
				}else{System.out.println("Kahta reallijuurta ei loytynyt");}
			}
			else if (demo == 6){
				System.out.print("Ensimmainen merkkijono: ");
				String a = lukija.nextLine();
				System.out.print("Toinen merkkijono (lyhyempi): ");
				String b = lukija.nextLine();
				int blen = b.length();
				String c = new String();
				for (int i = 0; i < a.length();){
					if (i <= (a.length()-blen)){
						if (a.substring(i,i+blen).equals(b)){
							c += a.substring(i,i+blen).toUpperCase();
							i += blen;
						}
						else{c += a.charAt(i);i++;}
					}
					else{c += a.charAt(i);i++;}				
				}
				System.out.println("------------------------");
				System.out.println(c);
			}
			else{System.out.println("Etsimaasi demoa ei loytynyt. Yrita uudelleen.");}
			lukija.close();
		}
		catch(Exception e){System.out.println("Jokin meni pieleen, yrita uudelleen!");}
	}
}
