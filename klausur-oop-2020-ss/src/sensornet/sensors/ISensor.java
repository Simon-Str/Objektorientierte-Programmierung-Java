package sensornet.sensors;

/*
 * @author Simon Stromberg
 * @version 1.0 20200724
 */
public interface ISensor {
    public void readData(String ioChannel, boolean multi);
    public void setParameter(boolean value, String name);
}
