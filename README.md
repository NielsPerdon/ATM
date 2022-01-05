# ATM
ATM machine in java gemaakt

De backend van dit project bestaat uit 7 onderdelen. 

1. transactie geschiedenis
2. opnemen
3. storten
4. overmaken
5. bon
6. saldo checken
7. afsluiten

Hoe maak je een txt bestand aan(bij de path moet je je eigen path neerzettenen de laatste \\atm.txt is de naam voor je file die automatisch word aangemaakt):

	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(
				new FileWriter("C:\\Users\\Niels Perdon\\Desktop\\Perdonics\\java\\ATM\\atm.txt"));
				bw.write("Dit is hoe je een file moet aanmaken en er informatie in moet zetten");
				bw.close();
		}catch(Exception ex) {
			return;
		}
		
	}
	
	op deze manier lees je een file. vergeet niet boven de public class de import java.io.*; neer te zetten

public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("C:\\Users\\Niels Perdon\\Desktop\\Perdonics\\java\\ATM\\atm.txt")
					);
			String s;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
			br.close();
		}catch(Exception ex) {
			return;
		}
		
	}

