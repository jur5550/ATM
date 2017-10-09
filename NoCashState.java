
public class NoCashState implements ATMState {
    ATM atm;

    public NoCashState(ATM newATMMachine) {
        this.atm = newATMMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("This ATM has no money.");
        System.out.println("Ejecting Card");
    }

    @Override
    public void ejectCard() {
        System.out.println("This ATM has no money.");
        System.out.println("There is no card to eject");
    }

    @Override
    public void insertPin(int pinNumber) {
        System.out.println("This ATM has no money.");
    }

    @Override
    public void requestAmount(int withdrawAmount) {
        System.out.println("This ATM has no money.");
    }
}
