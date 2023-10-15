package ch.heigvd.dai.binary;

import ch.heigvd.dai.Writable;

import java.io.*;

public class BinaryFileWriter implements Writable {

    @Override
    public void write(String filename, int sizeInBytes) throws IOException {

        try(FileOutputStream outputStream = new FileOutputStream(filename)){
            outputStream.write(new byte[sizeInBytes]);
        }
    }
}
