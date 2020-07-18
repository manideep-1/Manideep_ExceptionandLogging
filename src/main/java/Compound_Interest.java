import java.util.logging.LogManager;
import java.util.logging.Logger;
@SuppressWarnings("unused")
public class Compound_Interest extends Interest{
	private static final Logger logger = Logger.getLogger(Compound_Interest.class.getName()); 
	public Compound_Interest(double principle,double time,double rate_of_interest)
    {
        super(principle,time,rate_of_interest);
        logger.info("Created a Compound Interest object");
        
    }
    public double calculate_compound_interest()
    {
        return (principle+Math.pow((1+rate_of_interest),time));
    }

}
