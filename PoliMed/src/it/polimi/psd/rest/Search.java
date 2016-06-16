package it.polimi.psd.rest;

import it.polimi.psd.database.DataBase;
import it.polimi.psd.database.Drug;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/")
public class Search {
	
	Drug drugOrder;
	
	@POST
	  @Produces(MediaType.TEXT_HTML)
	  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	  public String output(@FormParam("drug") String drug, @FormParam("quantity") int quantity,
	      @Context HttpServletResponse servletResponse) throws IOException {
		
		drugOrder = new Drug();
		drugOrder.setName(drug);
		drugOrder.setQuantity(quantity);
		drugOrder.setTrackingNumber(DataBase.getTrackingNumber());
		DataBase.addDrug(drugOrder);
		
		 return "<html><body><h1>You have ordered " +drugOrder.getQuantity()+ " package(s) of " +drugOrder.getName()+ ".</h1>"
		 		+ "<h2>Your tracking number is: "+drugOrder.getTrackingNumber()+". Remind it!</h2>"
		 		+generateHomeButton() + generateBackButton() + generateImage()
		 		+ "</body></html>";
	  }


private String generateHomeButton(){
	return "<form action="+"/PoliMed/"+"> <input type="+"submit"+" value="+"Home"+"></form>";
}

private String generateBackButton(){
	return "<form action="+"/PoliMed/cerca_farmaco.jsp"+"><input type="+"submit"+" value="+"Back"+"></form>";
}

private String generateImage(){
	return "<img src="+"https://www.ausl.bologna.it/pro/c-e/gestione-del-farmaco-sperimentale/images/logistica.jpg?isImage=1"+" alt="+"logistic_image" +"width="+"128"+" height="+"128"+">";
}

}
