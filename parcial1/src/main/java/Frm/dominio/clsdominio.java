/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frm.dominio;

/**
 *
 * @author nelson
 */
public class clsdominio {
    private Double Dato1;
    private Double Dato2;

    public Double getDato1() {
        return Dato1;
    }

    public void setDato1(Double Dato1) {
        this.Dato1 = Dato1;
    }

    public Double getDato2() {
        return Dato2;
    }

    public void setDato2(Double Dato2) {
        this.Dato2 = Dato2;
    }
    
    public Double primerPeriodo(Double dato1, Double dato2){
        this.Dato1=dato1;
        this.Dato2=dato2;
        
        return dato1*0.40 + dato2*0.60;
        
    }
    public Double segundoPeriodo(Double dato1, Double dato2){
        this.Dato1=dato1;
        this.Dato2=dato2;
        
        return dato1*0.40 + dato2*0.60;
        
    }
    public Double tercerPeriodo(Double dato1, Double dato2){
        this.Dato1=dato1;
        this.Dato2=dato2;
        
        return dato1*0.40 + dato2*0.60;
        
    }
    
}
