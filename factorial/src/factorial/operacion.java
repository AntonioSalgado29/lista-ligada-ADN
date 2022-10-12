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
public class operacion {
    int numero=0;
    int numero2=0;
 

    public operacion(int numero, int numero2, int array) {
        this.numero=numero;
        this.numero2=numero2;
          
    }
    
    public void imprimir(){
        int limit=numero-1;
        int n=numero;
         int result=n;
        int array[]=new int[n];
        
        if (n==0 || n==1){
           System.out.println(1);
        }
        else{
           while(limit>0){
           result=result*limit;
           array[limit]=result;
           System.out.println(n+" x "+limit+" = "+array[limit]); 
           n-=1;
           limit-=1;
           }
        }
    }
   public static long multSuma(long x, long y){
       long result=0;
       for (int i=1;i<=y;i++){
           result+=x;
       }
       return result;
   }
   public static long multSumaRecurs(long x, long y){
       //caso base
      if (y==1){
          return x;
      }
      else{
          //llamada recursiva
          return x+multSumaRecurs(x,y-1);
      }
      
   
}
   //El máximo común divisor es aquel número entero mayor que divide a dos números sin dejar residuo.
      public static long maxDiv(long x, long y){
       //caso base
      if (y == 0) {
          return x;
      }
      else{
          //llamada recursiva
          return maxDiv(y, x % y);
        }
      } 
      //y es el residuo, y se busca que llegue a 0 para parar, y ocupa el lugar de x cuando se llama la funcion,
      //asi que cuando regresa x esta regresando el ultimo valor de y que dio 0 de residuo
    static public int Print(int n){
         if (n==0)
             return 0;
             else{
             System.out.println(n);
             return Print(n-1);
    
             }
     }
     
         
     
}

