import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // create the context
        ATM atm = new ATM();
        atm.setState(new IdleState(atm));
        atm.insertCard();
        atm.ejectCard();
        atm.insertCard();
        atm.insertPin(0000);
        atm.requestAmount(50);
        atm.insertCard();
        atm.insertPin(1111);
    }
}