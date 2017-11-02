package Coches;

public class Cambios {

	private final int MARCHA_MAXIMA = 5;
	private int marcha = 0;

	public int getMarcha() {
		return marcha;
	}

	public void subirMarcha() {
		if(this.marcha<MARCHA_MAXIMA)
			this.marcha++;
	}

	public void bajarMarcha(){
		if (this.marcha>0)
			this.marcha--;
	}
}
