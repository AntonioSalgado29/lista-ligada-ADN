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
            
            if (adnString.charAt(i)=='A' && comprobante==0 || adnString.charAt(i)=='T' && comprobante==0 || adnString.charAt(i)=='C' && comprobante==0 || adnString.charAt(i)=='G' && comprobante==0){ 
            System.out.println(adnString.charAt(i));
            nodoADN.insertAtFront(adnString.charAt(i));
            comprobante=1;
            if (adnString.charAt(i)=='A'){
            nodoADNComp.insertAtFront('C');
            }
            if (adnString.charAt(i)=='C'){
            nodoADNComp.insertAtFront('A');
            }
            if (adnString.charAt(i)=='T'){
            nodoADNComp.insertAtFront('G');
            }
            if (adnString.charAt(i)=='G'){
            nodoADNComp.insertAtFront('T');
            }
            }else{
            if (adnString.charAt(i)=='A' || adnString.charAt(i)=='T'|| adnString.charAt(i)=='C'|| adnString.charAt(i)=='G'){               
            System.out.println(adnString.charAt(i));
            nodoADN.insertAtTail(adnString.charAt(i));
            if (adnString.charAt(i)=='A'){
            nodoADNComp.insertAtTail('C');
            }
             if (adnString.charAt(i)=='C'){
            nodoADNComp.insertAtTail('A');
            }
            if (adnString.charAt(i)=='T'){
            nodoADNComp.insertAtTail('G');
            }
            if (adnString.charAt(i)=='G'){
            nodoADNComp.insertAtTail('T');
            }
              }
            }
        }
        System.out.println("");
        System.out.println(nodoADN);
        System.out.println(nodoADNComp);
        
        
        
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
