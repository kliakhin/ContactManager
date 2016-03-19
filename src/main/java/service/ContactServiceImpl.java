package service;

import dao.ContactDAO;
import domain.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Kliakhin Yevgen on 03/18/16.
 */

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDAO contactDAO;

    @Transactional
    public void addContact(Contact contact) {
        contactDAO.addContact(contact);
    }

    @Transactional
    public List<Contact> listContact() {

        return contactDAO.listContact();
    }

    @Transactional
    public void removeContact(Integer id) {
        contactDAO.removeContact(id);
    }
}