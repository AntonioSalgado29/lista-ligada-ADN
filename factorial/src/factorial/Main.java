/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
import java.util.Scanner;

/**
 *
 * @author ALUMNO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //int numero=12,numero2=20;
       //operacion obj1=new operacion(numero, numero2);
       //obj1.imprimir();
       //int result=operacion.Print(numero); //metodo estatico, se puede llamar sin crear una instancia u objeto
       //System.out.println(result);
       Scanner read=new Scanner(System.in);
       
        //codigo del profe
        System.out.println("ingresar secuencia de ADN");
        String adnString=(read.nextLine()).toUpperCase();
        adnLista nodoADN=new adnLista();
        
        System.out.println("uno por uno");
      
        for(int i=0;i<adnString.length();i++){
            if (adnString.charAt(i)=='A' || adnString.charAt(i)=='T'|| adnString.charAt(i)=='C'|| adnString.charAt(i)=='G'){
            System.out.println(adnString.charAt(i));
            nodoADN.insertAtTail(adnString.charAt(i));
            }
        }
        System.out.println("");
        
        
       /**
         listaLigada meList=new listaLigada();
         nodo node=new nodo(6);
         System.out.println("posicion de memoria otorgada: "+node);
         meList.insertAtEnd(node);
       
         System.out.println("Head dato: "+meList.getHead().getData());
         //nodo2
         nodo node2=new nodo(1);
         System.out.println("posicion de memoria otorgada: "+node2);
         meList.insertAtEnd(node2);
         System.out.println("Head dato: "+meList.getHead().getData());
         System.out.println("nodo siguiente al primero: "+node.getNext());
       
         System.out.println("numero de elementos en la lista: "+meList.getLengthL());
       */
         
        /**
        listaDoble meList=new listaDoble();
        nodoDoble node=new nodoDoble(4);
        */
    }
    
}
