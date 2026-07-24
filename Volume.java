import java.io.*;
import java.lang.*;

class Volume
{
    public static void main(String args[])
    {
        float r = 2.5f, vol;

        vol = (4 * 3.142f * r * r ) / 3;

        System.out.print("The volume of sphere is " + vol);
    }
}
