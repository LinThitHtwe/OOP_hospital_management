public class Patient extends Person {
    private String medicalHistory;
    private String diagnosis;

    public Patient(String name, int age, String contactDetails, String medicalHistory, String diagnosis)
    {
        super(name, age, contactDetails);
        this.medicalHistory = medicalHistory;
        this.diagnosis = diagnosis;
    }

    public String getMedicalHistory()
    {
        return medicalHistory; 
    }
    
    public void setMedicalHistory(String medicalHistory)
    {
        this.medicalHistory = medicalHistory; 
    }

    public String getDiagnosis()
    {
        return diagnosis;
    }
    
    public void setDiagnosis(String diagnosis) 
    {
        this.diagnosis = diagnosis;
    }

    @Override
    public void displayInfo() {
        System.out.println("---Patient Information---");
        super.displayInfo(); 
        System.out.println("Medical History: " + medicalHistory);
        System.out.println("Diagnosis: " + diagnosis);
    }
}
