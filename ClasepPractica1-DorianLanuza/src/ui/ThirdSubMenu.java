package ui;

import java.util.InputMismatchException;

import app.Application;
import exceptions.NumberOutOfRangeException;
import misc.SCUtil;

public class ThirdSubMenu implements IMenu {

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
				
				if(op < 1 || op>5 ) {
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
				Application.sum();
				break;
			case 2:
				Application.substraction();
				break;
			case 3:
				Application.multiplication();
				break;
			case 4:
				Application.division();
				break;
			case 5:
				Menu menu = new Menu();
				menu.show();
				break;
		   default:
				System.out.println("Opción inválida.");
				break;
			}
			
		}while(op!=5 || band == false);
		
	}

	@Override
	public void displayOptions() {
		System.out.println("==Primer herramienta==");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Voler al menú principal");
		
	}

}
