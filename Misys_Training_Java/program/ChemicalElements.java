import com.sun.swing.internal.plaf.metal.resources.metal;


public class ChemicalElements {

	String name;
	String symbolicName;
	int atomicNumber;
	public ChemicalElements(String name, String symbolicName, int atomicNumber) {
		super();
		this.name = name;
		this.symbolicName = symbolicName;
		this.atomicNumber = atomicNumber;
	}
	static {
//		boolean alkali[] = {false,false,false,true,false,false,false,false,false,false,true};
//		boolean transition[] = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true};
		boolean metal[] = { false,false,false,false,false,false,false,false,false,false,false,false,false,true};
	}
	private boolean isMetal(){
		System.out.println(metal[0]);
		return true;
}
	private boolean isAlkaliMetal(){
		
			switch (atomicNumber) {
		case 3:
			return true;
		case  11:
			return true;
		case 19:
			return true;
		case 37:
			return true;
		case  55:
			return true;
		case 87:
			return true;
			default:
				return false;
			}
		
	}
	private boolean isTransitionMetal(){
		
		return (atomicNumber==21||atomicNumber==22||atomicNumber==23||atomicNumber==24||atomicNumber==25||atomicNumber==26||atomicNumber==27||atomicNumber==28||atomicNumber==29||atomicNumber==30||atomicNumber==31||atomicNumber==39||atomicNumber==40||atomicNumber==41||atomicNumber==42||atomicNumber==43||atomicNumber==44||atomicNumber==45||atomicNumber==46||atomicNumber==47||atomicNumber==48||atomicNumber==72||atomicNumber==73||atomicNumber==74||atomicNumber==75||atomicNumber==76||atomicNumber==77||atomicNumber==78||atomicNumber==79||atomicNumber==80||atomicNumber==104||atomicNumber==105||atomicNumber==106||atomicNumber==107||atomicNumber==108||atomicNumber==109||atomicNumber==110||atomicNumber==111||atomicNumber==112) ? true : false;

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChemicalElements element1 = new ChemicalElements("H", "Hydrogen", 1);
		ChemicalElements element2 = new ChemicalElements("K", "Potassium", 19);
		ChemicalElements element3 = new ChemicalElements("Zn", "Zinc", 30);
		System.out.println(element1.isAlkaliMetal());
		System.out.println(element2.isAlkaliMetal());
		System.out.println(element3.isTransitionMetal());
		System.out.println();
		/*for (int i = 0; i < 150; i++) {
			System.out.print(i+",");
		}*/

	}

}
