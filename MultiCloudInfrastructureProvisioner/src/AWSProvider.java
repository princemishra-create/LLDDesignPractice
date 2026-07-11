public class AWSProvider implements CloudServiceProvider{
    @Override
    public Compute compute() {
        return new AWSCompute();
    }

    @Override
    public Storage storage() {
        return new AWSStorage();
    }
}
