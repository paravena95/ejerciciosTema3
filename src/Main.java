public class Main {
    public static void main(String[] args) {

        Coche miCoche = new Coche(3);

        System.out.println("La suma del 8+5+6 es: "+suma(8,5,6));

        System.out.println("El coche inicialmente tiene: "+miCoche.getPuertas()+" puertas.");
        System.out.println("Se le aumentarán en 1 cada vez que llamemos a este método. Puertas: "+miCoche.aumentar());
        System.out.println("Se aumentarán en 2 puertas con el siguiente método: "+miCoche.aumentar2(2));
    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }
}