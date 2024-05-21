
public class kadai extends MyFrame{
	public void run() {
		setColor(0,128,0);
		int x = 30; int t = 150; int n = 10; int m = 30; int y = 275;
		int i;
		for(i = 0; i < 10; i++) {
			fillRect(x,80,10,t);
			x+=20; t-=15;
		}
		for(i = 0; i < 10; i++) {
			fillRect(m,y,10,n);
			m+=20; n+=15; y-=15;
		}
	}

}
