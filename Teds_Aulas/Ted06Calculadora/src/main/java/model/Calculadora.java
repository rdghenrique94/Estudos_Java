/*
 * TED 06 CALCULADORA
 * RORDRIGO HENRIQUE SOARES DE OLIVEIRA ANDRADE
 */
package model;

public class Calculadora {
        
    private Double adic;
    private Double subt;
    private Double mult;
    private Double divi;

     public Calculadora(){
}
     
    public Double getAdic() {
        return adic;
    }

    public Double getSubt() {
        return subt;
    }

    public Double getMult() {
        return mult;
    }

    public Double getDivi() {
        return divi;
    }

    public void setAdic(Double adic) {
        this.adic = adic;
    }

    public void setSubt(Double subt) {
        this.subt = subt;
    }

    public void setMult(Double mult) {
        this.mult = mult;
    }

    public void setDivi(Double divi) {
        this.divi = divi;
    }
        
    public double calcSoma(Double n1, Double n2){
        return this.adic = n1 + n2;
    }
    public double calcSub(Double n1, Double n2){
        return this.subt = n1 - n2;
    }
    public double calcMult(Double n1, Double n2){
        return this.mult = n1 * n2;
    }
    public double calcDivi(Double n1, Double n2){
        return this.divi = n1 / n2;
    }
}
