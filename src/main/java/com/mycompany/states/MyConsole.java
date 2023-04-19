/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.states;

/**
 *
 * @author rkaune
 */
public class MyConsole {
  public static void main(String[] args) {

    FileReader myFileReader = new FileReader("statenames.txt");

    String[] stateNames = myFileReader.getStringData(50);
    myFileReader.setFile("population.txt");
    int[] population = myFileReader.getIntData(50);

    States myStates = new States(stateNames, population);
    
    myStates.printPairs("population");

    // TO DO #3: Add the code to read and analyze the areas file.


    
  }
}
