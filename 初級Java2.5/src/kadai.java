
public class kadai extends MyFrame{
	public void run() {
		setColor(0,128,0);
		int x =0;
		int y =0;
		int n =20;
		int m =20;
		for(int i = 0; i < 7; i++) {
			if(i == 6) {
				fillRect(x+20,y+20,30,30);
			}else {
				fillRect(x,y,n,m);
			}
			x+=25; y+=25; n+=5; m+=5;
		}
	}

}
