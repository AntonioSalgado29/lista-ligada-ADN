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
public class nodoDoble {
    private int data;
    private String name;
    private nodoDoble prev;
    private nodoDoble next;
    
    public nodoDoble(int data, String name){
        this.data=data;
        this.name=name;
        prev=null;
        next=null;
    }
    public nodoDoble(int data,String name, nodoDoble prev, nodoDoble next){
        this.data=data;
        this.name=name;
        this.prev=prev;
        this.next=next;
    }

    public int getData() {
        return data;
    }

     public String getName() {
        return name;
    }
     
    public nodoDoble getPrev() {
        return prev;
    }

    public nodoDoble getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setPrev(nodoDoble prev) {
        this.prev = prev;
    }

    public void setNext(nodoDoble next) {
        this.next = next;
    }

    public void setName(String name) {
        this.name = name;
    }
    public nodoDoble clone(){
        return new nodoDoble(data,name, prev,next);
    }
}
  