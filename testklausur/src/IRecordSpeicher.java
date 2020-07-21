/*
 * @author Simon Stromberg
 * @version 1.0 20200714
 */
public interface IRecordSpeicher {
    void hinzufuegen(int id, String inhalt) throws DoppelterEintragException;
    Record loeschen(int id) throws ExistiertNichtException;
    String getInhalt(int id) throws ExistiertNichtException;
    int anzahlZeichen();
    String[] stringArray();

}
