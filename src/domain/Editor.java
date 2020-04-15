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
public class Editor extends Artist {
    /**
     * Initialize Editor
     * @param electronicEditing electronic editing of Editor
     * @param skiils skills of Editor
     * @param name Name of editor
     * @param jobTitle job of editor
     * @param level level of editor
     * @param dept dept of editor
     */

    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
    /**
     * Assign skills and electronic editing
     * @param electronicEditing electronic editing of editor
     * @param skiils skills of Editor
     */

    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
    /**
     * Assign ID and electronic editing
     * @param electronicEditing electronic editing of Editor
     */

    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    /**
     * Creates a new instance of the Editor class that works with electronic devices.
     */
    
    public Editor() {
        super();
        this.electronicEditing = true;
    }
    /**
     *Create string "s"
     * @return string with information about editor
     */

    @Override
    public String toString() {
        String s = super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
            return s;
            
    }

    private boolean electronicEditing;

    public boolean getPreferences() {
        return electronicEditing;
    }
    /**
     * Set information about editing device of editor.
     * @param electronic If device is electronic
     */

    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
