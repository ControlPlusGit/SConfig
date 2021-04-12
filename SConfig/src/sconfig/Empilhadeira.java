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
        idDoLeitor = "0000";
        dataHora = "";
        ipRemotoPrincipal = "192.168.0.2";
        ipRemotoSecundario = "192.168.0.1";
        portaRemotaPrincipal = "8000";
        portaRemotaSecundaria = "8000";
        ssidWifi = "RedeWifi";
        senhaWifi = "12345";
        firmware = "";
        caminhoDoArquivo = "";
        
        this.dhcpHabilitado = 0;
        this.ip = "0.0.0.0";
        this.gateway = "0.0.0.0";
        this.mask = "0.0.0.0";
        this.mac = "FF:FF:FF:FF:FF:FF";
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
        idDoLeitor = "0000";
        dataHora = "";
        ipRemotoPrincipal = "192.168.0.2";
        ipRemotoSecundario = "192.168.0.1";
        portaRemotaPrincipal = "8000";
        portaRemotaSecundaria = "8000";
        ssidWifi = "RedeWifi";
        senhaWifi = "12345";
        firmware = "";
        this.caminhoDoArquivo = caminhoDoArquivo;
        
        this.dhcpHabilitado = 0;
        this.ip = "0.0.0.0";
        this.gateway = "0.0.0.0";
        this.mask = "0.0.0.0";
        this.mac = "FF:FF:FF:FF:FF:FF";
    }
}
