/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author purbi
 */
public class Counter {
    private int counter;
    private boolean check;
    
    public Counter (int startingValue, boolean check){
        this.counter = startingValue;
        this.check = check;
    }
    
    public Counter (int startingValue){
        this(startingValue, false);
    }
    
    public Counter (boolean check){
        this(0, check);
    }
    
    public Counter (){
        this(0, false);
    }
    
    public int value() {
        return this.counter;
    }
    
    public void increase() {
        this.counter++;
    }
    
    public void decrease() {
        if (this.check && this.counter == 0)
            return;
        this.counter--;
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount >= 0)
            this.counter += increaseAmount;
    }
    
    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 0)
            return;
        if (this.check && this.counter - decreaseAmount < 0)
            this.counter = 0;
        else 
            this.counter -= decreaseAmount;                    
    }
}
