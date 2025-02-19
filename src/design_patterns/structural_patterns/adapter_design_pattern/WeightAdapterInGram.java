package design_patterns.structural_patterns.adapter_design_pattern;

public class WeightAdapterInGram implements WeightAdapter {
    WeighingMachine weighingMachine;

    WeightAdapterInGram(WeighingMachine weighingMachine) {
        this.weighingMachine = weighingMachine;
    }

    @Override
    public double getWeight() {
        double weightInPound = weighingMachine.getWeightInPound();
        double weightInGram = weightInPound * 0.45 * 1000;
        return weightInGram;
    }
}
