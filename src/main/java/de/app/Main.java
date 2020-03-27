package de.app;

import de.dao.UsersDao;
import de.dao.UsersDaoJdbcTemplateImpl;
import de.models.User;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/fix_user_db");

        UsersDao usersDao = new UsersDaoJdbcTemplateImpl(dataSource);
        List<User> users = usersDao.findAll();

//        for (User user : users) {
//            System.out.println(user.getFirstName() + " " + user.getLastName());
//        }

        System.out.println(users);
    }
}
