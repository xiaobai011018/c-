import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.io.PrintStream;
class Animal {
    public void eat() {
        System.out.println("eat");
    }
}
class Person {
    public final static Animal a = null;
}
public class TestJava {
    public static void main(String[] args) {
        Person.a.eat();
    }
}
