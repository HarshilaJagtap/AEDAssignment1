
package com.aed.model;

import com.aed.view.MainFrame;
import java.awt.Image;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author yashpawar
 */
public class Employee {
    //https://www.javatpoint.com/java-regex
	//Use Exception classes and create a code which provides validations
	
       public static void main(String[] args) {
        new MainFrame().setVisible(true);
    }
    
	private String Name;
	private int EmployeeID;
	private int Age;
	private String Gender; // can be enum// can be boolean
	private String Start_date;
	private String Level; // can be int on use cases
	private String Team_info;
	private String Position_title;
	private Contact_Info contact_Info;
	private Image photo;
	/*
	 * URL iconURL = new URL(""); // iconURL is null when not found ImageIcon icon =
	 * new ImageIcon(iconURL); Image i = icon.getImage();
	 */

    /**
     *
     * @param args
     */

	public Employee(int employeeID,String name, int age, String gender, String start_date, String level,
			String team_info, String position_title, Contact_Info contact_Info) {
		super();
		this.EmployeeID = employeeID;
		this.Name = name;
		this.Age = age;
		this.Gender = gender;
		this.Start_date = start_date;
		this.Level = level;
		this.Team_info = team_info;
		this.Position_title = position_title;
		this.contact_Info = contact_Info;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getStart_date() {
		return Start_date;
	}

	public void setStart_date(String start_date) {
		Start_date = start_date;
	}

	public String getLevel() {
		return Level;
	}

	public void setLevel(String level) {
		Level = level;
	}

	public String getTeam_info() {
		return Team_info;
	}

	public void setTeam_info(String team_info) {
		Team_info = team_info;
	}

	public String getPosition_title() {
		return Position_title;
	}

	public void setPosition_title(String position_title) {
		Position_title = position_title;
	}

	public Contact_Info getContact_Info() {
		return contact_Info;
	}

	public void setContact_Info(Contact_Info contact_Info) {
		this.contact_Info = contact_Info;
	}

	public Image getPhoto() {
		return photo;
	}

	public void setPhoto(Image photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", EmployeeID=" + EmployeeID + ", Age=" + Age + ", Gender=" + Gender
				+ ", Start_date=" + Start_date + ", Level=" + Level + ", Team_info=" + Team_info + ", Position_title="
				+ Position_title + ", contact_Info=" + contact_Info + ", photo=" + photo + "]";
	}
        
     
}
