
public class Fraccion {
    private int numerador;
    private int denominador;

    public void fraccion(int numerador, int denominador){
        this.denominador = denominador;
        this.numerador = numerador;
    }

    public void fraccion(){
        this.denominador = 1 ;
        this.numerador = 1 ;
    }
    public void fraccion(int numerador){
        this.numerador = numerador;
        this.denominador = 1;
    }
    public void fraccion(Fraccion c){
        this.numerador = c.numerador;
        this.denominador = c.denominador;
    }
    public int getDenominador(){
        return this.denominador;
    }
     public int getNumerador(){
        return this.numerador;
     }
     public void setDenominador(int denominador){
        this.denominador = denominador;
     }
     public void setNumerador(int numerador){
        this.numerador = numerador;
     }

     public Fraccion Suma(Fraccion c){
        Fraccion resultado = new Fraccion();
        resultado.numerador = (this.getNumerador()  * c.getDenominador()) + (c.getNumerador() * this.getDenominador());
        resultado.denominador = this.getDenominador() * c.getDenominador() ;
        return resultado;
     }

     public Fraccion Resta(Fraccion c){
         Fraccion resultado = new Fraccion();
         resultado.denominador = this.getDenominador() * c.getDenominador() ;
         resultado.numerador = (this.getNumerador()  * c.getDenominador()) - (c.getNumerador() * this.getDenominador());
         return resultado;
     }

     public Fraccion Multiplicar(Fraccion c){
         Fraccion resultado = new Fraccion();
         resultado.numerador = getNumerador() * c.getNumerador();
         resultado.denominador = getDenominador() * c.getDenominador();
         return resultado;
     }

     public Fraccion Dividir(Fraccion c){
        Fraccion resultado = new Fraccion();
        resultado.numerador = getNumerador() * c.getDenominador();
        resultado.denominador = getDenominador() * c.getNumerador();
        return resultado;
     }

     public void Mostrar(){
        System.out.println(getNumerador()+ "/" + getDenominador());
     }
     public float Reducir(){
        float num = getNumerador();
        float dem = getDenominador();
        return num / dem;
    }

    public boolean Simplificable(){
        if (getNumerador() % 2 == 0 && getDenominador() % 2 == 0){
            return true;
        }else if (getNumerador() % 3 == 0 && getDenominador() % 3 == 0) {
            return true;
        }else if (getNumerador() % 5 == 0 && getDenominador() % 5 == 0) {
            return true;
        }else if(getNumerador() % 7 == 0 && getDenominador() % 7 == 0) {
            return true;
        }else {
            return false;
        }
    }

    public boolean Equivalente(Fraccion c){
        return this.Simplificable() == c.Simplificable();
    }

    public void Simplificar(){

        if (getNumerador() % 2 == 0 && getDenominador() % 2 == 0){
            this.numerador /= 2;
            this.denominador /= 2;
        }else if (getNumerador() % 3 == 0 && getDenominador() % 3 == 0) {
            this.numerador /= 3;
            this.denominador /= 3;
        }else if (getNumerador() % 5 == 0 && getDenominador() % 5 == 0) {
            this.numerador /= 5;
            this.denominador /= 5;
        }else if(getNumerador() % 7 == 0 && getDenominador() % 7 == 0) {
            this.numerador /= 7;
            this.denominador /= 7;
        }

    }



}
