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
public class LeitorMarsOne{
    
    public enum TipoProduto{
        EMPILHADEIRA,PORTAL;        
    };
    
    public String nomeDoArquivo;
    public String caminhoDoArquivo;
    public TipoProduto tipoDoProduto;
    public int modoDeOperacao;
    public int atrasoParaDegradarLeitura;
    public int repeticaoNaLeitura;
    public int sensibilidadeDaAntena;
    public int tempoParaInatividadeDaTagMonitorada;
    public int numeroDeAntenasLidas;
    public Antena antena1;
    public Antena antena2;
    public Antena antena3;
    public Antena antena4;
    public Antena antena5;
    public Antena antena6;
    public Antena antena7;
    public Antena antena8;
    public int frequenciaDeOperacao;
    public String idDoLeitor;
    public String dataHora;
    public String ipRemotoPrincipal;
    public String ipRemotoSecundario;
    public String portaRemotaPrincipal;
    public String portaRemotaSecundaria;
    public String ssidWifi;
    public String senhaWifi;
    public String firmware; 
    
    public void LeitorMarsOne(){
        this.caminhoDoArquivo = "";
        this.nomeDoArquivo = "";
        
        this.antena1 = new Antena(1,0,0,0,0);
        this.antena2 = new Antena(2,0,0,0,0);
        this.antena3 = new Antena(3,0,0,0,0);
        this.antena4 = new Antena(4,0,0,0,0);
        this.antena5 = new Antena(5,0,0,0,0);
        this.antena6 = new Antena(6,0,0,0,0);
        this.antena7 = new Antena(7,0,0,0,0);
        this.antena8 = new Antena(8,0,0,0,0);
        
        this.tipoDoProduto = tipoDoProduto.EMPILHADEIRA;
        this.modoDeOperacao = 0;
        this.atrasoParaDegradarLeitura = 0;
        this.repeticaoNaLeitura = 0;
        this.sensibilidadeDaAntena = 0;
        this.tempoParaInatividadeDaTagMonitorada = 0;
        this.numeroDeAntenasLidas = 0;
        
        this.frequenciaDeOperacao = 0;
        this.idDoLeitor = "";
        this.dataHora = "";
        this.ipRemotoPrincipal = "";
        this.ipRemotoSecundario = "";
        this.portaRemotaPrincipal = "";
        this.portaRemotaSecundaria = "";
        this.ssidWifi = "";
        this.senhaWifi = "";
        this.firmware = "";
    }    
    
}
