
package inheritance.webshop.perintaEsimerkkiElain;

public class Elain {
    private double paino;

    //konstruktorit

    
    public boolean syo(double paino){
        if (paino > 0.001) {
            return true;

        }
        else{
            return false;
        }
    }
    public Elain(double paino) {
        this.paino = paino;
    }
    public double getPaino() {
        return paino;
    }
    public void setPaino(double paino) {
        this.paino = paino;
    }
    
}

