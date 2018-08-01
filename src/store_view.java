
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehedi
 */
public class store_view extends javax.swing.JFrame {

    /**
     * Creates new form store_view
     */
    public store_view() {
        initComponents();
        Show_Users_In_JTable();
    }

    
      public Connection getConnection()
{
Connection con;
try {
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro_db", "root","root");
return con;
} 
catch (Exception e) {
e.printStackTrace();
return null;
}
}

public ArrayList<sto_t> getUsersList(){
ArrayList<sto_t> usersList = new ArrayList<sto_t>();
Connection connection = getConnection();
String query = "SELECT store_id,store_name,store_location,store_address FROM  `Stores` ";
Statement st;
ResultSet rs;
try {
st = connection.createStatement();
rs = st.executeQuery(query);
sto_t user;
while(rs.next())
{
user = new sto_t(rs.getInt("store_id"),rs.getString("store_name"),rs.getString("store_location"),rs.getString("store_address"));
usersList.add(user);
}
}
catch (Exception e) {
e.printStackTrace();
}
return usersList;
}
public void Show_Users_In_JTable()
{
ArrayList<sto_t> list = getUsersList();
DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
Object[] row = new Object[4];
for(int i = 0; i < list.size(); i++)
{
row[0] = list.get(i).getid();
row[2] = list.get(i).getaddrs();
row[3] = list.get(i).getLastNAme();
row[1] = list.get(i).getFirstName();

model.addRow(row);
}
}

public void executeSQlQuery(String query, String message)
{
Connection con = getConnection();
Statement st;
try{
st = con.createStatement();
if((st.executeUpdate(query)) == 1)
{

DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
model.setRowCount(0);
Show_Users_In_JTable();

JOptionPane.showMessageDialog(null, "Data "+message+" Succefully");
}else{
JOptionPane.showMessageDialog(null, "Data Not "+message);
}
}catch(Exception ex){
ex.printStackTrace();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Laksaman", 1, 35)); // NOI18N
        jLabel1.setText("Details About All Of Our Store ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 26, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Store ID", "Name", "Location", "Address"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 103, 523, -1));

        jButton1.setIcon(new javax.swing.ImageIcon("/home/mehedi/NetBeansProjects/PRoject/Icon/Previous_16x16.png")); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 569, 80, 30));

        jButton2.setIcon(new javax.swing.ImageIcon("/home/mehedi/NetBeansProjects/PRoject/Icon/Delete_16x16.png")); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new Data().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(store_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(store_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(store_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(store_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new store_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
