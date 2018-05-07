package cn.tju.scs.c01;

public class CarEn {
	private String name;
	private double price;
	
	void getCarInfo(){
		System.out.println("汽车名称："+ getName() + "，汽车价格：" + getPrice());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0){
			this.price = price;
		}	
	}
}
