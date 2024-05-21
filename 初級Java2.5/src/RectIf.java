
public class RectIf extends MyFrame{
	public void run() {
		int c = 0; int x = 30;
		for(int i =0; i < 10; i++) {
			setColor(c,c,c);
			fillRect(x,80,10,100);
			x+=20; c+=25;
		}
	}

}
