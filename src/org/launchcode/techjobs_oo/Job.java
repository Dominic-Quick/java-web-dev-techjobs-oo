package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    private String nothingHere = "Data not available";

    public Job(){
        id=nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }

    @Override
    public String toString() {
        String output = "";
        if (name.equals("")) {
            name = nothingHere;
        }
        if (employer.getValue().equals("") || employer.getValue() == null) {
            employer.setValue(nothingHere);
        }
        if (location.getValue().equals("") || location.getValue() == null) {
            location.setValue(nothingHere);
        }
        if (coreCompetency.getValue().equals("") || coreCompetency.getValue() == null) {
            coreCompetency.setValue(nothingHere);
        }
        if (positionType.getValue().equals("") || positionType.getValue() == null) {
            positionType.setValue(nothingHere);
        }
        output = String.format("\nID: %d\n"+
                "Name: %s\n"+
                "Employer: %s\n"+
                "Location: %s\n"+
                "Position Type: %s\n"+
                "Core Competency: %s\n",id,name,employer,location,positionType, coreCompetency+"\n" );
        return output;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
