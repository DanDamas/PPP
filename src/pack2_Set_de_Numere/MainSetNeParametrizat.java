package pack2_Set_de_Numere;

import java.util.HashSet;
import java.util.Set;

//Set neparametrizat in care punem mai multe numere

public class MainSetNeParametrizat {
	
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		System.out.println("4 ?" + set.add(   new Integer(4)  )  );
		System.out.println("35 ?" +  set.add(   new Integer(35)  )  );
		System.out.println("4.0 ?" +  set.add(   new Double(4.0)  )  );
		System.out.println("4 ?" + set.add(   new Long(4L)  )  );
		
	}
}
