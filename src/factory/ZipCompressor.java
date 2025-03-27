package factory;

public class ZipCompressor implements Compressor {
    @Override
    public void doCompress() {
        System.out.println("Zip Called");
    }
}
