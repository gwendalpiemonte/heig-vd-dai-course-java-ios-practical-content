package ch.heigvd.dai.binary;

import ch.heigvd.dai.Readable;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedBinaryFileReader implements Readable {

    @Override
    public void read(String filename) throws IOException {

        try(FileInputStream inputStream = new FileInputStream(filename)){

            BufferedInputStream bufferInputStream = new BufferedInputStream(inputStream);

            while (bufferInputStream.read() != -1) {}
        }
    }
}
