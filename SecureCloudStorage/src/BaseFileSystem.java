public class BaseFileSystem implements IFileSystem{
    @Override
    public String read(String filePath) {
        System.out.println("Read data from the specified location");
        return "XY";
    }

    @Override
    public void write(String data) {
        System.out.println("Written data to the specified location");
    }
}
