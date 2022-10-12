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
public class adnLista {
    private adnNodo head;
    private adnNodo tail;
    private int lengthdl;
    
  
     //crear nueva lista vacia
    public adnLista(){
        head=new adnNodo('\0',null,null);
        tail=new adnNodo('\0',head,null);
        head.setNext(tail);
        lengthdl=0;
    }
    //añadir nuevo valor al frente de la lista
    public void insertAtFront(char newData){
        adnNodo newNodo=new adnNodo(newData,null,head.getNext());
        newNodo.getNext().setPrev(newNodo); //newNodo.getNext().getPrev(newNodo);
        head=newNodo;
        lengthdl++;
    }
    //añadir un nuevo dato a la lista a una posicion recibida
    public void insetAtPos(char data, int position){
        //validar la posicion
        if(position<0) position=0;
        
        else if (position>lengthdl) position=lengthdl;
        //if the list is empty, make it be the unico elemento
        if(head==null){
            head=new adnNodo(data);
            tail=head;
        }else if(position==0){
            adnNodo newNodoD=new adnNodo(data);
            newNodoD.setNext(head);//newnodoD.next.head
            head=newNodoD;
        }
        else {
            adnNodo temp=head;
            for(int i=1;i<position;i++){    
            temp=temp.getNext();
            }
            adnNodo newNode=new adnNodo(data);
            newNode.setNext(temp.getNext()); //newNode.next=temp
            newNode.setPrev(temp);
            newNode.getNext().setPrev(newNode);
            temp.setNext(newNode);
        }
        lengthdl++;
    }
        //add a new value to hre rear of the list
        public void insertAtTail(char newVal){
            adnNodo newNode=new adnNodo (newVal, tail.getPrev(),tail);
            newNode.getPrev().setNext(newNode);
            tail.setPrev(newNode);
            lengthdl++;
        }
        // Return a string representation of this collection, in the form: ["str1","str2",...].
   public String toString() {
     String result = "[]";
     if (lengthdl == 0)
       return result;
     result = "[" + head.getData();
     adnNodo temp = head.getNext();
     while (temp != tail) {
       result += "," + temp.getData();
       temp =  temp.getNext();
     }
     return result + "]";
   }
     // Remove everything from the DLL.
   public void clearList(){
     head = null;
     tail = null;
     lengthdl = 0;
   }

   public int getSizeL(){
    return lengthdl;
   }
}
