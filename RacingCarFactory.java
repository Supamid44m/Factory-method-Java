public class RacingCarFactory {
    public RacingCar buildRacingcar(String carclass){
        if(carclass == null){
            return null;
         }else if(carclass.equals("F1")){
            return new F1();
            
            
         } else if(carclass.equals("Gokart")){
            return new Gokart();
         }else{
            return null;
        }
        
    }
}

