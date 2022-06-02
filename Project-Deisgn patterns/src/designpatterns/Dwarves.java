package designpatterns;

public class Dwarves implements Observer {
	
	public String name;
	private Observable topic;
	
	public Dwarves(String name) {
		this.name = name;
	}
	
	
	@Override
	public void update() {
		if(this.topic == null) {
			System.out.println("No topic set");
			return;
		}
		String lastTopic = this.topic.getUpdate();
		System.out.println(this.name + " received: " + lastTopic);
		
	}
	@Override
	public void setTopic(Observable topic) {
		this.topic = topic;
	}


	@Override
	public String getTopic() {
		String getTopic = this.topic.getUpdate();
		return getTopic;
		
	}
}
