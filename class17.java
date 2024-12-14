
interface Engine {

    static final int price = 70000;

    void start();

    void stop();

    void accelerate();
}

interface Brake {

    void brake();
}

interface Media {

    void start();

    void stop();
}

class car implements Engine, Brake, Media {

    @Override
    public void start() {
        System.out.println("I start like a normaL CAR");
    }

    @Override
    public void stop() {
        System.out.println("brake like a normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate like a normal car");
    }

    @Override
    public void brake() {
        System.out.println("Brake like a normal car");
    }
}

class Cdplayer implements Media {

    @Override
    public void start() {
        System.out.println("cd player starts");
    }

    public void stop() {
        System.out.println("cdplayer stops");
    }
}

class PowerEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Power engine start");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Power engine accelerate");
    }
}

class ElecticEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Electric engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric engine accelerate");
    }
}

class NiceCar {

    private Engine engine;
    private Media player = new Cdplayer();

    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElecticEngine();
    }
}

public class class17 {

    public static void main(String[] args) {
        car c = new car();
        c.accelerate(); // accelerate like a normal car
        c.brake(); // Brake like a normal car
        c.start(); // I start like a normaL CAR
        c.stop(); // brake like a normal car

        Media carMedia = new car();
        carMedia.stop(); // brake like a normal car

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();

    }

}
/*
  interfaces in java 

  in interfaee the variables are final static by default 

  variables final isliye nhi

  ismai sre mthode abstract honge

  objcet nhi bn skta inteface ka

  abstract class give implementation of inteface but interface dont give implementation of abstract class 

  interface be default public

  a class can inherit more than one interfaces
 
  yadi ek methode jo ki parent and child class dono mai h to dono run timw mai available hone chiaye taki java decide ker ske ki 

  kisko call kerna h

  yadi do classes jo ki unrelated ho wo bhi same interface ko use ker skte h

  interface ka chij runtime per hota h isliye perforrmance chahne wale code mai interfaxe na use kero

  class ke staat interface ko implements 

  lekin interfacxe ke saaat interfaxce extends laga na hoga
  */
