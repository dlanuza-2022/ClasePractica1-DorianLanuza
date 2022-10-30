package tools;

import misc.SCUtil;

public class SecondTool implements ITool {
	private double area;
	private double radius = -1;

	public SecondTool() {
		
	}
	
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public void function() {
		boolean band = false;
		
		do {
			try {
				System.out.print("\nIngrese el radio del círculo: ");
				this.radius = SCUtil.sc.nextDouble();
				if(this.radius != -1) {
					band = true;
				}
				if(this.radius<0) {
					System.out.println("El radio no puede ser menor de 0.");
				}
				
			}catch(IllegalArgumentException e) {
				System.out.println("Favor de ingresar un dato válido.");
			}
		}while(this.radius < 0 || band == false);
		
		this.area = Math.PI*this.radius;
		
	}


	@Override
	public void result() {
		System.out.printf("\nEl área es igual a : %f", this.area);
		
	}
	
	
	
	
	
	
	
	

}
