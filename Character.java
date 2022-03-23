/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Riley
 */
public class Character {
    int power;
    int toughness;
    int newT;
    int damageTaken;
    int money;
    int round;
    

   public void setPower(int power){
             
        this.power = power;
    }
    
    public int getPower() {
        return power;
    
        }
    
    public void setTough(int toughness){
             
        this.toughness = toughness;
    }
    
    public int getTough() {
        return toughness;
    
        }
    
    public void setDamage(int damageTaken){
             
        this.toughness = toughness;
    }
    
    public int getDamage() {
        return damageTaken;
        }
    
    public void takeDamage()
    {
        this.newT = this.toughness - this.damageTaken;
        toughness = this.newT;
    }
    public void setMoney(int Round){
        if(Round == 1)
        money = 10;
        else if(Round > 1)
        {
            money = (10*Round);
        }
        else if(Round <= 0)
        {
            money = 0;
        } 
    }
    public String getMoney(){
        return String.valueOf(money);
    }
    public void setRound (int number){
        round = number;
    }
    public int getRound (){
    return round;
    }
public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShopFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShopFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShopFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShopFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShopFrame().setVisible(true);
            }
        });
    }
}
