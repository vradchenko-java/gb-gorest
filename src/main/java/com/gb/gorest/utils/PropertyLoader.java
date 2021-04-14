package com.gb.gorest.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertyLoader {
    private static Properties properties = loadProperties();

    public static String getUri() {
        return properties.getProperty("base.uri");
    }

    public static String getApiToken() {
        return properties.getProperty("api.token");
    }

    private static Properties loadProperties() {
        Properties prop = new Properties();
        Path propsPath = Paths.get(System.getProperty("user.dir"), "src", "main", "resources", "env", "application.properties");

        try (InputStream input = new FileInputStream(propsPath.toFile())) {
            prop.load(input);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        return prop;
    }
}
