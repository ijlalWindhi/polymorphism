package Polymorphism;
public class pembayaranGaji {
    public int hitungGaji(pegawai peg){
        int uang=peg.gaji();
        if(peg instanceof direktur)
            uang+=((direktur)peg).tunjangan();
        if(peg instanceof staf)
            uang+=((staf)peg).bonus();
        return uang;
    }
    public static void main(String[] args) {
        pembayaranGaji pg = new pembayaranGaji();
        staf ali = new staf();
        direktur tony = new direktur();
        System.out.println("Gaji yang dibayarkan untuk staf = "+pg.hitungGaji(ali));
        System.out.println("Gaji yang dibayarkan untuk direktur = "+pg.hitungGaji(tony));
    }
}
