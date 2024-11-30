import java.util.*;
public class class9 {
  
}
class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

//    @Override
    static void greeting() {
        System.out.println("Hey, I am in BoxWeight class. Greetings!");
        ArrayList list = new ArrayList();
    }

    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        // used to initialise values present in parent class
        super(l, h, w); // what is this? call the parent class constructor
//        System.out.println(super.weight);
        this.weight = weight;
    }

}
class BoxColor extends BoxWeight {

}
class BoxPrice extends BoxWeight{

    double cost;

    BoxPrice () {
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }

}

/*
  types of inheritance 
  
  1) single inhertance-- one class extends other class 
      
      ex--> box --> boxweight

  2) multilevel inheritance -- one class extends other and that extends other class

      ex --> box --> boxwieght --> boxprice

   3) multiple inheritance --> not supported in java becuase is two parents class having same name variable then which to choose is problem

   done by interfaces

   ex ==> A,B -->C

   4) heirachial inheritances
    
    ex ==> A-->B,C,D


   5) hybrid inheritance --> combo of single and multiple inheritacnes not in java 
   done by interfaces

   ex ==> A --> B,C -->D
*/