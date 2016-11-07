class CompareToStringWithHashCode
{
    public static void main(String[] args)
    {
        Object myObject = new Object();
        System.out.println(myObject.toString());
        System.out.println(myObject.hashCode());
 
        String myString = "hello";
        System.out.println(myString.toString());
        System.out.println(myString.hashCode());
 
        Object[] myObjectArray = new Object[3];
        System.out.println(myObjectArray.toString());
        System.out.println(myObjectArray.hashCode());
 
        String[] myStringArray = new String[3];
        System.out.println(myStringArray.toString());
        System.out.println(myStringArray.hashCode());
 
        int[] myIntArray = new int[3];
        System.out.println(myIntArray.toString());
        System.out.println(myIntArray.hashCode());
 
        double[] myDoubleArray = new double[3];
        System.out.println(myDoubleArray.toString());
        System.out.println(myDoubleArray.hashCode());
 
        boolean[] myBooleanArray = new boolean[3];
        System.out.println(myBooleanArray.toString());
        System.out.println(myBooleanArray.hashCode());
    }
}