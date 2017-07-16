package com.emmasky;

/**
 * Created by emmas on 6/5/2017.
 */
public class Printer
{
    private int tonerLevel;
    private int numberOfPrintedPages;
    private String printerType;

    Printer(String _printerType)
    {
        printerType = _printerType;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPrintedPages() {
        return numberOfPrintedPages;
    }

    public String getPrinterType() {
        return printerType;
    }

    public void print()
    {
        System.out.println("Using " + printerType + " Printer");
        System.out.println("Printing...");

        numberOfPrintedPages++;
        tonerLevel--;
    }
    public void fillToner(int fillPercentage)
    {
        if(tonerLevel + fillPercentage <= 100)
        {
            tonerLevel =+ fillPercentage;
        }
        else
            tonerLevel = 100;

        System.out.println("Printer filled");
    }
}
