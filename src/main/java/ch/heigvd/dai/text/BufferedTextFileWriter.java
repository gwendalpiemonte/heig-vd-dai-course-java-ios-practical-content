package ch.heigvd.dai.text;

import ch.heigvd.dai.Writable;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTextFileWriter implements Writable {
    @Override
    public void write(String filename, int sizeInBytes) throws IOException {

        try (FileWriter outputStream = new FileWriter(filename)) {

            BufferedWriter bufferedWrite = new BufferedWriter(outputStream);

            for(int i = 0; i < sizeInBytes; ++i) {
                bufferedWrite.write('z');
            }
        }
    }
}
