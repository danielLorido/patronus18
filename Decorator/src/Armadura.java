
public class Armadura extends Caracterisitica {
	Nave actual;

	public Armadura(Nave actual) {
		super();
		this.actual = actual;
	}

	@Override
	public String dispara() {
		return actual.dispara();
	}

	@Override
	public int ponerArmadura() {
		
		return actual.ponerArmadura()+1;
	}

	@Override
	public Nave quitarArmadura() {
		return actual;
	}

}
