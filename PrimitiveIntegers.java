public class PrimitiveIntegers {
        public static void main(String[] args) {
                
                // 8 bits wide
                byte b_minimum = -128;
                byte b_maximum =  127;
                
                // 16 bits wide
                short s_minimum = -32768;
                short s_maximum =  32767;
                
                // 32 bits wide
                int i_minimum = -2147483648;
                int i_maximum =  2147483647;
                
                // 64 bits wide
                long l_minimum = -9_223_372_036_854_775_808L;
                long l_maximum =  9_223_372_036_854_775_807L;
                // And look here! We used underscores between
                // numbers to make the literal more readable
                // and put an L at the end to specify that our
                // variables are in fact longs.
                
                System.out.println("Byte minimum: " + b_minimum + " Byte maximum: " + b_maximum);
                System.out.println("Short minimum: " + s_minimum + " Short maximum: " + s_maximum);
                System.out.println("Int minimum: " + i_minimum + " Int maximum: " + i_maximum);
                System.out.println("Long minimum: " + l_minimum + " Long maximum: " + l_maximum);
        }
}
