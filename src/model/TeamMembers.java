package model;

import java.util.ArrayList;

public class TeamMembers {
    private ArrayList<Developer> developers;
    private ArrayList<ProjectOwner> owner;
    private ArrayList<ScrumMaster> scrum;



    public TeamMembers(){
        this.owner = new ArrayList<>();
        this.scrum = new ArrayList<>();

        this.developers = new ArrayList<>();
    }
    public void addDeveloper(Person person){
        developers.add((Developer)person);
    }

    public void addScrum(Person person){
        this.scrum.add((ScrumMaster)person);
    }

    public void addOwner(Person person){
        this.owner.add((ProjectOwner) person);
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    public ArrayList<ScrumMaster> getScrums() {
        return scrum;
    }

    public ArrayList<ProjectOwner> getOwners() {
        return owner;
    }
    public void removeScrum(int index){
        scrum.remove(index);
    }
    public void removeOwner(int index){
        owner.remove(index);
    }

    public int getDevSize(){
        return developers.size();
    }
    public Developer getDeveloper(int index){
        return developers.get(index);
    }

    public ProjectOwner getOwner(int index) {
        return owner.get(index);
    }

    public ScrumMaster getScrum(int index) {
        return scrum.get(index);
    }

    public boolean doesDeveloperExist(Developer developer){
        for (int x = 0; x < developers.size(); x++){
            if(developers.get(x) == developer){
                return true;
            }
        }
        return false;
    }

    public void removeDeveloper(int index){
        developers.remove(index);
    }
}