public class Factory  {


    public Assemblage assemblage = new Assemblage();
    public Paint paint = new Paint();

    public Factory() {
    }

    public String painting() {
        return paint.working();
    }

    public String assembling(){
        return assemblage.working();
    }

    public Car giveCar(){
        System.out.println("Factory");
        return new Car(painting(),assembling());
    }
}
