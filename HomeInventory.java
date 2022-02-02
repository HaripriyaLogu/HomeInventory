import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.awt.event.*;
import java.text.*;

public class LoanAssistant
{
    
    boolean computePayment;
   
    JFrame f = new JFrame("LoanAssistant");
    Font font = new Font("Arial",Font.PLAIN,14);
     JLabel l1 = new JLabel("Loan Balance:");
     JLabel l2 = new JLabel("Interest Rate:");
     JLabel l3 = new JLabel("Number of Payments:");
     JLabel l4 = new JLabel("Monthly Payment:");
     
     JTextField t1 = new JTextField();
     JTextField t2 = new JTextField();
     JTextField t4 = new JTextField();
     JTextField t3 = new JTextField();
     
     JButton b1 = new JButton("Compute Number of Payment");
     JButton b2 = new JButton("New Loan Analysis:");
     JButton b3 = new JButton("X");
      JButton b4 = new JButton("X");
      JButton b5 = new JButton("EXIT");
      
      JLabel analysis = new JLabel("LOAN ANALYSIS");
      JTextArea TA = new JTextArea();
       Font font1 = new Font("Courier",Font.BOLD,16);
     
   LoanAssistant()
   {
    
   // JFrame f = new JFrame("LoanAssistant");
   // Font font = new Font("Arial",Font.PLAIN,16);
    
    //JLabel l1 = new JLabel("Loan Balance:");
    l1.setBounds(20,20,150,30);
    l1.setFont(font);
      
   // JLabel l2 = new JLabel("Interest Rate:");
    l2.setFont(font);
    l2.setBounds(20,80,150,30);
   
    l3.setFont(font);
    l3.setBounds(20,140,150,30);
     
 
     l4.setFont(font);
     l4.setBounds(20,200,150,30);
  
     t1.setBounds(170,20,150,30);
    
     t2.setBounds(170,80,150,30);
     
     t3.setBounds(170,140,150,30);
  
     t4.setBounds(170,200,150,30);
     
     b1.setBounds(120,260,200,30);
     
     b2.setBounds(120,300,200,30);
   
  
    
     b3.setFont(font1);
     b3.setBounds(350,140,60,30);
     
  
     b4.setFont(font1);
     b4.setBounds(350,200,60,30);
     
     analysis.setFont(font);
     analysis.setBounds(1000,20,150,30);
  
     TA.setBounds(900,50,400,400);
     TA.setBorder(BorderFactory.createLineBorder(Color.black));
     TA.setFont(new Font("Courier new",Font.PLAIN,16));
     TA.setEditable(false);
     TA.setBackground(Color.WHITE);
    
    
     b5.setFont(font1);
     b5.setBounds(1100,470,100,30);
     JLabel name = new JLabel("ACCOUNTHOLDER NAME:");
        name.setBounds(450,20,170,30);
        name.setFont(font);
        JLabel AccNo = new JLabel("ACCOUNT NO:");
        AccNo.setBounds(450,70,170,30);
        AccNo.setFont(font);
        
        JLabel DOB = new JLabel("DATE OF BIRTH:");
        DOB.setBounds(450,120,170,30);
        DOB.setFont(font);
        
        JLabel Email = new JLabel("EMAIL ID:");
        Email.setBounds(450,180,170,30);
        Email.setFont(font);
        JLabel PhoneNo = new JLabel("PHONE NO:");
        PhoneNo.setBounds(450,230,170,30);
        PhoneNo.setFont(font);
        JLabel Add = new JLabel("PERMANENT ADDRESS:");
        Add.setBounds(450,270,170,30);
        Add.setFont(font);
        
        JLabel Fname = new JLabel("FATHER NAME:");
        Fname.setBounds(450,320,170,30);
        Fname.setFont(font);
        
         JLabel gender = new JLabel("GENDER");
        gender.setBounds(450,370,170,30);
        gender.setFont(font);
        
        JTextField nameTF = new JTextField();
        nameTF.setBounds(650,20,200,30);
        
        JTextField AccnoTF = new JTextField();
        AccnoTF.setBounds(650,70,200,30);
        JTextField DOBTF = new JTextField();
        DOBTF.setBounds(650,120,200,30);
        JTextField EmailTF = new JTextField();
        EmailTF.setBounds(650,180,200,30);
        JTextField PhoneNoTF = new JTextField();
        PhoneNoTF.setBounds(650,230,200,30);
        JTextField AddTF = new JTextField();
        AddTF.setBounds(650,270,200,30);
        JTextField FnameTF = new JTextField();
        FnameTF.setBounds(650,320,200,30);
        JTextField genderTF = new JTextField();
        genderTF.setBounds(650,370,200,30);
        
     
     
    b2.setEnabled(false);
    nameTF.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent e)
         {
             nameTF.transferFocus();
            if(printdetails(nameTF))
            {
             String s1 = nameTF.getText();
             if(returnvalue(s1))
             {
             TA.append("\n\n"+"Account Holder name:"+s1);
             }
             else
             {
                JOptionPane.showConfirmDialog(null, "Invalid or empty entry.\nPlease correct.", "Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        
             }
            }     
         }
     });
    AccnoTF.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent e)
         {
             AccnoTF.transferFocus();
             if(printdetails(AccnoTF))
             {
                 String s2 = AccnoTF.getText();
                 if(isNumeric(s2))
                 
                 {
                     TA.append("\n"+"Account No:"+s2);
                 }
                 
             }
         }
     });
     DOBTF.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent e)
         {
             DOBTF.transferFocus();
             if(printdetails(DOBTF))
             {  
                 
             
                 String s3 = DOBTF.getText();
                 String pattern = s3;
                 try
                 {
               Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(s3);
               TA.append("\n"+"\nDOB:"+date1);
                                  
                 }
                 catch(Exception d)
                 {
                   JOptionPane.showConfirmDialog(null,"Invalid Date!!"+"\nPlease correct!!!!","Warning",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
                  
                 }
           
             }
         }
     });
     EmailTF.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent e)
         {
             EmailTF.transferFocus();
             if(printdetails(EmailTF))
             {
                
                 String s4 = EmailTF.getText();
                 if(s4.contains("@"))
                 {
                 TA.append("\n"+"EMAIL:"+s4);
                 }
                 else
                 {
                      JOptionPane.showConfirmDialog(null, "Invalid or empty entry.\nPlease correct.", "Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                      
                 }
             }
         }
     });
    PhoneNoTF.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent e)
         {
             PhoneNoTF.transferFocus();
             if(printdetails(PhoneNoTF))
             {
                
                 String s5 = PhoneNoTF.getText();
                
                 if(isNumeric(s5))
                 {
                 if(s5.length()==10)
                 {
                 TA.append("\n"+"\nPhone No:"+s5);
                
                 }
                 else
                 {
                  JOptionPane.showConfirmDialog(null,"you should enter the phone number in only 10 digit!!","Warning",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
                 return;
                 }
                 }}
   
             }
         
     });
    AddTF.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent e)
         {
             AddTF.transferFocus();
             if(printdetails(AddTF))
             {
                 String s6 = AddTF.getText();
                 TA.append("\n"+"Address:"+s6);
             }
         }
     });
    FnameTF.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent e)
         {
             FnameTF.transferFocus();
             if(printdetails(FnameTF))
             {
                 String s7 = FnameTF.getText();
                 if(returnvalue(s7))
                 {
                 TA.append("\n"+"Father Name:"+s7);
                 }
                 else
                 {
                     JOptionPane.showConfirmDialog(null, "Invalid or empty entry.\nPlease correct.", "Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                 }
             }
         }
     });
    genderTF.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent e)
         {
             genderTF.transferFocus();
             if(printdetails(genderTF))
             {
                 String s8 = genderTF.getText();
                 if(returnvalue(s8))
                 {
                 TA.append("\n"+"Gender:"+s8);
                 }
                 else
                 {
                  JOptionPane.showConfirmDialog(null, "Invalid or empty entry.\nPlease correct.", "Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                 }
             }
         }
     });
f.addWindowListener(new WindowAdapter()
     {
         public void windowClosing(WindowEvent evt)
         {
             exitform(evt);
             
         }
     });
     
     b3.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent e)
         {
             monthXactionPerformed(e);
             
         }        
     });
      b4.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent e)
         {
             paymentXactionperformed(e);
         }
     });
     t1.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent e)
         {
             balanceactionperformed(e);
         }
     });
     t2.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent e)
         {
             interestactionperformed(e);
             
         }
     });
     t3.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent e)
         {
             monthsactionperformed(e);
         }
     });
     t4.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent e)
         {
             paymentactionperformed(e);
         }
     });
     b1.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent e)
         {
             computeactionperformed(e);
         }
     });
     b2.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent e)
         {
             newloanactionperformed(e);
             
         }
         });
    
     b4.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent e)
         {
             paymentXactionperformed(e);
         }
     });
     b5.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent e)
         {
             exitactionperformed(e);
         }
     });  
     f.add(l1);
     f.add(l2);
     f.add(l3);
     f.add(l4);
     f.add(t1);
     f.add(t2);
     f.add(t3);
     f.add(t4);
     f.add(b1);
     f.add(b2);
     f.add(b3);
     f.add(b4);
     f.add(b5);
     f.add(analysis);
     f.add(TA);
     f.add(name);
     f.add(AccNo);
     f.add(DOB);
     f.add(Email);
     f.add(PhoneNo);
     f.add(Add);
     f.add(Fname);
     f.add(gender);
     f.add(nameTF);
     f.add(AccnoTF);
     f.add(DOBTF);
     f.add(EmailTF);
     f.add(PhoneNoTF);
     f.add(AddTF);
     f.add(FnameTF);
     f.add(genderTF);  
       
        

             
     f.setSize(1500,700);
     f.setLayout(null);
     f.setVisible(true);
     f.setResizable(false);
     b4.doClick();
    }
private void exitform(WindowEvent evt)
    {
        System.exit(0);
    }
    private void  computeactionperformed(ActionEvent e)
    {
        double balance,interest,payment;
        int months;
        double X,Y,Z;
        double monthinterest;
        double loanbalance,finalpayment;
        
        if(validateDecimalNumber(t1)&&validateDecimalNumber(t2))
        {
         balance = Double.parseDouble(t1.getText());
         interest = Double.parseDouble(t2.getText());
         monthinterest = interest/1200;
         if(computePayment)
         {
            try
            {
             
             months = Integer.parseInt(t3.getText());
       
         
         monthinterest = interest/1200;
         
         
         Y = Math.pow(1+monthinterest,months);
         X = balance*Y*monthinterest;
         Z = Y-1;
         payment = X/Z;
         t4.setText(new DecimalFormat("0.00").format(payment));
         }
         catch(NumberFormatException n)
         {
             JOptionPane.showConfirmDialog(null, "Invalid or empty  Number of  Payments entry.\nPlease correct.", "Number of Payment Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
             return;
         }}
         else
         {
             //compute number of  payment
             if(validateDecimalNumber(t4))
             {
             payment = Double.parseDouble(t4.getText());
             
             months = (int)((Math.log(payment) - Math.log(payment - balance * monthinterest)) / Math.log(1 + monthinterest));
             }
             else
             {
                 JOptionPane.showConfirmDialog(null, "Invalid or empty Monthly Payment entry.\nPlease correct.", "Payment Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                 return;
             }
       
             
         }
        }
         
               
        else
        {
            JOptionPane.showConfirmDialog(null,"invalid or empty loan balance entry.\n Please correct","Balance Input Error",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(validateDecimalNumber(t4))
        {
            payment  = Double.valueOf(t4.getText()).doubleValue();
            if(payment<=(balance*monthinterest+1.0))
            {
                if(JOptionPane.showConfirmDialog(null,"Minimum payment must be $"+new DecimalFormat("0.00").format((int)(balance*monthinterest+1.0))+"\n"+"Do you want to use the minimum payment ?","input error",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==(JOptionPane.YES_NO_OPTION))
                {
                   t4.setText(new DecimalFormat("0.00").format((int)(balance*monthinterest+1.0)));
                   payment = Double.valueOf(t4.getText()).doubleValue();
                }  
                
                else
                {
                 t4.requestFocus();
                        return;
                        
                }
            }
        }
        else {
            JOptionPane.showConfirmDialog(null, "Invalid or empty Monthly Payment entry.\nPlease correct.", "Payment Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
         return;
        }
        if (interest == 0) {
            months = (int)(balance / payment);
        } 
        else 
        {
         months = (int)((Math.log(payment) - Math.log(payment - balance * monthinterest)) / Math.log(1 + monthinterest));
        }
         t3.setText(String.valueOf(months));
    
        
        
        payment = Double.valueOf(t4.getText()).doubleValue(); 
        
        
        TA.setText("Loan Balance: $" + new DecimalFormat("0.00").format(balance)); 
        TA.append("\n" + "Interest Rate: " + new DecimalFormat("0.00").format(interest) + "%");
        loanbalance = balance;
        for (int paymentNumber = 1; paymentNumber <= months - 1; paymentNumber++) { 
            loanbalance += loanbalance * monthinterest - payment;
        } 
      finalpayment = loanbalance;
      if (finalpayment > payment) { 
          loanbalance += loanbalance * monthinterest - payment;
          finalpayment = loanbalance; months++; 
          t3.setText(String.valueOf(months));
      }
      
        
        
        TA.append("\n\n "+String.valueOf(months-1)+"payment of $"+new DecimalFormat("0.00").format(payment));
        TA.append("\n"+"Final payment of $"+new DecimalFormat("0.00").format(finalpayment));
        TA.append("\n"+"Total payment of $"+new DecimalFormat("0.00").format((months-1)*payment+finalpayment));
        TA.append("\n"+"Interest paid $"+new DecimalFormat("0.00").format((months-1)*payment+finalpayment-balance));
        b1.setEnabled(false);
        b2.setEnabled(true);
        b2.requestFocus();
    }
    private void newloanactionperformed(ActionEvent e)
    {
        if(computePayment)
        {
            t4.setText("");
            
        }
        else
        {
            t3.setText("");
            
        }
       TA.setText("");
        b1.setEnabled(true);
        b2.setEnabled(false);
        t1.requestFocus();
   
    }
   private void monthXactionPerformed(ActionEvent e)
   {
       computePayment = false;
       b4.setVisible(true);
       b3.setVisible(false);
       t3.setText("");
       t3.setEditable(false);
       t3.setBackground(Color.YELLOW);
       
       t3.setFocusable(false);
       t4.setEditable(true);
       t4.setBackground(Color.WHITE);
       t4.setFocusable(true);
       b1.setText("Compute Number of Payments");
       t1.requestFocus();
       
       
   }
   private void paymentXactionperformed(ActionEvent e)
   {
       computePayment = true;
       b4.setVisible(false);
       b3.setVisible(true);
       t3.setEditable(true);
       t3.setBackground(Color.WHITE);
       t3.setFocusable(true);
       t4.setText("");
       t4.setEditable(false);
       t4.setBackground(Color.YELLOW);
       t4.setFocusable(false);
       b1.setText("Compute Monthly Payment");
       t1.requestFocus();
       
   }
   private void balanceactionperformed(ActionEvent e)
   {
       t1.transferFocus();
   }
   private void interestactionperformed(ActionEvent e)
   {
       t2.transferFocus();
       
   }
        private void monthsactionperformed(ActionEvent e)
        {
            t3.transferFocus();
            
        }
        private void paymentactionperformed(ActionEvent e)
        {
            t4.transferFocus();
        }
        private boolean validateDecimalNumber(JTextField tf)
        {
            String S = tf.getText().trim();
            boolean hasdecimal = false;
            boolean valid = true;
            if(S.length()==0)
            {
                valid = false;
            }
            else
            {
                for(int i=0;i<S.length();i++)
                {
                    char c = S.charAt(i);
                    if(c>='0'&&c<='9')
                    {
                        continue;
                    }
                    else if(c=='.'&&!hasdecimal)
                    {
                        hasdecimal = true;
                        
                    }
                    else
                    {
                        valid = false;
                    }
                }
            }
            tf.setText(S);
            if(!valid)
            {
                tf.requestFocus();
            }
            return(valid);
        }
        private void  exitactionperformed(ActionEvent e)
        {
            System.exit(0);
        }
        public boolean printdetails(JTextField tf)
   {
       boolean X,Y;
       X=true;
       Y=false;
       if(tf.getText().length()!=0)
       {
           return X;
           
       }
       else
       {
           JOptionPane.showConfirmDialog(null, "Invalid or empty entry.\nPlease correct.", "Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
           
          
       }
        return X;
   }
        public boolean returnvalue(String r)
   {
        boolean result = r.matches("[0-9]+");
      
        if(result==true)
        {
            return false;
        }
        else
        {
            return true;
        }
  
   }
        public boolean isNumeric(String str)
   {
       if(str==null)
       {
           return false;
           
       }
       else{
       try{
           double d = Double.parseDouble(str);
           
       }
       catch(NumberFormatException nfe)
       {
           JOptionPane.showConfirmDialog(null, "Invalid or empty entry.\nPlease correct.", "Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
           return false;
       }
         return true;
       }
   }
        
    public static void main(String args[])
    {
        new LoanAssistant();
        
    }
    
     
}
    
   
  
   

    
    
    
    