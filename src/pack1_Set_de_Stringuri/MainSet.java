package pack1_Set_de_Stringuri;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


//Set-urile nu permit duplicate
//Set-urile nu sunt ordonate, nu au index
//Ordinea nu este garantata


public class MainSet {

	
	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<String>();
		
		set1.add("maimuta");
		set1.add("portocala");
		set1.add("acadea");
		set1.add("casa");
		set1.add("munte");
		set1.add("trotineta");
		
		System.out.println( set1 );
		//Ne-a afisat: [munte, maimuta, casa, trotineta, portocala, acadea]
		// nu este garantata ordinea.

		//cuvantul casa este duplicat si nu se adauga
		//nu se accepta duplicate
		//se verifica mai intai dupa hashCode() (galeata)
		//apoi cu equals()
		//String implementeaza pe hashCode()
		boolean bool = set1.add("casa");
		System.out.println("S-a adaugat casa? " + bool );  //false
		
		
		//adaugam casa cu litera mare
		System.out.println("S-a adaugat Casa? " +  set1.add("Casa")   );
		
		System.out.println("================================");
		
		//Sa printam hashCodurile elementelor
		for (String string : set1) {
			System.out.println( string + ", hashCode:" + string.hashCode());
		}
		
		System.out.println("================================");
		
		//Sa afisam folosind un iterator
		System.out.println( "Afisam folosing un iterator" );
		Iterator<String> iter = set1.iterator();
		while (iter.hasNext()) {
			String string = iter.next();
			System.out.print( string + ", ");
		}
		
		System.out.println("================================");
		
		//Sa afisam folosind bucla for clasica
		//Nu se poate afisa cu index, pentru ca Set-urile nu au index
		for (int i = 0; i < set1.size(); i++) {
			//Decat prin transformarea in array cu metoda set1.toArray()
		}
		
	}
}
