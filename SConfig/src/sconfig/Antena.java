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
public class Antena extends AjusteCapacitores{
    private int canal;
    private int sensibilidade;
    private int frequenciaOperacao;
    private int reflexao;
    
    public Antena(){
        canal = 0;
        this.setAjuste(0,0,0);
        sensibilidade = 0;
    }
    
    public Antena(int canal, AjusteCapacitores ajustes, int sensibilidade){
        this.canal = canal;
        this.setAjuste(ajustes.getCin(),ajustes.getClen(),ajustes.getCout());
        this.sensibilidade = sensibilidade;
        this.reflexao = 0;
    }
    
    public Antena(int canal, int frequenciaOperacao,int Cin, int Clen, int Cout, int sensibilidade){
        this.canal = canal;
        this.setAjuste(Cin,Clen,Cout);
        this.sensibilidade = sensibilidade;
        this.frequenciaOperacao = frequenciaOperacao;
        this.reflexao = 0;
    }
    
    public Antena(int canal, int Cin, int Clen, int Cout, int sensibilidade){
        this.canal = canal;
        this.setAjuste(Cin,Clen,Cout);
        this.sensibilidade = sensibilidade;
        this.reflexao = 0;
    }
    
    public int getCanal(){
        return canal;
    }
    public void setCanal(int canal){
        this.canal = canal;
    }
    
    public int getReflexao(){
        return reflexao;
    }

    public void setReflexao(int reflexao){
        this.reflexao = reflexao;
    }
    
    public int getSensibilidade(){
        return sensibilidade;
    }
    public void setSensibilidade(int sensibilidade){
        this.sensibilidade = sensibilidade;
    }
    
    public int getFrequencia(){
        return frequenciaOperacao;
    }
    public void setFrequencia(int frequenciaOperacao){
        this.frequenciaOperacao = frequenciaOperacao;
    }
}
