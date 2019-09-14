package exercise.conversion;

public class Converter {

    public static void main(String args[]) {
        int deci = 1011;
        System.out.println((binaryToDecimal(deci)));
    }

    public static int decimalToBinary(int deci) {
        int bin = 0;
        int place = 1;

        while (deci != 0) {
            int rem = deci % 2;
            deci = deci / 2;

            bin = bin + rem * place;
            place = place * 10;
        }

        return bin;
    }

    public static int decimalToAny(int deci, int base) {
        int any = 0;
        int place = 1;

        while (deci != 0) {
            int rem = deci % base;
            deci = deci / base;

            any = any + rem * place;
            place = place * 10;
        }

        return any;
    }

    public static int binaryToDecimal(int bin) {
        int deci = 0;
        int place = 1;

        while (bin != 0) {
            int rem = bin % 10;
            bin = bin / 10;

            deci = deci + rem * place;
            place = place * 2;
        }

        return deci;
    }

    public static int anyToDeci(int any,int base){
        int deci = 0;
        int place = 1;

        while (any != 0){
            int rem = any%10;
            any = any/10;

            deci = deci + rem*place;
            place = place*base;
        }

        return deci;
    }

    public static int anyToAny(int any,int fBase,int sBase){
        int deci = anyToDeci(any,fBase);
        return decimalToAny(deci,sBase);
    }
}
