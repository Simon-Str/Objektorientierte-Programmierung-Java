package sensornet.sensors.exceptions;

/*
 * @author Simon Stromberg
 * @version 1.0 20200724
 */
public class ReadException extends Exception{
    private final String iochannel;
    private final boolean multi;

    public ReadException(String iochannel, boolean multi){
        this.iochannel=iochannel;
        this.multi=multi;
    }

    public toConsole(){
        System.out.println("IO-Channel: "+ iochannel + "   ,Multi: " + multi);
    }
}
