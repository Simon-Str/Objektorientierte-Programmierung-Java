/*
 * @author Simon Stromberg
 * @version 1.0 20200714
 */
public class Record {
    private int id;
    private String inhalt;

    public Record (int id, String inhalt){
        this.id=id;
        this.inhalt= inhalt;
    }

    public int getId() {
        return id;
    }

    public String getInhalt() {
        return inhalt;
    }
}
