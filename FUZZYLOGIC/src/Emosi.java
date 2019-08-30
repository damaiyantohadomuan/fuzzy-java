


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PEACE
 */
public class Emosi {
   private int e;

   public void setE(int e) {
        this.e = e;
   }

    public int getE() {
        return e;
    }
   
   public  double sangatrendah(){
       if (e<=25){
           return 1;
       }
       else if ((e>25)&&(e<50)){
         return -(e-50)/25.0;
       }
       else return 0.0;
       
   }
   public double rendah(){
       if (e==50){
           return 1;
       }
       else if((e>25)&&(e<50)){
         return (e-25)/25.0;   
       }
       else if ((e>50)&&(e<75)){
         return -(e-75)/25.0;
       }
       else return 0.0;
   }
   public double sedang(){
       if (e==75){
           return 1;
       }
       else if((e>51)&&(e<=75)){
         return (e-50)/25.0;   
       }
       else if ((e>75)&&(e<100)){
         return -(e-100)/25.0;
       }
       else return 0.0;
   }
   public double tinggi(){
       if (e==100){
           return 1;
       }
       else if((e>75)&&(e<=100)){
         return (e-75)/25.0;   
       }
         
       else return 0.0;
   }
  
    
    
}
