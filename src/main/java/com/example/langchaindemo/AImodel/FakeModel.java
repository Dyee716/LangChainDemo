package com.example.langchaindemo.AImodel;

import org.springframework.stereotype.Component;

public class FakeModel implements AImodel{
    @Override
    public String answer(String s) {
        return "this is a fake model for testing";
    }
}
