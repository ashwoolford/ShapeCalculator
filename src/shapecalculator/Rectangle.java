/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapecalculator;

/**
 *
 * @author ash
 */
public class Rectangle extends Square{
    
    public double w;
    public Rectangle(double l , double w){
        super(l);
        this.w = w;
    }
    
    @Override
    public double Area(){
        return l*w;
    }
    
    @Override
    public double Peremeter(){
        return 2*(l*w);
    }
    
    public void DisplayRectangle(){
        println(Area()+" "+Peremeter());
    }
    
    
    
    
}
