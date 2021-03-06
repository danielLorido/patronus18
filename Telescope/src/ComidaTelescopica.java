public class ComidaTelescopica {
	// el patron telescope se usa cuando existen varias propiedades que
	// entendemos como
	// opcionales su solucion consiste en escalar los constructores.
	
	//propiedades obligatorias
	  private final int id;
	  private final String name;
	  //propiedades opcionales
	  private final int calories;
	  private final int servingSize;
	  private final int fat;
	  private final String description;
	  
	  
	public ComidaTelescopica(int id, String name) {
		//este this hace referencia al constructor que contiene todas las propiedades
//		y le damos valor por defecto a las que no trata este constructor
		this(id,name,0,0,0,"nada");
	}


	public ComidaTelescopica(int id, String name, int calories) {
		this(id,name,calories,0,0,"nada");
	}

	public ComidaTelescopica(int id, String name, int calories, int servingSize) {
		this(id,name,calories,servingSize,0,"nada");
	}


	public ComidaTelescopica(int id, String name, int calories, int servingSize, int fat, String description) {
		super();
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.servingSize = servingSize;
		this.fat = fat;
		this.description = description;
	}
	  
	  

}
