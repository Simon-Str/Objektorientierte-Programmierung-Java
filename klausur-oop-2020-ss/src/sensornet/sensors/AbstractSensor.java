package sensornet.sensors;

import sensornet.sensors.exceptions.ReadException;

/*
 * @author Simon Stromberg
 * @version 1.0 20200724
 */
public abstract class AbstractSensor implements ISensor{
    protected boolean multi;
    protected String[] channels;

    public AbstractSensor(boolean multi, String[] channels) {
        this.multi = multi;
        this.channels = channels;
    }

    @Override
    public void readData(String ioChannel, boolean multi) throws ReadException {
        if(this.multi == multi){
            throw new ReadException(ioChannel, multi);
        }
        else{
            boolean found=false;
            for(int i=0; i<channels.length;i++){
                if(channels[i].equals(ioChannel)){
                    this.multi=multi;
                }
            }
        }
    }


}
