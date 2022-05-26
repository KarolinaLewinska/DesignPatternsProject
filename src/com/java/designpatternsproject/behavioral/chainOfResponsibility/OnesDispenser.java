public class OnesDispenser extends ChangeDispenser{
    @Override
    public void dispense(int change) {
        int remainder = change;
        if(change>=1){
            int count = change / 1;
            remainder = change % 1;
            System.out.printf("Dispensing '%d' 1PLN coins of change.\n", count);
        }
        if (remainder > 0 && this.nextChangeDispenser != null) {
            this.nextChangeDispenser.dispense(remainder);
        }
    }
}
