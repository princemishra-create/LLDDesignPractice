import java.util.HashMap;

public class CloudProviderFactory {
    static HashMap<CloudProviderType, CloudServiceProvider> instances = new HashMap<>();

    public CloudServiceProvider getCloudProvider(CloudProviderType cloudProviderType) {
        if(!instances.containsKey(cloudProviderType)){
            instances.put(cloudProviderType, this.getCloudProviderInstance(cloudProviderType));
        }

        return instances.get(cloudProviderType);
    }

    private CloudServiceProvider getCloudProviderInstance(CloudProviderType cloudProviderType){
        if (cloudProviderType == CloudProviderType.GCP) {
            return new GCPProvider();
        } else if (cloudProviderType == CloudProviderType.AWS) {
            return new AWSProvider();
        }

        return null;
    }
}
