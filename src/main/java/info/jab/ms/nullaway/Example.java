package info.jab.ms.nullaway;

import org.jspecify.annotations.NonNull;

public class Example {
    
    public void printLength(@NonNull String input) {
        if (input != null) {
            System.out.println(input.length());
        } else {
            System.out.println("Input is null");
        }
    }
}
