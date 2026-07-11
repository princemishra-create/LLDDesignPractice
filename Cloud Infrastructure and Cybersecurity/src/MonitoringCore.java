import java.util.ArrayList;
import java.util.List;

public class MonitoringCore implements IMonitoringCore{
    private List<IObserver>m_observers;
    private List<IServer>m_servers;

    public MonitoringCore(){
        this.m_observers = new ArrayList<>();
        this.m_servers = new ArrayList<>();
    }

    void addObserver(IObserver observer) {
        if(this.m_observers.contains(observer)){
            return;
        }
        this.m_observers.add(observer);
    }

    void removeObserver(IObserver observer){
        if(!this.m_observers.contains(observer)){
            return;
        }
        this.m_observers.remove(observer);
    }

    void addServer(IServer server){
        this.m_servers.add(server);
    }

    void removeServer(IServer server){
        this.m_servers.remove(server);
    }

    @Override
    public boolean checkHeartBeat() {
        for(IServer server: this.m_servers){
            String response = server.checkHeartBeat();
        }
    }
}
