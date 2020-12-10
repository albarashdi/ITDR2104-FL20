
package lecture5;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class PolymorphismDemo {
  public static void main(String[] args) {
    m(new GraduateStudent());
    m(new Student());
    m(new Person());
    m(new Object());
  }
  public static void m(Object x) {
    System.out.println(x.toString());
  }
}
class GraduateStudent extends Student {
    
}
class Student extends Person {
  
}
class Person extends Object {
  public String toString() {
    return "Person";
  }
}