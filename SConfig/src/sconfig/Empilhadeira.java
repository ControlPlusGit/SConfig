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

public class Empilhadeira extends LeitorMarsOne{
    
    public Empilhadeira(){
        tipoDoProduto = tipoDoProduto.EMPILHADEIRA;
       
        antena1 = new Antena();
        antena2 = new Antena();
        antena3 = new Antena();
        antena4 = new Antena();
        antena5 = new Antena();
        antena6 = new Antena();
        antena7 = new Antena();
        antena8 = new Antena();
        frequenciaDeOperacao = 0;
        idDoLeitor = "";
        dataHora = "";
        ipRemotoPrincipal = "";
        ipRemotoSecundario = "";
        portaRemotaPrincipal = "";
        portaRemotaSecundaria = "";
        ssidWifi = "";
        senhaWifi = "";
        firmware = "";
        caminhoDoArquivo = "";
    }
    public Empilhadeira(String caminhoDoArquivo){
        tipoDoProduto = tipoDoProduto.EMPILHADEIRA;
        
        antena1 = new Antena();
        antena2 = new Antena();
        antena3 = new Antena();
        antena4 = new Antena();
        antena5 = new Antena();
        antena6 = new Antena();
        antena7 = new Antena();
        antena8 = new Antena();
        frequenciaDeOperacao = 0;
        idDoLeitor = "";
        dataHora = "";
        ipRemotoPrincipal = "";
        ipRemotoSecundario = "";
        portaRemotaPrincipal = "";
        portaRemotaSecundaria = "";
        ssidWifi = "";
        senhaWifi = "";
        firmware = "";
        this.caminhoDoArquivo = caminhoDoArquivo;
    }
}
