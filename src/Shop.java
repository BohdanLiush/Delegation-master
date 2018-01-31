public class Shop  {
    public Assemblage assemblage = new Assemblage();
    public Paint paint = new Paint();



    public String painting() {
        return paint.working();
    }

    public String assembling(){
        return assemblage.working();
    }

    public Car giveCar(){
        System.out.println("Shop");
        return new Car(painting(),assembling());
    }
}
