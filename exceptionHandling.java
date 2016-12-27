
public class exceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		exceptionHandling neu = new exceptionHandling();
		
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		
		try {
			System.out.println(neu.division(i, j));
		} catch (DivisionByZeroException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
	
	
	
	
	private double division(double dividend, double divisor) throws DivisionByZeroException{
		
		double ans = 0;
		if(divisor != 0){
			
			ans = dividend/divisor;
		}
		else{
			
			throw new DivisionByZeroException();
		}
		
		return ans;
		
	}

}
