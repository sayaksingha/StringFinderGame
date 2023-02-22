package In.Design;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import In.Sayak.Controll.AllFunction;

public class GameStart {
	private static AllFunction obj=null;
    private GameStart() {}
    public static void printWelcome() {
      try {
    	String rline="";
		FileReader fr=new FileReader("J:\\FileIoCode\\COMPUTER_GAME.txt");
		BufferedReader br=new BufferedReader(fr);
		rline=br.readLine();
		while(rline!=null) {
			System.out.println(rline);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
			    e.printStackTrace();
			}
			rline=br.readLine();
		}
		System.out.println("\n\n");
	} catch (IOException e) {
		e.printStackTrace();
	}	
    }
}
