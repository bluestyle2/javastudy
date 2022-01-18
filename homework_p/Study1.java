package homework_p;

class MethCalc{
	
    int plus(int a, int b, int c) {
    	
        System.out.println("더하기 실행");
        
        return a+b+c;
    }
}
public class Study1 {
 
    public static void main(String[] args) {
        MethCalc mc = new MethCalc();
        
        //int rr = mc.plus(4,5,6);
        //System.out.println(rr);
        
        System.out.println(mc.plus(4,5,6));
        
    
 
    }
 
}
 