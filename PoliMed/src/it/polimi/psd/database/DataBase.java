package it.polimi.psd.database;

import java.util.ArrayList;

/**
 * @author edoardesd
 *	Fake Database
 */
public class DataBase {
	private final static ArrayList<Drug> db = new ArrayList<>();

	static int trackingNumber = 1;

	public static void addDrug( Drug newDrug ) {
	      db.add(newDrug);
	      trackingNumber++;
	      System.out.println(db);
	   }
	   
	   public static ArrayList<Drug> getDb(){
		return db;
	   }

	public static StringBuilder stringBuilder() {
		StringBuilder sb = new StringBuilder();
		for (Drug s : db)
		{
		    sb.append(s);
		    sb.append("\t");
		}
	    System.out.println(sb.toString());
	    return sb;
		}
	   
	public static int getTrackingNumber() {
		return trackingNumber;
	}
	
	public static boolean contains(ArrayList<Drug> list, int number) {
	    for (Drug item : list) {
	        if (item.getTrackingNumber() == number) {
	            return true;
	        }
	    }
	    return false;
	}
	   
	}
