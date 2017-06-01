package rybak.agata.Zbior_Zadan_4_zad2;

/**
 * Created by asus on 2017-03-16.
 */
public class Miejscowosc {
    private String nazwa;
    private double x;
    private double y;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        if(nazwa.matches("[A-Z]+\\s?[A-Z]?"))
        {
            this.nazwa = nazwa;
        }
        else
        {
            this.nazwa = "RANDOM";
        }
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        if(x >= -180 && x <= 180)
        {
            this.x = x;
        }
        else
        {
            this.x = 0;
        }
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        if(y >= -90 && y <= 90)
        {
            this.y = y;
        }
        else
        {
            this.y = 0;
        }
    }

    public Miejscowosc(String nazwa, double x, double y) {
       setNazwa(nazwa);
       setX(x);
       setY(y);
    }

    @Override
    public String toString() {
        return "Miejscowosc{" +
                "nazwa='" + nazwa + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Miejscowosc)) return false;

        Miejscowosc that = (Miejscowosc) o;

        if (Double.compare(that.x, x) != 0) return false;
        if (Double.compare(that.y, y) != 0) return false;
        return nazwa.equals(that.nazwa);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nazwa.hashCode();
        temp = Double.doubleToLongBits(x);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
