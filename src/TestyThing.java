//Importing input scanner
import java.util.Scanner;


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

  Animal( String t ) {
    age = 0;
    type = t;
  }

  Animal( int a) {
    age = a;
    type = "";
  }

  Animal( String t, int a ) {
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
    Scanner scanner = new Scanner(System.in);
  //Input Scanner

  //Collecting Input
    System.out.println("Enter the animal you would like to have:");
    String species;
    species = scanner.next();
    System.out.println("Enter the age you would like it to be:");
    int age;
    age = scanner.nextInt();

    Animal animal = new Animal( species, age );
  //Instantiating an object with collected data

    System.out.println("The animal you selected:");
    System.out.println(animal.getType());
    System.out.println("The age of the animal you selected:");
    System.out.println(animal.getAge());
  //Outputting data from the object
  }
}
