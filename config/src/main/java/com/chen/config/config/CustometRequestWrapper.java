package com.chen.config.config;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.ByteArrayInputStream;

/**
 * @author 陈智颖
 * @date 2018-11-16 上午11:29
 **/
public class CustometRequestWrapper extends HttpServletRequestWrapper {

    public CustometRequestWrapper(HttpServletRequest request) {
        super(request);
    }
    @Override
    public ServletInputStream getInputStream(){
        byte[] bytes = new byte[0];
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

        return new ServletInputStream() {
            @Override
            public boolean isFinished() {
                return byteArrayInputStream.read() == -1 ? true:false;
            }

            @Override
            public boolean isReady() {
                return false;
            }

            @Override
            public void setReadListener(ReadListener readListener) {

            }

            @Override
            public int read(){
                return byteArrayInputStream.read();
            }
        };
    }
}
