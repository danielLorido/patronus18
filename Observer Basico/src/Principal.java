
public class Principal {
public static void main(String[] args) {
	//Subject u Observable
	Avisador avisador=new Avisador();
	//los Observers
	Persona primera=new Persona();
	Persona segunda=new Persona();
	//añadir al boletin
	avisador.addObserver(primera);
	avisador.addObserver(segunda);
	//contador
	System.out.println("hay "+avisador.countObservers()+" observadores");
	avisador.cambio("ss");
	
}
}
