//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CloudProviderFactory cloudProviderFactory = new CloudProviderFactory();
    CloudServiceProvider cloudServiceProvider = cloudProviderFactory.getCloudProvider(CloudProviderType.AWS);
    Compute compute = cloudServiceProvider.compute();
    Storage storage = cloudServiceProvider.storage();

    compute.compute();
    storage.storage();
}
