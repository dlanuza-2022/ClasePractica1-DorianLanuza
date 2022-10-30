package ui;

import java.util.InputMismatchException;

import exceptions.NumberOutOfRangeException;
import misc.SCUtil;

public class Menu implements IMenu {
	

	@Override
	public void show() {
		short op = 0;
		boolean band = false;
	
		do {
			
			try {
				System.out.println();
				displayOptions();
				System.out.println();
				op = SCUtil.sc.nextShort();
				
				if(op < 1 || op>6 ) {
					throw new NumberOutOfRangeException("Numero fuera de rango, favor elegir un numero entre 1 y 6");
				}
				
				if(op != 0) {
					band = true;
				}
				
			}catch(IllegalArgumentException e) {
				System.out.println("Favor ingresar un dato valido.");
				
				e.printStackTrace();
			}catch(NumberOutOfRangeException e) {
				System.out.println("Favor de ingresar un dato valido.");
				e.printStackTrace();
				
			}catch(InputMismatchException e) {
				System.out.println("Favor de ingresar un dato valido.");
				e.printStackTrace();
				
			}
			
			switch(op) {
			case 1:
				FirstSubMenu menuOne = new FirstSubMenu();
				menuOne.show();
				break;
			case 2:
				SecondSubMenu menuTwo = new SecondSubMenu();
				menuTwo.show();
				break;
			case 3:
				ThirdSubMenu menuThree = new ThirdSubMenu();
				menuThree.show();
				break;
			case 4:
				FourthSubMenu menuFour = new FourthSubMenu();
				menuFour.show();
				break;
			case 5:
				FifthSubMenu menuFive = new FifthSubMenu();
				menuFive.show();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Opción inválida.");
				break;
			}
			
		}while(op!=6 || band == false);
		
		
		
		
		
	}

	@Override
	public void displayOptions() {
		System.out.println("===Menú de opciones===");
		System.out.println("1. Guardar nombre");
		System.out.println("2. Calcular el área de un círculo");
		System.out.println("3. Operaciones aritmeticas con dos números");
		System.out.println("4. Calcular la factura de un producto");
		System.out.println("5. Guardar nombre e imprimirlo al revés");
		System.out.println("6. Salir");
		
	}

}
