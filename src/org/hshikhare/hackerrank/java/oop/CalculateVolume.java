package org.hshikhare.hackerrank.java.oop;

import java.io.IOException;
import java.math.BigDecimal;
import java.security.Permission;
import java.util.Scanner;

/**
 * Created by h_shikhare on 1/16/2017.
 */
public class CalculateVolume {
    public static void main(String[] args) {
        DoNotTerminate.forbidExit();
        try {
            Calculate cal = new Calculate();
            int T = cal.get_int_val();
            while (T-- > 0) {
                double volume = 0.0;
                int ch = cal.get_int_val();
                if (ch == 1) {
                    int a = cal.get_int_val();
                    volume = Calculate.do_calc().get_volume(a);
                } else if (ch == 2) {
                    int l = cal.get_int_val();
                    int b = cal.get_int_val();
                    int h = cal.get_int_val();
                    volume = Calculate.do_calc().get_volume(l, b, h);

                } else if (ch == 3) {
                    double r = cal.get_double_val();
                    volume = Calculate.do_calc().get_volume(r);

                } else if (ch == 4) {
                    double r = cal.get_double_val();
                    double h = cal.get_double_val();
                    volume = Calculate.do_calc().get_volume(r, h);

                }
                cal.output.display(volume);
            }

        } catch (NumberFormatException e) {
            System.out.print(e);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }


    } //end of main
} //end of Solution

/**
 * This class prevents the user form using System.exit(0)
 * from terminating the program abnormally.
 */
class DoNotTerminate {

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }

    public static class ExitTrappedException extends SecurityException {
    }
}

class Calculate {

    static Scanner scanner;
    public Calculate output;

    public Calculate() {
        this.output = this;
        scanner = new Scanner(System.in);
    }

    public static Calculate do_calc() throws IOException {
        return new Calculate();
    }

    public int get_int_val() {
        int i = 0;
        if (scanner.hasNext()) {
            i = scanner.nextInt();
        }
        return i;
    }

    public double get_volume(int a) {
        return Math.pow(a, 3);
    }

    public double get_volume(int l, int b, int h) {
        return l * b * h;
    }

    public double get_double_val() {
        double v = 0.0;
        if (scanner.hasNext()) {
            v = scanner.nextDouble();
        }
        return v;
    }

    public double get_volume(double r) {
        return (2 * Math.PI * Math.pow(r, 3)) / 3;
    }

    public double get_volume(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    public void display(double volume) throws NumberFormatException {
        if (volume > 0) {
            BigDecimal bd = new BigDecimal(volume);
            bd = bd.setScale(3, BigDecimal.ROUND_HALF_EVEN);
            System.out.println(bd);
        } else {
            throw new java.lang.NumberFormatException("All the values must be positive");
        }
    }
}
