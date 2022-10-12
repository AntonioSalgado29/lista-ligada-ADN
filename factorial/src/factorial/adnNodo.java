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
public class adnNodo {
  private char data;
  private adnNodo prev;
  private adnNodo next;
  
  public adnNodo(){}
  
    public adnNodo(char data){
        this.data=data;
        prev=null;
        next=null;
    }
    public adnNodo(char data, adnNodo prev, adnNodo next){
        this.data=data;
        this.prev=prev;
        this.next=next;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public adnNodo getPrev() {
        return prev;
    }

    public void setPrev(adnNodo prev) {
        this.prev = prev;
    }

    public adnNodo getNext() {
        return next;
    }

    public void setNext(adnNodo next) {
        this.next = next;
    }
    public adnNodo clone(){
        return new adnNodo(data,prev,next);
    }

}

