package com.ajc;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Entry {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("training");
    }

}
