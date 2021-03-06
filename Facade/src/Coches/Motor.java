package Coches;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Motor {

	private int intervaloAceleracion[] = { 0, 1, 2, 3, 4, 5 };
	private float velocidad = 0;
	private int rpm = 0;
	private float fuerzaInicial = 0;
	private LocalTime nowInit, nowEnd;
	private final int RPM_MAX = 100;

	public long cambia(int marcha, float fuerzaFinal) {
		nowInit = LocalTime.now();
		int deltaRpm = 1, deltaFuerzaInicial = 1;
		if (rpm + fuerzaFinal - fuerzaInicial <= RPM_MAX) {
			if (fuerzaInicial > fuerzaFinal) {
				deltaRpm = -deltaRpm;
				deltaFuerzaInicial = -deltaFuerzaInicial;
			}
			try {
				while (Math.abs(this.fuerzaInicial - fuerzaFinal) != 0) {
					Thread.sleep((long) (this.intervaloAceleracion[marcha] * 100 / fuerzaFinal));
					this.rpm += deltaRpm;
					this.fuerzaInicial += deltaFuerzaInicial;
					this.velocidad = this.intervaloAceleracion[marcha] * this.rpm;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		nowEnd = LocalTime.now();
		return ChronoUnit.MILLIS.between(nowInit, nowEnd);
		// return Duration.between(nowInit, nowEnd).toMillis();
	}

	public float getVelocidad() {
		return velocidad;
	}

	public int getRpm() {
		return rpm;
	}

}
