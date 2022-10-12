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
public class nodo {
    private int data;
    public nodo next;

    public nodo(int data){
        this.data=data;
    }
    public void setData(int data){
        this.data=data;
    }
    public int getData() {
        return data;
    }
   public void setNext(nodo next){
        this.next=next;
    }

    public nodo getNext(){
        return next;
    }
   
    
}
