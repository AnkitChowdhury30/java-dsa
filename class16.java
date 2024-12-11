abstract class parent {
  abstract void  career(String name);
  abstract void partner(String name,int age);
}

public class son extends parent{
  void career(String name){
    System.out.println("My name is "+name);
  }
  void partner(String name,int age){
    System.out.println("I love "+name+" she is "+age);
  }
}

public class class16 {
  
}

/*
  kai bar aisa hota ki parent class bataata h what to do but not how to do 
  means parent mai kewal methode ka declaaration hoga body nhi hoga
  inko abstract mathode kahenege
  ager parent ke pass body nhi h to child classs body dega
  hum chahenge ki child class sbi neceessary methode ko override kere
  yadi class mai ek bhi abstractmethode ho to class abstract declare kerna hoga
 */
