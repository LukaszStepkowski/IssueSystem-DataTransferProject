package sda.issuesystem.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class User implements Serializable {

    private String id;
    private String name;
    private String surname;
    private int age;
    private String address;
    private String city;
    private String login;
    private String password;
    private LocalDate creationDate;
    private LocalDate modificationDate;
    private LocalDate passwordExpirationDate;
    private int status;

    public User(UserBuilder builder) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.city = city;
        this.login = login;
        this.password = password;
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
        this.passwordExpirationDate = passwordExpirationDate;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public LocalDate getModificationDate() {
        return modificationDate;
    }

    public LocalDate getPasswordExpirationDate() {
        return passwordExpirationDate;
    }

    public int getStatus() {
        return status;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setModificationDate(LocalDate modificationDate) {
        this.modificationDate = modificationDate;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID: '" + id + '\'' +
                ", Name: '" + name + '\'' +
                ", Surname: '" + surname + '\'' +
                ", Age: " + age +
                ", Address: '" + address + '\'' +
                ", City: '" + city + '\'' +
                ", Login: '" + login + '\'' +
                ", Creation Date: " + creationDate +
                ", Modification Date: " + modificationDate +
                ", Password Expiration Date: " + passwordExpirationDate +
                ", Status: " + status +
                '}';
    }

    public static class UserBuilder {
        private String id;
        private String name;
        private String surname;
        private int age;
        private String address;
        private String city;
        private String login;
        private String password;
        private LocalDate creationDate;
        private LocalDate modificationDate;
        private LocalDate passwordExpirationDate;
        private int status;

        public UserBuilder () {
            this.creationDate = LocalDate.now();
            this.modificationDate = LocalDate.now();
            this.passwordExpirationDate = creationDate.plusMonths(1);
            this.status = 1;
        }

        public UserBuilder setID(String id) {
            this.id = id;
            return this;
        }

        public UserBuilder setName(String name){
            this.name = name;
            return this;
        }

        public UserBuilder setSurname(String surname){
            this.surname = surname;
            return this;
        }

        public UserBuilder setLogin(String login){
            this.login = login;
            return this;
        }

        public UserBuilder setPassword(String password){
            this.password = password;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setAddress(String address){
            this.address = address;
            return this;
        }

        public UserBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    public static UserBuilder builder(){
        return new UserBuilder();
    }
}
