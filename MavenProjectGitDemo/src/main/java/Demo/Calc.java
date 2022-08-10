package Demo;

public class Calc {
    public String hell() {
    	return "hello world";
    }
    public int sub(int x,int y) {
    	return x-y;
    }
    public void srchEmp(int empid) {
    	if(empid==0) throw new ArithmeticException("zero");
    	else System.out.println("continue");
    }
}
