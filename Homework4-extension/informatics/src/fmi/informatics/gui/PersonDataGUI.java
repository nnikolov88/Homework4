package fmi.informatics.gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import fmi.informatics.extending.Person;
import fmi.informatics.extending.Professor;
import fmi.informatics.extending.Student;

// Create class PersonDataGUI
public class PersonDataGUI {
	
	private static Person[] people;
	JTable table;
	PersonInfo personInfo;

	public static void main(String[] args) {
		getPeople();
		PersonDataGUI gui = new PersonDataGUI();
		gui.createAndShowGUI();
	}
	
	public static void getPeople() {
		people = new Person[10];
		
		for (int i = 0; i < 2; i++) {
			Person student = Student.StudentGenerator.make();
			people[i] = student;
		}
		
		for (int i = 2; i < 4; i++) {
			Person professor = Professor.ProfessorGenerator.make();
			people[i] = professor;
		}
		
		for (int i = 4; i < 6; i++) {
			Person student = Student.StudentGenerator.make();
			people[i] = student;
		}
		
		for (int i = 6; i < 8; i++) {
			Person professor = Professor.ProfessorGenerator.make();
			people[i] = professor;
		}
		
		for (int i = 8; i < 10; i++) {
			Person student = Student.StudentGenerator.make();
			people[i] = student;
		}
		
	}
	
	public void createAndShowGUI() {
		JFrame frame = new JFrame("Таблица с данни за хора");
		frame.setSize(1280, 800);//Zadavame v kakva rezolucia shte se vizualizira prilojenieto
		
		JLabel label = new JLabel("Списък с потребители", JLabel.CENTER);
		
		personInfo = new PersonInfo(people);
		table = new JTable(personInfo);
		
		JScrollPane scrollPane = new JScrollPane(table);
		
		Container container = frame.getContentPane();
		container.setLayout(new BorderLayout());
		container.add(label, BorderLayout.NORTH);
		container.add(scrollPane, BorderLayout.CENTER);
		
		frame.setVisible(true);
	}
}