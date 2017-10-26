package frontend;

import java.util.Scanner;

import backend.Motor;
import backend.MotorEconomico;
import backend.MotorElectricoAdapter;

public class Principal {
public static void main(String[] args) {
	 System.out.println("que motor quieres");
	 Scanner leer=new Scanner(System.in);
	 Motor motor = null;
	 int opcion=leer.nextInt();
	 switch (opcion) {
	case 1:motor=new MotorEconomico();		
		break;
	case 2:motor=new MotorElectricoAdapter();
		break;
	}	 
	 motor.encender();
	 motor.acelerar();
	 motor.apagar();
}
}
