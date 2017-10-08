public class NoCashState implements ATMState {
    ATM atm;

    public NoCashState(ATM newATMMachine) {
        this.atm = newATMMachine;
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
