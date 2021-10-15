package com.jeet.example2;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;


@Builder
@Slf4j
public class SayHello {

    int a;

    public void hello()
    {
        System.out.println("Hello");
        log.info("Hello from lombok slf4j config");
    }
}
