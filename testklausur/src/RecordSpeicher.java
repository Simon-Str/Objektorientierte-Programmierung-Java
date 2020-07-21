import java.util.ArrayList;

/*
 * @author Simon Stromberg
 * @version 1.0 20200714
 */
public class RecordSpeicher implements IRecordSpeicher {
    protected ArrayList<Record> container = new ArrayList<Record>();

    public RecordSpeicher(){

    }

    @Override
    public void hinzufuegen(int id, String inhalt) throws DoppelterEintragException {
        boolean duplicate= false;
        if(container.size()>0) {
            for (int i = 0; i< container.size(); i++){
                if(((container.get(i)).getId()==id)){
                    duplicate=true;
                }
            }

        }
        if(duplicate=false || container.size()==0){
            Record r= new Record(id, inhalt);
            container.add(r);
        }
        else{
            throw new DoppelterEintragException(id);
        }
    }

    @Override
    public Record loeschen(int id) throws ExistiertNichtException {
        boolean existiert=false;
        int index=0;
        if(container.size()>0) {
            for (int i = 0; i< container.size(); i++){
                if(container.get(i).getId()==id){
                    existiert=true;
                    index=i;
                }
            }

        }
        if(existiert=false || container.size()==0){
            throw new ExistiertNichtException(id);
        }
        else{
            Record r = container.remove(index);
            return r;
        }
    }

    @Override
    public String getInhalt(int id) throws ExistiertNichtException {
        boolean existiert=false;
        int index=0;
        if(container.size()>0) {
            for (int i = 0; i< container.size(); i++){
                if(container.get(i).getId()==id){
                    existiert=true;
                    index=i;
                }
            }

        }
        if(existiert=false || container.size()==0){
            throw new ExistiertNichtException(id);
        }
        else{
            return (container.get(index)).getInhalt();
        }
    }

    @Override
    public int anzahlZeichen() {
        int anzahl=0;
        for (int i=0; i<container.size();i++){
            anzahl= anzahl+ container.get(i).getInhalt().length();
        }
        return anzahl;
    }

    @Override
    public String[] stringArray() {
        String temp[] = new String [container.size()];
        for (int i=0; i<container.size();i++){
            temp[i]= container.get(i).getInhalt();
        }

        return temp;
    }
}
