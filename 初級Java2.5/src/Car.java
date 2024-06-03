
public class Car {
	int x,y,vx,vy;
	public Car(int x,int y,int vx, int vy) {
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
	public void draw(MyFrame frame) {
		frame.fillOval(x+5,y+30,20,20);
		frame.fillOval(x+35,y+30,20,20);
		frame.fillRect(x+10,y-5,40,35);
		frame.fillRect(x,y+10,60,20);
	}
	public void move() {
		x+=vx;
		y+=vy;
	}
}