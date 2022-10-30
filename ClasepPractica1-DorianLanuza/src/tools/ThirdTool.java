package tools;

import misc.SCUtil;

public class ThirdTool {
	private double a;
	private double b;
	private double result;
	
	public ThirdTool() {
		
	}
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	public void sum() {
		boolean band = false;
		do {
			try {
				System.out.print("\nIngrese el primer número: ");
				this.a = SCUtil.sc.nextDouble();
				band = true;
			}catch(IllegalArgumentException e) {
				System.out.println("Favor de ingresar un dato válido.");
				e.printStackTrace();
			}
		}while(band == false);
		
		band = false;
		
		do {
			try {
				System.out.print("\nIngrese el segundo número: ");
				this.b = SCUtil.sc.nextDouble();
				band = true;
			}catch(IllegalArgumentException e) {
				System.out.println("Favor de ingresar un dato válido.");
				e.printStackTrace();
			}
		}while(band == false);
		
		this.result = this.a + this.b;
		
		System.out.printf("El resultado de la suma es: %f", this.result);
	}
	
	public void substraction() {
		boolean band = false;
		do {
			try {
				System.out.print("\nIngrese el primer número: ");
				this.a = SCUtil.sc.nextDouble();
				band = true;
			}catch(IllegalArgumentException e) {
				System.out.println("Favor de ingresar un dato válido.");
				e.printStackTrace();
			}
		}while(band == false);
		
		band = false;
		
		do {
			try {
				System.out.print("\nIngrese el segundo número: ");
				this.b = SCUtil.sc.nextDouble();
				band = true;
			}catch(IllegalArgumentException e) {
				System.out.println("Favor de ingresar un dato válido.");
				e.printStackTrace();
			}
		}while(band == false);
		
		this.result = this.a - this.b;
		
		System.out.printf("El resultado de la resta es: %f", this.result);
	}
	
	public void multiplication() {
		boolean band = false;
		do {
			try {
				System.out.print("\nIngrese el primer número: ");
				this.a = SCUtil.sc.nextDouble();
				band = true;
			}catch(IllegalArgumentException e) {
				System.out.println("Favor de ingresar un dato válido.");
				e.printStackTrace();
			}
		}while(band == false);
		
		band = false;
		
		do {
			try {
				System.out.print("\nIngrese el segundo número: ");
				this.b = SCUtil.sc.nextDouble();
				band = true;
			}catch(IllegalArgumentException e) {
				System.out.println("Favor de ingresar un dato válido.");
				e.printStackTrace();
			}
		}while(band == false);
		
		this.result = this.a * this.b;
		
		System.out.printf("El resultado de la multiplicación es: %f", this.result);
	}
	
	public void division() {
		boolean band = false;
		do {
			try {
				System.out.print("\nIngrese el primer número: ");
				this.a = SCUtil.sc.nextDouble();
				band = true;
			}catch(IllegalArgumentException e) {
				System.out.println("Favor de ingresar un dato válido.");
				e.printStackTrace();
			}
		}while(band == false);
		
		band = false;
		
		do {
			try {
				System.out.print("\nIngrese el segundo número: ");
				this.b = SCUtil.sc.nextDouble();
				band = true;
				
				if(this.b==0) {
					System.out.println("No se puede dividir por 0.");
				}
			}catch(IllegalArgumentException e) {
				System.out.println("Favor de ingresar un dato válido.");
				e.printStackTrace();
			}
		}while(band == false || this.b == 0);
		
		this.result = this.a / this.b;
		
		System.out.printf("El resultado de la división es: %f", this.result);
	}

}
