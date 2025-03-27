package factory;

public class TarCompressor implements Compressor{
    @Override
    public void doCompress() {
        System.out.println("Tar Called");
    }
}
