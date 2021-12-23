package com.springhack.help.mock.accessor;

import com.springhack.help.accessor.S3Accessor;

public class S3AccessorImplMock implements S3Accessor {
    @Override
    public String get(String dir, String fileName) {
        return "this is mock";
    }
}
