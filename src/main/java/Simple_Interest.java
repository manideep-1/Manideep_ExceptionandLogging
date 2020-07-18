import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Simple_Interest extends Interest{
	private static final Logger logger = Logger.getLogger(Simple_Interest.class.getName()); 
	public Simple_Interest(double principle,double time,double rate)
	{
		super(principle,time,rate);
		logger.info("Created a Simple Interest object");
	}
	public double calculate_interest ()
    {
        return (principle*time*rate_of_interest)/100;
    }
}
