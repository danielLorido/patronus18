
public class NaveBase extends Nave {
	

	@Override
	public String dispara() {
		return "disparo Simple";
		
	}

	@Override
	public int ponerArmadura() {
		return 0;
	}

	@Override
	public Nave quitarArmadura() {
		return this;
		}

}
