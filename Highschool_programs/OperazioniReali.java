/*

Dati due numeri reali calcolare 
 * la somma, la differenza, il prodotto, il quoziente
 * comunicando dopo aver effettuato tutti i calcoli
 * Autore: .......
 * Data: 6 novembre 2014
 * Classe: 3bs   
*/

class OperazioniReali
{  public static void main(String papero[])
   {  // dichiarazione delle risorse
      double a; // primo numero
      double b; // secondo numero
      double c; // somma
      double c1; // somma arrotondata
      double d; // differenza 
      double d1; // differenza arrotondata
      double e; // prodotto
      double e1; // prodotto arrotondato
      double f; // quoziente
      double f1; // quoziente arrotondato
{  ConsoleReader tastiera = new ConsoleReader(System.in);

      // elaborazione
System.out.println("\nInserisci primo numero:");
      a = tastiera.readDouble();
System.out.println("\nInserisci secondo numero:");
      b = tastiera.readDouble();
      c = a + b;
      c1 = Math.round(a + b); 
      d = a - b ;
      d1 = Math.round(a - b);  
      e = a * b; 
      e1 = Math.round(a * b); 
      f = a / b;
      f1 = Math.round(a / b);  
      System.out.println("\nAddizione tra" + a + " e " + b + " e\u0027" + c);
      System.out.println("\nAddizione tra" + a + " e " + b + "con arrotondamento e\u0027" + c1);
      System.out.println("\nSottrazione tra" + a + " e " + b + " e\u0027" + d);
      System.out.println("\nSottrazione tra" + a + " e " + b + "con arrotondamento e\u0027" + d1);
      System.out.println("\nMoltiplicazione tra" + a + " e " + b + "con arrotondamento e\u0027" + c1);


}
   }

}
