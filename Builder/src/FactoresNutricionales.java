//El patron builder se utiliza cuando necesitamos derivar la creacion
//de objetos, por su complicacion, a otro objeto creador que se encarga 
//de la produccion
public class FactoresNutricionales {
	// partimos de una serie de propiedades que pueden ser o no obligatorias
	// obligatorios
	private final int servingSize;
	private final int servings;
	// opcionales
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	// Hagamos el builder
	public static class Builder {
		// como son obligatorios, no se inicializan
		private final int servingSize;
		private final int servings;
		//opcionales les doy un valor por defecto
		private int calories = 0;
		private int fat = 0;
		private int carbohydrate = 0;
		private int sodium = 0;
		
		//el constructor de los obligatorios
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		//un especificador por cada atributo opcional
		public Builder calories(int val){
			this.calories=val;
			return this;
		}
		public Builder fat(int val) {
			this.fat = val;
			return this;
		}

		public Builder carbohydrate(int val) {
			this.carbohydrate = val;
			return this;
		}

		public Builder sodium(int val) {
			this.sodium = val;
			return this;
		}
		//este metodo es el encargado final de la construccion
		public FactoresNutricionales build(){
			return new FactoresNutricionales(this);
		}
	}

	private FactoresNutricionales(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}
}
