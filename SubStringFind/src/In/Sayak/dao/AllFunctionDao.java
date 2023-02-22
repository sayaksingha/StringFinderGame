package In.Sayak.dao;

import In.Sayak.Controll.AllFunction;
import In.Sayak.Controll.AllFunctionmpl;

public class AllFunctionDao {
	private static AllFunction obj=null;
    private AllFunctionDao() {}
    public static AllFunction getAllFunction() {
    	if(obj==null) {
    		obj=new AllFunctionmpl();
    	}
    	return obj;
    }
}
