package backend;

public class MotorElectricoAdapter extends Motor{

	private MotorElectrico motorElectrico;;
	
	public MotorElectricoAdapter() {
		super();
		this.motorElectrico=new MotorElectrico();
	}
	@Override
	public void encender() {
		this.motorElectrico.conectar();
		this.motorElectrico.activar();
		
	}

	@Override
	public void acelerar() {
		this.motorElectrico.moverMasRapido();
		
	}

	@Override
	public void apagar() {
		this.motorElectrico.desconectar();
		
	}

}
