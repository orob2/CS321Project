/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.possibleprojectdesign;

import java.util.Stack;

public class Currency {
    int currentMoney;
    
    public Currency()
    {
        currentMoney = 15;
    }
    public int getCurrentMoney()
    {
        return currentMoney;
    }
    
    public boolean purchaseCharacter(Character c, Stack teamStack)
    {
        
        if (currentMoney >= c.getCost())
        {
            currentMoney -= c.getCost();
            teamStack.push(c);
            return true;
        }
        else
            return false;
            
    }
}
