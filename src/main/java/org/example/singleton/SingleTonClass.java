package org.example.singleton;

public class SingleTonClass {
    static  SingleTonClass singleTonClass=null;
    private SingleTonClass()
    {
        System.out.println("Private constructor is called");
    }
    public static  SingleTonClass getInstance()
    {

        if(singleTonClass==null)
        {
            synchronized (SingleTonClass.class) {
                if(singleTonClass==null)  // double check
                singleTonClass = new SingleTonClass();
            }
        }
        return  singleTonClass;
    }

}
