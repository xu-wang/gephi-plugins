/*
Copyright 2008-2010 Gephi
Authors : Patick J. McSweeney <pjmcswee@syr.edu>
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.gephi.ui.statistics.plugin;

/**
 *
 * @author pjmcswee
 */
public class ConnectedComponentPanel extends javax.swing.JPanel {

    /** Creates new form ConnectedComponentPanel */
    public ConnectedComponentPanel() {
        initComponents();
    }

   public boolean isDirected() {
        return directedRadioButton.isSelected();       
    }



    public void setDirected(boolean directed) {
         buttonGroup1.setSelected(directed ? directedRadioButton.getModel() : undirectedRadioButton.getModel(), true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        header = new org.jdesktop.swingx.JXHeader();
        directedRadioButton = new javax.swing.JRadioButton();
        undirectedRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        header.setDescription(org.openide.util.NbBundle.getMessage(ConnectedComponentPanel.class, "ConnectedComponentPanel.header.description")); // NOI18N
        header.setTitle(org.openide.util.NbBundle.getMessage(ConnectedComponentPanel.class, "ConnectedComponentPanel.header.title")); // NOI18N

        buttonGroup1.add(directedRadioButton);
        directedRadioButton.setText(org.openide.util.NbBundle.getMessage(ConnectedComponentPanel.class, "ConnectedComponentPanel.directedRadioButton.text")); // NOI18N

        buttonGroup1.add(undirectedRadioButton);
        undirectedRadioButton.setText(org.openide.util.NbBundle.getMessage(ConnectedComponentPanel.class, "ConnectedComponentPanel.undirectedRadioButton.text")); // NOI18N

        jLabel1.setText(org.openide.util.NbBundle.getMessage(ConnectedComponentPanel.class, "ConnectedComponentPanel.jLabel1.text")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(ConnectedComponentPanel.class, "ConnectedComponentPanel.jLabel2.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(undirectedRadioButton)
                    .addComponent(directedRadioButton))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(directedRadioButton)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(undirectedRadioButton)
                    .addComponent(jLabel2))
                .addContainerGap(115, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton directedRadioButton;
    private org.jdesktop.swingx.JXHeader header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton undirectedRadioButton;
    // End of variables declaration//GEN-END:variables

}
