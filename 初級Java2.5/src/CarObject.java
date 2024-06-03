import java.util.Vector;

public class CarObject extends MyFrame{
	public void run() {
		Vector<Car> cars=new Vector<Car>();
		cars.add(new Car(50,50,1,0));
		cars.add(new Car(50,110,2,0));
		cars.add(new Car(50,170,3,0));
		cars.add(new Car(50,230,4,0));
		cars.add(new Car(50,290,5,0));
		for(int i=0; i<50; i++) {
			clear();
			for(int j=0; j<cars.size(); j++) {
				cars.get(j).draw(this);
				cars.get(j).move();
			}
			sleep(0.1);
		}
	}

}
