package factory;

public enum CompressionFactory {
    INSTACE;

    public Compressor getCompressor(CompressionType compressionType) {
        switch (compressionType) {
            case ZIP: return new ZipCompressor();
            case TAR: return new TarCompressor();
            default:throw new IllegalArgumentException("Only Zip and Tar are supported");
        }
    }
}
