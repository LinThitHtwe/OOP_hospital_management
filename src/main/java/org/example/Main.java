package org.example;


public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[3];

        persons[0] = new Patient("Alice", 25, "012-3456789", "Asthma", "Breathing issue");
        persons[1] = new Doctor("Dr.Lin", 45, "018-9988776", "Cardiologist", true);
        persons[2] = new Staff("Micheal", 30, "011-39232999", "Nurse", "Emergency Department");

        for (int i = 0; i < persons.length; i++)
        {
            persons[i].displayInfo();
            System.out.println();
        }
    }
}