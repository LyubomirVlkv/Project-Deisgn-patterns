package designpatterns;

public class Main {
	public static void main (String[] args) {
	SingletonClass santa = SingletonClass.getSanta();
	
	santa.showDefaultMessage("Hello kids!");
	//santa.needBikes();
	//santa.needDolls();
	
	MagicBoard magicboard = new MagicBoard();
	Command needDolls = new NeedDolls(magicboard);
	Command needBikes = new NeedBikes(magicboard);
	Observer ivan = new Dwarves("Ivan");
	Observer petar = new Dwarves("Petar");
	Observer maria = new Dwarves("Maria");
	ToyFactory santaWorkshop = new Workshop();
	WorkshopToys ivanToy;
	WorkshopToys petarToy;
	WorkshopToys mariaToy;
	
	santa.setCommand(needBikes);
	santa.sayCommand();
	
	magicboard.subscribe(ivan);
	magicboard.subscribe(petar);
	magicboard.notifyObservers();
	ivanToy = santaWorkshop.produceToy(ivan.getTopic());
	petarToy = santaWorkshop.produceToy(petar.getTopic());
	
	santa.setCommand(needDolls);
	santa.sayCommand();
	
	magicboard.subscribe(maria);
	magicboard.notifyObservers();
	mariaToy = santaWorkshop.produceToy(maria.getTopic());
	ivanToy = santaWorkshop.produceToy(ivan.getTopic());
	petarToy = santaWorkshop.produceToy(petar.getTopic());
	
	
	
	
	
	}

}
