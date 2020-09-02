package com.adp3.repository.standalone.impl;



@RunWith(Arquillian.class)
public class TimekeepingServiceRepositoryImplTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(TimekeepingServiceRepositoryImpl.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @org.junit.Test
    public void getRepository() {
    }

    @org.junit.Test
    public void getAll() {
    }

    @org.junit.Test
    public void create() {
    }

    @org.junit.Test
    public void read() {
    }

    @org.junit.Test
    public void update() {
    }

    @org.junit.Test
    public void delete() {
    }
}
