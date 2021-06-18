package com.example.database.jpa;

import com.example.database.jpa.model.beans.*;
import com.example.database.jpa.service.*;

import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    @Autowired
    TestService testService;

    @Autowired
    Stato_richiestaService stato_richiestaService;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.setLogStartupInfo(false);
        app.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("Start application...");
        testService.setup();
        Stato_richiesta stato_richiesta = stato_richiestaService.findByStato();
        LOGGER.info("**********************************");
        LOGGER.info("STATO_RICHIESTA=" + stato_richiesta.getId() + " " + stato_richiesta.getStato());
        LOGGER.info("**********************************");
        List<Test> listTest = testService.list();
        Test testThis = null;
        LOGGER.info("*********** QUERY 1 ************** " + listTest.size());
        for (Test test : listTest) {
            testThis = test;
            LOGGER.info("TEST=" + test.getDescrizione() + " ID=" + test.getId());
            LOGGER.info("**********************************");
        }
        listTest = testService.selectTestFromDate(testThis.getCreate_date());
        LOGGER.info("*********** QUERY 2 ************* " + listTest.size());
        for (Test test : listTest) {
            LOGGER.info("TEST=" + test.getDescrizione() + " ID=" + test.getId());
            LOGGER.info("**********************************");
        }
        listTest = testService.selectTestFromDate2(testThis.getCreate_date());
        LOGGER.info("*********** QUERY 3 ************* " + listTest.size());
        for (Test test : listTest) {
            LOGGER.info("TEST=" + test.getDescrizione() + " ID=" + test.getId());
            LOGGER.info("**********************************");
        }

        Integer somma1 = testService.sumId(0L);
        Integer somma2 = testService.sumId(1L);
        LOGGER.info("*********** QUERY 4 **************");
        LOGGER.info("somma1=" + somma1 + " somma2=" + somma2);
        LOGGER.info("**********************************");

        LOGGER.info("*********** QUERY 5 **************");
        Test test = testService.get(1L);
        LOGGER.info("Test id=1 intero=" + test.getIntero());
        Integer intero = Math.abs(new Random().nextInt() % 10);
        testService.updateTest(1L, intero);
        test = testService.get(1L);
        LOGGER.info("Test id=1 intero=" + test.getIntero());
        LOGGER.info("**********************************");
        System.exit(0);
    }

}
