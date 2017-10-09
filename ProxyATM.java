public class ProxyATM implements AbstractATM {
    private ATM atm;

    @Override
    public void insertCard() {
        if(atm == null) {
            atm = new ATM();
        }
        atm.insertCard();
    }

    @Override
    public void ejectCard() {
        if(atm == null) {
            atm = new ATM();
        }
        atm.ejectCard();
    }

    @Override
    public void insertPin(int pinNumber) {
        if(atm == null) {
            atm = new ATM();
        }
        atm.insertPin(pinNumber);
    }

    @Override
    public void requestAmount(int withdrawAmount) {
        if(atm == null) {
            atm = new ATM();
        }
        atm.requestAmount(withdrawAmount);
    }

    @Override
    public void setState(ATMState atmState) {
        if(atm == null) {
            atm = new ATM();
        }
        atm.setState(atmState);
    }

    @Override
    public ATMState getCardInsertedState() {
        if(atm == null) {
            atm = new ATM();
        }
        return atm.getCardInsertedState();
    }

    @Override
    public ATMState getIdleState() {
        if(atm == null) {
            atm = new ATM();
        }
        return atm.getIdleState();
    }

    @Override
    public ATMState getHasCorrectPinState() {
        if(atm == null) {
            atm = new ATM();
        }
        return atm.getHasCorrectPinState();
    }

    @Override
    public ATMState getNoCashinATMState() {
        if(atm == null) {
            atm = new ATM();
        }
        return atm.getNoCashinATMState();
    }
}
