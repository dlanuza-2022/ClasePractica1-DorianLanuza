
package tools;

import misc.SCUtil;

public class FifthTool implements ITool {
	private char[] name;
	private int length = 0;
	
	public FifthTool() {
		
	}
	
	public char[] getName() {
		return name;
	}

	public void setName(char[] name) {
		this.name = name;
	}

    public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public void function() {
		boolean band = false;
		
		do {
			try {
				
				System.out.print("\nIngrese la cantidad de letras de este nombre: ");
				this.length = SCUtil.sc.nextInt();
				if(this.length != 0) {
					band = true;
				}
				
			}catch(IllegalArgumentException e) {
				System.out.println("Favor de ingresar un dato válido.");
			}
			
		}while(band == false);
		
		
		band = false;
		
		this.name = new char[this.length];
		
		
		do {
			for(int i = 0; i<this.length; i++) {
				
				try {
					System.out.print("\nIngrese la letra de la posición número " + (i+1) + ":");
					this.name[i] = SCUtil.sc.next().charAt(0);
					
					if(this.name[(this.length-1)] != ' ') {
						band = true;					
					}
				}catch(IllegalArgumentException e) {
					System.out.println("Error.");
					System.out.println("Intentelo nuevamente.");
					e.printStackTrace();
					break;
				}
				
			}
		}while(band == false);
			
	}
	
    @Override
    public void result() {
    	System.out.print("\nNombre: ");
    	for(int i = (this.length-1); i>=0; i--) {
    		System.out.print(this.name[i]);
    	}
    	
    }
	
	
	

}
