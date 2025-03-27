package co.edu.javeriana.wiki.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.javeriana.wiki.models.Contacto;
import co.edu.javeriana.wiki.repositories.ContactoRepository;

@Service
public class ContactoService {
    @Autowired
    ContactoRepository contactoRepository;

    public Contacto saveContact(Contacto contact) {
        return contactoRepository.save(contact);
    }
}
