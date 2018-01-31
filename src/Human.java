import java.util.Random;

public class Human{
    private Car car;
    public void giveCar(Car car){
        this.car = car;
    }

    public static void main(String[] args) throws InterruptedException {
        Factory factory = new Factory();
        Shop shop = new Shop();

        Human[] humans = new Human[10];
            for (int i = 0; i < humans.length; i++) {
                humans[i] = new Human();
                Thread.sleep(1000);
                Random random = new Random();
                int a = random.nextInt(100);
                System.out.println("a = " + a);
                if (a > 50){
                    //System.out.println("car is good");
                    humans[i].giveCar(factory.giveCar());
                }
                else
                    humans[i].giveCar(shop.giveCar());
            }
        }

       /* ArrayList<Human> humanArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            //Thread.sleep(1000);
            humanArrayList.add(new Human());
            Random random = new Random();
            int a = random.nextInt(100);
            System.out.println("a = " + a);
            if ( a > 50)
                System.out.println("car is good");
            else
                humanArrayList.get(i).giveCar();
        }*/

        /*for (Human a: humanArrayList){
            System.out.println(a);
        }*/
    }

