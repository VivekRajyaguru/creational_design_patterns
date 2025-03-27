package factory;

public class Main {

    public static void main(String[] args) {
    Compressor compressor = CompressionFactory.INSTACE.getCompressor(CompressionType.ZIP);
    compressor.doCompress();

    Compressor compressor2 = CompressionFactory.INSTACE.getCompressor(CompressionType.TAR);
    compressor2.doCompress();

        Compressor compressor3 = CompressionFactory.INSTACE.getCompressor(CompressionType.valueOf("ABC"));
        compressor3.doCompress();
    }
}
