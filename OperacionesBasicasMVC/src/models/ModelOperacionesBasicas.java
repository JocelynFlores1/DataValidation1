package models;

/**
 *
 * @author Jocelyn
 */
public class ModelOperacionesBasicas {
    private float Numero1=0;
    private float Numero2=0;
    private float Resultado=0;

    public float getNumero1() {
        return Numero1;
    }

    public void setNumero1(float Numero1) {
        this.Numero1 = Numero1;
    }

    public float getNumero2() {
        return Numero2;
    }

    public void setNumero2(float Numero2) {
        this.Numero2 = Numero2;
    }

    public float getResultado() {
        return Resultado;
    }

    public void setResultado(float Resultado) {
        this.Resultado = Resultado;
    }
    public float suma(){
        this.Resultado = this.Numero1 + this.Numero2;
        return this.Resultado;
    }
    public float resta(){
        this.Resultado = this.Numero1 - this.Numero2;
        return this.Resultado;
    }
    public float multiplicacion(){
        this.Resultado = this.Numero1 * this.Numero2;
        return this.Resultado;
    }
    public float division(){
        this.Resultado = this.Numero1 / this.Numero2;
        return this.Resultado;
    }
    public float modulo(){
        this.Resultado = this.Numero1 % this.Numero2;
        return this.Resultado;
    }
}
