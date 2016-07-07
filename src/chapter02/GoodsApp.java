package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		//camera.name = "nikon";
		camera.setName("nikon");
		//camera.price=400000;
		camera.setPrice(-1);
		camera.setCountSold(10);
		camera.setCountStock(50);
		
		System.out.println(Goods.countOfGoods);
		
//		camera.showInfo();
		
		System.out.println(camera);
		//System.out.println(camera.toString());
		
		
		//camera.countStock = 30;
		//camera.countSold = 50;
		
//		String str = camera.toString();// °´Ã¼ÀÇ Á¤º¸¸¦ ½ºÅ×Æ½? ½ºÆ®¸µÀ¸·Î ¹Ù²ãÁÜ
//		System.out.println(camera.getName());
		
		
		int discountPrice = camera.calcDiscountPrice(43);
		System.out.println(discountPrice);
		
		 
		Goods goods1 = new Goods("cannon", 300000, 0, 100);
		System.out.println(discountPrice);
	}

}
