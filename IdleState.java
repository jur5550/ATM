
public class IdleState implements ATMState {

    ATM atm;
    public IdleState(ATM newATMMachine){
        this.atm = newATMMachine;
    }
    @Override
    public void insertCard() {

            System.out.println("Please enter your pin");

                atm.setState(atm.getCardInsertedState());

        }



    @Override
    public void ejectCard() {
        System.out.println("Enter your card.");
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("Enter your card.");
    }

    @Override
    public void requestAmount(int withdrawAmount) {
        System.out.println("Enter your card.");
    }
}
