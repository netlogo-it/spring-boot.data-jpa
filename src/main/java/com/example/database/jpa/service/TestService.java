package com.example.database.jpa.service;

import com.example.database.jpa.model.beans.*;
import com.example.database.jpa.repository.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService {

    @Autowired
    TestRepository testRepository;

    @Autowired
    Stato_richiestaRepository stato_richiestaRepository;

    @Autowired
    RuoloRepository ruoloRepository;

    @Autowired
    Ruolo2Repository ruolo2Repository;

    @Autowired
    EnteRepository enteRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ElementoRepository elementoRepository;

    @Autowired
    ElementoSecondoRepository elementoSecondoRepository;

    @Transactional(readOnly = true)
    public List<Test> list() {
        return testRepository.findAll();
    }

    @Transactional(rollbackFor = Exception.class)
    public void setup() {
        Stato_richiesta stato_richiesta = new Stato_richiesta();
        stato_richiesta.setStato("STATO 1");
        stato_richiestaRepository.save(stato_richiesta);

        Ruolo2 ruolo2 = new Ruolo2();
        ruolo2.setRuolo2("RUOLO B");
        ruolo2Repository.save(ruolo2);

        EnteInfo enteInfo = new EnteInfo();
        enteInfo.setInfo("INFO");

        Ente ente = new Ente();
        ente.setComune("TITO");
        ente.setEnteInfo(enteInfo);
        enteRepository.save(ente);

        User user = new User();
        user.setUsername("XXX");
        user.setPassword("12345678");
        userRepository.save(user);

        Elemento elemento = new Elemento();
        elemento.setElemento("Elemento 1");
        elementoRepository.save(elemento);

        ElementoSecondo elementoSecondo = new ElementoSecondo();
        elementoSecondo.setElemento("Elemento-secondo 1");
        elementoSecondoRepository.save(elementoSecondo);

        elementoSecondo = new ElementoSecondo();
        elementoSecondo.setElemento("Elemento-secondo 2");
        elementoSecondoRepository.save(elementoSecondo);

        Test test = new Test();
        test.setElemento(elemento);
        test.setDescrizione("Descrizione 1");
        test.setFlag(true);
        test.setGiorno(new Date());
        test.setGiorno2(new Date());
        test.setIntero(545);
        test.setOrario(new Time(new Date().getTime()));
        test.setPrezzo(23.0);
        test.setPrezzo2(new BigDecimal(10.24));
        test.setSesso("M");
        test.setEnte(ente);
        testRepository.save(test);

        elemento = new Elemento();
        elemento.setElemento("Elemento 2");
        elementoRepository.save(elemento);

        test = new Test();
        test.setElemento(elemento);
        test.setDescrizione("Descrizione 2");
        test.setFlag(false);
        test.setGiorno(new Date());
        test.setGiorno2(new Date());
        test.setIntero(123);
        test.setOrario(new Time(new Date().getTime()));
        test.setPrezzo(11.0);
        test.setPrezzo2(new BigDecimal(99.77));
        test.setSesso("F");
        test.setEnte(ente);
        testRepository.save(test);
    }

    @Transactional(readOnly = true)
    public List<Test> selectTestFromDate(Date data) {
        return testRepository.selectTestFromDate(data);
    }

    @Transactional(readOnly = true)
    public List<Test> selectTestFromDate2(Date data) {
        return testRepository.selectTestFromDate2(data);
    }

    @Transactional(readOnly = true)
    public Integer sumId(Long id) {
        return testRepository.sumId(id);
    }

    @Transactional(rollbackFor = Exception.class)
    public void updateTest(Long id, Integer num) {
        testRepository.updateTest(id, num);
    }

    @Transactional(readOnly = true)
    public Test get(Long id) {
        return testRepository.findById(id).get();
    }

}
