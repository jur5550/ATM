// the context
public class ATM
{
    ATMState idleState;
    ATMState hasCardState;
    ATMState hasCorrectPinState;
    ATMState noCashinATMState;

    private ATMState state;
    private int amount = 100;
    boolean correctPin = false;

    // define an initial state
    public ATM() {
        setState(idleState);
        hasCardState = new HasCardState(this);
        idleState = new IdleState(this);
        hasCorrectPinState = new HasPinState(this);
        noCashinATMState = new NoCashState(this);

        setState(idleState);

        if(amount < 0)
        {
            setState(noCashinATMState);
        }
    }

    void setState(ATMState state) {
        this.state = state;
    }

    ATMState getState() {
        return this.state;
    }

    void insertCard() {
        state.insertCard();
    }
    void ejectCard() {
        state.ejectCard();
    }
    void insertPin(int pin) {
        state.insertPin(pin);
    }
    void requestAmount(int withdrawAmount) {
        state.requestAmount(withdrawAmount );
    }

    public int getAmount()
    {
        return amount;
    }
    public void setAmount(int newAmount)
    {
        amount = newAmount;

    }

    public ATMState getCardInsertedState() {return hasCardState;}
    public ATMState getIdleState() {return idleState;}
    public ATMState getHasCorrectPinState() {return hasCorrectPinState;}
    public ATMState getNoCashinATMState() {return noCashinATMState;}
}
