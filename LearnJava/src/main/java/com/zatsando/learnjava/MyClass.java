package com.zatsando.learnjava;

public class MyClass {

    public static void main(String[] args) {

        Microphone microphone = new Microphone("Blue Yeti", "Blue", 133543);

        Microphone gHMic = new Microphone("GHZB", "red", 465);
        microphone.setName("87");
        microphone.setColor("blue");
        microphone.setModel(134);

        System.out.println("new mic "+microphone.getModel());

        System.out.println(microphone.showDescription());

        Microphone newMic = new Microphone("new mic", "green", 123);

        Microphone otherMic = new Microphone();
        otherMic.setColor("blue");
        otherMic.setModel(123412);
        otherMic.setName("ablabla");

        Microphone grandMic = new Microphone("grand","yellow");

    }
}
