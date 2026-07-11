public abstract class CloudAsset {
    abstract int getMonthlyCost();

    void add(CloudAsset cloudAsset) {
        throw new RuntimeException("add operation not defined");
    }

    void remove(CloudAsset cloudAsset) {
        throw new RuntimeException("remove operation not defined");
    }
}
