
public class CarObject extends MyFrame{
	public void run() {
        Car Car1=new Car(50,50,10,0);
		
        Car Car2=new Car(300,150,-10,0);
		
		for(int i=0; i < 30; i++) {
			clear();
			Car1.draw(this);
			Car2.draw(this);
			Car1.move();
			Car2.move();
			sleep(0.1);
			}
	}

}
