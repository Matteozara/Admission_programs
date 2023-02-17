/*

 * commento

*/


class Cerchio

{  public static void main(String[] args)

   {  // dichiarazione delle risorse

      double c = 0;

      double area = 0;

      double raggio = 0;

     
 // input
      {ConsoleReader tastiera = new ConsoleReader(System.in);
      System.out.println("\nInserire il raggio del cerchio:");
 
     raggio = tastiera.readDouble();


      // elaborazione ed arrotondamento a 4 decimali

      c = Math.round(raggio * 2 * Math.PI * 10000) / 10000.;

      area = Math.round(Math.pow(raggio, 2) * Math.PI * 10000) / 10000.;


      // comunicazione

      System.out.println("\n\nIl cerchio di raggio " + raggio + " ha una circonferenza pari a " + c + " e un'area pari a " + area);

      System.out.println("\n\nIl valore di pi_greco e\u0027 " + Math.PI);

      System.out.println("\nFINE ELABORAZIONE\n");

      }
   }

}
      
      
