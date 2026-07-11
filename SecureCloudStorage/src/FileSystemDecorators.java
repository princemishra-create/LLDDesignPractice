public abstract class FileSystemDecorators implements IFileSystem{
    protected IFileSystem fileSystem;

    public FileSystemDecorators(IFileSystem fileSystem){
        this.fileSystem = fileSystem;
    }

    @Override
    public abstract String read(String data);

    @Override
    public abstract void write(String data);
}
