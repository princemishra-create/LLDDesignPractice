public class EncryptionSystem extends FileSystemDecorators{
    public EncryptionSystem(IFileSystem fileSystem){
        super(fileSystem);
    }

    @Override
    public String read(String data) {
        String res = this.fileSystem.read(data);
        System.out.println("Decrypting the message");
        return "XYZ";
    }

    @Override
    public void write(String data) {
        System.out.println("Encrypting the message");
        this.fileSystem.write("XYZ");
    }
}
