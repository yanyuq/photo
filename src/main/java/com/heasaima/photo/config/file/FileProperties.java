package com.heasaima.photo.config.file;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class FileProperties {

    @Value("${file.path}")
    private String path;
}
