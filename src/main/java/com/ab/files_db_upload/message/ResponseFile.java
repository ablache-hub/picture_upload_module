package com.ab.files_db_upload.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ResponseFile {
    private String name;
    private String url;
    private String type;
    private long size;
}