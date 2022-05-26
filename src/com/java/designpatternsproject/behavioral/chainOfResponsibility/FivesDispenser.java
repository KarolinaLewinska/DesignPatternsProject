public class FivesDispenser extends ChangeDispenser{
    @Override
    public void dispense(int change) {
        int remainder = change;
        if(change>=5){
            int count = change / 5;
            remainder = change % 5;
            System.out.printf("Dispensing '%d' 5PLN coins of change.\n", count);
        }
        if (remainder > 0 && this.nextChangeDispenser != null) {
            this.nextChangeDispenser.dispense(remainder);
        }
    }
}
