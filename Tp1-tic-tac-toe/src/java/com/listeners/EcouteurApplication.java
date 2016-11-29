/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.listeners;

import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author moumene
 */
public class EcouteurApplication implements ServletContextListener {

    private void initialiserAttributs(ServletContext sc) {
        sc.setAttribute("listeJoueurs", new ArrayList());
        sc.setAttribute("listeInvitations", new ArrayList());
        sc.setAttribute("listeParties", new ArrayList());
    }
    
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Application demarree");
        ServletContext appli = sce.getServletContext();
        appli.setAttribute("nbConnectes", 0);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Application termin�e");
    }
    
}
