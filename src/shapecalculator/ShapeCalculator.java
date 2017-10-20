
package shapecalculator;

/**
 *
 * @author ash
 */
public class ShapeCalculator {

   
    public static void main(String[] args) {
        
     Cube cube = new Cube(34,5,34);
     cube.DisplayCube();
     cube.DisplayRectangle();
     cube.DisplaySquare();
       
    }
    
    public static void print(Object ob){
        System.out.print(ob);
    }
    
    public static void println(Object ob){
        System.out.println(ob); 
    }
    
}
