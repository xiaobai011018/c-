package com.bsc;

import sun.security.provider.ConfigFile;

enum Spiciness {
    NOT,
    MILD,
    MEDIUM,
    HOT,
    FLAMING
}
public class Note {
    public static void main(String[] args) {
        Spiciness sp = Spiciness.FLAMING;
        for (Spiciness s:Spiciness.values()) {
            System.out.println(s+",ordinal "+s.ordinal());
        }
        //System.out.println(sp);
        //System.out.println(Spiciness.values());
    }
}
