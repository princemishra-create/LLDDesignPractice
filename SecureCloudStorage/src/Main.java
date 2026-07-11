//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    IFileSystem fileSystem = new LoggingSystem(new EncryptionSystem(new CompressionSystem(new BaseFileSystem())));
    fileSystem.write("xyz");
}
