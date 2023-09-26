package ch.heigvd.dai.text;

import ch.heigvd.dai.Readable;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class BufferedTextFileReader implements Readable {
    @Override
    public void read(String filename) throws IOException {

        try(FileReader inputStream = new FileReader(filename)) {

            BufferedReader bufferReader = new BufferedReader(inputStream);

            while (bufferReader.read() != -1) {}
        }
    }
}
