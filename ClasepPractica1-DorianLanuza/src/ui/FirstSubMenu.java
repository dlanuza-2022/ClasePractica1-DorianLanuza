package ui;

import java.util.InputMismatchException;

import app.Application;
import exceptions.NumberOutOfRangeException;
import misc.SCUtil;

public class FirstSubMenu implements IMenu {

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
				
				if(op < 1 || op>2 ) {
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
				Application.toolOne();
				break;
			case 2:
				Menu menu = new Menu();
				menu.show();
				break;
		   default:
				System.out.println("Opción inválida.");
				break;
			}
			
		}while(op!=2 || band == false);
		
	}

	@Override
	public void displayOptions() {
		System.out.println("==Primer herramienta==");
		System.out.println("1. Ejecutar");
		System.out.println("2. Voler al menú principal");
		
	}

}
