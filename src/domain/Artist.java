package domain;
/**
 * 
 * Java-пакет, що описує працівників компанії {@link Artist, 
 * є підкласом {@link Employee}
 * 
 */
public class Artist extends Employee {
        /**
         * Конструктор класу {@link Artist}, створює об'єкт класу й присвоює такі параметри за замовчуванням :
         * {@link skiils} - описує набір навичок працівника; 
         * {@link name} - ім'я праціника компанії;
         * {@link jobTitle} -  назва посади працівника;
         * {@link level} -  напрям працівника / спрямованість/ фахова градація(juniorm middle etc);
         * {@link dept}  - посада працівника компанії;
         */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
    /**
     *  конструктор класу {@link Artist}
     * @param skiils передаваний масив 
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    /**
     * конструктор класу {@link Artist}
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }
    
    /**
     * @see Employee
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;
    /**
     * 
     * @return 
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
     *  При роботі з приватними змінними ми не можемо встановити їхнє значення напряму, {@link setSkills} слугує для зміни даних про здібності  робітника;
     * @param skills 
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
    /**
     * При роботі з приватними змінними ми не можемо отримати їхнє значення напряму, {@link getSkillsList} слугує для отримання даних про здібності  робітника;
     * @return {@link skills} -  встановлюється не за замовчуванням 
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
