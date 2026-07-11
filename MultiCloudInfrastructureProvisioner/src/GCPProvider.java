public class GCPProvider implements CloudServiceProvider{
    @Override
    public Compute compute() {
        return new GCPCompute();
    }

    @Override
    public Storage storage() {
        return new GCPStorage();
    }
}
