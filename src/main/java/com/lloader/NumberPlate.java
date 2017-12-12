package com.lloader;

import java.util.Random;

public class NumberPlate implements Randomized, Comparable<NumberPlate> {
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private String region;
    private String number;
    private String prefix;
    private String postfix;

    public NumberPlate() {

    }


    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPostfix() {
        return postfix;
    }

    public void setPostfix(String postfix) {
        this.postfix = postfix;
    }

    public void randomize() {
        final Random random = new Random();
        String region = random.nextInt(200) + "";
        if(region.length() == 1) {
            region = "0" + region;
        }
        String number = random.nextInt(1000) + "";

        if(number.length() == 1) {
            number = "00" + number;
        } else if(number.length() == 2) {
            number = "0" + number;
        }

        final String prefix = alphabet.charAt(random.nextInt(alphabet.length())) + "";
        final String postfix =
                "" + alphabet.charAt(random.nextInt(alphabet.length())) +
                alphabet.charAt(random.nextInt(alphabet.length()));

        this.number = number;
        this.region = region;
        this.prefix = prefix;
        this.postfix = postfix;
    }

    @Override
    public String toString() {
        return prefix + number + postfix + " " + region + "RUS";
    }

    @Override
    public int compareTo(NumberPlate o) {
        return number.compareTo(o.number);
    }
}
