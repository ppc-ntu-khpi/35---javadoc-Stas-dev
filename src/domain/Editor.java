package domain;
/**
 * Java-пакет, що описує клас {@link Editor}
 * @author Я
 */
public class Editor extends Artist {
    /**
     * конструктор класу {@link Editor}
     * @param electronicEditing
     * @param skiils
     * @param name
     * @param jobTitle
     * @param level
     * @param dept 
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
    /**
     * 
     * @param electronicEditing
     * @param skiils 
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
    /**
     * 
     * @param electronicEditing 
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    /**
     * 
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;
        /**
         * 
         * @return 
         */
    public boolean getPreferences() {
        return electronicEditing;
    }
    /**
     * 
     * @param electronic 
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
