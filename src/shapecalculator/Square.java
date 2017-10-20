
package shapecalculator;

/**
 *
 * @author ash
 */
public class Square implements StandardInputOutput{
    double l;
    public Square(double l){
        this.l = l;
    }
    
    public double Area(){
        return l*l;
    }
    
    public double Peremeter(){
        return 4*l;
    }
    
    public void DisplaySquare(){
        
        println(Area()+" "+Peremeter());
        
    }

    @Override
    public void print(Object ob) {
         System.out.print(ob);
    }

    @Override
    public void println(Object ob) {
        System.out.println(ob);
    }
    
    
    
}
