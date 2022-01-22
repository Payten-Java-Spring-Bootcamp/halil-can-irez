package com.halilcanirez.patika;



public enum Genre {
    ACTİON ("ACTİON"),
    ADVANTURE ("ADVANTURE"),
    ANİMATİON ("animation"),
    BIOGRPHY ("BIOGRPHY"),
    COMEDY ("COMEDY"),
    CRİME ("CRİME"),
    DOCUMENTRY ("DOCUMENTRY"),
    DRAMA ("DRAMA"),
    FAMİLY ("FAMİLY"),
    FANTASY ("FANTASY"),
    HISTORY ("HISTORY"),
    HORROR ("HORROR"),
    WAR ("WAR"),
    MUSİCAL ("MUSİCAL");

    private final String nameString;

    Genre(String nameString){
        this.nameString=nameString;
    }
}
