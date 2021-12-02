package ru.eugenev.springcoursemvc;

import org.springframework.stereotype.Component;
import ru.eugenev.springcoursemvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

@Component
public class Employee {
    @Size(min=2, message = "Name length must be 2 or longer")
    private String name;
    @NotBlank(message = "This field is empty")
    private String surname;
    @Min(value = 500, message = "Must be greater than 499")
    @Max(value = 200000, message = "Must be less than 200000")
    private int salary;
    @CheckEmail
    private String email;
    private String department;
    private Map<String, String> departments;
    private String car;
    private String[] languages;
    private Map<String, String> availableLanguages;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT","Information Technology");
        departments.put("Sc","Security");
        departments.put("HR","Human Resources");
        departments.put("Sales", "Sales");
        availableLanguages = new HashMap<>();
        availableLanguages.put("English","English");
        availableLanguages.put("German","German");
        availableLanguages.put("French","French");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getAvailableLanguages() {
        return availableLanguages;
    }

    public void setAvailableLanguages(Map<String, String> availableLanguages) {
        this.availableLanguages = availableLanguages;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
