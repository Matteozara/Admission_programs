/*
*
*
*/

import java.util.Random;   // mi inporto la classe che contiene il programma che serve per lanciare il dado (perche non fa parte del pacchetto java lang
class EstraiStringa
{ public static void main(String[] args)
  {
   // dichiarazione delle variabi
     String parola = "";
     String risultato = "";
     int n1 = 0;
     int n2 = 0;
     ConsoleReader input = new ConsoleReader(System.in);
     Random pluto = new Random ();
    

   // elaborazione 
     System.out.println("\nInserisci una parola");
     parola = input.readLine();

     n1 = pluto.nextInt(7);
     n2 = pluto.nextInt(7);

     System.out.println("\nPrimo numero casuale " + n1 );
     System.out.println("\nSecondo numero casuale " +n2 );

     risultato = parola.substring(n1,n2);

     System.out.println("\nPrimo numero casuale " + n1 );
     System.out.println("\nSecondo numero casuale " +n2 );
     System.out.println("\nLa parola inserita e\u0027 " + parola);
     System.out.println("\nLa parola estratta e\u0027 " + risultato);
     System.out.println("\nFINE ELABORAZIONE");
}
}  
