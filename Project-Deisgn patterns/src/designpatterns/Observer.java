package designpatterns;

public interface Observer {
		void update();
		void setTopic(Observable topic);
		String getTopic();
	}

