package com.adp3.controller.standalone;
import com.adp3.entity.standalone.Timekeeping;
import com.adp3.factory.standalone.TimekeepingFactory;
import junit.framework.TestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

public class TimekeepingControllerTest extends TestCase {

    private Timekeeping timekeeping =
            TimekeepingFactory.buildTimekeepingService(1800,1000,"LM1234567890");

    @Autowired
    private TestRestTemplate restTemplate;
    private  String timekeepingUrl = "http://localhost:8080/timekeeping/";



    public void testGetAll() {
        String urlGet = timekeepingUrl + "getAll " ;
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(urlGet, HttpMethod.GET, entity, String.class);
        assertNotNull(responseEntity);
    }

    public void testCreate() {
        String urlCreate = timekeepingUrl + "create ";
        ResponseEntity<Timekeeping> storeResponseEntity = restTemplate.postForEntity(urlCreate, timekeeping, Timekeeping.class);
        assertNotNull(storeResponseEntity);
        assertNotNull(storeResponseEntity.getBody());
        timekeeping = storeResponseEntity.getBody();
        assertEquals(timekeeping.getempID(), storeResponseEntity.getBody().getempID());
        assertEquals(timekeeping.getTime_In(), storeResponseEntity.getBody().getTime_In());
        assertEquals(timekeeping.getTime_Out(), storeResponseEntity.getBody().getTime_Out());
    }

    public void testRead() {
        String url = timekeepingUrl + "read" + timekeeping.getempID();
        ResponseEntity<Timekeeping> leaveResponseEntity = restTemplate.getForEntity(url, Timekeeping.class);
        assertNotNull(leaveResponseEntity);
        assertNotNull(leaveResponseEntity.getBody());
            }

    public void testUpdate() {
        Timekeeping updated  = new Timekeeping.Builder().copy(timekeeping).setEmployee_id("12hugh23").setTime_In(1800).setTime_Out(1000).build();
        String url = timekeepingUrl + " updated ";
        ResponseEntity<Timekeeping> ResponseEntity = restTemplate.postForEntity(url,updated, Timekeeping.class);
        assertNotNull(ResponseEntity);
        assertNotNull(updated);
    }

    public void testDelete() {
        String urlDel = timekeepingUrl + " Delete " + timekeeping.getempID();
        restTemplate.delete(urlDel);
        System.out.println("Timesheet data deleted ");
    }
}