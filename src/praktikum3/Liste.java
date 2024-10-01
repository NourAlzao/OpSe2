package praktikum3;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
public class Liste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        LinkedList<Stadt> staedteListe = new LinkedList<>();
		        String csvFile = "nrw.csv";
		        String line;

		        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
		            while ((line = br.readLine()) != null) {
		                String[] parts = line.split(":");
		                String stadtName = parts[0];
		                Stadt stadt = new Stadt(stadtName);

		                String[] postleitzahlen = parts[1].split(";");
		                for (String plz : postleitzahlen) {
		                    stadt.addPostleitzahl(plz);
		                }

		                staedteListe.add(stadt);
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        }

		       
		        if (!staedteListe.isEmpty()) {
		            Random rand = new Random();
		            Stadt randomStadt = staedteListe.get(rand.nextInt(staedteListe.size()));

		            System.out.println("Stadt: " + randomStadt.getName());
		            System.out.println("Postleitzahlen: ");
		            for (String plz : randomStadt.getpostzahl()) {
		                System.out.print(plz + " ");
		            }
		            System.out.println();
		        }
		    }
	}


