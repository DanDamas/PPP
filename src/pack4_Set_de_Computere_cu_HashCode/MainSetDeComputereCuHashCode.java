package pack4_Set_de_Computere_cu_HashCode;

import java.util.HashSet;
import java.util.Set;

public class MainSetDeComputereCuHashCode {

	
	public static void main(String[] args) {
		
		Set<Computer> setComputere = new HashSet<Computer>();
		
		setComputere.add( new Computer("Lenovo", 4, 3.6));
		setComputere.add( new Computer("Lenovo", 4, 3.6));
		//nu se mai permite adaugarea aceluiasi comp de doua ori pentru ca 
		//am suprascris si pe equals() si pe hashCode()

		
		for (Computer computer : setComputere) {
			System.out.println( computer);			
		}
		System.out.println("========================");
		
		
		//introducem elementul null
		System.out.println("null ? " + setComputere.add(null)     );//true
		
		System.out.println("========================");
		
		System.out.println("Afiseaza elementele:");
		for (Computer computer : setComputere) {
			System.out.println( computer);			
		}
		System.out.println("========================");
		
		//introducem iar elementul null
		System.out.println("null ? " + setComputere.add(null)     );//false

	}
}






















