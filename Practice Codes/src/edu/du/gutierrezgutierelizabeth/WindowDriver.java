package edu.du.gutierrezgutierelizabeth;

public class WindowDriver 
{
	public static void main (String [] args)
	{
		WindowDisplay windows = new WindowDisplay (200, 200); 
		windows.addWindow(50, 50, 60 , 80, Draw.BLUE); 
		windows.addWindow(100,  130,  80, 80, Draw.RED);
		windows.addWindow(80,  80,  60, 80, Draw.GREEN);
		windows.addWindow(120,  60,  100, 80, Draw.BLACK);
		windows.Draw(); 
	}

}
