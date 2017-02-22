package edu.ucsd.cs110.temperature;

/**
 * Created by boc016 on 2/15/17.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t){
        super(t) ;
    }

    @Override
    public Temperature toCelsius() {
        float newValue = this.getValue() - 32 ;
        newValue = (newValue * 5 ) / 9 ;

        return new Celsius(newValue) ;
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(this.getValue()) ;
    }

    public String toString(){
        // TODO: complete this method
        return "" + this.getValue() + " F" ;
    }
}
