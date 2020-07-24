package sensornet.sensors;

import java.util.ArrayList;

/*
 * @author Simon Stromberg
 * @version 1.0 20200724
 */
public class HygroSensor extends AbstractSensor{
    private Messwert[] messwerte;

    public HygroSensor(Messwert [] messwerte){
        this.messwerte=messwerte;
    }

    public void werteMessen(long [] timestamps, ArrayList<String> values){
        int realeGroesse=0;
        for(int i=0; i<timestamps.length;i++){
            if(timestamps[i]!=null){
                realeGroesse++;
            }
        }
        messwerte = new Messwert[realeGroesse];
        int count=0;
        for(int i=0; i<timestamps.length;i++){
            if(timestamps[i]!=null){
                messwerte [count]= new Messwert(timestamps[i], values.get(i));
                count ++;
            }
        }
    }
}
