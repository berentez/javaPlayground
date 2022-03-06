package com.berentez;

public class CodingHours {
    public static void main(String[] args) {

        final byte HOURS = 6;
        final byte SEMESTER = 17;
        final byte WORKDAYS = 5;
        final byte WORKHOURS = 52;

        int codeHours = HOURS * WORKDAYS * SEMESTER;
        int workHours = WORKHOURS * SEMESTER;
        short percent = (short)(100 / (double)workHours * (double)codeHours );

        System.out.println( percent+"%" );

    }
}