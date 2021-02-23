package PolymorphismTest;
public class shape {
    private String color;
    
    public shape(String color){
        this.color=color;
    }
    @Override
    public String toString(){
        return "Shape{color=" + color+ "}";
    }
    public double getArea(){
        System.out.println("Shape unknown! Cannot compute area!");
        return 0;
    }
}
