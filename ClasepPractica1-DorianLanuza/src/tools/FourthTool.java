package tools;

import misc.SCUtil;

public class FourthTool implements ITool {
	private String productName;
	private float price;
	private float discount;
	private int amount;
	private double total;
	
	public FourthTool() {
		
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	@Override
	public void function() {
		boolean band = false;
		
		do {
			try {
				System.out.print("\nNombre del producto: ");
				this.productName = SCUtil.sc.nextLine();
				SCUtil.sc.nextLine();
				band = true;
			}catch(IllegalArgumentException e) {
				System.out.println("Favor de ingresar un nombre valido.");
				e.printStackTrace();
			}
			
		}while(band == false);
		
		band = false;
		
	
		do {
			try {
				System.out.print("\nPrecio unitario del producto en cordobas: ");
				this.price = SCUtil.sc.nextFloat();
				band = true;
				
				if(this.price<=0) {
					System.out.println("El precio no puede ser menor o igual a 0.");
				}
				
			}catch(IllegalArgumentException e) {
				System.out.println("Favor de ingresar un nombre valido.");
				e.printStackTrace();
			}
			
		}while(band == false || this.price <= 0);
		
		
		band = false;
		
		
		do {
			try {
				System.out.print("\nDescuento del producto(Ingresar en formato de %): ");
				this.discount = SCUtil.sc.nextFloat();
				band = true;
				
				if(this.discount<0) {
					System.out.println("El porcentaje de descuento no puede ser menor a 0.");
				}
				
			}catch(IllegalArgumentException e) {
				System.out.println("Favor de ingresar un nombre valido.");
				e.printStackTrace();
			}
			
		}while(band == false || this.price <= 0);
		
		this.discount = this.discount / 100;
		
		band = false;
		
		do {
			try {
				System.out.print("\nCantidad del producto: ");
				this.amount = SCUtil.sc.nextInt();
				band = true;
				
				if(this.price<=0) {
					System.out.println("La cantidad no puede ser menor o igual a 0.");
				}
				
			}catch(IllegalArgumentException e) {
				System.out.println("Favor de ingresar un nombre valido.");
				e.printStackTrace();
			}
			
		}while(band == false || this.amount <= 0);
		
	
		this.total = (double) (this.amount * (this.price-(this.price*this.discount)));
	
	}
	
	
	@Override
	public void result() {
		System.out.printf("El precio total en la compra de %s es: %f", this.productName, this.total);
	}
	
	
	
	

}
