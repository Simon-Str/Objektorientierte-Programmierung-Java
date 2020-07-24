package sensornet.sensors;

/*
 * @author Simon Stromberg
 * @version 1.0 20200724
 */
public class Messwert {
    final long timestamp;
    final String wert;

    public Messwert(long timestamp, String wert){
        this.timestamp=timestamp;
        this.wert=wert;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getWert() {
        return wert;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setWert(String wert) {
        this.wert = wert;
    }
}
