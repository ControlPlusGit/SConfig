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
    private final int frequenciesAnatelTable[]={900000, 900250, 900500, 900750,
                                                901000, 901250, 901500, 901750,
                                                902000, 902250, 902500, 902750,
                                                903000, 903250, 903500, 903750,
                                                904000, 904250, 904500, 904750,
                                                905000, 905250, 905500, 905750,
                                                906000, 906250, 906500, 906750,
                                                907000, 907250, 907500, 907750,
                                                908000, 908250, 908500, 908750,
                                                909000, 909250, 909500, 909750,
                                                910000, 910250, 910500, 910750,
                                                911000, 911250, 911500, 911750,
                                                912000, 912250, 912500, 912750,
                                                913000, 913250, 913500, 913750,
                                                914000, 914250, 914500, 914750,
                                                915000, 915250, 915500, 915750,
                                                916000, 916250, 916500, 916750,
                                                917000, 917250, 917500, 917750,
                                                918000, 918250, 918500, 918750,
                                                919000, 919250, 919500, 919750,
                                                920000, 920250, 920500, 920750,
                                                921000, 921250, 921500, 921750,
                                                922000, 922250, 922500, 922750,
                                                923000, 923250, 923500, 923750,
                                                924000, 924250, 924500, 924750,
                                                925000, 925250, 925500, 925750,
                                                926000, 926250, 926500, 926750,
                                                927000, 927250, 927500, 927750,
                                                928000, 928250, 928500, 928750,
                                                929000, 929250, 929500, 929750,
                                                930000 };
    
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
