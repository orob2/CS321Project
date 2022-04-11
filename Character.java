
package projectdesign;
import java.util.*;


public class Character {
    String name;
    String imageName;
    int attack;
    int defense;
    int cost;
    
    public  Character()
    {
        name = "";
        imageName = "";
        attack = 0;
        defense = 0;
        cost = 0;
    }
    public Character(String n, String i, int a, int d, int c)
    {
        name = n;
        imageName = i;
        attack = a;
        defense = d;
        cost = c;
    }
    public String getName()
    {
        return name;
    }
    public String getImageName()
    {
        return imageName;
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
    public void generateEnemies(Stack teamStack, Stack oppStack, int round)
    {
      Random randGen = new Random();
      int randNum;
      Character c;      
      
      for (int i = 0; i < teamStack.size(); i++)
      {
          randNum = randGen.nextInt(4);
         
          switch(randNum)
          {
              case 0:
                  c = new Character("Fridge", "/images/HappyFridge.png", 3, 4, 6);
                  oppStack.push(c);
                  break;
              case 1:
                  c = new Character("Chair", "/images/ScreamingChair.png", 4, 1, 4);
                  oppStack.push(c);
                  break;
              case 2:
                  c = new Character("Table", "/images/SmirkyTable.png", 2, 3, 4);
                  oppStack.push(c);
                  break;
              case 3:
                   c = new Character("Lamp", "/images/LampLady.png", 2, 1, 2);
                  oppStack.push(c);
                  break;
                  
          }
      }
       if (round == 1)
      {
          c = new Character("Lamp", "/images/LampLady.png", 2, 1, 2);
          oppStack.push(c); 
      }
      if (round == 2)
      {
          c = new Character("Table", "/images/SmirkyTable.png", 2, 3, 4);
          oppStack.push(c); 
      }
      if (round == 3)
      {
          c = new Character("Chair", "/images/ScreamingChair.png", 4, 1, 4);
          oppStack.push(c); 
      }
     
    }
    
    
}
