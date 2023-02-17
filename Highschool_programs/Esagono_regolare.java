/*

Scopo: Calcolare il perimetro e l'area di un esagono 
Autore: Matteo Zaramella
Classe: 3Bs
Data: 19/11/14

*/

class Esagono_regolare
{ public static void main(string[] args)
{
 // dichiarazione delle variabili
double l = 15;
double apotema = 0;
double b = 0;
double c = 0;
double a = 0;
double p = 0;

 // elaborazione
apotema = l*0,866;
b = l*apotema;
c = b/2;
a = c*6;
p = l*6;

System.out.println ("\nL'area di un esagono regolare con lato" + l + "e\u0027" + a);
System.out.println ("\nIl perimetro di un esagono regolare con lato" + l + "e\u0027" + p);
System.out.println ("\nFINE ELABORAZIONE\n");
}
}