
public class Node {
	private double x;
	private double y;
	
	/**
	 * 
	 * @param _x wspó³rzêdna latitude
	 * @param _y wspó³rzêdna longitude
	 * 
	 *  przelicza wspó³rzêdne geograficzene na pixele
	 * 
	 */
	
	public Node(double _x, double _y){
		double west = 19.8548;
		double east = 20.0307;
		
		double north = 50.0944;
        double south = 50.0306;
                
        y = (1080) * (_x - north) / (south - north);
        x = (1920) * (_y - west) / (east - west);
 	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
}
