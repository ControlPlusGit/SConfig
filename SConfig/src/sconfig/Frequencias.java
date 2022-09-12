/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sconfig;

/**
 *
 * @author vitor.alho
 */
public class Frequencias {
    private int frequenciesAnatelTable[]={  900000,        901000,        901500,        902000,
                                    902500,        903000,        903500,        904000,
                                    904500,        905000,        905500,        906000,
                                    906500,        907000,        907500,        908000,
                                    908500,        909000,        909500,        910000,
                                    910500,        911000,        911500,        912000,
                                    912500,        913000,        913500,        914000,
                                    914500,        915000,        915500,        916000,
                                    916500,        917000,        917500,        918000,
                                    918500,        919000,        919500,        920000,
                                    920500,        921000,        921500,        922000,
                                    922500,        923000,        923500,        924000,
                                    924500,        925000,        925500,        926000,
                                    926500,        927000,        927500,        928000,
                                    928500,        929000,        929500,        930000,
                                    930500};
    
    public void Frequencias(){
        
    }
    
    public int getFreqIndex(int frequencia){
        int i=0;
        int freqIndex = 0;
        
        for(i=0;i<frequenciesAnatelTable.length;i++){
            if(frequenciesAnatelTable[i] == frequencia){
                freqIndex = i;
            }
        }
        return freqIndex;
    }
    
    public int getFreq(int freqIndex){
        int i=0;
        int frequencia = 0;
                
        frequencia = frequenciesAnatelTable[freqIndex];
        
        return frequencia;
    }
    
    public String getFreqString(int freqIndex){
        int i=0;
        String frequencia;
                
        frequencia = Integer.toString(frequenciesAnatelTable[freqIndex]);
        
        return frequencia;
    }
    
    public int getNumFreqs(){
        return frequenciesAnatelTable.length;
    }
}
