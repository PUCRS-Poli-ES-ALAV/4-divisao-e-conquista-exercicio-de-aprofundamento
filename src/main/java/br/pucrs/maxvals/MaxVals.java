package br.pucrs.maxvals;

import br.pucrs.util.ContagemRes;

public class MaxVals {
    public ContagemRes maxValRep(long [] vet, int n){
        ContagemRes contRes = new ContagemRes();
        long [] vetRes = new long[1];

        contRes.resetCounters();
        vetRes[0] = maxValRep(vet, n, contRes);
        contRes.getClockSec();
		contRes.setResult(vetRes);


        return contRes;
    }

    private long maxValRep(long [] vet, int n, ContagemRes contRes) {
        long max = -1;
        
        if (vet.length == 0)
            throw new IllegalArgumentException("Vetor vazio!");
        else 
            max = vet[0];

        for (int i = 1; i < n; i++) {  
            if( vet[i] > max ) 
               max = vet[i];
        }

        return max;
    }
    
}
