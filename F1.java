public class F1 implements RacingCar {

    String carbrand;
    final int tiressize = 18;
    
   // Constructor
    public F1(){

   }
    public F1(String carbrand){
        this.carbrand=carbrand;
    }
    //method
    
    public void setcarbrand(String carbrand){
        this.carbrand=carbrand;
       
    }
    public void gettiresSize(){
        
    }

    public void showinfo(){
        System.out.println("Brand:"+" "+carbrand);
        System.out.println("TiresSize:"+" "+tiressize);
    }
    
    
}
