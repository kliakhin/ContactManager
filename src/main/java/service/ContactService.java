package service;

import domain.Contact;

import java.util.List;

/**
 * Created by Kliakhin Yevgen on 03/18/16.
 */
public interface ContactService {

    void addContact(Contact contact);

    List<Contact> listContact();

    void removeContact(Integer id);
}
