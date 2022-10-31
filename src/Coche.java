public class Coche {
    private int puertas;

    public Coche() {

    }

    public Coche(int puertas) {
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int aumentar(){
        this.puertas++;
        return this.puertas;
    }

    public int aumentar2(int cantidad){
        int total;

        total = this.puertas + cantidad;

        return total;
    }
}
