/* Scrivere un programma che contenga un metodo che sfrutti il while loop e prenda in ingresso 
1 valore intero come limite superiore e calcoli la somma di tutti i valori prima del limite e 
la stampi a video.
(Esempio passo 5 come limite e otterrò la somma di 1 + 2 + 3 + 4) */


public class myClass{
    public static void main(String[] args){
        
        int valSup = 3 ;
        System.out.print("Il valore della somma di tutti i numeri minori di " + valSup + " è: " + sumValues(valSup));
    }
    
    
    public static int sumValues(int a){
      int i = 1;
      int sum = 0;
      while (i < a){
          sum+=i;
          i++;
      }
      return sum;
    }
}