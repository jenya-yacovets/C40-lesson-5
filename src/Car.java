import java.util.Random;

public class Car {
    private String marka;
    private int price;
    private Engine engine;
    private boolean isStarted = false;

    public Car(String marka, int price, Engine engine) {
        this.marka = marka;
        this.price = price;
        this.engine = engine;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
       if(!isStarted) {
          if (this.checkSystem()) {
              this.engine.start();
              System.out.println(this.marka + " завелся");
              isStarted = true;
          } else {
              System.out.println("Предстартовая проверка провалилась");
          }
       } else {
           System.out.println("Автомобиль " + this.marka + " уже заведен");
       }
    }

    private boolean checkSystem() {
        System.out.println("Предстартовая провекра");
        Random r = new Random();
        int a = r.nextInt(10);

        return a % 2 == 0;
    }

    public void stop() {
       if (isStarted) {
           this.engine.stop();
           System.out.println(marka + " заглушен");
           isStarted = false;
       } else {
           System.out.println("Автомобиль " + this.marka + " не заведен");
       }
    }
}
