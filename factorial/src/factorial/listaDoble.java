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
public class listaDoble {
    //atributos
    private nodoDoble head;
    private nodoDoble tail;
    private int lengthdl;
    //crear nueva lista vacia
    public listaDoble(){
        head=new nodoDoble(0,"",null,null);
        tail=new nodoDoble(Integer.MIN_VALUE,"",null,null);
        head.setNext(tail);
        lengthdl=0;
    }
    //añadir nuevo valor al frente de la lista
    public void insertAtBegining(int newData,String newName){
        nodoDoble newNodo=new nodoDoble(newData, newName,null,head.getNext());
        newNodo.getNext().setPrev(newNodo); //newNodo.getNext().getPrev(newNodo);
        head=newNodo;
        lengthdl++;
    }
    //añadir un nuevo dato a la lista a una posicion recibida
    public void insetAtPos(int data,String name, int position){
        //validar la posicion
        if(position<0) position=0;
        if (position>lengthdl) position=lengthdl;
        //if the list is empty, make it be the unico elemento
        if(head==null){
            head=new nodoDoble(data,name);
            tail=head;
        }else if(position==0){
            nodoDoble newNodoD=new nodoDoble(data,name);
            newNodoD.setNext(head);//newnodoD.next.head
            head=newNodoD;
        }
        else {
            nodoDoble temp=head;
            for(int i=1;i<position;i++){               
            }
            nodoDoble newNode=new nodoDoble(data,name);
            newNode.setNext(temp.getNext()); //newNode.next=temp
            newNode.setPrev(temp);
            newNode.getNext().setPrev(newNode);
            temp.setNext(newNode);
        }
        lengthdl++;
    }
        //add a new value to hre rear of the list
        public void insertAtTail(int newVal, String newName){
            nodoDoble newNode=new nodoDoble (newVal,newName, tail.getPrev(),tail);
            newNode.getPrev().setNext(newNode);
            tail.setPrev(newNode);
            lengthdl++;
        }
    }


