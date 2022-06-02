package designpatterns;

public abstract class ToyFactory {

public abstract  WorkshopToys createToy(String toyName);
	
	public WorkshopToys produceToy(String toyName) {
		WorkshopToys toy = createToy(toyName);
		toy.prepare();
		return toy;
	}
}
