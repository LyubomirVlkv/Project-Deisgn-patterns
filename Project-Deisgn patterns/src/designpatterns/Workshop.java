package designpatterns;

public class Workshop extends ToyFactory {
	
	public WorkshopToys createToy(String toyName) {
		
		if(toyName == "Dolls") {
			return new Doll();
		}
		if(toyName == "Bikes") {
			return new Bike();
		}
		else System.out.println("Unknown toy");
		return null;
	}
	

}

