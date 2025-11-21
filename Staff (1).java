public class Staff extends Person {
    private String role;
    private String department;

    public Staff(String name, int age, String contactDetails, String role, String department) 
    {
        super(name, age, contactDetails);
        this.role = role;
        this.department = department;
    }

    public String getRole() 
    {
        return role; 
    }
    
    public void setRole(String role)
    {
        this.role = role;
    }

    public String getDepartment() 
    {
        return department;
    }
    
    public void setDepartment(String department)
    {
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println("===== Staff Information =====");
        super.displayInfo();
        System.out.println("Role: " + role);
        System.out.println("Department: " + department);
    }
}
