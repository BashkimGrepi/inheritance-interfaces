package inheritance.webshop.perintaEsimerkkiElain;

public class ElainOhjelma {
     public static void main(String[] args) {
        Ihminen ihminen = new Ihminen();
        ihminen.avuttomuusVahenee();
        ihminen.syo(5000);

        ihminen.setPaino(100);
     }
}
