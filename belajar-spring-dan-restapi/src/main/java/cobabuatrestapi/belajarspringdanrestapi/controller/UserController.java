package cobabuatrestapi.belajarspringdanrestapi.controller;

import cobabuatrestapi.belajarspringdanrestapi.model.User;
import cobabuatrestapi.belajarspringdanrestapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepo;

//    Ambil semua data user
    @GetMapping("/")
    public List<User> all()
    {
        return userRepo.findAll();
    }

//    Membuat data baru
    @PostMapping("/")
    public User add(@RequestParam("first_name") String firstname, @RequestParam("last_name") String lastname, @RequestParam("address") String address ){

        User user = new User();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setAddress(address);

        return userRepo.save(user);
    }

//    Mengubah data
    @PutMapping("/{id}")
    public User update(@PathVariable("id") Long id, @RequestParam("first_name") String firstname, @RequestParam("last_name") String lastname, @RequestParam("address") String address ){
        User user = new User();
        user.setId(id);
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setAddress(address);

        return userRepo.save(user);
    }

//    Menghapus data
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id)
    {
        User user = new User();
        user.setId(id);

        userRepo.delete(user);
    }

//    Mengambil satu data user
    @GetMapping("/{id}")
    public Optional<User> find(@PathVariable("id") Long id)
    {
        return userRepo.findById(id);
    }
}
