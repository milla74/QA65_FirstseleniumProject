package com.demowebshop.utils;

import com.demowebshop.models.Contact;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {
//
//    @DataProvider
//    public Iterator<Object[]> addNewContact() {
//        List<Object[]> list = new ArrayList<>();
//        list.add(new Object[]{"Lara", "Buch", "01234567890", "Lara@vail.com", "Nürnberg", "QA"});
//        list.add(new Object[]{"Nadya", "Buch", "012345678990", "Lara1@vail.com", "Nürnberg", "QA"});
//        list.add(new Object[]{"Tanya", "Buch", "0123456789901", "Lara2@vail.com", "Nürnberg", "QA"});
//        return list.iterator();
//    }

    @DataProvider
    public Iterator<Object[]> addNewContactWithCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/Contact.csv")));

        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",");

            list.add(new Object[]{new Contact()
                    .setGender(split[0])
                    .setFirsName(split[1])
                    .setLastName(split[2])
                    .setEmail(split[3])
                    .setPassword(split[4])
                    .setConfirmPassword(split[5])});

                    line = reader.readLine();
        }
        return list.iterator();
    }
}
