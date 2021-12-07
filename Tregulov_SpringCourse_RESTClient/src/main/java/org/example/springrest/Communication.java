package org.example.springrest;

import org.example.springrest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Component
public class Communication {
    private final String URL = "http://localhost:8080/springrest/api/employees";
    @Autowired
    private RestTemplate restTemplate;

    public List<Employee> getAllEmployees() {
        ResponseEntity<List<Employee>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET,
                null, new ParameterizedTypeReference<List<Employee>>() {});
        return responseEntity.getBody();
    }
    public Employee getEmployeeById(int id) {
        return restTemplate.getForObject(URL + "/" + id, Employee.class);
    }
    public void saveOrUpdateEmployee(Employee employee) {
        int id = employee.getId();
        if (id == 0) {
            ResponseEntity<String> responseEntity = restTemplate.postForEntity(URL, employee, String.class);
            System.out.println("New employee was added to Database");
        }
        else {
            restTemplate.put(URL, employee);
            System.out.println("Employee with id " + id + " was updated");
        }
    }
    public void deleteEmployee(int id) {
        restTemplate.delete(URL + "/" + id);
    }
}
