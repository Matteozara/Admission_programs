/*

 * Scopo: determinazione del massimo e del minimo tra cinque numeri interi

 * Autore: Feiyu Wang

 * Data: 13 novembre 2014

 * Classe: 3Bs

*/ 

class MaxMinInteri

{  public static void main(String[] args)

   {  // dichiarazione delle risorse

      int a = 0;

      int b = 0;

      int c = 0;

      int d = 0;

      int e = 0;

      int max = 0;

      int min = 0;


      {ConsoleReader tastiera = new ConsoleReader(System.in);
      System.out.println("\nInserire il primo numero:");
      a = tastiera.readInt();
      System.out.println("\nInserire il secondo numero:");
      b = tastiera.readInt();
      System.out.println("\nInserire il terzo numero:");
      c = tastiera.readInt();
      System.out.println("\nInserire il quarto numero:");
      d = tastiera.readInt();
      System.out.println("\nInserire il quinto numero:");
      e = tastiera.readInt();
      max = Math.max(a,b);

      max = Math.max(max,c);

      max = Math.max(max,d);

      max = Math.max(max,e);


     // determinazione del numero minimo

      min = Math.min(a,b);

      min = Math.min(min,c);

      min = Math.min(min,d);

      min = Math.min(min,e);


     // comunicazione

     System.out.println("\nIl massimo tra " + a + ", " + b + ", " + c + ", " + d + ", " + e + " e\u0027 " + max);


     System.out.println("\nIl minimo tra " + a + ", " + b + ", " + c + ", " + d + ", " + e + " e\u0027 " + min);


     System.out.println("\nFINE ELABORAZIONE\n\n");

      }
    }

}
