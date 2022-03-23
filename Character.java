/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.possibleprojectdesign;
import java.util.*;
//import java.util.Random;

/**
 *
 * @author Anna
 */
// Character class holds all properties of a single character
public class Character {
    String name;
    int attack;
    int defense;
    int cost;
    
    public  Character()
    {
        name = "";
        attack = 0;
        defense = 0;
        cost = 0;
    }
    public Character(String n, int a, int d, int c)
    {
        name = n;
        attack = a;
        defense = d;
        cost = c;
    }
    public String getName()
    {
        return name;
    }
    public int getAttack()
    {
        return attack;
    }
    public int getDefense()
    {
        return defense;
    }
    public int getCost()
    {
        return cost;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setAttack(int att)
    {
        attack = att;
    }
    public void setDefense(int def)
    {
        defense = def;
    }
    public void setCost(int c)
    {
        cost = c;
    }
    public int battle(Stack teamStack, Stack oppStack, Character ch1, Character ch2)
    {
        int teamAttack;
        int oppAttack;
        int teamDefense;
        int oppDefense;
        
        while (!teamStack.isEmpty() && !oppStack.isEmpty())
        {
            ch1 = (Character) teamStack.peek();
            ch2 = (Character) oppStack.peek();
            teamAttack = ch1.attack;
            oppAttack = ch2.attack;
            teamDefense = ch1.defense;
            oppDefense = ch2.defense;
            
            if (teamAttack >= oppDefense)
            {
                oppStack.pop();
            }
            else if (teamAttack < oppDefense)
            {
                ch2.setDefense(oppDefense - teamAttack);
            }
            
            if(oppAttack >= teamDefense)
            {
                teamStack.pop();
            }
            else if (oppAttack < teamDefense)
            {
                 ch1.setDefense(teamDefense - oppAttack);
            }
                 
        }
        if (teamStack.isEmpty() && oppStack.isEmpty())
            return 0;
        else if (teamStack.isEmpty())
            return -1;
        else if (oppStack.isEmpty())
            return 1;
        return 0;
    }
    public void generateEnemies(Stack teamStack, Stack oppStack)
    {
      Random randGen = new Random();
      int randNum;
      Character c;
      for (int i = 0; i < teamStack.size(); i++)
      {
          randNum = randGen.nextInt(3);
          switch(randNum)
          {
              case 0:
                  c = new Character("lamp", 1, 1, 1);
                  oppStack.push(c);
                  break;
              case 1:
                  c = new Character("chair", 2, 3, 3);
                  oppStack.push(c);
                  break;
              case 2:
                  c = new Character("table", 3, 2, 3);
                  oppStack.push(c);
                  break;
          }
      }
    }
    
    public static void main(String args[]) {
    }
    
    
}