/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sconfig;

/**
 *
 * @author Vitor
 */

public class AjusteCapacitores {
    private int Cin;
    private int Clen;
    private int Cout;
    
    public void AjusteCapacitores(){
        Cin = 0;
        Clen = 0;
        Cout = 0;
    }
    
    public void AjusteCapacitores(int C){
        this.Cin = C;
        this.Clen = C;
        this.Cout = C;
    }
    
    public void AjusteCapacitores(int Cin, int Clen, int Cout){
        this.Cin = Cin;
        this.Clen = Clen;
        this.Cout = Cout;
    }
    
    public AjusteCapacitores getAjuste(){
        AjusteCapacitores ajusteAtual = new AjusteCapacitores();
        ajusteAtual.Cin = this.Cin;
        ajusteAtual.Clen = this.Clen;
        ajusteAtual.Cout = this.Cout;
        
        return ajusteAtual;
    }
    
    public void setAjuste(int Cin, int Clen, int Cout){
        this.Cin = Cin;
        this.Clen = Clen;
        this.Cout = Cout;
    }
    
    public void setCin(int Cin){
        this.Cin = Cin;
    }
    public int getCin(){
        return Cin;
    }
    
    public void setClen(int Clen){
        this.Clen = Clen;
    }
    public int getClen(){
        return Clen;
    }
    
    public void setCout(int Cout){
        this.Cout = Cout;        
    }
    public int getCout(){
        return Cout;
    }
    
    
}
