public abstract class ChangeDispenser {
    protected ChangeDispenser nextChangeDispenser;

    public void setNextChangeDispenser(ChangeDispenser nextChangeDispenser){
        this.nextChangeDispenser = nextChangeDispenser;
    }

    public abstract void dispense(int change);
}
