
package ProjetoFinal;


public class Calculadora extends Operação implements InCalculadora {
   private double resul; 

    public double getResul() {
        return resul;
    }

    public void setResul(double resul) {
        this.resul = resul;
    }
    @Override
    public double somar(double a, double b) {
        return a + b;
    }

    @Override
    public double subtrair(double a, double b) {
         return a - b;
    }

    @Override
    public double dividir(double a, double b) {
        
        return a / b;
    }

    @Override
    public double multiplicar(double a, double b) {
        
        return a * b;
    }

    @Override
    public double porcentagem (double a, double b) {
       
        return (a/100) * b  ;
    }
    
   @Override
   public double calculo (double a, double b){
     return a * b; 
    }
   
}
