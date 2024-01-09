public class IntRange {
    public static void main(String[] args) {
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        int bytesvalue=Integer.BYTES;
        int bitsValue =Integer.BYTES*8;
       

        System.out.println("Minimum value of int: " + minValue);
        System.out.println("Maximum value of int: " + maxValue);
        System.out.println(bytesvalue);
        System.out.println(bitsValue);

        {
        long minValues =Long.MIN_VALUE;
        long maxValues =Long.MAX_VALUE;
        long lbytesValue= Long.BYTES;
        long lbitesValue=Long.BYTES*8;

         System.out.println("minvalue:" + minValues);
         System.out.println("maxvalue:" + maxValues);
         System.out.println(lbytesValue);
         System.out.println(lbitesValue);
        }
        {
          float fminValue= Float.MIN_VALUE;
          float fmaxValue=Float.MAX_VALUE;
          float fbytesValue=Float.BYTES;
          float fbitesValue=Float.BYTES*8;

          System.out.println("minvalue:" + fminValue);
          System.out.println("maxvalue:" + fmaxValue);
          System.out.println(fbytesValue);
          System.out.println(fbitesValue);

        }
       {
          double dminValue = Double.MIN_VALUE;
          double dmaxValue = Double.MAX_VALUE;
          double dbytesValue=Double.BYTES;
          double dbitesValue= Double.BYTES*8;
          
          System.out.println("minvalue:" + dminValue);
          System.out.println("maxvalue:" + dmaxValue);
          System.out.println(dbytesValue);
          System.out.println(dbitesValue);


     }
     {
           char cminValue = Character.MIN_VALUE;
           char cmaxValue = Character.MAX_VALUE;
           char cbytesValue=Character.BYTES;
           char cbitesValue= Character.BYTES*8;

           System.out.println("minvalue:" + cminValue);
          System.out.println("maxvalue:" + cmaxValue);
          System.out.println(cbytesValue);
          System.out.println(cbitesValue);
      
        }
       {  

          byte bminValue = Byte.MIN_VALUE;
          byte bmaxValue = Byte.MAX_VALUE;
          byte bbytesValue=Byte.BYTES;
          byte bbitesValue=Byte.BYTES*8;

          System.out.println("minvalue:" + bminValue);
          System.out.println("maxvalue:" + bmaxValue);
          System.out.println(bbytesValue);
          System.out.println(bbitesValue);
      
           }
}
}
