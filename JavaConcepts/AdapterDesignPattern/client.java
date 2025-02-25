package AdapterDesignPattern;

import AdapterDesignPattern.Adaptee.WeightMachineImpl;
import AdapterDesignPattern.Adapter.WeightMachineAdapter;
import AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class client {

    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineImpl());
        int weightMachineInKg = weightMachineAdapter.getWeightMachineInKg();
        System.out.println(weightMachineInKg);
    }
}
