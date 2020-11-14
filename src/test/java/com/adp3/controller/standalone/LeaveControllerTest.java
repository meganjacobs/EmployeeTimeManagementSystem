package com.adp3.controller.standalone;

import com.adp3.entity.standalone.Leave;
import com.adp3.factory.standalone.LeaveFactory;
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

import static org.junit.Assert.*;
@SpringBootTest (webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LeaveControllerTest {

    @Autowired
    TestRestTemplate leaveRestTemplate;
    ResponseEntity leaveReponseEntity;
    Leave leave = LeaveFactory.createLeave("sick");
    private String baseURL = "http://localhost:8080/employee_time_management/leave/";

    @Test
    public void a_create() {
        leaveReponseEntity = leaveRestTemplate.withBasicAuth("Super", "Password.ADP3").postForEntity(baseURL+"create/",leave,Leave.class);
        System.out.println("create" + leaveReponseEntity.getBody());
    }

    @Test
    public void b_read() {
        leaveReponseEntity = leaveRestTemplate.withBasicAuth("Super", "Password.ADP3").getForEntity(baseURL+"read/"+ (leave.getLeaveID()),Leave.class);
        System.out.println("read" + leaveReponseEntity.getBody());
    }

    @Test
    public void c_update() {
        if (leave.getLeaveID()!=null) {
            Leave updatedLeave = new Leave.Builder().copy(leave).setLeaveDescription("unpaid-annual").build();
            leaveRestTemplate.withBasicAuth("Super", "Password.ADP3")
                    .put(baseURL + "update/" + "updated" , updatedLeave);
        System.out.println("update" + updatedLeave);}
        else System.out.println("leave = null");
    }

    @Test
    public void e_delete() {
        leaveRestTemplate.withBasicAuth("Super", "Password.ADP3").delete(baseURL+"delete/"+leave.getLeaveID());
        System.out.println("deleted" + leave);
    }

    @Test
    public void d_getAll() {
        HttpHeaders leaveHeader = new HttpHeaders();
        HttpEntity leaveEntity = new HttpEntity(null,leaveHeader);
        ResponseEntity stringReponseEntity = leaveRestTemplate.withBasicAuth("Super", "Password.ADP3").exchange(baseURL+"all/", HttpMethod.GET, leaveEntity,String.class);
        System.out.println("all" + stringReponseEntity.getBody());
    }
}