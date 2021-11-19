package server.core.transmit;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileMeta {

    public FileMeta() {
    }

    public enum Compressed {
        COMPRESSED,
        NOT_COMPRESSED
    }

    public long size;
    public String filename;
    public Compressed compressed;

    public FileMeta(long size, String filename, Compressed compressed) {
        this.size = size;
        this.filename = filename;
        this.compressed = compressed;
    }
}
