package Polymorphism;
public class staf extends pegawai{
    private static final int gajiStaf=50000;
    private static final int bonusStaf=10000;
    
    @Override
    public int gaji(){
        return gajiStaf;
    }
    public int bonus(){
        return bonusStaf;
    }
}
