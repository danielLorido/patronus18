import java.util.Observable;
import java.util.Observer;


public class Persona implements Observer {

	//Esta clase es la que se va a poner como Observer
	@Override
	public void update(Observable o, Object a) {
		System.out.println("Soy la persona "+this.toString()+"y he sido avisada "+o.toString()+ " "+a.toString());
	}

}
