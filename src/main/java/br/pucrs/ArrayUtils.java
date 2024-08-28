package br.pucrs;

import java.util.Random;

public class ArrayUtils 
{
    public long[] array;

    public ArrayUtils(long n){
        array = this.geraVetor(n/2,n/2);
        // this.printaVetor();
    }
    
    private void printaVetor(){
        for(int i = 0; i < this.array.length; i++){
            System.out.print(array[i] + " ");    
        }
    }

    private long[] geraVetor(long nroPares, long nroImpares){
        long [] res = null;
        long contPar = 0, contImpar = 0, novoNum;
        Random rnd = new Random();

        if ((nroPares >= 0) ||
                (nroImpares >= 0) &&
                (nroPares + nroImpares > 0)) {

            res = new long[(int)nroPares + (int)nroImpares];

            while ((contPar < nroPares) || (contImpar < nroImpares)) {
                novoNum = rnd.nextLong(98)+1;

                if ((novoNum % 2 == 0) && (contPar < nroPares)) {
                    res[(int)contPar+(int)contImpar] = novoNum;
                    contPar++;
                }
                else if ((novoNum % 2 == 1) && (contImpar < nroImpares)) {
                    res[(int)contPar+(int)contImpar] = novoNum;
                    contImpar++;
                }
            }
        }

        return res;
    }
}