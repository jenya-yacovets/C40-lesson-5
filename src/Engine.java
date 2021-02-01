public class Engine {
    private int power;

    public Engine(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void start() {
        System.out.println("Двигатель мощностью " + power + " запущен");
    }

    public void stop() {
        System.out.println("Двигатель мощностью " + power + " заглушен");
    }
}
