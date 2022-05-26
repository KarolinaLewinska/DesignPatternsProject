public class CoffeMachine {
    protected static ChangeDispenser fivesDispenser = new FivesDispenser();
    protected static ChangeDispenser twosDispenser = new TwosDispenser();
    protected static ChangeDispenser onesDispenser = new OnesDispenser();
    protected static ChangeDispenser responsibilityChain;
    static {
        fivesDispenser.setNextChangeDispenser(twosDispenser);
        twosDispenser.setNextChangeDispenser(onesDispenser);
        responsibilityChain = fivesDispenser;
    }
    public static void giveChange(int change){
        responsibilityChain.dispense(change);
    }

}
