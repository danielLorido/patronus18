
public class Principal {
public static void main(String[] args) {
	/*
	 * Pasada autentica: Se trata de que el constructor de la clase sea privado
	 * para que no tengamos los problemas de un constructor muy grande ni que usar
	 * tantos metodos como diga javabean
	 * La idea es que hay una innerclass que se llame Builder, con todos los parametros
	 * de la clase externa. Partimos de un constructor en el que estan los obligatorios
	 * y existe un metodo por cada propiedad opcional. En el constructor se pueden llamar
	 * a tantos metodos que dan valor a un atributo como se quiera. Finalmente se llamma
	 * al metodo build, que tiene acceso al constructor de la clase externa y le otorga
	 * los valores de la clase interna.
	 */
	/*
	 * Se pueden hacer llamadas sucesivas a los metodos del builder porque todos retornan
	 * el propio (this) objeto builder que modifican. !Espectacular!
	 */
	FactoresNutricionales cocaCola=new FactoresNutricionales.Builder(300, 125).build();
	//Como se usa la opcionales
	FactoresNutricionales fanta=new FactoresNutricionales.Builder(250, 100)
	.calories(150).calories(500).build();
}
}
