package rybak.agata.ZZ_5_Container;

import java.util.Scanner;

/**
 * Created by asus on 2017-03-17.
 */
public class Main {

    public static Container container_max_volume (Container[] con)
    {
        double max = 0;
        int index = 0;
        for(int i = 0; i < con.length; i++)
        {
            //System.out.println(con[i]);
            //System.out.println(con[i].volume());
            if(con[i].volume() > max)
            {
                max = con[i].volume();
                index = i;
            }
        }
        return con[index];
    }

    public static void main(String[] args) {

        Container c = new Container("Red", 2, 3, 4);
        System.out.println(c.isBigEnough(23));

        Container[] con = new Container[]{
                new Container("Green", 3, 4, 5),
                new Container("Red", 1, 2, 6),
                new Container("Blue", 5, 4, 8),
                new Container("Pink", 1, 7, 3),
                new Container("Yellow", 3, 5, 1)
        };

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int s = Integer.parseInt(sc.nextLine());

        Container[] container = new Container[s];

        for(int i = 0; i < container.length; i++)
        {
            container[i] = new Container();
        }
        */
        System.out.println("The container with the largest volume: " + container_max_volume(con));

    }

}
