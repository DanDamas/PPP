package pack3_Set_de_Computere;

import java.util.HashSet;
import java.util.Set;

public class MainSetDeComputere {

	
	public static void main(String[] args) {
		
		Set<Computer> setComputere = new HashSet<Computer>();
		
		setComputere.add( new Computer("Lenovo", 4, 3.6));
		setComputere.add( new Computer("Lenovo", 4, 3.6));
		//se permite adaugarea aceluiasi de doua ori pentru ca 
		//am suprascris pe equals() dar nu si pe hashCode()
		//Calculatorul cauta in galeti diferite.
		
		
		//Am putut adauga acelasi computer de doua ori
		//pentru ca nu am suprascris metodele equals() si hashCode()
		//si din punctul lui de vedere sunt 2 obiecte total diferite.
		
		for (Computer computer : setComputere) {
			System.out.println( computer);			
		}
		System.out.println("========================");
				
		Computer comp3 = new Computer("Lenovo", 4, 3.6);
		Computer comp4 = new Computer("Lenovo", 4, 3.6);
		System.out.println( "HashCodul lui comp3: " + comp3.hashCode() );
		System.out.println( "HashCodul lui comp4: " + comp4.hashCode() );
		
		//Deci hashCodurile sunt diferite
		//Metoda hashCode() din clasa Oject returneaza 
		//un numar pe baza adresei obiectului din memorie
	}
}






















