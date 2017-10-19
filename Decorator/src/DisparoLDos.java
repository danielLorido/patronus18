
public class DisparoLDos extends Disparo{
	Nave actual;

	public DisparoLDos(Nave actual) {
		super();
		this.actual=actual;
	}
	@Override
	public String dispara() {
//		return actual.dispara()+" disparo lateral ";
		return " disparo lateral ";
	}

	@Override
	public int ponerArmadura() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Nave quitarArmadura() {
		// TODO Auto-generated method stub
		return null;
	}

}
