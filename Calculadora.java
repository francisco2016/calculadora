
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
      while(cont <= 11){
          suma = cont + suma;
          cont ++;
      }
      System.out.println("");
      System.out.println("La suma es: " +suma);
  }
  
  
}




















