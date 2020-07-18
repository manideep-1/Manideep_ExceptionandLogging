import java.util.logging.Logger;

public class Construction {
	boolean automated;
    String material;
    double area;
    double construction_cost=0.0;
    private static final Logger logger = Logger.getLogger(Construction.class.getName()); 
    public Construction(boolean b,String material,double area){
        this.automated=b;
        this.material=material;
        this.area=area;
        logger.info("Created a Construction object");
    }
    public double construct() {
        if (!automated) {
            if (material.equals("standard")) {
                construction_cost = 1200 * area;
            } else if (material.equals("above_standard")) {
                construction_cost = 1500 * area;
            } else if (material.equals("high_standard")) {
                construction_cost = 1800 * area;
            }
        } else  {
            construction_cost = 2500 * area;
        }

        return construction_cost;
    }

}
