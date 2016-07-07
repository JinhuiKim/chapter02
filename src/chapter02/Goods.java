package chapter02;

public class Goods {
	public static int countOfGoods;
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public Goods(){
		
	}
	
	public Goods(String name, int price, int countStock, int countSold){
		this.name=name;
		this.price=price;
		this.countStock = countStock;
		this.countSold=countSold;
	}
	
	//접근할때
	public String getName() {
		return name;
	}
	
	//외부에 값을 던져줄때
	public void setName(String name){
		this.name = name;//this.쓰면 인스턴스 변수를 말함
	}	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price<0){
			price=0;
		}
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public int calcDiscountPrice(int percentage){
		return price * percentage/100;
	}
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ "]";
	}

	public void showInfo() {
		System.out.println("[name="+name+","+
							"price="+price+","+
							"countStock="+countStock+","+
							"countSold="+countSold+"]");
	}
}
