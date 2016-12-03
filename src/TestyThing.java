
class Animal {
  /* A generic animal class
  * has a bunch of generic methods
  * and data
  */
  String type;
  int age;

  Animal() {
    age = 0;
    type = "";
  }

  Animal( String t="", int a=0 ) {
    age = a;
    type = t;
  }

  String getType() {
    return type;
  }

  int getAge() {
    return age;
  }

  void setType( String t ) {
    type = t;
  }

  void setAge( int a ) {
    age = a;
  }
}


public class TestyThing {
  /* Testing my knowledge of java
  * using multiple classes and data
  * structures
  */
  public static void main(String[] args) {
    Animal tiger = new Animal( "Tiger", 13  );

    System.out.println(tiger.getAge());
  }
}
