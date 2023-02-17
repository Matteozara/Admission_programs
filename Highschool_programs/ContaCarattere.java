/*
* Scopo: Contare quanti numeri sono presenti in una stringa
* Autore: Matteo Zararmella
* Data: 30/01/15
* Clase: 3Bs
*/

class ContaNumeri
{ public static void main(String[] args)
  { //dichiarazione delle variabili
     String parola = "";
     int i = 0;
     int l = 0;
     char car = '\u0000';
     ConsoleReader tastiera = new ConsoleReader(System.in);

    // elaborazione
   
   do
    {  System.out.println("\nInserisci una parola");
       parola = tastiera.readLine().trim();
       l = parola.length();
       if (l == 0)
         System.out.println("\nERRORE Non hai digitato nulla di significativo: ridigita");
    }
    while(l == 0);

   do 
    { car = parola.charAt(i);
      if( // scrivo intervallo numeri
else Errore








   do
     {  car = parola.charAt(i);
        switch(car)
       {  case 'a':
          case 'A':
	  case 'e':
 	  case 'E':
	  case 'i':
	  case 'I':
  	  case 'o':
	  case 'O':
  	  case 'u':
	  case 'U': { break;}
          default: { if((car > 65 && car <= 90) || (car > 97 && car <= 122))
                     { conta++;break;} }
       }
       i++;
     }
    while(i < l);
     

     System.out.println("\nLa parola inserita e\u0027 " +parola+ " \ne\u0027 formata da " +l+ " caratteri\ncontiene " +conta+ " consonanti");
     System.out.println("\nFINE ELABORAZIONE");
