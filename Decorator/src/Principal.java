
public class Principal {

	public static void main(String[] args) {
		Nave miNave = new NaveBase();
		System.out.println(miNave.dispara());
		System.out.println(miNave.getClass().toString());
		//a�adir una funcionalidad
		miNave=new DisparoLDos(miNave);
		System.out.println(miNave.dispara());
		System.out.println(miNave.getClass().toString());
		//le ponemos armadura
		miNave=new Armadura(miNave);
		System.out.println(miNave.dispara());
		System.out.println(miNave.getClass().toString());
		System.out.println(miNave.ponerArmadura());
		
		miNave=new Armadura(miNave);
		System.out.println(miNave.dispara());
		System.out.println(miNave.getClass().toString());
		System.out.println(miNave.ponerArmadura());
		
		miNave=miNave.quitarArmadura();
		System.out.println(miNave.dispara());
		System.out.println(miNave.getClass().toString());
		System.out.println(miNave.ponerArmadura());
		
	}

}
