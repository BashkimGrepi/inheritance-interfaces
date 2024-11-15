package inheritance.webshop.perintaEsimerkkiElain;

public class Nisakas extends Elain {
    
    private boolean imettaa = true;
    public Nisakas(double paino, boolean imettaa) {
        super(paino);
        this.imettaa = imettaa;
    }
    public double imeta(double pyynti){
        

        return 1;
    }
}
