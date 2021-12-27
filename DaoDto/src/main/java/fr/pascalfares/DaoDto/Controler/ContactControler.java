package fr.pascalfares.DaoDto.Controler;

import fr.pascalfares.DaoDto.DTO.Contact;
import fr.pascalfares.DaoDto.Repository.BDContacts;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Pascal Fares
 */
@RestController
public class ContactControler {

    @Autowired
    BDContacts bdContacts;

    @GetMapping("/uncontact")
    public Contact getUnContact() {
        return new Contact("Exemple", "exemple@pascal-fares.fr");
    }

    @PostMapping("/uncontact")
    public Contact postUnContact(@RequestBody Contact unc) {
        return unc;
    }

    @GetMapping("/contacts")
    public List<Contact> getContacts() {
        return bdContacts.getAll();
    }

    @PostMapping("/addcontact")
    public List<Contact> postAddContact(@RequestBody Contact unc) {
        bdContacts.save(unc);      
        return bdContacts.getAll();
    }
}
