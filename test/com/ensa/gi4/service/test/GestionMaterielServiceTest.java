package com.ensa.gi4.service.test;

import beans.BeanConfig;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionMaterielService;
import com.ensa.gi4.service.impl.GestionMaterielServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GestionMaterielServiceTest {


    //  test methods go here
    private GestionMaterielService gestionMaterielService;
    private ApplicationContext APPLICATION_CONTEXT;

    public GestionMaterielServiceTest() {
    }

    @BeforeEach
    public void initGestionMaterielService()
    {
        //APPLICATION_CONTEXT = new ClassPathXmlApplicationContext("/beans/app-context.xml");
        /*
        APPLICATION_CONTEXT = new AnnotationConfigApplicationContext(GestionMaterielServiceTest.class);
        gestionMaterielService = APPLICATION_CONTEXT.getBean(GestionMaterielServiceImpl.class);
         */
    }


    @Test
    public void testgetMateriel() {
        // Arrange
        String nomChercher = "Moby Dick";

        // Act
        Materiel materielList = gestionMaterielService.getMateriel(nomChercher);

        // Assert
        assertEquals(null, materielList);
    }


    @AfterEach
    public void undefCalculator() {
        gestionMaterielService = null;
    }
}
