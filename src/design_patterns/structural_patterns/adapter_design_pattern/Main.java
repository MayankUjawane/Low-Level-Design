package design_patterns.structural_patterns.adapter_design_pattern;

public class Main {
    public static void main(String[] args) {
        WeighingMachine weighingMachine = new WeighingMachine();
        System.out.println("Weight in pound: " + weighingMachine.getWeightInPound());

        WeightAdapter weightAdapter = new WeightAdapterForKg(weighingMachine);
        System.out.println("Weight in Kg: " + weightAdapter.getWeight());

        weightAdapter = new WeightAdapterInGram(weighingMachine);
        System.out.println("Weight in Gram: " + weightAdapter.getWeight());
    }
}
