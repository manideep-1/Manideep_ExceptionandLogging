import java.util.logging.Logger;

public class LoanCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final Logger logger = Logger.getLogger(LoanCalculator.class.getName());
		 //Interest Calculator
		 double principal=100,time=2,rate=5;
		 Compound_Interest c=new Compound_Interest(principal,time,rate);
		 logger.info("Compound Interest = "+c.calculate_compound_interest());
		 
		 Simple_Interest s=new Simple_Interest(principal,time,rate);
		 logger.info("Simple Interest = "+s.calculate_interest());
		 
		 //Construction Material
		 Construction automated=new Construction(true,"standard",1000);
		 logger.info("Construction cost for automated house is: "+automated.construct());
		 
		 Construction not_automated=new Construction(false,"high_standard",1000);
		 logger.info("Construction cost for automated house is: "+not_automated.construct());
	}

}
