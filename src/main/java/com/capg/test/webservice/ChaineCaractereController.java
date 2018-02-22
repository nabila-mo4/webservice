package com.capg.test.webservice;

import java.util.concurrent.atomic.AtomicLong;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import cucumber.api.java.en.When;

@RestController
public class ChaineCaractereController {

    private static final String template = "";
    private final AtomicLong counter = new AtomicLong();
    
    
    @RequestMapping(value="/")
	public ModelAndView saisirchaine(){
    	 System.out.println("Saisissez votre chaine de caracteres");
    	 String chaine = System.console().readLine();
		if(chaine.equals("YES_I_CAN"))
		{
			return new ModelAndView("redirect:/chaineune");	
		}
		else
		{
			return new ModelAndView("redirect:/chainedeux");
		
		}
		
	                                   }
    @When("ton envoies la chaine « YES_I_CAN »")
    @RequestMapping("/chaineune")
    public ChaineCaractere chaineune()
    {
    	
        return new ChaineCaractere(counter.incrementAndGet(),
                            String.format(template, "YES_I_CAN_AND_DID_IT"));
    }
    
    @When("tu envoies une chaine nulle")
    @RequestMapping("/chaindeux")
    public ChaineCaractere chainedeux() 
    {
        return new ChaineCaractere(counter.incrementAndGet(),
                            String.format(template, "NOTHING_TO_SAY "));
    }
}
