package edu.ucsd.cs110.temperature;

/**
 * Created by boc016 on 2/15/17.
 */
public class Celsius extends Temperature {
    public Celsius(float t){
        super(t) ;
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius(this.getValue()) ;
    }

    @Override
    public Temperature toFahrenheit() {
        float newValue = (this.getValue() * 9) / 5 ;
        newValue += 32 ;

        return new Fahrenheit(newValue) ;
    }

    public String toString(){
        // TODO: complete this method
        return "" + this.getValue() + " C" ;
    }
}
