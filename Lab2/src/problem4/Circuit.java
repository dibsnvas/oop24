package problem4;

public abstract class Circuit {

    public abstract double getResistance(); //сопротивлениe цепи
    public abstract double getPotentialDifference(); // разность потенциалов
    public abstract void applyPotentialDifference(double V); //напряжение на цепь
    
    public double getPower() {
        return getCurrent() * getPotentialDifference();
    }

    public double getCurrent() {
        return getPotentialDifference() / getResistance(); // i*u
    }

    @Override
    public String toString() {
        return "U = " + getPotentialDifference() + "V, R = " + getResistance() + "Ohm, I = " + getCurrent() + "A, P = " + getPower() + "W";
    }
}
