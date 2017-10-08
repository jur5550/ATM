
public class HasPinState implements ATMState {


    ATM atm;


    public HasPinState(ATM newATMMachine) {

        atm = newATMMachine;
    }

    public void insertCard(ATM atm) {


        System.out.println("You already entered a card");

    }

    public void ejectCard(ATM atm) {

        System.out.println("Your card is ejected");

        atm.setState(atm.idleState);

    }

    public void requestAmount(ATM atm) {

        if (atm.getWithdrawalAmount() > atm.getAmount()) {

            System.out.println("You don't have that much cash available");

            System.out.println("Your card is ejected");

            atm.setState(atm.idleState);


        } else {


            System.out.println(getWithdrawalAmount + " is provided by the machine");
            atm.setAmount(atm.getAmount() - getWithdrawalAmount);
            System.out.println("Your card is ejected");
            atm.setState(atm.idleState);

            if (atm.getAmount() <= 0) {
                atm.setState(atm.idleState);
            }
        }
    }

    public void insertPin(ATM atm) {
        System.out.println("You already entered a PIN");
    }

}
