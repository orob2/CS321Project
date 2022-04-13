
package uieditor;
import projectdesign.Character;
import projectdesign.Currency;
import projectdesign.Item;
import java.util.Stack;
import javax.swing.JFrame;


public class CharacterSelectUI extends javax.swing.JFrame {
        Item upgrade;
        Character c;
        Stack teamStack;
        Stack oppStack;   
        Currency curr;
        int posCount;
        int wins;
        int losses;
        
  
    public CharacterSelectUI() {
        initComponents();
        teamStack = new Stack();
        oppStack = new Stack();
        curr = new Currency();
        upgrade = new Item();
        posCount = 1;
    }
    public void setWinLossLabel()
    {
       NumWinLabel.setText(String.valueOf(wins));
       NumLossLabel.setText(String.valueOf(losses));
    }
    public void displayCharacter()
    {
        switch (posCount)
        {
            case 1: 
                Pos1Label.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                AttPos1.setText("Att: " + String.valueOf(c.getAttack()));
                DefPos1.setText("Def: " + String.valueOf(c.getDefense()));
                break;
            case 2: 
                Pos2Label.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                AttPos2.setText("Att: " + String.valueOf(c.getAttack()));
                DefPos2.setText("Def: " + String.valueOf(c.getDefense()));
                break;
            case 3: 
                Pos3Label.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                AttPos3.setText("Att: " + String.valueOf(c.getAttack()));
                DefPos3.setText("Def: " + String.valueOf(c.getDefense()));
                break;
            case 4:
                Pos4Label.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                AttPos4.setText("Att: " + String.valueOf(c.getAttack()));
                DefPos4.setText("Def: " + String.valueOf(c.getDefense()));
                break;
            case 5: 
                Pos5Label.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                AttPos5.setText("Att: " + String.valueOf(c.getAttack()));
                DefPos5.setText("Def: " + String.valueOf(c.getDefense()));
                break;
            case 6: 
                Pos6Label.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                AttPos6.setText("Att: " + String.valueOf(c.getAttack()));
                DefPos6.setText("Def: " + String.valueOf(c.getDefense()));
                break;
            case 7: 
                Pos7Label.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                AttPos7.setText("Att: " + String.valueOf(c.getAttack()));
                DefPos7.setText("Def: " + String.valueOf(c.getDefense()));
                break;
            case 8:
                Pos8Label.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                AttPos8.setText("Att: " + String.valueOf(c.getAttack()));
                DefPos8.setText("Def: " + String.valueOf(c.getDefense()));
                break;
            case 9: 
                Pos9Label.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                AttPos9.setText("Att: " + String.valueOf(c.getAttack()));
                DefPos9.setText("Def: " + String.valueOf(c.getDefense()));
                break;
            case 10: 
                Pos10Label.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                AttPos10.setText("Att: " + String.valueOf(c.getAttack()));
                DefPos10.setText(String.valueOf(c.getDefense()));
                break;
            
        }
        posCount++;
    }
    public void outputCharacterAdd()
    {
        if (curr.purchaseCharacter(c, teamStack))
        {
            numericalMoney.setText(String.valueOf(curr.getCurrentMoney()));
            purchaseUpdate.setText(c.getName() + " was added to the team!"); 
            displayCharacter();
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
            posCount--;
            displayCharacter();
        }
        else
            purchaseUpdate.setText("Not enough funds!");    
    }
    public void outputAttackItemAdd()
    {
        if (curr.purchaseAttackItem(upgrade, c))
        {
            numericalMoney.setText(String.valueOf(curr.getCurrentMoney()));
            purchaseUpdate.setText(c.getName() + "'s attack was upgraded"); 
            posCount--;
            displayCharacter();
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
        Pos1Label = new javax.swing.JLabel();
        Pos2Label = new javax.swing.JLabel();
        Pos3Label = new javax.swing.JLabel();
        Pos4Label = new javax.swing.JLabel();
        Pos5Label = new javax.swing.JLabel();
        Pos6Label = new javax.swing.JLabel();
        Pos7Label = new javax.swing.JLabel();
        Pos8Label = new javax.swing.JLabel();
        Pos9Label = new javax.swing.JLabel();
        Pos10Label = new javax.swing.JLabel();
        LampLabel = new javax.swing.JLabel();
        ChairLabel = new javax.swing.JLabel();
        TableLabel = new javax.swing.JLabel();
        LampCostLabel = new javax.swing.JLabel();
        TableCostLabel = new javax.swing.JLabel();
        ChairCostLabel = new javax.swing.JLabel();
        AttUpgradeCostLabel = new javax.swing.JLabel();
        DefUpgradeCostLabel = new javax.swing.JLabel();
        InitLampAttLabel = new javax.swing.JLabel();
        InitLampDefLabel = new javax.swing.JLabel();
        InitTableAttLabel = new javax.swing.JLabel();
        InitTableDefLabel = new javax.swing.JLabel();
        InitChairAttLabel = new javax.swing.JLabel();
        InitChairDefLabel = new javax.swing.JLabel();
        AttPos1 = new javax.swing.JLabel();
        DefPos1 = new javax.swing.JLabel();
        AttPos2 = new javax.swing.JLabel();
        DefPos2 = new javax.swing.JLabel();
        AttPos3 = new javax.swing.JLabel();
        DefPos3 = new javax.swing.JLabel();
        AttPos4 = new javax.swing.JLabel();
        DefPos4 = new javax.swing.JLabel();
        AttPos5 = new javax.swing.JLabel();
        DefPos5 = new javax.swing.JLabel();
        AttPos6 = new javax.swing.JLabel();
        DefPos6 = new javax.swing.JLabel();
        AttPos7 = new javax.swing.JLabel();
        DefPos7 = new javax.swing.JLabel();
        AttPos8 = new javax.swing.JLabel();
        DefPos8 = new javax.swing.JLabel();
        AttPos9 = new javax.swing.JLabel();
        DefPos9 = new javax.swing.JLabel();
        AttPos10 = new javax.swing.JLabel();
        DefPos10 = new javax.swing.JLabel();
        FridgeLabel = new javax.swing.JLabel();
        FridgeButton = new javax.swing.JButton();
        FridgeCostLabel = new javax.swing.JLabel();
        InitFridgeAttLabel = new javax.swing.JLabel();
        InitFridgeDefLabel = new javax.swing.JLabel();
        WinsLabel = new javax.swing.JLabel();
        NumWinLabel = new javax.swing.JLabel();
        LossesLabel = new javax.swing.JLabel();
        NumLossLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ChooseFighterLabel.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 36)); // NOI18N
        ChooseFighterLabel.setText("Choose Your Fighters");

        CurrentFundsLabel.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        CurrentFundsLabel.setText("Current Funds:");

        numericalMoney.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        numericalMoney.setText("$ 20");

        purchaseUpdate.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        purchaseUpdate.setText("Click to add characters to your team.");

        LampButton.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        LampButton.setText("Lamp");
        LampButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LampButtonActionPerformed(evt);
            }
        });

        AttUpgradeButton.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        AttUpgradeButton.setText("Attack Upgrade (+5)");
        AttUpgradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttUpgradeButtonActionPerformed(evt);
            }
        });

        DefUpgradeButton.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        DefUpgradeButton.setText("Defense Upgrade (+5)");
        DefUpgradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefUpgradeButtonActionPerformed(evt);
            }
        });

        TableButton.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        TableButton.setText("Table ");
        TableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableButtonActionPerformed(evt);
            }
        });

        ItemsLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        ItemsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ItemsLabel.setText("Items");

        ChairButton.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        ChairButton.setText("Chair");
        ChairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChairButtonActionPerformed(evt);
            }
        });

        BattleButton.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        BattleButton.setText("BATTLE!");
        BattleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BattleButtonActionPerformed(evt);
            }
        });

        Pos1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos6Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos7Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos8Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos9Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos10Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LampLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LampLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LampLady.png"))); // NOI18N

        ChairLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ChairLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ScreamingChair.png"))); // NOI18N

        TableLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TableLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SmirkyTable.png"))); // NOI18N

        LampCostLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        LampCostLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LampCostLabel.setText("Cost: $2");

        TableCostLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        TableCostLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TableCostLabel.setText("Cost: $4");

        ChairCostLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        ChairCostLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ChairCostLabel.setText("Cost: $4");

        AttUpgradeCostLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        AttUpgradeCostLabel.setText("Cost: $8");

        DefUpgradeCostLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        DefUpgradeCostLabel.setText("Cost: $8");

        InitLampAttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        InitLampAttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InitLampAttLabel.setText("Attack: 2");

        InitLampDefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        InitLampDefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InitLampDefLabel.setText("Defense: 1");

        InitTableAttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        InitTableAttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InitTableAttLabel.setText("Attack: 2");

        InitTableDefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        InitTableDefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InitTableDefLabel.setText("Defense: 3");

        InitChairAttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        InitChairAttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InitChairAttLabel.setText("Attack: 4");

        InitChairDefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        InitChairDefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InitChairDefLabel.setText("Defense: 1");

        AttPos1.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        DefPos1.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        AttPos2.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        DefPos2.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        AttPos3.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        DefPos3.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        AttPos4.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        DefPos4.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        AttPos5.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        DefPos5.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        AttPos6.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        DefPos6.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        AttPos7.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        DefPos7.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        AttPos8.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        DefPos8.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        AttPos9.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        DefPos9.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        AttPos10.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        DefPos10.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        FridgeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FridgeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HappyFridge.png"))); // NOI18N
        FridgeLabel.setText("jLabel2");

        FridgeButton.setText("Fridge");
        FridgeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FridgeButtonActionPerformed(evt);
            }
        });

        FridgeCostLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        FridgeCostLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FridgeCostLabel.setText("Cost: $6");

        InitFridgeAttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        InitFridgeAttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InitFridgeAttLabel.setText("Attack: 3");

        InitFridgeDefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        InitFridgeDefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InitFridgeDefLabel.setText("Defense: 4");

        WinsLabel.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        WinsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WinsLabel.setText("Wins:");

        NumWinLabel.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        NumWinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumWinLabel.setText("0");

        LossesLabel.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LossesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LossesLabel.setText("Losses:");

        NumLossLabel.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        NumLossLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumLossLabel.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LampLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LampButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(InitLampDefLabel)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(InitLampAttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(LampCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(InitTableDefLabel)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(InitTableAttLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(TableCostLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(TableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(InitChairAttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ChairCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(InitChairDefLabel)))
                                    .addComponent(ChairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(InitFridgeAttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(InitFridgeDefLabel)
                                            .addComponent(FridgeCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(FridgeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(purchaseUpdate)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ChooseFighterLabel)
                                .addGap(104, 104, 104)
                                .addComponent(CurrentFundsLabel)
                                .addGap(18, 18, 18)
                                .addComponent(numericalMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(472, 472, 472)
                                .addComponent(BattleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pos1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(AttPos1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(DefPos1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pos2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(AttPos2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(DefPos2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ChairLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FridgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(690, 690, 690)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addComponent(DefUpgradeCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(AttUpgradeButton)
                                            .addComponent(DefUpgradeButton)
                                            .addComponent(ItemsLabel)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addComponent(AttUpgradeCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Pos3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Pos4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(AttPos5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(DefPos5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(AttPos6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(DefPos6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(AttPos7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(DefPos7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(AttPos8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(DefPos8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(AttPos9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(DefPos9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(AttPos10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(DefPos10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Pos5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Pos6Label, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Pos7Label, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Pos8Label, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Pos9Label, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Pos10Label, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(263, 263, 263)
                                                .addComponent(WinsLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(NumWinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(51, 51, 51)
                                                .addComponent(LossesLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(NumLossLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(AttPos3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(DefPos3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(AttPos4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(DefPos4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChooseFighterLabel)
                    .addComponent(CurrentFundsLabel)
                    .addComponent(numericalMoney)
                    .addComponent(BattleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WinsLabel)
                    .addComponent(NumWinLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LossesLabel)
                        .addComponent(NumLossLabel)))
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pos1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pos2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pos3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pos4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pos5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pos6Label, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pos7Label, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pos8Label, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pos9Label, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pos10Label, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AttPos1)
                    .addComponent(DefPos1)
                    .addComponent(AttPos2)
                    .addComponent(DefPos2)
                    .addComponent(AttPos3)
                    .addComponent(DefPos3)
                    .addComponent(AttPos4)
                    .addComponent(DefPos4)
                    .addComponent(AttPos5)
                    .addComponent(DefPos5)
                    .addComponent(AttPos6)
                    .addComponent(DefPos6)
                    .addComponent(AttPos7)
                    .addComponent(DefPos7)
                    .addComponent(AttPos8)
                    .addComponent(DefPos8)
                    .addComponent(AttPos9)
                    .addComponent(DefPos9)
                    .addComponent(AttPos10)
                    .addComponent(DefPos10))
                .addGap(121, 121, 121)
                .addComponent(purchaseUpdate)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LampLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LampButton)
                            .addComponent(TableButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LampCostLabel)
                            .addComponent(TableCostLabel))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InitLampAttLabel)
                            .addComponent(InitTableAttLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InitTableDefLabel)
                            .addComponent(InitLampDefLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(FridgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(ChairLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ChairButton)
                                    .addComponent(FridgeButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ItemsLabel)
                                .addGap(29, 29, 29)
                                .addComponent(AttUpgradeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AttUpgradeCostLabel)
                                .addGap(18, 18, 18)
                                .addComponent(DefUpgradeButton)
                                .addGap(5, 5, 5)
                                .addComponent(DefUpgradeCostLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ChairCostLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InitChairAttLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InitChairDefLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FridgeCostLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InitFridgeAttLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InitFridgeDefLabel)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LampButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LampButtonActionPerformed
        c = new Character("Lamp","/images/LampLady.png", 2, 1, 2);
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
        c = new Character("Table", "/images/SmirkyTable.png", 2, 3, 4);
        outputCharacterAdd();

    }//GEN-LAST:event_TableButtonActionPerformed

    private void ChairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChairButtonActionPerformed
        c = new Character("Chair", "/images/ScreamingChair.png", 4, 1, 4);
        outputCharacterAdd();
    }//GEN-LAST:event_ChairButtonActionPerformed

    private void BattleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BattleButtonActionPerformed
        this.setVisible(false);
        BattleUI bui = new BattleUI();
        bui.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        bui.setVisible(true);
        c.generateEnemies(teamStack, oppStack, wins);
        bui.outputBattleCharacter(teamStack, oppStack);
        int victoryValue = c.battle(teamStack, oppStack, c, c);
        if (victoryValue == 1)
            wins++;
        else if (victoryValue == -1)
            losses++;
        bui.wins = this.wins;
        bui.losses = this.losses;
        bui.outputVictory(victoryValue);
    }//GEN-LAST:event_BattleButtonActionPerformed

    private void FridgeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FridgeButtonActionPerformed
        c = new Character("Fridge", "/images/HappyFridge.png", 3, 4, 6);
        outputCharacterAdd();
    }//GEN-LAST:event_FridgeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AttPos1;
    private javax.swing.JLabel AttPos10;
    private javax.swing.JLabel AttPos2;
    private javax.swing.JLabel AttPos3;
    private javax.swing.JLabel AttPos4;
    private javax.swing.JLabel AttPos5;
    private javax.swing.JLabel AttPos6;
    private javax.swing.JLabel AttPos7;
    private javax.swing.JLabel AttPos8;
    private javax.swing.JLabel AttPos9;
    private javax.swing.JButton AttUpgradeButton;
    private javax.swing.JLabel AttUpgradeCostLabel;
    private javax.swing.JToggleButton BattleButton;
    private javax.swing.JButton ChairButton;
    private javax.swing.JLabel ChairCostLabel;
    private javax.swing.JLabel ChairLabel;
    private javax.swing.JLabel ChooseFighterLabel;
    private javax.swing.JLabel CurrentFundsLabel;
    private javax.swing.JLabel DefPos1;
    private javax.swing.JLabel DefPos10;
    private javax.swing.JLabel DefPos2;
    private javax.swing.JLabel DefPos3;
    private javax.swing.JLabel DefPos4;
    private javax.swing.JLabel DefPos5;
    private javax.swing.JLabel DefPos6;
    private javax.swing.JLabel DefPos7;
    private javax.swing.JLabel DefPos8;
    private javax.swing.JLabel DefPos9;
    private javax.swing.JButton DefUpgradeButton;
    private javax.swing.JLabel DefUpgradeCostLabel;
    private javax.swing.JButton FridgeButton;
    private javax.swing.JLabel FridgeCostLabel;
    private javax.swing.JLabel FridgeLabel;
    private javax.swing.JLabel InitChairAttLabel;
    private javax.swing.JLabel InitChairDefLabel;
    private javax.swing.JLabel InitFridgeAttLabel;
    private javax.swing.JLabel InitFridgeDefLabel;
    private javax.swing.JLabel InitLampAttLabel;
    private javax.swing.JLabel InitLampDefLabel;
    private javax.swing.JLabel InitTableAttLabel;
    private javax.swing.JLabel InitTableDefLabel;
    private javax.swing.JLabel ItemsLabel;
    private javax.swing.JButton LampButton;
    private javax.swing.JLabel LampCostLabel;
    private javax.swing.JLabel LampLabel;
    private javax.swing.JLabel LossesLabel;
    private javax.swing.JLabel NumLossLabel;
    private javax.swing.JLabel NumWinLabel;
    private javax.swing.JLabel Pos10Label;
    private javax.swing.JLabel Pos1Label;
    private javax.swing.JLabel Pos2Label;
    private javax.swing.JLabel Pos3Label;
    private javax.swing.JLabel Pos4Label;
    private javax.swing.JLabel Pos5Label;
    private javax.swing.JLabel Pos6Label;
    private javax.swing.JLabel Pos7Label;
    private javax.swing.JLabel Pos8Label;
    private javax.swing.JLabel Pos9Label;
    private javax.swing.JButton TableButton;
    private javax.swing.JLabel TableCostLabel;
    private javax.swing.JLabel TableLabel;
    private javax.swing.JLabel WinsLabel;
    private javax.swing.JLabel numericalMoney;
    private javax.swing.JLabel purchaseUpdate;
    // End of variables declaration//GEN-END:variables
}
