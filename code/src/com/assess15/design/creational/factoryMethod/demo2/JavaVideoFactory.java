package com.assess15.design.creational.factoryMethod.demo2;

public class JavaVideoFactory extends VideoFactory {
    @Override
    Video getVideo() {
        return new JavaVideo();
    }
}
