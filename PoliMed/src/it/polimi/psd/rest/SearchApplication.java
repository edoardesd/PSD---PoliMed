package it.polimi.psd.rest;

import java.util.ArrayList;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/PoliMed/cerca_farmaco/search/*")
public class SearchApplication extends Application{
	public ArrayList<String> db = new ArrayList<String>(); // crea finto db con un array list

}
