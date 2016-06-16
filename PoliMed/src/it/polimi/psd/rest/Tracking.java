package it.polimi.psd.rest;

import it.polimi.psd.database.Addresses;
import it.polimi.psd.database.DataBase;
import it.polimi.psd.database.Drug;

import java.io.IOException;
import java.util.Random;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/")
public class Tracking {
	
	static final int MAX_RAND_TEMP = 35;
	static final int MIN_RAND_TEMP = -15;
	static final int MAX_TEMP = 30;
	static final int MIN_TEMP = -10;

	int intTracking;
	int temp;
	boolean status;
	Drug myDrug = new Drug();
	Addresses myAddress;
	

	@GET
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String output(@FormParam("tracking") String tracking,
			@Context HttpServletResponse servletResponse) throws IOException {

		intTracking = Integer.parseInt(tracking);
		status = checkOrder(intTracking);
		return stringGenerator(status);
	}


	private String stringGenerator(boolean status) {
		if (status) {
				
				myDrug = findOrder(intTracking);
			return "<html><body><h1>Order n&deg: " +myDrug.getTrackingNumber()+ " </h1><h2>Details <br>"
					+ addressGenerator()
					+ temperatureGenerator() + "</h2>" + "<h3>The package will arrive before the end of the day.</h3> <br>"
					+ generateHomeButton() + generateBackButton() + generateImage()
					+"</body></html>";

		}	
		if (!status){
			return "<html><body><h1> Your order is not in our databases!</h1>"
					+generateBackButton()
					+"</body></html>";

		}
		return "<html><body><h1>Error, Something strange happened! O.O </h1></body></html>";
	}
	
	private String generateMap(Addresses myAddress) {
		String mapString = myAddress.getMap();
		return mapString;
	}


	private String addressGenerator(){
		myAddress = Addresses.getRandom();
		return "<br> Name: " + myDrug.getName()+" <br>Quantity: "+myDrug.getQuantity()
			+"<br>Location: " +myAddress.getCity()+ " - "+ myAddress.getStreet() +", " + myAddress.getCivicNumber()
			+ "<br>" + generateMap(myAddress);
	}
	
	private String temperatureGenerator(){
		temp = randTemp(MIN_RAND_TEMP,MAX_RAND_TEMP);
		return "<br>For this medicine the temperature must be between "+MIN_TEMP+ "&deg and " +MAX_TEMP +"&deg"
				+"<br>Actual temperature: " + temp +"&deg"+ checkTemperature(temp);
	}
	
	private String generateHomeButton(){
		return "<form action="+"/PoliMed/"+"> <input type="+"submit"+" value="+"Home"+"></form>";
	}
	
	private String generateBackButton(){
		return "<form action="+"/PoliMed/traccia_pacco.jsp"+"><input type="+"submit"+" value="+"Back"+"></form>";
	}
	
	private String generateImage(){
		return "<img src="+"https://www.ausl.bologna.it/pro/c-e/gestione-del-farmaco-sperimentale/images/logistica.jpg?isImage=1"+" alt="+"logistic_image" +"width="+"128"+" height="+"128"+">";
	}
	
	private Drug findOrder(int trackingNumber) {
		myDrug = DataBase.getDb().get(trackingNumber - 1);
		System.out.println(myDrug);
		return myDrug;
	}


	private boolean checkOrder(int numOrder) {
		if (DataBase.contains(DataBase.getDb(),numOrder)) {
			status = true;
		}
		else status = false;
		return status;
	}

	private String checkTemperature(int myTemp){
		if (myTemp > MAX_TEMP) return "<br>Temperature out of limits! It's so hot. WARNING!";
		if (myTemp < MIN_TEMP) return "<br>Temperature out of limits! It's so cold. WARNING!";
		return "<br>Everything is alright!";
	}
	
	private int randTemp(int min, int max) {
		Random rand = new Random();
		int randomTemp = rand.nextInt((max - min) + 1) + min;
		return randomTemp;
	}
	
	
}
