public class TwosDispenser extends ChangeDispenser {
    @Override
    public void dispense(int change) {
        int remainder = change;
        if(change>=2){
            int count = change / 2;
            remainder = change % 2;
            System.out.printf("Dispensing '%d' 2PLN coins of change.\n", count);
        }
        if (remainder > 0 && this.nextChangeDispenser != null) {
            this.nextChangeDispenser.dispense(remainder);
        }
    }
}
