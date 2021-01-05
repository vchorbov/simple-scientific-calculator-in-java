package ms0.a2;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        BigDecimal a = new BigDecimal("1");
        BigDecimal b = new BigDecimal("5");
        BigDecimal c = new BigDecimal("2");
        MathContext mc1 = new MathContext(100, RoundingMode.HALF_UP);
        MathContext mc2 = new MathContext(30, RoundingMode.HALF_UP);


      // System.out.println(a.divide(b, mc));

        b=b.sqrt(mc1);
        BigDecimal d= a.add(b,mc1);
        BigDecimal e = d.divide(c,mc1);
        e=(e.divide(BigDecimal.valueOf(1),mc2));



        System.out.println(e);
        System.out.println(e.unscaledValue());
        System.out.println(e.scale());
    }

}

//1.61803398874989484820458683437
//1.6180339887498948482045868343656381177203091798058