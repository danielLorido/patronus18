import java.util.Observable;



//El Observable es el subject (poseedor de la informacion)
public class Avisador extends Observable {
	public void cambio(Object o){
		//Este metodo produce un cambio
		//lo avisa al Observable
		setChanged();
		//Avisar a todos los observer en nuestro boletin, pasandole
		//en el parametro opcional el objeto o
		notifyObservers(o);
	}
}
