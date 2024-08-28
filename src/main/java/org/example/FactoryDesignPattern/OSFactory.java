package org.example.FactoryDesignPattern;

public class OSFactory {
    OS getOS(String str)
    {
        if(str.equalsIgnoreCase("open"))
            return new Android();
        if(str.equalsIgnoreCase("old"))
            return new Windows();
        if(str.equalsIgnoreCase("limited"))
            return new Mac();
        else return null;
    }

}
