/*
Five Bikers Compete in a race such that they drive at
a constant speed which may or may not be the same as
the other. To qualify the race, the speed of a racer must
be more than the average speed of all 5 racers. Write a
Java program to take as input the speed of each racer
and print back the speed of qualifying racers.
 */
class Bikers {
    public static void main(String[] args) {
        float[] a =new float[5];
        a[0]=100;
        a[1]=120;
        a[2]=130;
        a[3]=140;
        a[4]=150;

        float avg;
        avg = (a[0]+a[1]+a[2]+a[3]+a[4])/5;
        System.out.println(" Average is  "+avg);
        for (int i = 0; i<4; i++) {
            if (a[i]>avg)
                System.out.println(" Racer R"+(i+1)+" qualified ");
        }
    }
}

