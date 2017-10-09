public class HasCardState implements ATMState{

    ATM atm;
    public HasCardState(ATM newATMMachine) {

        atm = newATMMachine;
    }
    @Override
    public void insertCard() {
        System.out.println("Card has been entered");
    }

    @Override
    public void ejectCard() {
        System.out.println("Ejecting card");
        atm.setState(atm.getIdleState());
    }

    @Override
    public void insertPin(int pin) {
        if(pin == 0000){
            System.out.println("Correct pin!");
            atm.correctPin = true;
            atm.setState(atm.getHasCorrectPinState());
        }
        else
        {
            System.out.println("Wrong pin!");
            atm.correctPin = false;
            System.out.println("Ejecting card");
            atm.setState(atm.getIdleState());
        }
    }

    @Override
    public void requestAmount(int withdrawAmount) {
        System.out.println("Please enter your pin before withdrawing");
    }
}
