package Abstract;
public class aeroPlan extends vehicle{
    @Override
    public void walk(){
        System.out.println("Aeroplan is Flying");
    }
    @Override
    public void fuel(){
        System.out.println("Fuels");
    }
    public static void main(String[] args) {
        aeroPlan garuda = new aeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
} 
