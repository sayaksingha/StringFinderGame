package In.Sayak.Service;

import java.util.Scanner;

import In.Design.GameStart;
import In.Sayak.Controll.AllFunction;
import In.Sayak.dao.AllFunctionDao;

public class StringService {
	
    private StringService() {}
	public static void ready() {
		GameStart.printWelcome();
        Scanner sc=new Scanner(System.in);

		AllFunction obj=AllFunctionDao.getAllFunction();
		
        System.out.print("\n\n enter First String :: ");
        String str1=sc.nextLine();
        System.out.print("\n\n enter second String :: ");
        String str2=sc.next();
        System.out.print("\n___________ENTER YOUR CHOICE____________ :: ");
		int choice1=(int)sc.nextDouble();
        switch(choice1) {
        case 1:
        	System.out.println();
        	System.out.printf("OUTPUT :: %s",obj.deleteString(str1,str2));
        	
        	break;
        case 2:
        	System.out.println();
        	System.out.printf("OUTPUT :: %s",obj.concatString(str1, str2));
        	break;
        	
        default:
        	System.out.println("<<<<       ENTER CORRECTLY        >>>>");
        }
        System.out.println("\n\n------------------BYE---------------------");
	}

}
