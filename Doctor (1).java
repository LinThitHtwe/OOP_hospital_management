public class Doctor extends Person {
    private String specialization;
    private boolean availability;

    public Doctor(String name, int age, String contactDetails, String specialization, boolean availability)
    {
        super(name, age, contactDetails);
        this.specialization = specialization;
        this.availability = availability;
    }

    public String getSpecialization() 
    {
        return specialization;
    }
    
    public void setSpecialization(String specialization) 
    {
        this.specialization = specialization;
    }

    public boolean isAvailable() 
    {
        return availability;
    }
    
    public void setAvailability(boolean availability)
    {
        this.availability = availability;
    }

    @Override
    public void displayInfo() {
        System.out.println("===== Doctor Information =====");
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
        System.out.println("Available: " + (availability ? "Yes" : "No"));
    }
}
