package com.example.ch1.di;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {
    public String sayHello(String userRealname){
        return  "hello" + userRealname;
    }
}
