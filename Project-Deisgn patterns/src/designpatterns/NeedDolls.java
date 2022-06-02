package designpatterns;

public class NeedDolls implements Command {
	
	private MagicBoard dolls;
	
	public NeedDolls(MagicBoard dolls) {
		this.dolls = dolls;
	}
	
	public void execute() {
		this.dolls.needDolls();
	}

}
