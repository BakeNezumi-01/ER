package com.example.ER.controller;

import com.example.ER.domain.Lesson;
import com.example.ER.domain.Student;
import com.example.ER.domain.User;
import com.example.ER.repositories.LessonRepository;
import com.example.ER.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
//@Controller
public class MainController {
    @PersistenceContext
    private EntityManager entityManager;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private LessonRepository lessonRepository;

    @GetMapping("/")
    public String home(Map<String, Object> model) {
        model.put("userList", userRepository.findAll());

        return "home";
    }

    @GetMapping("/lessons")
    public List<Lesson> schedule() {
        List<Lesson> list = lessonRepository.findAll();
        for(Lesson lesson : list) System.out.println(lesson);

        return lessonRepository.findAll();
    }


    @GetMapping("/schedule")
    public List<Lesson> schedule(String groupName) {
        return lessonRepository.findByGroupNameOrderByIdAsc(groupName);
    }

    @PostMapping("/")
    public String printUsers(String username){
        List<User> list = entityManager.createQuery(
                "from User u where u.username = '" + username + "'", User.class).getResultList();
        for(User user : list) System.out.println(user);
        System.out.println(1111);

        return "home";
    }

    @GetMapping("/registration")
    public String registration(Map<String, Object> model) {
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(Student student, Map<String, Object> model) {
        User userFromDb = userRepository.findByUsername(student.getUsername());
        if (userFromDb != null) {
            model.put("message", "User exists!");
            return "registration";
        }

        userRepository.save(student);
        return "/home";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

}
