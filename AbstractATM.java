public interface AbstractATM {
    void insertCard();

    void ejectCard();

    void insertPin(int pinNumber);

    void requestAmount(int withdrawAmount);

    void setState(ATMState atmState);
    public ATMState getCardInsertedState();
    public ATMState getIdleState();
    public ATMState getHasCorrectPinState();
    public ATMState getNoCashinATMState();
}
