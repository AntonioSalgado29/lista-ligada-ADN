/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author ALUMNO
 */
public class listaLigada {
    nodo head;
    int lengthL;

    public int getLengthL() {
        return lengthL;
    }
    
    public listaLigada(){
        lengthL=0;
    }
    public nodo getHead(){
        return head;
    }
    //insert at the begining of the list
    public synchronized void insertAtbegining(nodo node){
        node.next=head;
        head=node;
        lengthL++;
    }
    
    public void insertAtEnd (nodo node){
        if(head==null){
            head=node;
        }else{
            nodo i,z;
            for (i=head;(z=i.next)!=null;i=z);
            i.next=node;
        }
        lengthL++;
    }
    public void insertAny (int data, int position){//NO TERMINADO
       //comprobar si es negativo
       if (position<0){
           position=0;
       }
       if (position>lengthL){
        position=lengthL;
    }
    }
    //remover nodo que contenga los datos ingresados
    //usar equals()
    public void removeMatched(nodo node){
        if (head==null){
            return;
        }
        if(node.equals(head)){
            head=head.next;
            return;
        }
        nodo p=head,q=null;
        while((q=p.next)!=null){
            if(node.equals(q)){
                p.next=q.next;
                lengthL--;
                return;
            }
            p=q;
        }
    }
    //remover valor de una posicion
    public void removeAtPos(int position){
        //fix negative position
        if(position<0){
            position=0;
        }
        if(position>lengthL){
            position=lengthL-1;
        }
        //if nada en la lista no se hace nada(solo poner return)
        if(head==null){
            return;
        }
        if (position==0){
            head=head.next;
        }else{
            nodo temp=head;
            for (int i=1;i<=position;i++){
                temp=temp.next;
            }
            temp.next=null;
        }
        lengthL--;
    }
  //remove all list ajujauejaueajueja
    public void clearList(){
        head=null;
        lengthL=0;
    }
    //return un string 
    public String toString(){
        String result="[";
        if(head==null){
            return result+"]";
        }
        result += head.getData();
        nodo temp=head.next;
        while(temp!=null){
            result += ","+temp.next;
            temp=temp.next;
        }
        return result +"[";
    }
}  //fin de la clase
