package designpatterns;

public class NeedBikes implements Command {
	
private MagicBoard bikes;
	
	public NeedBikes(MagicBoard bikes) {
		this.bikes = bikes;
	}
	
	public void execute() {
		this.bikes.needBikes();
	}
}
