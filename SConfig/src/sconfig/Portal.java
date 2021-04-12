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
public class Portal extends LeitorMarsOne{
    public Portal(){
        tipoDoProduto = tipoDoProduto.PORTAL;
       
        antena1 = new Antena();
        antena2 = new Antena();
        antena3 = new Antena();
        antena4 = new Antena();
        antena5 = new Antena();
        antena6 = new Antena();
        antena7 = new Antena();
        antena8 = new Antena();
        
        modoDeOperacao = 0;
        atrasoParaDegradarLeitura = 0;
        repeticaoNaLeitura = 0;
        sensibilidadeDaAntena = 125;
        tempoParaInatividadeDaTagMonitorada = 0;
        numeroDeAntenasLidas = 0;
        
        frequenciaDeOperacao = 0;
        idDoLeitor = "";
        dataHora = "";
        ipRemotoPrincipal = "";
        ipRemotoSecundario = "";
        portaRemotaPrincipal = "";
        portaRemotaSecundaria = "";        
        firmware = "";
        caminhoDoArquivo = "";
        
        this.dhcpHabilitado = 0;
        this.ip = "0.0.0.0";
        this.gateway = "0.0.0.0";
        this.mask = "0.0.0.0";
        this.mac = "FF:FF:FF:FF:FF:FF";
    }
    public Portal(String caminhoDoArquivo){
        tipoDoProduto = tipoDoProduto.PORTAL;
        
        antena1 = new Antena();
        antena2 = new Antena();
        antena3 = new Antena();
        antena4 = new Antena();
        antena5 = new Antena();
        antena6 = new Antena();
        antena7 = new Antena();
        antena8 = new Antena();
        
        modoDeOperacao = 0;
        atrasoParaDegradarLeitura = 0;
        repeticaoNaLeitura = 0;
        sensibilidadeDaAntena = 125;
        tempoParaInatividadeDaTagMonitorada = 0;
        numeroDeAntenasLidas = 0;
        
        frequenciaDeOperacao = 0;
        idDoLeitor = "0000";
        dataHora = "";
        ipRemotoPrincipal = "192.168.0.2";
        ipRemotoSecundario = "192.168.0.1";
        portaRemotaPrincipal = "8000";
        portaRemotaSecundaria = "8000";  
        firmware = "";
        this.caminhoDoArquivo = caminhoDoArquivo;
        
        this.dhcpHabilitado = 0;
        this.ip = "0.0.0.0";
        this.gateway = "0.0.0.0";
        this.mask = "0.0.0.0";
        this.mac = "FF:FF:FF:FF:FF:FF";
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
