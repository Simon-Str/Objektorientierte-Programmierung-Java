

/*
 * @author Simon Stromberg
 * @version 1.0 20200714
 */
public class DoppelterEintragException extends Exception{
    private int id;
    public DoppelterEintragException(int id){
        super();
        this.id=id;
    }

    @Override
    public String toString(){
       return super.toString() + " on id " + id;
    }


}
