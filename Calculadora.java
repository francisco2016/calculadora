
/**
 * Write a description of class Calculadora here.
 * 
 * @author (Francisco) 
 * @version (ejercicio de programación 0049)
 */
public class Calculadora
{
    /**
     *  imprima todos los múltiplos de 5 entre 10 y 95 (ambos extremos no incluidos).
     */
    public void multiplesOfFive(){
        int cont = 15;
        while(cont <= 90){
            System.out.println(cont);
            cont = cont +5;
        }
    }

    /**
     * que saque por pantalla la suma de los números comprendidos entre el 0 y el 10 (ambos incluidos).
     */
    public void sumValues(){
        int cont = 0;
        int suma = 0;
        while(cont <= 10){
            suma = cont + suma;
            cont ++;
        }
        System.out.println("");
        System.out.println("La suma es: " +suma);
    }

    /**
     * devuelva la suma de los valores comprendidos entre 2 parámetros (ambos incluidos). 
     */
    public int sumValuesInterval(int val1, int val2){
        int sol = 0;
        if(val1 < 0 || val2 < 0 ){
            sol = -1;
            System.out.println("");
            System.out.println("Error, un valor es negativo." );
        }
        else if(val1 == val2){sol = val1;}
        else{
            if(val1 > val2){
                 int aux = 0;  aux = val1;     val1 = val2;    val2 = aux;
            }
           
            int cont = val1;
            while(cont <= val2){
                sol = sol +cont;
                cont++;
            }
        }
         return sol;
    }
   
}



