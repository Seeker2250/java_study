package chap10.functionalinterfaceapi;

//(2)Consumer Function Interface =>
//accept()method

import java.util.function.Consumer;

public class ConsumerTest01 {
    Consumer<String> c = s -> System.out.println(s);

     //c.accept ()
}
