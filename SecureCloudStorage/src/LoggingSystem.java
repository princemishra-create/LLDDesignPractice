public class LoggingSystem extends FileSystemDecorators{
    public LoggingSystem(IFileSystem fileSystem){
        super(fileSystem);
    }

    @Override
    public String read(String data) {
        System.out.println("Reading Message");
        return this.fileSystem.read(data);
    }

    @Override
    public void write(String data) {
        System.out.println("Writing Message");
        this.fileSystem.write(data);
    }
}
