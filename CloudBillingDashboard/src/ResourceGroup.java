import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ResourceGroup extends CloudAsset{
    List<CloudAsset> assets = new ArrayList<>();

    @Override
    void add(CloudAsset cloudAsset){
        this.assets.add(cloudAsset);
    }

    @Override
    public int getMonthlyCost() {
        int cost = 0;

        for (CloudAsset asset : assets) {
            cost = cost + asset.getMonthlyCost();
        }

        return cost + 3;
    }
}
