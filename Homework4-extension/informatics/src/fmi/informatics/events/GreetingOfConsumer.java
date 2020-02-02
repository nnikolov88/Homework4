package fmi.informatics.events;

import java.util.ArrayList;
import java.util.List;

public class GreetingOfConsumer implements Observable {
	
	private List<Observer> people = new ArrayList<>();
	private boolean salutation;
	@Override
	public void addObserver(Observer o) {
		people.add(o);
		
	}
	@Override
	public void removeObserver(Observer o) {
		people.remove(o);
		
	}
	@Override
		public void notifyObserver() {
			for(Observer person : people) {
				person.update(); 
			}
	
		}
		
		public boolean salutation() {
			return salutation;
		}
		public void consumerSalutation(boolean salutation) {
			this.salutation = salutation;
			if (salutation) notifyObserver();
		}
	}