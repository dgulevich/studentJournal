package main.java.util.impl;

import main.java.util.Writer;

import java.io.*;
import java.util.Collection;

public class TextFileWriter implements Writer<String> {

    private static TextFileWriter instance;

    public static TextFileWriter getInstance() {
        if (instance == null) {
            instance = new TextFileWriter();
        }
        return instance;
    }

    private TextFileWriter() {

    }


    @Override
    public void write(String source, Collection<?> collection) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(source)))) {
            collection.forEach((t) -> {
                try {
                    objectOutputStream.writeObject(t);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
