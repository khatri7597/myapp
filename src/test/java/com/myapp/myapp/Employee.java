package com.myapp.myapp;

public class Employee implements Comparable<Employee> {
    private long id;
    private String name;
    
    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
    
    @Override
    public boolean equals(Object o) {
    	String n = (String) o;
        return n.equals(name);
    }
 
    @Override
    public int hashCode() {
        return 31;
    }
 
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
	@Override
	public int compareTo(Employee o) {
		return name.compareTo(o.name);
	}
}