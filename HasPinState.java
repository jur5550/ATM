
public class HasPinState implements ATMState {


    ATM atm;


    public HasPinState(ATM newATMMachine) {

        atm = newATMMachine;
    }

    public void insertCard() {


        System.out.println("You already entered a card");

    }

    public void ejectCard() {

        System.out.println("Your card is ejected");

        atm.setState(atm.idleState);

    }

    public void requestAmount(int withdrawAmount) {

        if (withdrawAmount > atm.getAmount()) {

            System.out.println("You don't have that much cash available");

            System.out.println("Your card is ejected");

            atm.setState(atm.getIdleState());


        } else {


            System.out.println(withdrawAmount + " is provided by the machine");
            atm.setAmount(atm.getAmount() - withdrawAmount);
            System.out.println("Your card is ejected");
            atm.setState(atm.idleState);

            if (atm.getAmount() <= 0) {
                atm.setState(atm.getIdleState());
            }
        }
    }

    public void insertPin(int pin) {
        System.out.println("You already entered a PIN");
    }

}
