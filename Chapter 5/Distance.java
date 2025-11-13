/*Method distance(x1,y1,x2,y2) returns Euclidean distance (double).
Use Math.sqrt((x2-x1)^2 + (y2-y1)^2).
*/
public class Distance {
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.hypot(x2 - x1, y2 - y1); // or Math.sqrt(...)
    }
    public static void main(String[] args) { 
	System.out.println(distance(0,0,3,4)); } //5.0
}
