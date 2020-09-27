package com.adp3.controller.standalone;

import com.adp3.entity.standalone.Employee;
import com.adp3.factory.standalone.EmployeeFactory;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.text.html.parser.Entity;
import java.util.Date;

import static org.junit.Assert.assertNotNull;
/**
 * @author Malusi Pakade
 * 209105917
 * desc: Employee Controller Test
 * 2020
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private  String baseUrl = "http://localhost:8080/employee/";
    private Employee employee =  EmployeeFactory.createEmployee("Malusi", "Pakade", "021 543 9876", new Date(1986, 00, 12));


    @Test
    public void d_getAll() {
        String url = baseUrl + "all";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("Get All Test: ");
        System.out.println(response.getBody());
    }

    @Test
    public void a_create() {
        String url = baseUrl + "create";
        ResponseEntity<Employee> postResponse = restTemplate.postForEntity(url, employee, Employee.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println("Create Test: ");
        System.out.println(postResponse.getBody());
    }

    @Test
    public void b_read() {
        String url = baseUrl + "read/" + employee.getEmpID();

        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("Read Test: ");
        System.out.println(response.getBody());

    }

    @Test
    public void c_update() {
        String url = baseUrl + "update";

        Employee employeeUpdate = new Employee.Builder().copy(employee).setEmpLastName("Gigaba").setEmpPhoneNumber("0719876543").build();
        ResponseEntity<Employee> postResponse = restTemplate.postForEntity(url, employeeUpdate, Employee.class);

        System.out.println("Updated Test: ");
        System.out.println(employeeUpdate);
    }

    @Test
    public void e_delete() {
        String url = baseUrl + "delete/" + employee.getEmpID();

        restTemplate.delete(url);
        System.out.println("Delete Test");
    }

}
