package In.Sayak.Controll;

public class AllFunctionmpl implements AllFunction {
    
    /*
     * @author SAYAK SINGHA
     * 
     * 
     * @description it use for String delete and concatenation
     * 
     * */
    
	@Override
	public String deleteString(String str1, String str2) {
    	//Array Creation from string
    	char []Char1=str1.toCharArray();
    	char []Char2=str2.toCharArray();
    	
        //points collect
    	int start=0,end=0;
    	boolean flag=false;
    	String newString="";
    	//find 
 
    	for(int i=0;i<Char1.length;i++) {
    		start=i;
    		for(int j=0;j<Char2.length;j++) {
    			if(Char1[i]==Char2[j]) {
    				i++;
    				if(j==Char2.length-1) {
    					
    					end=i;
    					flag=true;
    				}
    			}
    			else {
    				break;
    			}
    		}
    	}
    	if(flag) {
    	for(int i=0;i<start;i++) {
    		
    		newString+=Char1[i];
    	}
    	for(int i=end+1;i<Char1.length;i++) {
    		newString+=Char1[i];
    	}}
    	return newString;
        
	}
    @Override
	public String concatString(String str1, String str2) {
		return str1+str2;
	}

	
}
