package fmi.informatics.gui;

import javax.swing.table.AbstractTableModel;

import fmi.informatics.extending.Person;


// Suzdavame class PersonInfo
public class PersonInfo extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	
	private Person[] people;

	// constructor
	public PersonInfo(Person[] people) {
		this.people = people;
	}

	@Override
	public int getColumnCount() {
		return 10; // broi koloni v tablicata
	}

	@Override
	public int getRowCount() {
		return people.length; // broi redove v tablicata
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
			case 0:
				return people[rowIndex].getName();
				
			case 1:
				return people[rowIndex].getEgn();
				
			case 2:
				return people[rowIndex].getAge();
				
			case 3:
				return people[rowIndex].getSpeciality();
				
			case 4:
				return people[rowIndex].getFacNum();
				
				
			case 5:
				return people[rowIndex].getUniversity();
				
				
			case 6:
				return people[rowIndex].getTitle();
				
			case 7: 
				return people[rowIndex].getType();
				
			case 8: 
				return people[rowIndex].getWeight();
				
			case 9: 
				return people[rowIndex].getHeight();
				
		}
		return null;
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
			case 0:
				return "Ime";
				
			case 1:
				return "EGN";
				
			case 2:
				return "Vuzrast";
				
			case 3:
				return "Specialnost";
				
			case 4:
				return "Fac-№";
				
			case 5:
				return "Universitet";
				
			case 6:
				return "Titla";
				
			case 7:
				return "Tip";
				
			case 8:
				return "Teglo";
				
			case 9:
				return "Visochina";
				
	
			default:
				return super.getColumnName(column);
		}
	}
}
