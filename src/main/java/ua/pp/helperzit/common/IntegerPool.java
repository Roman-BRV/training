package ua.pp.helperzit.common;

public class IntegerPool {

    public static void main(String[] args) {

        Integer iObm5 = -129;
        Integer iObm6 = -129;
        System.out.println("<> -128...127 in pool (-129) --- " + (iObm5 == iObm6));

        Integer iObm1 = -128;
        Integer iObm2 = -128;
        System.out.println("in -128...127 in pool (-128) --- " + (iObm1 == iObm2));

        Integer iObm3 = new Integer(-128);
        Integer iObm4 = new Integer(-128);
        System.out.println("by NEW in pool (-128) --- " + (iObm3 == iObm4));

        Integer iOb1 = 127;
        Integer iOb2 = 127;
        System.out.println("in -128...127 in pool (127) --- " + (iOb1 == iOb2));

        Integer iOb3 = new Integer(127);
        Integer iOb4 = new Integer(127);
        System.out.println("by NEW in pool (127) --- " + (iOb3 == iOb4));

        Integer iOb5 = 128;
        Integer iOb6 = 128;
        System.out.println("<> -128...127 in pool (128) --- " + (iOb5 == iOb6));

    }
}
