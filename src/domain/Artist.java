/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Admin
 */
public class Artist extends Employee {
     /**
     *Initialize Artist
     * @param skiils SkiLls of Artist
     * @param name Name of Artist
     * @param jobTitle Job of Artist
     * @param level Level of Artist
     * @param dept Dept of Artist
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
     /**
     * Assign ID to Artist
     * @param skiils SkiLls of Artist
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    /**
     * Creates a new instance of the Artist class.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }
    /**
     * Get skills of Artist
     * @return string with information about artist
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;
    /**
     * Get skills of Artist
     * @return string with all skills
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
     /**
     * Sets skills of the artist 
     * @param skills Skills of the Artist
     */

    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
    
    /**
     * Get skills of artist as array of strings
     * @return array of artist skills
     */

    public String[] getSkillsLSist() {
        return skiils;
    }
}

