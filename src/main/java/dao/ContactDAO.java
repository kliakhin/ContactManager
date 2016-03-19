package dao;

import domain.Contact;

import java.util.List;

/**
 * Created by Kliakhin Yevgen on 03/18/16.
 */
public interface ContactDAO {

    void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);
}
