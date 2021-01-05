/*
 * Velichka Chorbova
 * Matrikelnummer: 7354029
 */
package ms1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class Mathcore {
    public static final int STELLEN_INTERN = 200;
    public static final int STELLEN_OUTPUT = 30;
    public static final MathContext mc = new MathContext(STELLEN_INTERN,
            RoundingMode.HALF_EVEN);
    public static final MathContext mc_out = new MathContext(STELLEN_OUTPUT,
            RoundingMode.HALF_EVEN);
    public static final BigDecimal epsilon = BigDecimal.ONE.scaleByPowerOfTen(-(STELLEN_INTERN + 1));
    public static final String PI =
            "3.141592653589793238462643383279502884197169399375105820974944592307816406286208" +
                    "99862803482534211706798214808651328230664709384460955058223172535940812848111745" +
                    "02841027019385211055596446229489549303819644288109756659334461284756482337867831" +
                    "65271201909145648566923460348610454326648213393607260249141273724587006606315588" +
                    "17488152092096282925409171536436789259036001133053054882046652138414695194151160" +
                    "94330572703657595919530921861173819326117931051185480744623799627495673518857527" +
                    "24891227938183011949129833673362440656643086021394946395224737190702179860943702" +
                    "77053921717629317675238467481846766940513200056812714526356082778577134275778960" +
                    "91736371787214684409012249534301465495853710507922796892589235420199561121290219" +
                    "60864034418159813629774771309960518707211349999998372978049951059731732816096318" +
                    "59502445945534690830264252230825334468503526193118817101000313783875288658753320" +
                    "83814206171776691473035982534904287554687311595628638823537875937519577818577805" +
                    "32171226806613001927876611195909216420198938095257201065485863278865936153381827" +
                    "96823030195203530185296899577362259941389124972177528347913151557485724245415069" +
                    "59508295331168617278558890750983817546374649393192550604009277016711390098488240" +
                    "12858361603563707660104710181942955596198946767837449448255379774726847104047534" +
                    "64620804668425906949129331367702898915210475216205696602405803815019351125338243" +
                    "00355876402474964732639141992726042699227967823547816360093417216412199245863150" +
                    "30286182974555706749838505494588586926995690927210797509302955321165344987202755" +
                    "96023648066549911988183479775356636980742654252786255181841757467289097777279380" +
                    "00816470600161452491921732172147723501414419735685481613611573525521334757418494" +
                    "68438523323907394143334547762416862518983569485562099219222184272550254256887671" +
                    "79049460165346680498862723279178608578438382796797668145410095388378636095068006" +
                    "42251252051173929848960841284886269456042419652850222106611863067442786220391949" +
                    "450471237137869609563643719172874677646575739624138908658326459958133904780275901";
    public static final String E =
            "2.718281828459045235360287471352662497757247093699959574966967627724076630353547" +
                    "59457138217852516642742746639193200305992181741359662904357290033429526059563073" +
                    "81323286279434907632338298807531952510190115738341879307021540891499348841675092" +
                    "44761460668082264800168477411853742345442437107539077744992069551702761838606261" +
                    "33138458300075204493382656029760673711320070932870912744374704723069697720931014" +
                    "16928368190255151086574637721112523897844250569536967707854499699679468644549059" +
                    "87931636889230098793127736178215424999229576351482208269895193668033182528869398" +
                    "49646510582093923982948879332036250944311730123819706841614039701983767932068328" +
                    "23764648042953118023287825098194558153017567173613320698112509961818815930416903" +
                    "51598888519345807273866738589422879228499892086805825749279610484198444363463244" +
                    "96848756023362482704197862320900216099023530436994184914631409343173814364054625" +
                    "31520961836908887070167683964243781405927145635490613031072085103837505101157477" +
                    "04171898610687396965521267154688957035035402123407849819334321068170121005627880" +
                    "23519303322474501585390473041995777709350366041699732972508868769664035557071622" +
                    "68447162560798826517871341951246652010305921236677194325278675398558944896970964" +
                    "09754591856956380236370162112047742722836489613422516445078182442352948636372141" +
                    "74023889344124796357437026375529444833799801612549227850925778256209262264832627" +
                    "79333865664816277251640191059004916449982893150566047258027786318641551956532442" +
                    "58698294695930801915298721172556347546396447910145904090586298496791287406870504" +
                    "89585867174798546677575732056812884592054133405392200011378630094556068816674001" +
                    "69842055804033637953764520304024322566135278369511778838638744396625322498506549" +
                    "95886234281899707733276171783928034946501434558897071942586398772754710962953741" +
                    "52111513683506275260232648472870392076431005958411661205452970302364725492966693" +
                    "81151373227536450988890313602057248176585118063036442812314965507047510254465011" +
                    "727211555194866850800368532281831521960037356252794495158284188294787610852639814";

    /* Some constant variables that will be needed throughout the program. */
    public static final BigDecimal CONST180 = new BigDecimal("180");
    public static final BigDecimal CONST2 = new BigDecimal("2");
    public static final BigDecimal CONST3 = new BigDecimal("3");
    public static final BigDecimal CONST19 = new BigDecimal("19");
    public static final BigDecimal CONSTNEG1 = new BigDecimal("-1");
    /* е and p are final but not in capital letters because final E and PI were already taken */
    public static final BigDecimal e = new BigDecimal(E, mc);
    public static final BigDecimal pi = new BigDecimal(PI, mc);
    public static final BigDecimal negE = e.negate(mc);
    public static final BigDecimal negPi = pi.negate(mc);


    /* This method calculates the sum of two numbers. */
    public static BigDecimal add(BigDecimal a, BigDecimal b) {
        BigDecimal c = b.add(a, mc);
        return c;
    }

    /* This method calculates the difference of two numbers.
     * {(a-b)}.
     */
    public static BigDecimal sub(BigDecimal a, BigDecimal b) {
        BigDecimal c = a.subtract(b, mc);
        return c;
    }

    /*
     *  This method divides two numbers {(a/b)} and throws Exception
     *  if the divisor (b) equals 0.
     */
    public static BigDecimal div(BigDecimal a, BigDecimal b) throws Exception {
        if (b.equals(0)) {
            throw new Exception("Divison by 0 is not permitted");
        }
        BigDecimal c = a.divide(b, mc);
        return c;
    }

    /* This method multiplies two numbers. */
    public static BigDecimal mul(BigDecimal a, BigDecimal b) {
        BigDecimal c = a.multiply(b, mc);
        return c;
    }

    /*
     *  This method calculates the faculty of a number
     *  and throws Exception if the number is not an integer number
     *  or is negative.
     */
    public static BigDecimal fak(BigDecimal a) throws Exception {
        if (!isInteger(a) || a.compareTo(BigDecimal.ZERO) == -1) {
            throw new Exception("The faculty of non-integer or negative number cannot be calculated");
        } else {
            BigDecimal factorial = BigDecimal.ONE;
            int n = a.intValue();
            if (n == 1 || n == 0) {
                return BigDecimal.ONE;
            } else {
                for (int i = 1; i <= n; i++) {
                    factorial = factorial.multiply(new BigDecimal(i), mc);
                }
                return factorial;
            }

        }
    }

    /* This method calculates the approximation of the exponential function of "x". */
    public static BigDecimal exp(BigDecimal x) {
        BigDecimal r = BigDecimal.ZERO;
        BigDecimal k = BigDecimal.ZERO;
        /* "kFak" holds the value of (k-1)! or 1 for 0 and 1 .*/
        BigDecimal kFak = BigDecimal.ONE;
        BigDecimal b = BigDecimal.ZERO;
        BigDecimal x_abs = x.abs(mc);

        /*
         * Loop for the calculation of the smallest b, where |x| < 10^b .
         * Scaling of x.
         */
        while (x_abs.compareTo(BigDecimal.ONE) != -1) {
            x_abs = x_abs.divide(BigDecimal.TEN, mc);
            b = b.add(BigDecimal.ONE);
        }
        /* After we have obtained the value of b we can initialize a. */
        int valueOfB = b.intValue();
        BigDecimal a = x.divide((BigDecimal.TEN.pow(valueOfB)), mc);

        /*
         *  When the limit falls under the given error tolerance (epsilon),
         *  the value of r is an accurate approximation
         *  of the actual exp-function value.
         */
            BigDecimal limit = e;
            while (limit.compareTo(epsilon) != -1) {
                int valueOfK = k.intValue();
                BigDecimal kPow = a.pow(valueOfK);
                BigDecimal kEnd = kPow.divide(kFak, mc);
                r = r.add(kEnd, mc);
                k = k.add(BigDecimal.ONE);

                if (k.compareTo(BigDecimal.ONE) != 1) {
                    kFak = BigDecimal.ONE;
                } else {
                    /* We multiply k with (k-1)! instead of using fak(). */
                    kFak = kFak.multiply(k, mc);
                }
                /* Update of the limit. */
                limit = e.divide(kFak, mc);

            }

            /* Reverse the scaling of x. */
            while (b.compareTo(BigDecimal.ZERO) == 1) {
                r = r.pow(10);
                b = b.subtract(BigDecimal.ONE, mc);
            }
            return r;

    }

    /* This method calculates the approximation of natural logarithm of "a" . */
    public static BigDecimal ln(BigDecimal a) throws Exception {
        if (a.compareTo(BigDecimal.ZERO) != 1) {
            throw new Exception("Illegal argument. The argument cannot be smaller or equal to 0.");
        } else {
            return lnCore(a);
        }
    }

    /* This method calculates the logarithm of number "a" to the base 10. */
    public static BigDecimal lg(BigDecimal a) throws Exception {
        if (a.compareTo(BigDecimal.ZERO) != 1) {
            throw new Exception("Illegal argument. The argument cannot be smaller or equal to 0.");
        } else {
            BigDecimal result = lnCore(a).divide(lnCore(BigDecimal.TEN), mc);
            return result;
        }
    }

    /* This method calculates the logarithm of number "b" to the base "a". */
    public static BigDecimal log(BigDecimal a, BigDecimal b) throws Exception {
        if (a.compareTo(BigDecimal.ZERO) != 1
                || b.equals(BigDecimal.ONE)
                || b.compareTo(BigDecimal.ZERO) != 1) {
            throw new Exception("The argument and the base must be greater than 0 " +
                    "and the base cannot be equal to 1.");
        } else {
            BigDecimal result = lnCore(a).divide(lnCore(b), mc);
            return result;
        }
    }

    /* This method raises number "a" to the power of "b". */
    public static BigDecimal pot(BigDecimal a, BigDecimal b) throws Exception {
        if (a.compareTo(BigDecimal.ZERO) != 1
                || b.compareTo(BigDecimal.ZERO) != 1) {
            throw new Exception("Neither the argument nor the exponent can be smaller or equal to 0.");
        }
        /* If the exponent is an int-number, we use the existing BigDecimal method - pow(). */
        BigDecimal result = BigDecimal.ZERO;
        if (isInteger(b)) {
            int k = b.intValue();
            result = a.pow(k, mc);

            return result;
        } else {
            /*
             *  term1 and term2 are part of a bigger arithmetical expression.
             *  They are divided to reduce complexity and make the code
             *  easier to read and debug.
             */
            BigDecimal term1 = ln(a);
            BigDecimal term2 = b.multiply(term1, mc);
            result = exp(term2);

            return result;
        }
    }

    /*This method calculates the square root of a number "a"
     * and throws Exception if the number is negative. */
    public static BigDecimal sqrt(BigDecimal a) throws Exception {
        if (a.compareTo(BigDecimal.ZERO) == -1) {
            throw new Exception("Cannot calculate sqrt from negative number.");
        } else {
            return a.sqrt(mc);
        }
    }

    /*
     * This method calculates the "a"-root of a number "b"
     * and throws Exception if the number "b" is negative
     * or the exponent "a" is smaller or equal to 0.
     */
    public static BigDecimal root(BigDecimal a, BigDecimal b) throws Exception {
        if (a.compareTo(BigDecimal.ZERO) != 1
                || b.compareTo(BigDecimal.ZERO) == -1) {
            throw new Exception("Invalid input. The root index cannot be smaller or " +
                    "equal to 0 and the radicand cannot be nagative. ");
        } else {
            try {
                BigDecimal result = pot(b, (BigDecimal.ONE.divide(a, mc)));
                return result;
            } catch (Exception e) {
                /*  pot(a,b) throws Exception if "a" or "b" <= 0,
                 *  but we can have radicand equal to 0.
                 *  And then the result is also equal to 0. */
                return BigDecimal.ZERO;
            }
        }
    }

    /* This method calculates the sinus value of number "a". */
    public static BigDecimal sin(BigDecimal x)  {
        /*  Bring the value of "a" as close as possible to 0
         *  by using the information that the period of sin
         *  is 2*pi.
         */
        BigDecimal helper = CONST2.multiply(pi, mc);
        BigDecimal a = x.remainder(helper, mc);

        if (a.compareTo(pi) == 0) {
            return BigDecimal.ZERO;
        }else if (a.compareTo(pi) == 1  && a.compareTo(helper) == -1){
            a = a.subtract(helper, mc);
        }

        BigDecimal r = BigDecimal.ZERO;
        BigDecimal k = BigDecimal.ZERO;
        BigDecimal n1 = CONST3;
        BigDecimal n2 = BigDecimal.ONE;
        BigDecimal fak1 =  new BigDecimal("6");      // (the number1)!
        BigDecimal fak2 =  BigDecimal.ONE;               //  (the number2)!
        BigDecimal term1 = BigDecimal.ONE;
        BigDecimal limit = (pi.pow(3, mc)).divide(fak1, mc);
        int valueOfK = k.intValue();
        int count =1;

        while (limit.compareTo(epsilon) != -1) {
            /*
             * The whole arithmetic expression is divided into smaller ones,
             * called term1 and term2 in order to reduce the complexity
             * and make the code easier to read and debug .
             */
            if(count==1){
                /* For the first iteration or the while loop the value of "fak2" is as declared above. */
                term1 = (a.pow((2 * valueOfK) + 1)).divide(fak2,mc);
            }else {
                /*
                *  Instead of calculating (2k + 1)! for every iteration
                * "fak2" holds the value of the faculty for the last update of "k" or in this case "n2".
                *  To obtain the new value of "fak2" we multiply it with (n2+1) and (n2+2).
                */
                 fak2 = fak2.multiply((n2.add(BigDecimal.ONE, mc)), mc).multiply(n2.add(CONST2, mc), mc);    // (2k+1)!
                 term1 = (a.pow((2 * valueOfK) + 1))
                        .divide(fak2, mc);
                 /* Update of "n2". */
                n2 = n2.add(CONST2);
            }

            BigDecimal term2 = CONSTNEG1.pow(valueOfK, mc);
            r = r.add((term2.multiply(term1, mc)), mc);
            k = k.add(BigDecimal.ONE, mc);
            valueOfK = k.intValue();

            /*  Update of the limit.
             *  Instead of calculating (2k + 3)! for every iteration
             *  "fak1" holds the value of the faculty for the last update of "k" or in this case "n1".
             *  To obtain the new value of "fak2" we multiply it with (n1+1) and (n1+2).
             */
            fak1 = fak1.multiply((n1.add(BigDecimal.ONE, mc)), mc).multiply(n1.add(CONST2, mc), mc);
            limit = (pi.pow((2 * valueOfK) + 3, mc))
                    .divide(fak1,mc);
            /* Update of "n1". */
            n1 = n1.add(CONST2);
            count++;
        }

        return r;
    }

    /* This method calculates the cosinus value of number "a" */
    public static BigDecimal cos(BigDecimal a) {
        BigDecimal term1= (pi.divide(CONST2, mc));
        BigDecimal term2 = term1.subtract(a,mc);
        BigDecimal result =  sin(term2);

        return result;
    }

    /* This method calculates the tangens value of number "a" */
    public static BigDecimal tan(BigDecimal a) throws Exception {
        BigDecimal sin = sin(a);
        BigDecimal cos = cos(a);

        if (cos.compareTo(BigDecimal.ZERO) == 0) {
            throw new Exception("cos equals 0. Invalid 0-division.");
        }
        BigDecimal result = sin.divide(cos, mc);

        return result;
    }

    /* The core method for the natural logarithmic function. */
    private static BigDecimal lnCore(BigDecimal x) {
        BigDecimal a = x;
        BigDecimal w = BigDecimal.ZERO;
        BigDecimal v = (BigDecimal.ONE.subtract(a, mc)).abs(mc);
        BigDecimal limit1 = new BigDecimal("0.1");

        /*
         *  The loop brings the value af "a" as close as possible to 1
         *  for optimization purposes.
         *  Scaling of a.
         */
        while (v.compareTo(limit1) != -1) {
            a = a.sqrt(mc);
            w = w.add(BigDecimal.ONE);
            v = (BigDecimal.ONE.subtract(a, mc)).abs(mc);
        }

        BigDecimal r = BigDecimal.ZERO;
        BigDecimal k = BigDecimal.ZERO;
        /*
         *  Loop for update of the limit.
         *  When the limit falls under the given error tolerance (epsilon),
         *  the value of r is an accurate approximation
         *  of the actual natural-log-function value.
         */
        BigDecimal limit = BigDecimal.ONE
                .divide((CONST180.multiply(CONST3).multiply(CONST19)), mc);
        while (limit.compareTo(epsilon) != -1) {
            int valueOfK = k.intValue();
            /*
             * The whole arithmetic expression is divided into smaller ones,
             * called term1 and term2 in order to reduce the complexity
             * and make the code easier to read and debug .
             */
            BigDecimal term1 = ((a.subtract(BigDecimal.ONE, mc))
                    .divide((a.add(BigDecimal.ONE, mc)), mc))
                    .pow((2 * valueOfK) + 1);
            BigDecimal term2 = CONST2
                    .divide(BigDecimal.ONE.add((CONST2.multiply(k, mc)), mc), mc);
            r = r.add((term1.multiply(term2, mc)), mc);
            k = k.add(BigDecimal.ONE);

            //Update of the limit.
            limit = BigDecimal.ONE
                    .divide(CONST180.multiply(((CONST2.multiply(k, mc))
                            .add(CONST3, mc)), mc).multiply((CONST19.pow((2 * valueOfK) + 1))), mc);

        }
        // Rescaling.
        while (w.compareTo(BigDecimal.ZERO) == 1) {
            r = r.multiply(CONST2);
            w = w.subtract(BigDecimal.ONE);
        }
        return r;
    }

    /* This method verifies if a given number is int. */
    private static boolean isInteger(BigDecimal a) {
        String s = a.toString();
        boolean isInteger = true;
        try {
            BigInteger i = new BigInteger(s);
        } catch (NumberFormatException e) {
            isInteger = false;
        }
        return isInteger;
    }
}

