package com.notyficationsystem.NotyficationSystem.service;

import com.notyficationsystem.NotyficationSystem.model.Contact;
import com.notyficationsystem.NotyficationSystem.model.User;

import java.io.InputStream;

public interface CSVService {
    void importCSV(InputStream inputStream);
//    Contact parseContact(String CSVline);
//    Person parsePerson(String CSVline);
}
