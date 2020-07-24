package sensornet.tools;


import sensornet.sensors.Messwert;

/*
 * @author Simon Stromberg
 * @version 1.0 20200724
 */
public class SensorHelper {

    public static Messwert[] anstiegKorrigieren(Messwert[] mw){
        long temp;
        temp=mw[0].getTimestamp();
        for(int i=1; i<mw.length;i++){
            if( temp >= mw[i].getTimestamp()){
                mw[i]=null;
            }
            else{
                temp=mw[i].getTimestamp();
            }
        }
        return mw;

        String s;
        int i;
        boolean compare;
        compare=s.equals(i);
    }
}
