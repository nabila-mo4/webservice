package com.capg.test.webservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;

import cucumber.api.java.en.When;

public class StepDef extends ApplicationTest {
	 private static final String template = "";
	 private final AtomicLong counter = new AtomicLong();
	
	@When("ton envoies la chaine « YES_I_CAN »")
    @RequestMapping("/chaineune")
    public ChaineCaractere chaineune () throws Throwable
    {
    	
        return new ChaineCaractere(counter.incrementAndGet(),
                            String.format(template, "YES_I_CAN_AND_DID_IT"));
    }
    
    @When("tu envoies une chaine nulle")
    @RequestMapping("/chaindeux")
    public ChaineCaractere chainedeux() throws Throwable
    {
        return new ChaineCaractere(counter.incrementAndGet(),
                            String.format(template, "NOTHING_TO_SAY "));
    }

}
