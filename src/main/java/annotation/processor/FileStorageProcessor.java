package main.java.annotation.processor;

import main.java.annotation.FileStorege;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;

public class FileStorageProcessor {

    private static FileStorageProcessor instance;

    private FileStorageProcessor() {

    }

    public static FileStorageProcessor getInstance() {
        if (instance == null) {
            instance = new FileStorageProcessor();
        }
        return instance;
    }

    public String getPath(Class<?> aClass) {
        final String name = getFileStorageName(aClass);
        return getPath(name);
    }

    private String getFileStorageName(Class<?> objectClass) {
        final Optional<FileStorege> optionalFileStorege = Optional.ofNullable(objectClass.getAnnotation(FileStorege.class));
        final FileStorege fileStorege =
                optionalFileStorege.orElseThrow(() -> new RuntimeException("Class " + objectClass.getName() + " don't have a FileStorage annotation!"));
        final String name = fileStorege.name();
        if (name.isEmpty()) {
            throw new RuntimeException("Class " + objectClass.getName() + " annotation FileStorage don't have a name param!");
        }
        return name;
    }

    private String getPath(String name) {
        try (InputStream input = this.getClass().getClassLoader().getResourceAsStream("application.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            final String root = prop.getProperty("dao.file.root");
            final String format = prop.getProperty("dao.file.format");
            return root + name + format;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
