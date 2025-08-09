// Optional class
// It is a class which used to handle null values safety (To avoid NullPointerException)

import java.util.Optional;

class OptionalClassDemo {
    public static void main(String[] args) {
        printResult(findLen("Pga"));
        printResult(findLen(""));
        printResult(findLen(null));
    }

    static void printResult(Optional<Integer> result) {
        if (result.isPresent()) {
            System.out.println(result.get());
        }else {
            System.out.println("Invalid string");
        }
    } 

    static Optional<Integer> findLen(String s) {
        if (s == null) {
            return Optional.ofNullable(null);
        }
        if (s.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(s.length());
    }
}
