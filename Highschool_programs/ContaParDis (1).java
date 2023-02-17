/*
* Scopo: Contare quanti numeri pari e quanti dispari sono presenti in una stringa
* Autore: Matteo Zararmella
* Data: 04/02/15
* Clase: 3Bs
*/


class ContaParDis
{ public static void main(String[] args)
  {
    // dichiarazione delle variabili
      int nu1 = 0;
      int nu2 = 0;
      int nu3 = 0;
      int nu4 = 0;
      int nu5 = 0;
      int nu6 = 0;
      int i = 0;
      int l = 0;
      int pari = 0;
      int dispari = 0;
      ConsoleReader tastiera = new ConsoleReader(System.in);

    // relaborazione 
do 
  { System.out.println("\nDigitare dei numeri interi maggiori di 0 (massimo 6, per terminare la digitazione digitare 0)");
     nu1 = tastiera.readInt();
    while(nu1 == 0)
      { nu2 = tastiera.readInt();
         while(nu2 == 0)
          { nu3 = tastiera.readInt(); 
             while(nu3 == 0)
               { nu4 = tastiera.readInt();
                   while(nu4 == 0)
                     {  nu5 = tastiera.readInt();
                          while(nu5 == 0)
                             {  nu6 = tastiera.readInt(); }
         }
        }
       }
      }
     }
while(nu1 == 0);

do 
  { if(nu1 % 2 == 0)
      { pari = pari +1; }
     else 
       { dispari = dispari +1; }do 
 

  { if(nu2 % 2 == 0)
      { pari = pari +1; }
     else 
       { dispari = dispari +1; }


       
  { if(nu3 % 2 == 0)
      { pari = pari +1; }
     else 
       { dispari = dispari +1; }


 
  { if(nu4 % 2 == 0)
      { pari = pari +1; }
     else 
       { dispari = dispari +1; }

 
  { if(nu5 % 2 == 0)
      { pari = pari +1; }
     else 
       { dispari = dispari +1; }


  { if(nu6 % 2 == 0)
      { pari = pari +1; }
     else 
       { dispari = dispari +1; }




















       { dispari = dispari +1; }

      if(num3 == int)
      { pari = pari +1; }
     else 
       { dispari = dispari +1; }

      if(num4 == int)
      { pari = pari +1; }
     else 
       { dispari = dispari +1; }

      if(num5 == int)
      { pari = pari +1; }
     else 
       { dispari = dispari +1; }

      if(num6 == int)
      { pari = pari +1; }
     else 
       { dispari = dispari +1; }
    }
while(dispari < 0);

System.out.println("\nI numeri inseriti sono: " + nu1 + " - " + nu2 + " - " + nu3 + " - " + nu4 + " - " + nu5 + " - " + nu6 + "\n ed il numero dei numeri pari e\u0027: " + pari + " e quello dei dispari e\u0027: " + dispari);
System.out.println("\nFINE ELABORAZIONE);
  }
}  
          
