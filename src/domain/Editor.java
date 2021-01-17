package domain;
/**
 * Java-пакет, що описує клас {@link Editor}
 * @author Я
 */
public class Editor extends Artist {
    /**
     * конструктор класу {@link Editor} при створенні об'єкту наступні параметри вказуються за замовчуванням:
     * {@link electronicEditing},
     * {@link skiils},
     * {@link name},
     * {@link jobTitle},
     * {@link level},
     * {@link dept};
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
    /**
     * конструктор класу {@link Editor}, який встановлює наступні параметри:
     * {@link electronicEditing},
     * {@link skiils}; 
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
     * конструктор класу {@link Editor}
     * {@link electronicEditing} - true, за замовчуванням
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }
    /**
     * @see Employee
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
