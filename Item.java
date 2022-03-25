
package projectdesign;

public class Item extends Currency {
    int itemCost;
    public Item()
    {
        itemCost = 5;
    }
    public int getItemCost()
    {
        return itemCost;
    }
    public void addDefenseItem(Character c){
        c.setDefense(c.defense + 3);
        
    }
    public void addAttackItem(Character c){
        c.setAttack(c.attack + 3);
    }

   


}

