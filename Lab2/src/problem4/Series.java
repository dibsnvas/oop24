package problem4;

public class Series extends Circuit {
    private Circuit firstCircuit;
    private Circuit secondCircuit;

    public Series(Circuit a, Circuit b) {
        this.firstCircuit = a;
        this.secondCircuit = b;
    }

    @Override //общего сопротивления последовательной цепи
    public double getResistance() {
        return firstCircuit.getResistance() + secondCircuit.getResistance();
    }

    @Override //разности потенциалов в цепи
    public double getPotentialDifference() {
        return firstCircuit.getPotentialDifference() + secondCircuit.getPotentialDifference();
    }

    @Override //разности потенциалов к цепи
    public void applyPotentialDifference(double V) {
        double current = V / getResistance();
        firstCircuit.applyPotentialDifference(firstCircuit.getResistance() * current);
        secondCircuit.applyPotentialDifference(secondCircuit.getResistance() * current);        
    }

    @Override
    public String toString() {
        return "Series => " + super.toString() + "\n- First: " + firstCircuit + "\n- Second: " + secondCircuit;
    }
}
