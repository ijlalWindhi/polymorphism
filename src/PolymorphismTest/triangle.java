package PolymorphismTest;
public class triangle extends shape{
    private int base;
    private int height;
    
    public triangle(String color, int base, int height){
        super(color);
        this.base=base;
        this.height=height;
    }
    @Override
    public String toString(){
        return "Triangle[base = " +base+ " height= " +height+ "," 
                +super.toString()+ "]";
    }
    @Override
    public double getArea(){
        return 0.5*base*height;
    }
}
