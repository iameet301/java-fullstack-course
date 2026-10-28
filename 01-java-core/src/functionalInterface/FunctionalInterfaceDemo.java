package functionalInterface;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        
        Predicate<Integer> isEligibleForLoan = salary -> salary >= 30000;
        System.out.println("Loan Eligible? " + isEligibleForLoan.test(45000));


        Function<Integer, Double> addTax = price -> price + (price * 0.10);
        System.out.println("Price with Tax: Rs." + addTax.apply(1000)); 

        Consumer<String> sendNotification = name -> System.out.println("Welcome to Pune IT, " + name + "!");
        sendNotification.accept("Meet");

        Supplier<Integer> otpGenerator = () -> (int) (Math.random() * 9000) + 1000;
        System.out.println("Generated OTP: " + otpGenerator.get());
    }
}
