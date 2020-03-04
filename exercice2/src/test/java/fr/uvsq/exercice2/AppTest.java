package fr.uvsq.exercice2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    

    /**
     * @return the suite of tests being tested
     */
   @Test
    public void test()
    {
        Vendeur v= new Vendeur(10);
        Employe e= new Employe(2010);
        Vendeur v2= new Vendeur(20);
        Employe e2= new Employe(2005);
        Manager m= new Manager(20);
        ArrayList<AllEmploye> listEmploye= new ArrayList<AllEmploye>();
        listEmploye.add(e);
        listEmploye.add(e2);
        listEmploye.add(v);
        listEmploye.add(v2);
        listEmploye.add(m);
        double saliareTotal=0;
        for(int i=0; i<listEmploye.size();i++) {
        	saliareTotal+=listEmploye.get(i).salaire();
        }
        System.out.println("Salaire total:  "+saliareTotal);
  
        
    }
}
