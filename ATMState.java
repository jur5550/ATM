public interface ATMState {

    void insertCard();

    void ejectCard();

    void insertPin(int pinNumber);

    void requestAmount(int withdrawAmount);

}

// implement the 5 concrete states

