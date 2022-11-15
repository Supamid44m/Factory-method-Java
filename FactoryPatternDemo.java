public class FactoryPatternDemo {
    public static void main(String[] args) {
        RacingCarFactory RacingCarFactory = new RacingCarFactory();
        
        RacingCar car1 = RacingCarFactory.buildRacingcar("F1");
        car1.setcarbrand("Ferrari");
        car1.showinfo();

        RacingCar car2 = RacingCarFactory.buildRacingcar("Gokart");
        car2.setcarbrand("Honda");
        car2.showinfo();
    }
}
