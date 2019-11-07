package com.pengq.config.server.loader;

import org.springframework.boot.env.PropertySourceLoader;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

/**
 * Created by pengq on 2019/11/6 17:51.
 * 解决配置服务默认以 ISO 8859-1 字符集解析 导致中文乱码问题
 * @see Properties#load(java.io.InputStream)
 */
public class PropertiesPropertySourceLoader implements PropertySourceLoader {
    @Override
    public String[] getFileExtensions() {
        return new String[]{"properties", "xml"};
    }

    @Override
    public List<PropertySource<?>> load(String name, Resource resource) throws IOException {
        Properties properties = getProperties(resource);
        if (properties.isEmpty()) {
            return Collections.emptyList();
        }
        return Collections.singletonList(new PropertiesPropertySource(name, properties));
    }

    private Properties getProperties(Resource resource) throws IOException {
        Properties properties = new Properties();
        try (InputStream inputStream = resource.getInputStream()) {
            properties.load(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        }
        return properties;
    }
}

