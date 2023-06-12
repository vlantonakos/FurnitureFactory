
public class MainClass {

	public static void main(String[] args) {
		Order ord = new Order(new VictorianFurnitureFactory());
		Order ord1 = new Order(new ModernFurnitureFactory());
		ord.addChair();
		ord.addChair();
		ord.addTable();
		ord.addSofa();
		
		ord1.addTable();
		ord1.addSofa();

		System.out.println("**** Order 1 ****");
		ord.printInfo();
		
		System.out.println("**** Order 2 ****");
		ord1.printInfo();
	}

}
