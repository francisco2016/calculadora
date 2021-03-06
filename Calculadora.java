
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

    /**
     *  devuelve verdadero si el parámetro n es primo o falso en caso contrario. 
     */
    public boolean isPrime(int n){
        boolean esPrimo = true;
        if(n < 1 ){
            System.out.println("");
            System.out.println("Error ." );
            esPrimo = false;
        }
        int cont = 2;
        while(n % cont == 0 && esPrimo){
            esPrimo = false;
            cont ++;
        }
        return esPrimo;

    } 

    /**
     * método para realizar multiplicaciones entre nº enteros positivos. solo se pueden emplear las operaciones matemáticas
     * suma y resta, no estando permitido usar ninguna otra operación matemática
     */
    public int multiplicacion(int num1, int num2){
        int cont = 1;
        int acum = 0;

        if(num1 < 0 || num2 < 0 ){
            System.out.println("");
            System.out.println("Error, un valor es negativo." );
            acum = -1;
        }
        else{
            while(cont <= num2){
                acum = acum + num1;
                cont ++;
            }
        }
        return acum;
    }
    
    /**
     * para realizar divisiones entre enteros positivos. solo se pueden emplear las operaciones matemáticas
     * suma y resta, no estando permitido usar ninguna otra operación matemática
     */
    public int dividir(int num1, int num2){
        int sol = 1;
        if(num1 < 0 || num2 < 0){
            System.out.println("");
            System.out.println("Error, un valor es negativo." );
            sol = -1;
        }
        else{
            int  acum = num1;
            while( acum - num2 != 0){
                acum = acum - num2;
                sol ++;
              
            }
        }
        return sol;
    }

}


















