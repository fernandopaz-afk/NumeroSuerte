import java.io.*;
import java.util.*;
public class NumeroSuerte {
public static void main(String args[])throws IOException{
BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
ListaDobleEnlazada suerte = new ListaDobleEnlazada();
   Random c = new Random();
int a=0,b,opc,elem;

do{
System.out.println("Ingresa un numero");
a=Integer.parseInt(leer.readLine());
suerte.agregarAlInicio(new Nodo<Integer>(a));
System.out.println("Desea agregar otro numero 1.-Si 2.-No");
opc=Integer.parseInt(leer.readLine());
}while(opc==1);
System.out.println("*****TUS NUMEROS SON*****");
System.out.println(suerte.toStringReverse());
System.out.println(suerte);

System.out.println("Calculando...");
elem=(suerte.obtenerNoElementos())-1;


for(int i=0;i<elem;i++){
b=c.nextInt(2);


if(b==0){
suerte.EliminarAlInicio();
}if(b==1){
suerte.EliminarAlFin();
}
}

System.out.println("EL NUMERO DE LA SUERTE ES: "+suerte);
}    
}
