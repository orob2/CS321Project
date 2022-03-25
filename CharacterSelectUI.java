
package uieditor;
import projectdesign.Character;
import projectdesign.Currency;
import projectdesign.Item;
import java.util.Stack;


public class CharacterSelectUI extends javax.swing.JFrame {
        Item upgrade;
        Character c;
        Stack teamStack;
        Stack oppStack;   
        Currency curr;
        
  
    public CharacterSelectUI() {
        initComponents();
        teamStack = new Stack();
        oppStack = new Stack();
        curr = new Currency();
        upgrade = new Item();
    }
    public void outputCharacterAdd()
    {
        if (curr.purchaseCharacter(c, teamStack))
        {
            numericalMoney.setText(String.valueOf(curr.getCurrentMoney()));
            purchaseUpdate.setText(c.getName() + " was added to the team!"); 
        }
        else
        purchaseUpdate.setText("Not enough funds!");    
    }
    public void outputDefenseItemAdd()
    {
        if (curr.purchaseDefenseItem(upgrade, c))
        {
            numericalMoney.setText(String.valueOf(curr.getCurrentMoney()));
            purchaseUpdate.setText(c.getName() + "'s defense was upgraded"); 
        }
        else
            purchaseUpdate.setText("Not enough funds!");    
    }
    public void outputAttackItemAdd()
    {
        if (curr.purchaseDefenseItem(upgrade, c))
        {
            numericalMoney.setText(String.valueOf(curr.getCurrentMoney()));
            purchaseUpdate.setText(c.getName() + "'s attack was upgraded"); 
        }
        else
            purchaseUpdate.setText("Not enough funds!");    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ChooseFighterLabel = new javax.swing.JLabel();
        CurrentFundsLabel = new javax.swing.JLabel();
        numericalMoney = new javax.swing.JLabel();
        purchaseUpdate = new javax.swing.JLabel();
        LampButton = new javax.swing.JButton();
        AttUpgradeButton = new javax.swing.JButton();
        DefUpgradeButton = new javax.swing.JButton();
        TableButton = new javax.swing.JButton();
        ItemsLabel = new javax.swing.JLabel();
        ChairButton = new javax.swing.JButton();
        BattleButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ChooseFighterLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ChooseFighterLabel.setText("Choose Your Fighters");

        CurrentFundsLabel.setText("Current Funds:");

        numericalMoney.setText("$ 15");

        purchaseUpdate.setText("Click to add Characters to your team.");

        LampButton.setText("Lamp");
        LampButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LampButtonActionPerformed(evt);
            }
        });

        AttUpgradeButton.setText("Attack Upgrade (+3)");
        AttUpgradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttUpgradeButtonActionPerformed(evt);
            }
        });

        DefUpgradeButton.setText("Defense Upgrade (+3)");
        DefUpgradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefUpgradeButtonActionPerformed(evt);
            }
        });

        TableButton.setText("Table ");
        TableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableButtonActionPerformed(evt);
            }
        });

        ItemsLabel.setText("Items");

        ChairButton.setText("Chair");
        ChairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChairButtonActionPerformed(evt);
            }
        });

        BattleButton.setText("BATTLE!");
        BattleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BattleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ItemsLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(ChooseFighterLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(CurrentFundsLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(numericalMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(LampButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(TableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(ChairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DefUpgradeButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AttUpgradeButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(purchaseUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(BattleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChooseFighterLabel)
                    .addComponent(CurrentFundsLabel)
                    .addComponent(numericalMoney))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchaseUpdate)
                    .addComponent(BattleButton))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LampButton)
                    .addComponent(TableButton)
                    .addComponent(ChairButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(ItemsLabel)
                .addGap(18, 18, 18)
                .addComponent(AttUpgradeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DefUpgradeButton)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LampButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LampButtonActionPerformed
        c = new Character("Lamp", 1, 1, 1);
        outputCharacterAdd();
    }//GEN-LAST:event_LampButtonActionPerformed

    private void AttUpgradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttUpgradeButtonActionPerformed
        c = (Character) teamStack.peek();
        outputAttackItemAdd();
    }//GEN-LAST:event_AttUpgradeButtonActionPerformed

    private void DefUpgradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DefUpgradeButtonActionPerformed
        c = (Character) teamStack.peek();
        outputDefenseItemAdd();
    }//GEN-LAST:event_DefUpgradeButtonActionPerformed

    private void TableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableButtonActionPerformed
        c = new Character("Table", 3, 2, 3);
        outputCharacterAdd();

    }//GEN-LAST:event_TableButtonActionPerformed

    private void ChairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChairButtonActionPerformed
        c = new Character("Chair", 2, 3, 3);
        outputCharacterAdd();
    }//GEN-LAST:event_ChairButtonActionPerformed

    private void BattleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BattleButtonActionPerformed
        c.generateEnemies(teamStack, oppStack);
        int victoryValue = c.battle(teamStack, oppStack, c, c);

        this.setVisible(false);
        BattleUI bui = new BattleUI();
        bui.outputVictory(victoryValue);
        bui.setVisible(true);
    }//GEN-LAST:event_BattleButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CharacterSelectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CharacterSelectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CharacterSelectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CharacterSelectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CharacterSelectUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AttUpgradeButton;
    private javax.swing.JToggleButton BattleButton;
    private javax.swing.JButton ChairButton;
    private javax.swing.JLabel ChooseFighterLabel;
    private javax.swing.JLabel CurrentFundsLabel;
    private javax.swing.JButton DefUpgradeButton;
    private javax.swing.JLabel ItemsLabel;
    private javax.swing.JButton LampButton;
    private javax.swing.JButton TableButton;
    private javax.swing.JLabel numericalMoney;
    private javax.swing.JLabel purchaseUpdate;
    // End of variables declaration//GEN-END:variables
}
