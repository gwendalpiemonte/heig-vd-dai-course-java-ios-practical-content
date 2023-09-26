package ch.heigvd.dai;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        final int ONE_BYTE = 1;
        final int ONE_KILO_BYTE = 1024;
        final int ONE_MEGA_BYTE = 1000 * 1024 ;
        final int FIVE_MEGA_BYTE = 5 * ONE_MEGA_BYTE;
        final int TEN_MEGA_BYTE = 10 * ONE_MEGA_BYTE;

        //hello

        // Measure the time to write a file (e.g : 1 byte, no buffer and binary file)

        Measure.write("binary_1B.bin", 1, false, Measure.FileType.BINARY);

        // Measure the time to read the same file

        Measure.read("binary_1B.bin", false, Measure.FileType.BINARY);
    }
}
