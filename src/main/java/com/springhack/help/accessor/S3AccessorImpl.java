package com.springhack.help.accessor;

import org.springframework.stereotype.Component;

@Component
public class S3AccessorImpl implements S3Accessor{

    @Override
    public String get(String dir, String fileName) {
        return dir + fileName + "のファイルです";
    }
}
