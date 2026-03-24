package six;

import javax.sound.midi.Soundbank;
import java.util.function.BiConsumer;

public class BiCnonnsumableDemo {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> addConsumer = (a,b) -> System.out.println("add consumer "+ (a+b));
        addConsumer.accept(10,30);
    }
}
