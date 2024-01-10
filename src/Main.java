public class Main {

    public static void main(String[] args) {
        System.out.println("Hola");
        Fraccion a = new Fraccion();
        a.fraccion(5,10);
        System.out.println("Numerador:" + a.getNumerador());
        System.out.println("Denominador:" + a.getDenominador());
        a.setNumerador(3);
        a.setDenominador(6);
        Fraccion b = new Fraccion();
        b.fraccion(4,7);

        Fraccion c = new Fraccion();
        c = a.Suma(b);
        c = a.Resta(b);
        c = a.Multiplicar(b);
        c = a.Dividir(b);
        a.Mostrar();
        System.out.println("Fraccion reducida:" + a.Reducir());
        System.out.println("¿Es Simplificable?" + a.Simplificable());
        a.Equivalente(b);


    }

}