package designpatterns;

public class SingletonClass {

	private static SingletonClass santa = new SingletonClass();
	private Command command;
	
	private SingletonClass() {}
	
	 public static SingletonClass getSanta(){
	      if (santa == null) {
	    	  santa = new SingletonClass();
	      }
	      
	      return santa;
	   }
	 
	 public void showDefaultMessage(String message) {
		 System.out.println("Santa says " + message);
	 }
	 
	 public Command getCommand() {
		 return command;
	 }
	 
	 public void setCommand(Command command) {
		 this.command = command;
	 }
	 
	 public void sayCommand() {
		 if(this.command == null) {
			 System.out.println("Santa did not give any commands");
			 return;
		 }
		 this.command.execute();
	 }
	 
	 
	 //probably wont work correctly for command, will see if I need them for 
	 //the implementation of observer
	// public void needDolls() {
	//	 System.out.println("I need dolls");
	// }
	 
	// public void needBikes() {
	//	 System.out.println("I need bikes");
	// }
}
