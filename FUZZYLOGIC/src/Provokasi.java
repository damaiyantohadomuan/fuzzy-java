/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PeACe
 */
public class Provokasi {
      private int p;

   public void setP(int p) {
        this.p = p;
   }

    public int getP() {
        return p;
    }
   
   
   public  double sangatrendah(){
       if (p<=25){
           return 1;
       }
       else if((p>25)&&(p<50)){
         return -(p-50)/25.0;   
       }
       else return 0;
       
   }
   public double rendah(){
       if (p==50){
           return 1;
       }
       else if((p>25)&&(p<50)){
         return (p-25)/25.0;   
       }
       else if ((p>50)&&(p<75)){
         return -(p-75)/25.0;
       }
       else return 0;
   }
   public double sedang(){
       if (p==75){
           return 1;
       }
       else if((p>51)&&(p<=75)){
         return (p-50)/25.0;   
       }
       else if ((p>75)&&(p<100)){
         return -(p-100)/25.0;
       }
       else return 0;
   }
   public double tinggi(){
       if (p==100){
           return 1;
       }
       else if((p>75)&&(p<=100)){
         return (p-75)/25.0;   
       }
      
       else return 0;
   }
  
 
}
