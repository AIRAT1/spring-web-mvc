package de.controllers;

import de.dao.UsersDao;
import de.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class UsersController {
    @Autowired
    private UsersDao usersDao;

    @RequestMapping(path = "/users", method = RequestMethod.GET) {
        public ModelAndView getAllUsers() {
            List<User> users = usersDao.findAll();
            ModelAndView modelAndView = new ModelAndView("users");
            modelAndView.addObject("userSFromServer", users);
            return modelAndView;
        }
    }
}
