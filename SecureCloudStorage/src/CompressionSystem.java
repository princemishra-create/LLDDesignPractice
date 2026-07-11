public class CompressionSystem extends FileSystemDecorators{
    public CompressionSystem(IFileSystem fileSystem) {
        super(fileSystem);
    }

    @Override
    public String read(String data) {
        String res = this.fileSystem.read(data);
        System.out.println("Decompressing the message");
        return "XY";
    }

    @Override
    public void write(String data) {
        System.out.println("Compressing the message");
        this.fileSystem.write("XY");
    }
}
