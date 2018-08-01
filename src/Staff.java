
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Staff extends javax.swing.JFrame {

    /**
     * Creates new form add
     */
    public Staff() {
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

public ArrayList<sta_t> getUsersList(){
ArrayList<sta_t> usersList = new ArrayList<sta_t>();
Connection connection = getConnection();
String query = "SELECT * FROM  `Staff` ";
Statement st;
ResultSet rs;
try {
st = connection.createStatement();
rs = st.executeQuery(query);
sta_t user;
while(rs.next())
{
user = new sta_t(rs.getInt("staff_id"),rs.getString("first_name"),rs.getString("last_name"),rs.getString("gender"),rs.getInt("office_phone"),rs.getInt("mobile"),rs.getString("email"),rs.getString("date_join"),rs.getString("date_left"),rs.getString("date_of_birth"));
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
ArrayList<sta_t> list = getUsersList();
DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
Object[] row = new Object[10];
for(int i = 0; i < list.size(); i++)
{
row[0] = list.get(i).getId();
row[1] = list.get(i).getFirstName();
row[2] = list.get(i).getLastNAme();
row[3] = list.get(i).getgen();
row[4] = list.get(i).getoffice();
row[5] = list.get(i).getmob();
row[6] = list.get(i).geteml();
row[7] = list.get(i).getjn();
row[8] = list.get(i).getlv();
row[9] = list.get(i).getdob();
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon("/home/mehedi/NetBeansProjects/PRoject/Icon/Add_16x16.png")); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 100, 30));

        jButton2.setIcon(new javax.swing.ImageIcon("/home/mehedi/NetBeansProjects/PRoject/Icon/Refresh_16x16.png")); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 110, 30));

        jButton3.setIcon(new javax.swing.ImageIcon("/home/mehedi/NetBeansProjects/PRoject/Icon/Previous_16x16.png")); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 560, 90, 30));

        jLabel1.setText("Staff_id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 124, -1));

        jLabel2.setText("First_name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 61, 124, -1));

        jLabel3.setText("Last_name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 114, 124, -1));

        jLabel4.setText("Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 161, 124, -1));

        jLabel5.setText("Phone");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 208, 124, -1));

        jLabel6.setText("Mobile");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 259, 124, -1));

        jLabel7.setText("Email");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 317, 124, -1));

        jLabel8.setText("Join_date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 360, 124, -1));

        jLabel9.setText("Leave_date");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 409, 124, -1));

        jLabel10.setText("date_of_birth");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 458, 124, -1));

        jButton4.setIcon(new javax.swing.ImageIcon("/home/mehedi/NetBeansProjects/PRoject/Icon/Delete_16x16.png")); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 560, 80, 30));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 14, 171, 35));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 61, 171, 35));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 114, 171, 35));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 161, 171, 35));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 208, 171, 35));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 259, 171, 36));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 317, 171, 31));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 360, 171, 31));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 409, 171, 31));

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 458, 171, 31));

        jButton5.setIcon(new javax.swing.ImageIcon("/home/mehedi/NetBeansProjects/PRoject/Icon/Rename_16x16.png")); // NOI18N
        jButton5.setText("reset");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 100, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "staff_id", "f_name   ", "L_name", "Gender", "Phone", "Mobile", "Email", "Join_date", "Leave_date", "Date_of_Birth"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 640, -1));

        jMenu1.setText("Staff Table");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//
        // String query = "INSERT INTO `Staff`(`staff_id`, `first_name`, 'last_name`, `gender`,'office_phone','mobile','email','date_join','date_left','date_of_birth') VALUES ('"+jTextField1.getText()+"','" + jTextField2.getText()+"','"+jTextField3.getText()+"','" +  jTextField4.getText()+ "','"+jTextField5.getText()+"','" +jTextField6.getText()+"','" +jTextField7.getText()+"','" + jTextField8.getText()+"','" +jTextField9.getText()+"',"+jTextField10.getText()+")";
        String id = jTextField1.getText();
        String fnm= jTextField2.getText();
        String lnm=jTextField3.getText();
        String gnd=jTextField4.getText();
        String phn=jTextField5.getText();
        String mbl=jTextField6.getText();
        String eml=jTextField7.getText();
        String jn=jTextField8.getText();
        String lv=jTextField9.getText();
        String dob=jTextField10.getText();
        
        Connection con =null;
        PreparedStatement pst =null;
        try{
           
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro_db", "root","root");
            pst=con.prepareStatement("insert into Staff values(?,?,?,?,?,?,?,?,?,?)");
            
            pst.setString(1, id);
            pst.setString(2, fnm);
            pst.setString(3, lnm);
            pst.setString(4, gnd);
            pst.setString(5, phn);
            pst.setString(6, mbl);
            pst.setString(7, eml);
            pst.setString(8, jn);
            pst.setString(9, lv);
            pst.setString(10,dob);
            
            int i=pst.executeUpdate();
            if(i>0){
                
                
                JOptionPane.showMessageDialog(null,"saved");
            }
            else{
                JOptionPane.showMessageDialog(null,"Not saved");
            }
           
            
        }catch(Exception e){
        }
        
                                                
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
        new Data().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
        String id = jTextField1.getText();
        String fnm= jTextField2.getText();
        String lnm=jTextField3.getText();
        String gnd=jTextField4.getText();
        String phn=jTextField5.getText();
        String mbl=jTextField6.getText();
        String eml=jTextField7.getText();
        String jn=jTextField8.getText();
        String lv=jTextField9.getText();
        String dob=jTextField10.getText();
        
        
        String query = "UPDATE Staff set staff_id='"+jTextField1.getText()+"',first_name='" + jTextField2.getText()+"',last_name='"+jTextField3.getText()+"',gender='" +  jTextField4.getText()+ "',office_phone='"+jTextField5.getText()+"',mobile='" +jTextField6.getText()+"',email='" +jTextField7.getText()+"',date_join='" + jTextField8.getText()+"',date_left='" +jTextField9.getText()+"',date_of_birth='"+jTextField10.getText()+"' where staff_id='"+id+"'" ;
        Connection con =null;
        PreparedStatement pst =null;
        try{
           
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro_db", "root","root");
            pst=con.prepareStatement(query);
            pst.execute();
            JOptionPane.showMessageDialog(null,"update");
            
  
        
        } catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        
       jTextField1.setText("");
       jTextField2.setText("");
       jTextField3.setText("");
       jTextField4.setText("");
       jTextField5.setText("");
       jTextField6.setText("");
       jTextField7.setText("");
       jTextField8.setText("");
       jTextField9.setText("");
       jTextField10.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}