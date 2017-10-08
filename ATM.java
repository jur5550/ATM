// the context
public class ATM
{
    ATMState idleState;
    ATMState hasCardState;
    ATMState hasCorrectPinState;
    ATMState noCashState;

    private ATMState state;
    private int amount = 100;

    // define an initial state
    public ATM() {
        setState(idleState);
        hasCardState = new HasCardState(this);
        idleState = new IdleState(this);
        hasCorrectPinState = new HasPinState(this);
        noCashState = new NoCashState(this);

        //setState(new IdleState());
    }

    void setState(ATMState state) {
        this.state = state;
    }

    ATMState getState() {
        return this.state;
    }

    void insertCard() {
        state.insertCard(this);
    }
    void ejectCard() {
        state.ejectCard(this);
    }
    void insertPin() {
        state.insertPin(this);
    }
    void requestAmount() {
        state.requestAmount(this);
    }

    public int getAmount()
    {
        return amount;
    }
    public void setAmount(int newAmount)
    {
        amount = newAmount;

    }
}
