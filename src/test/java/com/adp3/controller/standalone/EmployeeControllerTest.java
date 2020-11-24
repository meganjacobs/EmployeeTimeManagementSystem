package com.adp3.controller.standalone;

import com.adp3.entity.standalone.Employee;
import com.adp3.factory.standalone.EmployeeFactory;
import com.adp3.service.standalone.EmployeeService;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
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

import static org.junit.Assert.assertEquals;
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

    private Employee employee =  EmployeeFactory.createEmployee("New Malusi", "Pakade", "021 543 9876", new Date(1986, 00, 12));

    @Autowired
    private TestRestTemplate restTemplate;
    private  String baseUrl = "http://localhost:8080/employee/";
    private static  String SECURITY_USERNAME = "Super";
    private static  String SECURITY_PASSWORD = "Password.ADP3";


    @Test
    public void d_getAll() {
        String url = baseUrl + "all";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
       // ResponseEntity<String> response = restTemplate

        ResponseEntity<String> response = restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .exchange(url, HttpMethod.GET, entity, String.class);

        System.out.println("Get All Test: ");
        System.out.println(response.getBody());
    }

    @Test
    public void a_create() {
        String url = baseUrl + "create";
        ResponseEntity<Employee> reesponse = restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .postForEntity(url, employee, Employee.class);

        assertNotNull(reesponse);
        assertNotNull(reesponse.getBody());
        employee = reesponse.getBody();
        System.out.println("Create Test: " + employee );
        assertEquals( employee.getEmpID(), reesponse.getBody().getEmpID());

    }

    @Test
    public void b_read() {
        String url = baseUrl + "read/" + employee.getEmpID();

        ResponseEntity<Employee> response = restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .getForEntity(url, Employee.class);

                //exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("Read Test: ");
        System.out.println(response.getBody());

    }

    @Test
    public void c_update() {
        String url = baseUrl + "update";

        Employee employeeUpdate = new Employee.Builder().copy(employee).setEmpLastName("Gigaba").setEmpPhoneNumber("0719876543").build();
        ResponseEntity<Employee> response = restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .postForEntity(url, employeeUpdate, Employee.class);

        System.out.println("Updated Test: ");
        System.out.println(employeeUpdate);
    }

    @Test
    public void e_delete() {
        String url = baseUrl + "delete/" + employee.getEmpID();

        restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .delete(url);
        System.out.println("Deleted Employee");
    }

}
