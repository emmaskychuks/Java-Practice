package com.emmasky;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer("Duplex");
	    printer.fillToner(50);

	    for(int count  = 0; count < 5; count++) {
			printer.print();
		}
	    System.out.println("Toner Level: " + printer.getTonerLevel() + " Number of printed pages: "
		+ printer.getNumberOfPrintedPages());
    }
}
