
package projectdesign;
import java.util.Stack;


public class Currency {
    int currentMoney;
    
    public Currency()
    {
        currentMoney = 20;
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
    public boolean purchaseDefenseItem(Item item, Character c)
    {
        
        if (currentMoney >= item.getItemCost())
        {
            currentMoney -= item.getItemCost();
            item.addDefenseItem(c);
            return true;
        }
        else
            return false;
            
    }
    public boolean purchaseAttackItem(Item item, Character c)
    {
        
        if (currentMoney >= item.getItemCost())
        {
            currentMoney -= item.getItemCost();
            item.addAttackItem(c);
            return true;
        }
        else
            return false;
            
    }
}
