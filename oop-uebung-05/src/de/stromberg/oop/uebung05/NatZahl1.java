/*
 * @author Simon Stromberg
 * @version 1.0 20200618
 */

package de.stromberg.oop.uebung05;

public class NatZahl1 extends AbstractOrdered{

    private int i;

    public NatZahl1(int i) {
        if(i < 1)
        {
            this.i = 0;
        }
        else {
            this.i = i;
        }
    }

    @Override
    public boolean eq(Object o) {

        if(o instanceof NatZahl1)
        {
            NatZahl1 z = (NatZahl1) o;
            return this.i == z.i;
        }

        return false;
    }


    @Override
    public boolean gt(Object o) {

        if(o instanceof NatZahl1)
        {
            NatZahl1 z = (NatZahl1) o;
            return this.i > z.i;
        }

        return false;
    }

    //	@Override
//	public String toString(){
//		String s= String.valueOf(i);
//		return s;
//	}

    @Override
    public String toString() {
        String s=String.format("%d",i);
        return s;
    }

}
