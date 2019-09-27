package rs.itbootcamp.humanity.start;

import java.util.Scanner;

import rs.itbootcamp.humanity.page.tests.HumanityAddNewEmployeeExcelTests;
import rs.itbootcamp.humanity.page.tests.HumanityAddNewEmployesTests;
import rs.itbootcamp.humanity.page.tests.HumanityLoginExcel;
import rs.itbootcamp.humanity.page.tests.HumanityLoginTests;
import rs.itbootcamp.humanity.page.tests.HumanityStaffTest;

public class HumanityMain2 {

				
		public static void main(String[] args) throws Exception {
			
				Scanner sc=new Scanner(System.in);
				int izbor; 
				do {
					System.out.println("Testiranje web aplikacije Humanity.com");
					System.out.println("Izaberite jednu od opcija: ");
					System.out.println("1 - Manualni testovi");
					System.out.println("2 - Automatizovani testovi");
					System.out.println("0 - Izlaz");
					System.out.println("Unesite broj: ");
					
					izbor =sc.nextInt(); 
					sc.nextLine();
					switch (izbor) {
					case 0:
						System.out.println("Hvala vam sto ste koristili ovaj program.");	
						break;
					case 1:
						String manuelno;
						do {
							
							System.out.println("Dobrodosli u program za manuelno testiranje");
							System.out.println("Ponudjeni testovi:");
							System.out.println("1 - Manuelno logovanje");
							System.out.println("2 - Manuelno dodavanje zaposlenih na listu");
							System.out.println("3 - Manuelno dodavanje zaposlenih sa slikom");
							System.out.println("0 - Povratak na pocetni meni");
							System.out.println("Unesite broj testa koji zelite da pokrenete: ");
							manuelno=sc.nextLine();
							switch (manuelno) {
							case "1":
							if	(HumanityLoginTests.loginTest()) {
								System.out.println("Test je uspesan!");
							} else {
								System.out.println("Test nije uspesan!");
							};
								break;
							case "2":
							if	(HumanityAddNewEmployesTests.AddEmployesTest()) {
								System.out.println("Test je uspesan!");
							} else {
								System.out.println("Test nije uspesan!");
							};
								break;
							case "3":
							if	(HumanityStaffTest.TestPicture()) {
								System.out.println("Test je uspesan!");
							} else {
								System.out.println("Test nije uspesan!");
							};
								break;
							
							default:
								System.out.println("Nepostojeca operacija!");
							}
						}while(!manuelno.equals("0"));
						break;
					
					case 2:
						String automatizovano;
						do {
							System.out.println("Dobrodosli u program za automatsko testiranje");
							System.out.println("Ponudjeni testovi:");
							System.out.println("1 - Automatizovano logovanje");
							System.out.println("2 - Automatizovano dodavanje zaposlenih na listu");
							System.out.println("0 - Povratak na pocetni meni");
							System.out.println("Unesite broj testa koji zelite da pokrenete: ");
							automatizovano=sc.nextLine();
							switch(automatizovano) {
							case "1":
							if	(HumanityLoginExcel.Login()) {
								System.out.println("Test je uspesan!");
							} else {
								System.out.println("Test nije uspesan!");
							};
								break;
							case "2":
							if	(HumanityAddNewEmployeeExcelTests.AddEmployesExcelTest()) {
								System.out.println("Test je uspesan!");
							} else {
								System.out.println("Test nije uspesan!");
							};
								break;
							case "3":
								System.out.println("Povratak na pocetni meni");
								Thread.sleep(2000);
								System.out.print("............");
								break;
							default:
								System.out.println("Nepostojeca operacija!");
								
							}
						}while(!automatizovano.equals("0"));
					default: 
						System.out.println("Nepostojeca operacija!");
						Thread.sleep(1000);
						System.out.print("............");
						break;
					}
				}while (izbor!=0);	
			}		
		
	}


