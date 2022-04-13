package uieditor;

import java.util.Stack;
import javax.swing.JFrame;
import projectdesign.Character;

public class BattleUI extends javax.swing.JFrame {

    int wins;
    int losses;

    public BattleUI() {
        initComponents();
    }

    public void outputVictory(int victoryValue) {

        if (victoryValue == 0) {
            resultBox.setText("You tied!");
        } else if (victoryValue == 1) {
            resultBox.setText("You win!");
        } else if (victoryValue == -1) {
            resultBox.setText("You lose! Get your revenge!");
        }
    }

    public void outputBattleCharacter(Stack teamStack, Stack oppStack) {
        Character c;
        for (int i = 0; i < teamStack.size(); i++) {
            c = (Character) teamStack.elementAt(i);
            switch (i) {
                case 0:
                    TeamPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                    Pos1AttLabel.setText(String.valueOf("Att: " + c.getAttack()));
                    Pos1DefLabel.setText(String.valueOf("Def: " + c.getDefense()));
                    break;
                case 1:
                    TeamPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                    Pos2AttLabel.setText(String.valueOf("Att: " + c.getAttack()));
                    Pos2DefLabel.setText(String.valueOf("Def: " + c.getDefense()));
                    break;
                case 2:
                    TeamPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                    Pos3AttLabel.setText(String.valueOf("Att: " + c.getAttack()));
                    Pos3DefLabel.setText(String.valueOf("Def: " + c.getDefense()));
                    break;
                case 3:
                    TeamPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                    Pos4AttLabel.setText(String.valueOf("Att: " + c.getAttack()));
                    Pos4DefLabel.setText(String.valueOf("Def: " + c.getDefense()));
                    break;
                case 4:
                    TeamPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                    Pos5AttLabel.setText(String.valueOf("Att: " + c.getAttack()));
                    Pos5DefLabel.setText(String.valueOf("Def: " + c.getDefense()));
                    break;
                case 5:
                    TeamPos6.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                    Pos6AttLabel.setText(String.valueOf("Att: " + c.getAttack()));
                    Pos6DefLabel.setText(String.valueOf("Def: " + c.getDefense()));
                    break;
                case 6:
                    TeamPos7.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                    Pos7AttLabel.setText(String.valueOf("Att: " + c.getAttack()));
                    Pos7DefLabel.setText(String.valueOf("Def: " + c.getDefense()));
                    break;
                case 7:
                    TeamPos8.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                    Pos8AttLabel.setText(String.valueOf("Att: " + c.getAttack()));
                    Pos8DefLabel.setText(String.valueOf("Def: " + c.getDefense()));
                    break;
                case 8:
                    TeamPos9.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                    Pos9AttLabel.setText(String.valueOf("Att: " + c.getAttack()));
                    Pos9DefLabel.setText(String.valueOf("Def: " + c.getDefense()));
                    break;
                case 9:
                    TeamPos10.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                    Pos10AttLabel.setText(String.valueOf("Att: " + c.getAttack()));
                    Pos10DefLabel.setText(String.valueOf("Def: " + c.getDefense()));
                    break;
            }
        }
        for (int j = 0; j < oppStack.size(); j++) {
            c = (Character) oppStack.elementAt(j);
            switch (j) {
                case 0:
                    OppPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                    OppPos1AttLabel.setText(String.valueOf("Att: " + c.getAttack()));
                    OppPos1DefLabel.setText(String.valueOf("Def: " + c.getDefense()));
                    break;
                case 1:
                    OppPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                    OppPos2AttLabel.setText(String.valueOf("Att: " + c.getAttack()));
                    OppPos2DefLabel.setText(String.valueOf("Def: " + c.getDefense()));
                    break;
                case 2:
                    OppPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                    OppPos3AttLabel.setText(String.valueOf("Att: " + c.getAttack()));
                    OppPos3DefLabel.setText(String.valueOf("Def: " + c.getDefense()));
                    break;
                case 3:
                    OppPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                    OppPos4AttLabel.setText(String.valueOf("Att: " + c.getAttack()));
                    OppPos4DefLabel.setText(String.valueOf("Def: " + c.getDefense()));
                    break;
                case 4:
                    OppPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                    OppPos5AttLabel.setText(String.valueOf("Att: " + c.getAttack()));
                    OppPos5DefLabel.setText(String.valueOf("Def: " + c.getDefense()));
                    break;
                case 5:
                    OppPos6.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                    OppPos6AttLabel.setText(String.valueOf("Att: " + c.getAttack()));
                    OppPos6DefLabel.setText(String.valueOf("Def: " + c.getDefense()));
                    break;
                case 6:
                    OppPos7.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                    OppPos7AttLabel.setText(String.valueOf("Att: " + c.getAttack()));
                    OppPos7DefLabel.setText(String.valueOf("Def: " + c.getDefense()));
                    break;
                case 7:
                    OppPos8.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                    OppPos8AttLabel.setText(String.valueOf("Att: " + c.getAttack()));
                    OppPos8DefLabel.setText(String.valueOf("Def: " + c.getDefense()));
                    break;
                case 8:
                    OppPos9.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                    OppPos9AttLabel.setText(String.valueOf("Att: " + c.getAttack()));
                    OppPos9DefLabel.setText(String.valueOf("Def: " + c.getDefense()));
                    break;
                case 9:
                    OppPos10.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImageName())));
                    OppPos10AttLabel.setText(String.valueOf("Att: " + c.getAttack()));
                    OppPos10DefLabel.setText(String.valueOf("Def: " + c.getDefense()));
                    break;
            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playAgain = new javax.swing.JToggleButton();
        resultBox = new javax.swing.JLabel();
        exit = new javax.swing.JToggleButton();
        TeamPos1 = new javax.swing.JLabel();
        TeamPos2 = new javax.swing.JLabel();
        TeamPos3 = new javax.swing.JLabel();
        TeamPos4 = new javax.swing.JLabel();
        TeamPos5 = new javax.swing.JLabel();
        TeamPos6 = new javax.swing.JLabel();
        TeamPos7 = new javax.swing.JLabel();
        TeamPos8 = new javax.swing.JLabel();
        TeamPos9 = new javax.swing.JLabel();
        TeamPos10 = new javax.swing.JLabel();
        TeamName = new javax.swing.JLabel();
        TeamPos11 = new javax.swing.JLabel();
        TeamPos12 = new javax.swing.JLabel();
        TeamPos13 = new javax.swing.JLabel();
        TeamPos14 = new javax.swing.JLabel();
        TeamPos15 = new javax.swing.JLabel();
        TeamPos16 = new javax.swing.JLabel();
        TeamPos17 = new javax.swing.JLabel();
        TeamPos18 = new javax.swing.JLabel();
        TeamPos19 = new javax.swing.JLabel();
        EnemyTeamLabel = new javax.swing.JLabel();
        OppPos1 = new javax.swing.JLabel();
        OppPos2 = new javax.swing.JLabel();
        OppPos3 = new javax.swing.JLabel();
        OppPos4 = new javax.swing.JLabel();
        OppPos5 = new javax.swing.JLabel();
        OppPos6 = new javax.swing.JLabel();
        OppPos7 = new javax.swing.JLabel();
        OppPos8 = new javax.swing.JLabel();
        OppPos9 = new javax.swing.JLabel();
        OppPos10 = new javax.swing.JLabel();
        Pos1AttLabel = new javax.swing.JLabel();
        Pos1DefLabel = new javax.swing.JLabel();
        Pos2AttLabel = new javax.swing.JLabel();
        Pos2DefLabel = new javax.swing.JLabel();
        Pos3AttLabel = new javax.swing.JLabel();
        Pos3DefLabel = new javax.swing.JLabel();
        Pos4DefLabel = new javax.swing.JLabel();
        Pos4AttLabel = new javax.swing.JLabel();
        Pos5AttLabel = new javax.swing.JLabel();
        Pos5DefLabel = new javax.swing.JLabel();
        Pos6AttLabel = new javax.swing.JLabel();
        Pos6DefLabel = new javax.swing.JLabel();
        Pos7AttLabel = new javax.swing.JLabel();
        Pos7DefLabel = new javax.swing.JLabel();
        Pos8AttLabel = new javax.swing.JLabel();
        Pos8DefLabel = new javax.swing.JLabel();
        Pos9AttLabel = new javax.swing.JLabel();
        Pos9DefLabel = new javax.swing.JLabel();
        Pos10AttLabel = new javax.swing.JLabel();
        Pos10DefLabel = new javax.swing.JLabel();
        OppPos1AttLabel = new javax.swing.JLabel();
        OppPos1DefLabel = new javax.swing.JLabel();
        OppPos2AttLabel = new javax.swing.JLabel();
        OppPos2DefLabel = new javax.swing.JLabel();
        OppPos3AttLabel = new javax.swing.JLabel();
        OppPos3DefLabel = new javax.swing.JLabel();
        OppPos4AttLabel = new javax.swing.JLabel();
        OppPos4DefLabel = new javax.swing.JLabel();
        OppPos5AttLabel = new javax.swing.JLabel();
        OppPos5DefLabel = new javax.swing.JLabel();
        OppPos6AttLabel = new javax.swing.JLabel();
        OppPos6DefLabel = new javax.swing.JLabel();
        OppPos7AttLabel = new javax.swing.JLabel();
        OppPos7DefLabel = new javax.swing.JLabel();
        OppPos8AttLabel = new javax.swing.JLabel();
        OppPos8DefLabel = new javax.swing.JLabel();
        OppPos9AttLabel = new javax.swing.JLabel();
        OppPos9DefLabel = new javax.swing.JLabel();
        OppPos10AttLabel = new javax.swing.JLabel();
        OppPos10DefLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        playAgain.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        playAgain.setText("Next");
        playAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainActionPerformed(evt);
            }
        });

        resultBox.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 30)); // NOI18N
        resultBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultBox.setText("Results");

        exit.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        exit.setText("Exit to Main Menu");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        TeamPos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        TeamPos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        TeamPos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        TeamPos4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        TeamPos5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        TeamPos6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        TeamPos7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        TeamPos8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        TeamPos9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        TeamPos10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        TeamName.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        TeamName.setText("Your Team");

        EnemyTeamLabel.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        EnemyTeamLabel.setText("vs Enemy Team");

        OppPos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos1AttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        Pos1AttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos1DefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        Pos1DefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos2AttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        Pos2AttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos2DefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        Pos2DefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos3AttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        Pos3AttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos3DefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        Pos3DefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos4DefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        Pos4DefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos4AttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        Pos4AttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos5AttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        Pos5AttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos5DefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        Pos5DefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos6AttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        Pos6AttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos6DefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        Pos6DefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos7AttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        Pos7AttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos7DefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        Pos7DefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos8AttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        Pos8AttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos8DefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        Pos8DefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos9AttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        Pos9AttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos9DefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        Pos9DefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos10AttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        Pos10AttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Pos10DefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        Pos10DefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos1AttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        OppPos1AttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos1DefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        OppPos1DefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos2AttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        OppPos2AttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos2DefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        OppPos2DefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos3AttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        OppPos3AttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos3DefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        OppPos3DefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos4AttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        OppPos4AttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos4DefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        OppPos4DefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos5AttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        OppPos5AttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos5DefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        OppPos5DefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos6AttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        OppPos6AttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos6DefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        OppPos6DefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos7AttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        OppPos7AttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos7DefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        OppPos7DefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos8AttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        OppPos8AttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos8DefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        OppPos8DefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos9AttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        OppPos9AttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos9DefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        OppPos9DefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos10AttLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        OppPos10AttLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OppPos10DefLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        OppPos10DefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(OppPos1AttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(OppPos1DefLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(OppPos2AttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(OppPos2DefLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(OppPos3AttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(OppPos3DefLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(OppPos4AttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(OppPos4DefLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(OppPos5AttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(OppPos5DefLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(OppPos6AttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(OppPos6DefLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TeamPos1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(Pos2AttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Pos2DefLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TeamPos2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(Pos3AttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Pos3DefLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TeamPos3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(Pos4AttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Pos4DefLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(44, 44, 44))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TeamPos4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(Pos5AttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Pos5DefLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(44, 44, 44))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TeamPos5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(Pos6AttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Pos6DefLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TeamPos6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(Pos1AttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(Pos1DefLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(EnemyTeamLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(OppPos1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(OppPos2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(OppPos3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(OppPos4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(OppPos5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(OppPos6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Pos7AttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Pos7DefLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27))
                                            .addComponent(TeamPos7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Pos8AttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Pos8DefLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33))
                                            .addComponent(TeamPos8, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(Pos9AttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Pos9DefLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(TeamPos9, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TeamPos10, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(Pos10AttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Pos10DefLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(OppPos7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(OppPos8, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(OppPos9, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(OppPos7AttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(OppPos7DefLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(71, 71, 71)
                                                .addComponent(OppPos8AttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(OppPos8DefLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(63, 63, 63)
                                                .addComponent(OppPos9AttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(OppPos9DefLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(OppPos10AttLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(OppPos10DefLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(OppPos10, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 164, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(TeamName)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(playAgain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit)
                .addGap(40, 40, 40))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TeamPos11)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TeamPos12)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TeamPos13)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TeamPos14)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TeamPos15)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TeamPos16)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TeamPos17)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TeamPos18)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TeamPos19)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TeamName)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TeamPos6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TeamPos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TeamPos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TeamPos4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TeamPos3, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(TeamPos5, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(TeamPos8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TeamPos7, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(TeamPos10, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(TeamPos9, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pos1AttLabel)
                    .addComponent(Pos1DefLabel)
                    .addComponent(Pos2AttLabel)
                    .addComponent(Pos2DefLabel)
                    .addComponent(Pos3AttLabel)
                    .addComponent(Pos3DefLabel)
                    .addComponent(Pos4AttLabel)
                    .addComponent(Pos4DefLabel)
                    .addComponent(Pos5AttLabel)
                    .addComponent(Pos5DefLabel)
                    .addComponent(Pos6AttLabel)
                    .addComponent(Pos6DefLabel)
                    .addComponent(Pos7AttLabel)
                    .addComponent(Pos7DefLabel)
                    .addComponent(Pos8AttLabel)
                    .addComponent(Pos8DefLabel)
                    .addComponent(Pos9AttLabel)
                    .addComponent(Pos9DefLabel)
                    .addComponent(Pos10AttLabel)
                    .addComponent(Pos10DefLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                .addComponent(EnemyTeamLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OppPos6, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(OppPos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OppPos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OppPos4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OppPos3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OppPos5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OppPos8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OppPos7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OppPos10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OppPos9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OppPos9AttLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(OppPos1DefLabel)
                        .addComponent(OppPos2AttLabel)
                        .addComponent(OppPos2DefLabel)
                        .addComponent(OppPos3AttLabel)
                        .addComponent(OppPos3DefLabel)
                        .addComponent(OppPos4AttLabel)
                        .addComponent(OppPos4DefLabel)
                        .addComponent(OppPos5AttLabel)
                        .addComponent(OppPos5DefLabel)
                        .addComponent(OppPos6AttLabel)
                        .addComponent(OppPos6DefLabel)
                        .addComponent(OppPos7AttLabel)
                        .addComponent(OppPos7DefLabel)
                        .addComponent(OppPos8DefLabel)
                        .addComponent(OppPos10AttLabel)
                        .addComponent(OppPos10DefLabel)
                        .addComponent(OppPos1AttLabel)
                        .addComponent(OppPos8AttLabel)
                        .addComponent(OppPos9DefLabel)))
                .addContainerGap(390, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 588, Short.MAX_VALUE)
                    .addComponent(TeamPos11)
                    .addGap(0, 589, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 588, Short.MAX_VALUE)
                    .addComponent(TeamPos12)
                    .addGap(0, 589, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 588, Short.MAX_VALUE)
                    .addComponent(TeamPos13)
                    .addGap(0, 589, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 588, Short.MAX_VALUE)
                    .addComponent(TeamPos14)
                    .addGap(0, 589, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 588, Short.MAX_VALUE)
                    .addComponent(TeamPos15)
                    .addGap(0, 589, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 588, Short.MAX_VALUE)
                    .addComponent(TeamPos16)
                    .addGap(0, 589, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 588, Short.MAX_VALUE)
                    .addComponent(TeamPos17)
                    .addGap(0, 589, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 588, Short.MAX_VALUE)
                    .addComponent(TeamPos18)
                    .addGap(0, 589, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 588, Short.MAX_VALUE)
                    .addComponent(TeamPos19)
                    .addGap(0, 589, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainActionPerformed
        this.setVisible(false);
        if (this.wins == 3) {
            EndScreenUI eui = new EndScreenUI();
            eui.setExtendedState(JFrame.MAXIMIZED_BOTH);
            eui.displayWin();
            eui.setVisible(true);
        } else if (this.losses == 3) {
            EndScreenUI eui = new EndScreenUI();
            eui.setExtendedState(JFrame.MAXIMIZED_BOTH);
            eui.displayLoss();
            eui.setVisible(true);
        } else {
            CharacterSelectUI csui = new CharacterSelectUI();
            csui.wins = this.wins;
            csui.losses = this.losses;
            csui.setExtendedState(JFrame.MAXIMIZED_BOTH);
            csui.setWinLossLabel();
            csui.setVisible(true);
        }
    }//GEN-LAST:event_playAgainActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.setVisible(false);
        MenuUI mui = new MenuUI();
        mui.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mui.setVisible(true);
        mui.wins = this.wins;
        mui.losses = this.losses;
    }//GEN-LAST:event_exitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EnemyTeamLabel;
    private javax.swing.JLabel OppPos1;
    private javax.swing.JLabel OppPos10;
    private javax.swing.JLabel OppPos10AttLabel;
    private javax.swing.JLabel OppPos10DefLabel;
    private javax.swing.JLabel OppPos1AttLabel;
    private javax.swing.JLabel OppPos1DefLabel;
    private javax.swing.JLabel OppPos2;
    private javax.swing.JLabel OppPos2AttLabel;
    private javax.swing.JLabel OppPos2DefLabel;
    private javax.swing.JLabel OppPos3;
    private javax.swing.JLabel OppPos3AttLabel;
    private javax.swing.JLabel OppPos3DefLabel;
    private javax.swing.JLabel OppPos4;
    private javax.swing.JLabel OppPos4AttLabel;
    private javax.swing.JLabel OppPos4DefLabel;
    private javax.swing.JLabel OppPos5;
    private javax.swing.JLabel OppPos5AttLabel;
    private javax.swing.JLabel OppPos5DefLabel;
    private javax.swing.JLabel OppPos6;
    private javax.swing.JLabel OppPos6AttLabel;
    private javax.swing.JLabel OppPos6DefLabel;
    private javax.swing.JLabel OppPos7;
    private javax.swing.JLabel OppPos7AttLabel;
    private javax.swing.JLabel OppPos7DefLabel;
    private javax.swing.JLabel OppPos8;
    private javax.swing.JLabel OppPos8AttLabel;
    private javax.swing.JLabel OppPos8DefLabel;
    private javax.swing.JLabel OppPos9;
    private javax.swing.JLabel OppPos9AttLabel;
    private javax.swing.JLabel OppPos9DefLabel;
    private javax.swing.JLabel Pos10AttLabel;
    private javax.swing.JLabel Pos10DefLabel;
    private javax.swing.JLabel Pos1AttLabel;
    private javax.swing.JLabel Pos1DefLabel;
    private javax.swing.JLabel Pos2AttLabel;
    private javax.swing.JLabel Pos2DefLabel;
    private javax.swing.JLabel Pos3AttLabel;
    private javax.swing.JLabel Pos3DefLabel;
    private javax.swing.JLabel Pos4AttLabel;
    private javax.swing.JLabel Pos4DefLabel;
    private javax.swing.JLabel Pos5AttLabel;
    private javax.swing.JLabel Pos5DefLabel;
    private javax.swing.JLabel Pos6AttLabel;
    private javax.swing.JLabel Pos6DefLabel;
    private javax.swing.JLabel Pos7AttLabel;
    private javax.swing.JLabel Pos7DefLabel;
    private javax.swing.JLabel Pos8AttLabel;
    private javax.swing.JLabel Pos8DefLabel;
    private javax.swing.JLabel Pos9AttLabel;
    private javax.swing.JLabel Pos9DefLabel;
    private javax.swing.JLabel TeamName;
    private javax.swing.JLabel TeamPos1;
    private javax.swing.JLabel TeamPos10;
    private javax.swing.JLabel TeamPos11;
    private javax.swing.JLabel TeamPos12;
    private javax.swing.JLabel TeamPos13;
    private javax.swing.JLabel TeamPos14;
    private javax.swing.JLabel TeamPos15;
    private javax.swing.JLabel TeamPos16;
    private javax.swing.JLabel TeamPos17;
    private javax.swing.JLabel TeamPos18;
    private javax.swing.JLabel TeamPos19;
    private javax.swing.JLabel TeamPos2;
    private javax.swing.JLabel TeamPos3;
    private javax.swing.JLabel TeamPos4;
    private javax.swing.JLabel TeamPos5;
    private javax.swing.JLabel TeamPos6;
    private javax.swing.JLabel TeamPos7;
    private javax.swing.JLabel TeamPos8;
    private javax.swing.JLabel TeamPos9;
    private javax.swing.JToggleButton exit;
    private javax.swing.JToggleButton playAgain;
    private javax.swing.JLabel resultBox;
    // End of variables declaration//GEN-END:variables
}
