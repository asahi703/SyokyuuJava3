
public class RectIf extends MyFrame{
	public void run() {
		int x =30;
		int t =10;
		setColor(0,128,0);
		int i;
		for(i = 0; i < 9; i++) {
			fillRect(x,80,10,t);
			x+=20; t+=20;
		}
	}

}
