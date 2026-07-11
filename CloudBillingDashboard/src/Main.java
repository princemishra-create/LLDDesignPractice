//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CloudAsset asset1 = new ComputeInstance();
    CloudAsset asset2 = new StorageBucket();
    CloudAsset asset3 = new ComputeInstance();
    CloudAsset asset4 = new StorageBucket();
    CloudAsset asset5 = new ResourceGroup();

    asset5.add(asset1);
    asset5.add(asset2);
    asset5.add(asset3);
    asset5.add(asset4);
    System.out.println(asset5.getMonthlyCost());
}
