/*
* Scopo: 
* Autore: Matteo Zaramella
* Classe: 3 Bs
* Data: 5/03/15
*/

class SequenzaGeometrica
{ public static void main(String[] args)
  { // dichiarazione delle variabili
    int rip = 0;
    int num = 1;
    int esp = 2;
    long ris = 2;
    ConsoleReader tastiera = new ConsoleReader(System.in);

   // elaborazione
 do {
      System.out.println("\nQuanti elementi della serie geometrica vuoi visualizzare (oltre a 1 e 1/2)? ");
      rip = tastiera.readInt();
      if (rip == 0)
      System.out.println("\nErrore, ridigita ");
    }
 while (rip == 0);
    System.out.print(" 1 + 1/2 +"); 
 for (int i = 0; i < rip; i++)
  { ris = ris * esp;
  
   System.out.print(" " + num + "/" + ris + " +");
  }
  System.out.print(" ... \n ");
 }
}
