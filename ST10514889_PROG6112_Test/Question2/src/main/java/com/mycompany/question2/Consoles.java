/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2;

/**
 *
 * @author nemat
 */
public abstract class Consoles implements IConsoles{
    
    protected String consoleType;
    protected String store;
    protected int totalSales;

    public Consoles(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() {
        
        return consoleType;
    }

    @Override
    public String getStorer() {
        
        return store;
    }

    @Override
    public int getTotalSales() {
        
        return totalSales;
    }
    
    
}
