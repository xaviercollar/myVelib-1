package myVelib;

import java.util.ArrayList;

/**
 * Classe Reseau permettant de rassembler la liste des stations, la liste des utilisateurs, la liste des locations
 * afin de permettre de faire les statistiques et d'acceder � diverses informations
 * @author xavier
 *
 */
public class Reseau {
	/**
	 * La classe reseau est constitu�e de 3 attributs, une ArrayList de Station nomm�e stationList, une ArrayList de User nomm�e userList
	 * et une ArrayList de Location nomm�e locationList
	 */
	protected ArrayList<Station> stationList;
	protected ArrayList<User> userList;
	protected ArrayList<Location> locationList;
	
	public Reseau(ArrayList<Station> stationList, ArrayList<User> userList, ArrayList<Location> locationList) {
		super();
		this.stationList = stationList;
		this.userList = userList;
		this.locationList = locationList;
		Location.initializeLocation(this);
	}
	
	public Reseau() {
		super();
		this.stationList = new ArrayList<Station>();
		this.userList = new ArrayList<User>();
		this.locationList = new ArrayList<Location>();
		Location.initializeLocation(this);
	}
	public ArrayList<Station> getStationList() {
		return stationList;
	}
	public ArrayList<User> getUserList() {
		return userList;
	}
	public ArrayList<Location> getLocationList() {
		return locationList;
	}
	
	public void addStation(Station station) {
		stationList.add(station);
	}
	
	public void addUser(User user) {
		userList.add(user);
	}
	
	public void addLocation(Location loc) {
		locationList.add(loc);
	}
	
	public void removeStation(Station station) {
		stationList.remove(station);
	}
	
	public void removeUser(User user) {
		userList.remove(user);
	}
	
	public void removeLocation(Location loc) {
		locationList.remove(loc);
	}

	@Override
	public String toString() {
		return "Reseau [stationList=" + stationList + ", userList=" + userList + ", locationList=" + locationList + "]";
	}
	
	
}
