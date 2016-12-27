public class Train {

	// Kann für die Ausgabe verwendet werden
	private static final String LOCOMOTIVE = "<___|o|";

	private Waggon head;

	public int getSize() {
		int buffer = 0;
		
		Waggon buf = head;
		while(buf!=null){
			head.getNext();
			buffer++;
		}
			
			
		
		
		return buffer;
		
	}

	public int getPassengerCount() {
		Waggon buf = head;
		int count = 0;
		while(buf!=null){
			count += buf.getPassengers();
			buf.getNext();
		}
		return count;
	}

	public int getCapacity() {
		
		Waggon buf = head;
		int cap = 0;
		while(buf!=null){
			cap+= buf.getCapacity();
			buf.getNext();
		}
		return cap;
	}

	public void appendWaggon(Waggon waggon) {
		if(head == null){
			head = waggon;
			return;
		}
		
			Waggon buf = head;
			while(buf.getNext()!=null){
				buf.setNext(waggon);
			buf = buf.getNext();
			
		
			}
			
	
		
		
	}

	public void boardPassengers(int numberOfPassengers) {
		
		int restplaetze = 0;
		Waggon buf = head;
		while(buf!=null){
			if(buf.getPassengers() + numberOfPassengers <= buf.getCapacity()){
				
				buf.setPassengers(numberOfPassengers + buf.getPassengers());
				return;
			}
			else {
				
				
			}
			
		}
		
	}

	public Train uncoupleWaggons(int index) {
		return new Train();
	}

	public void insertWaggon(Waggon waggon, int index) {
	}

	public void turnOver() {
	}

	public void removeWaggon(Waggon waggon) {
	}

	public Waggon getWaggonAt(int index) {
		return null;
	}

	@Override
	public String toString() {
		if (getSize() == 0) {
			return LOCOMOTIVE;
		}

		StringBuilder str = new StringBuilder(LOCOMOTIVE);

		Waggon pointer = head;
		while (pointer != null) {
			str.append(" <---> ");
			str.append(pointer.getName());
			pointer = pointer.getNext();
		}

		return str.toString();
	}

}
