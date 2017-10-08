public class HasCardState implements ATMState{

    ATM atm;
    public HasCardState(ATM newATMMachine) {

        atm = newATMMachine;
    }
    @Override
    public void insertCard(ATM atm) {

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
