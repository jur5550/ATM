
public class IdleState implements ATMState {

    ATM atm;
    public IdleState(ATM newATMMachine){
        this.atm = newATMMachine;
    }
    @Override
    public void insertCard(ATM atm) {

            System.out.println("Please enter your pin");

                atm.setState(atm.hasCardState);

        }



    @Override
    public void ejectCard(ATM atm) {

    }

    @Override
    public void insertPin(ATM atm) {

    }

    @Override
    public void requestAmount(ATM atm) {

    }
}
