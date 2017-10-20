
package shapecalculator;

/**
 *
 * @author ash
 */
public class Cube extends Rectangle{
    double h;
    public Cube(double l , double w , double h){
        super(l , w);
        this.h = h;
    }
    
    public double Volume(){
        return l*w*h;
    }
    
    public void DisplayCube(){
        println(Volume());
    }
    
}
