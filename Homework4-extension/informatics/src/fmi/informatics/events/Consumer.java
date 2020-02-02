package fmi.informatics.events;

public class Consumer implements Observer {
	
	private String name;
	private Observable observable;
	
	public Consumer(String name, Observable observable) {
		this.name = name;
		this.observable = observable;
	}
	
	public void unsubscribe() {
		observable.removeObserver(this);
	}
	
	public void greeting() {
		System.out.println("The consumer " + name + " is greeting you!");
	}

	@Override
	public void update() {
		greeting();
	
	}
}