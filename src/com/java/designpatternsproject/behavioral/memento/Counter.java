public class Counter {
    private int counter;

    public Counter(){
        counter = 0;
    }
    public int getCount(){
        return counter;
    }

    public void addToCount(){
        counter += 1;
    }

    public void subtractFromCount(){
        counter -=1;
    }
    public CounterState saveCounter(){
        return new CounterState(counter);
    }
    public void undo(CounterState save){
        counter = save.getCounter();
    }
}
