package design_patterns.structural_patterns.adapter_design_pattern;

public class WeightAdapterForKg implements WeightAdapter {
    WeighingMachine weighingMachine;

    public WeightAdapterForKg(WeighingMachine weighingMachine) {
        this.weighingMachine = weighingMachine;
    }

    public double getWeight() {
        double weightInPound = weighingMachine.getWeightInPound();
        double weightInKg = weightInPound * 0.45;
        return weightInKg;
    }
}
