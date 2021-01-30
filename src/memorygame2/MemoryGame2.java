package memorygame2;
import static java.awt.Color.gray;
import static java.awt.Color.green;
import static java.awt.Color.red;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Joshua Bastien
 */
public class MemoryGame2 extends javax.swing.JFrame {
    
        //PATH LOCATED HERE: change to the path of the text file on your computer
        String path = "C:\\Users\\remem\\Desktop\\symbols.txt";
    
    //Other global variables defined
    String[] textdata = new String[30];
    boolean first = true;
    String[] symbolLoc = new String[60];
    String temp;
    int p1Score = 0;
    int p2Score = 0;
    int turn = 0;
    int last = -1;
    
    //Method to read the text file and put each line of it into a String array
    public void readFile(String path) throws IOException {
        
            FileReader fr = new FileReader(path);
            BufferedReader textReader = new BufferedReader(fr);
            for (int i=0; i<30; i++) {
                textdata[i] = textReader.readLine();
            }
            textReader.close(); 
    }
    
    //Creates new form MemoryGame2
    public MemoryGame2() {
        initComponents();
    }
    
    //Method that does most of the calculations for the game. Is called everytime a button is pressed
    public int turn(int num) throws IOException {
        int tmep = turn;
        int outcome =0;
        //Checks if it is the player's first or second box being selected
        if (first) {
            clearAll();
            outcome = 1;
            //Stores the card data if first card flipped to later check against with second card
            temp = symbolLoc[num];
            selectBTF.setText(temp);
            last = num;
            first = false;
        } else {
            //Switches the players turns
            if (turn ==1) {
                turn = 0;
            } else if (turn ==0) {
                turn = 1;
            }
            first = true;
                //If a player tries to select the same card twice, will output this error and then skip their turn
                if (num==last) {
                JOptionPane.showMessageDialog(null, "Cannot choose the same square twice!");            
                //Ihe user gets a match: deletes boxes
                } else if (symbolLoc[num].equals(temp)) {
                deleteB(num+1);
                deleteB(last+1);
                //Gives the correct player a point
                if (turn ==0) {
                    p2Score = p2Score +1;
                    p2PointsTF.setText(Integer.toString(p2Score));
                } else {
                    p1Score =  p1Score +1;
                    turn = turn -1;
                    p1PointsTF.setText(Integer.toString(p1Score));
                }
                //Switches the players turns back so the player who answered correctly goes again
                turn = tmep;
            //Outputs the card info in text field
            } else {
                outcome = 3;
                selectBTF.setText(symbolLoc[num]);
            }
        }
        //Tells players whos turn it is
        if (turn ==0) {
            turnTF.setText("Player 1");
        } else if (turn ==1) {
            turnTF.setText("Player 2");
        } 
        return outcome;
        
    }
    
    //Method to set all button colours to gray, called upon in between player's turns
    public void clearAll() {
        b1.setBackground(gray);
        b2.setBackground(gray);
        b3.setBackground(gray);
        b4.setBackground(gray);
        b5.setBackground(gray);
        b6.setBackground(gray);
        b7.setBackground(gray);
        b8.setBackground(gray);
        b9.setBackground(gray);
        b10.setBackground(gray);
        b11.setBackground(gray);
        b12.setBackground(gray);
        b13.setBackground(gray);
        b14.setBackground(gray);
        b15.setBackground(gray);
        b16.setBackground(gray);
        b17.setBackground(gray);
        b18.setBackground(gray);
        b19.setBackground(gray);
        b20.setBackground(gray);
        b21.setBackground(gray);
        b22.setBackground(gray);
        b23.setBackground(gray);
        b24.setBackground(gray);
        b25.setBackground(gray);
        b26.setBackground(gray);
        b27.setBackground(gray);
        b28.setBackground(gray);
        b29.setBackground(gray);
        b30.setBackground(gray);
        b31.setBackground(gray);
        b32.setBackground(gray);
        b33.setBackground(gray);
        b34.setBackground(gray);
        b35.setBackground(gray);
        b36.setBackground(gray);
        b37.setBackground(gray);
        b38.setBackground(gray);
        b39.setBackground(gray);
        b40.setBackground(gray);
        b41.setBackground(gray);
        b42.setBackground(gray);
        b43.setBackground(gray);
        b44.setBackground(gray);
        b45.setBackground(gray);
        b46.setBackground(gray);
        b47.setBackground(gray);
        b48.setBackground(gray);
        b49.setBackground(gray);
        b50.setBackground(gray);
        b51.setBackground(gray);
        b52.setBackground(gray);
        b53.setBackground(gray);
        b54.setBackground(gray);
        b55.setBackground(gray);
        b56.setBackground(gray);
        b57.setBackground(gray);
        b58.setBackground(gray);
        b59.setBackground(gray);
        b60.setBackground(gray);
        
    }
    
    // This method is called from within the constructor to initialize the form.
    @SuppressWarnings("unchecked")
    private void initComponents() {
        
        //Initializes all 60 buttons
        b28 = new javax.swing.JButton();
        b29 = new javax.swing.JButton();
        b60 = new javax.swing.JButton();
        b42 = new javax.swing.JButton();
        b43 = new javax.swing.JButton();
        b41 = new javax.swing.JButton();
        b44 = new javax.swing.JButton();
        b45 = new javax.swing.JButton();
        b46 = new javax.swing.JButton();
        b30 = new javax.swing.JButton();
        b47 = new javax.swing.JButton();
        b32 = new javax.swing.JButton();
        b48 = new javax.swing.JButton();
        b33 = new javax.swing.JButton();
        b49 = new javax.swing.JButton();
        b31 = new javax.swing.JButton();
        b34 = new javax.swing.JButton();
        b35 = new javax.swing.JButton();
        b36 = new javax.swing.JButton();
        b37 = new javax.swing.JButton();
        b38 = new javax.swing.JButton();
        b39 = new javax.swing.JButton();
        b50 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        b52 = new javax.swing.JButton();
        b53 = new javax.swing.JButton();
        b51 = new javax.swing.JButton();
        b40 = new javax.swing.JButton();
        b54 = new javax.swing.JButton();
        b55 = new javax.swing.JButton();
        b56 = new javax.swing.JButton();
        b57 = new javax.swing.JButton();
        b58 = new javax.swing.JButton();
        b59 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        b25 = new javax.swing.JButton();
        b26 = new javax.swing.JButton();
        b27 = new javax.swing.JButton();
        //Initializes other GUI elements
        jLabel1 = new javax.swing.JLabel();
        turnTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        p1PointsTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        p2PointsTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        selectBTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        /**NOTE: IF YOU ARE GETTING ERRORS HERE, PLEASE READ: I made use of netbeans AbsoluteLayout library,  It should be added automatically by the ide 
         * whenever absolutelayout is used in the form, if you are getting errors on the 'org.'s, however, it means that it didn't and you do not have the proper library
         * installed. To fix, select the 'Libraries' node in the project, right-click and select 'Add Library' and select 'Absolute Layout' library from the 
         * list of available libraries.
        */
        
        //Sets it so that the program closes when the 'x' is hit
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        //Formats all buttons with the method that should execute when they are pressed and their locations on the program. Will not comment for each one.
        b28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b28ActionPerformed(evt);
            }
        });
        getContentPane().add(b28, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 133, 93, 52));

        b29.setText("               ");
        b29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b29ActionPerformed(evt);
            }
        });
        getContentPane().add(b29, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 133, 93, 52));

        b60.setText("               ");
        b60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b60ActionPerformed(evt);
            }
        });
        getContentPane().add(b60, new org.netbeans.lib.awtextra.AbsoluteConstraints(1088, 307, 93, 52));

        b42.setText("               ");
        b42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b42ActionPerformed(evt);
            }
        });
        getContentPane().add(b42, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 249, 93, 52));

        b43.setText("               ");
        b43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b43ActionPerformed(evt);
            }
        });
        getContentPane().add(b43, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 249, 93, 52));

        b41.setText("               ");
        b41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b41ActionPerformed(evt);
            }
        });
        getContentPane().add(b41, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 249, 93, 52));

        b44.setText("               ");
        b44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b44ActionPerformed(evt);
            }
        });
        getContentPane().add(b44, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 249, 93, 52));

        b45.setText("               ");
        b45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b45ActionPerformed(evt);
            }
        });
        getContentPane().add(b45, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 249, 93, 52));

        b46.setText("               ");
        b46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b46ActionPerformed(evt);
            }
        });
        getContentPane().add(b46, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 249, 93, 52));

        b30.setText("               ");
        b30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b30ActionPerformed(evt);
            }
        });
        getContentPane().add(b30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1088, 133, 93, 52));

        b47.setText("               ");
        b47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b47ActionPerformed(evt);
            }
        });
        getContentPane().add(b47, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 249, 93, 52));

        b32.setText("               ");
        b32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b32ActionPerformed(evt);
            }
        });
        getContentPane().add(b32, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 191, 93, 52));

        b48.setText("               ");
        b48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b48ActionPerformed(evt);
            }
        });
        getContentPane().add(b48, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 93, 52));

        b33.setText("               ");
        b33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b33ActionPerformed(evt);
            }
        });
        getContentPane().add(b33, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 191, 93, 52));

        b49.setText("               ");
        b49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b49ActionPerformed(evt);
            }
        });
        getContentPane().add(b49, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 249, 93, 52));

        b31.setText("               ");
        b31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b31ActionPerformed(evt);
            }
        });
        getContentPane().add(b31, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 191, 93, 52));

        b34.setText("               ");
        b34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b34ActionPerformed(evt);
            }
        });
        getContentPane().add(b34, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 191, 93, 52));

        b35.setText("               ");
        b35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b35ActionPerformed(evt);
            }
        });
        getContentPane().add(b35, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 191, 93, 52));

        b36.setText("               ");
        b36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b36ActionPerformed(evt);
            }
        });
        getContentPane().add(b36, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 191, 93, 52));

        b37.setText("               ");
        b37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b37ActionPerformed(evt);
            }
        });
        getContentPane().add(b37, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 191, 93, 52));

        b38.setText("               ");
        b38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b38ActionPerformed(evt);
            }
        });
        getContentPane().add(b38, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 191, 93, 52));

        b39.setText("               ");
        b39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b39ActionPerformed(evt);
            }
        });
        getContentPane().add(b39, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 191, 93, 52));

        b50.setText("               ");
        b50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b50ActionPerformed(evt);
            }
        });
        getContentPane().add(b50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1088, 249, 93, 52));

        b2.setText("               ");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 17, 93, 52));

        b3.setText("               ");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 17, 93, 52));

        b1.setText("               ");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 17, 93, 52));

        b4.setText("               ");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 17, 93, 52));

        b5.setText("               ");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 17, 93, 52));

        b6.setText("               ");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 17, 93, 52));

        b7.setText("               ");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 17, 93, 52));

        b8.setText("               ");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 17, 93, 52));

        b9.setText("               ");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 17, 93, 52));

        b10.setText("               ");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        getContentPane().add(b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1088, 17, 93, 52));

        b12.setText("               ");
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        getContentPane().add(b12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 75, 93, 52));

        b13.setText("               ");
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        getContentPane().add(b13, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 75, 93, 52));

        b11.setText("               ");
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        getContentPane().add(b11, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 75, 93, 52));

        b14.setText("               ");
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        getContentPane().add(b14, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 75, 93, 52));

        b15.setText("               ");
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        getContentPane().add(b15, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 75, 93, 52));

        b16.setText("               ");
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });
        getContentPane().add(b16, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 75, 93, 52));

        b17.setText("               ");
        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });
        getContentPane().add(b17, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 75, 93, 52));

        b18.setText("               ");
        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });
        getContentPane().add(b18, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 75, 93, 52));

        b19.setText("               ");
        b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19ActionPerformed(evt);
            }
        });
        getContentPane().add(b19, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 75, 93, 52));

        b52.setText("               ");
        b52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b52ActionPerformed(evt);
            }
        });
        getContentPane().add(b52, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 307, 93, 52));

        b53.setText("               ");
        b53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b53ActionPerformed(evt);
            }
        });
        getContentPane().add(b53, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 307, 93, 52));

        b51.setText("               ");
        b51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b51ActionPerformed(evt);
            }
        });
        getContentPane().add(b51, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 307, 93, 52));

        b40.setText("               ");
        b40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b40ActionPerformed(evt);
            }
        });
        getContentPane().add(b40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1088, 191, 93, 52));

        b54.setText("               ");
        b54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b54ActionPerformed(evt);
            }
        });
        getContentPane().add(b54, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 307, 93, 52));

        b55.setText("               ");
        b55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b55ActionPerformed(evt);
            }
        });
        getContentPane().add(b55, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 307, 93, 52));

        b56.setText("               ");
        b56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b56ActionPerformed(evt);
            }
        });
        getContentPane().add(b56, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 307, 93, 52));

        b57.setText("               ");
        b57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b57ActionPerformed(evt);
            }
        });
        getContentPane().add(b57, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 307, 93, 52));

        b58.setText("               ");
        b58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b58ActionPerformed(evt);
            }
        });
        getContentPane().add(b58, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 307, 93, 52));

        b59.setText("               ");
        b59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b59ActionPerformed(evt);
            }
        });
        getContentPane().add(b59, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 307, 93, 52));

        b20.setText("               ");
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });
        getContentPane().add(b20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1088, 75, 93, 52));

        b22.setText("               ");
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });
        getContentPane().add(b22, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 133, 93, 52));

        b23.setText("               ");
        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b23ActionPerformed(evt);
            }
        });
        getContentPane().add(b23, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 133, 93, 52));

        b21.setText("               ");
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });
        getContentPane().add(b21, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 133, 93, 52));

        b24.setText("               ");
        b24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b24ActionPerformed(evt);
            }
        });
        getContentPane().add(b24, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 133, 93, 52));

        b25.setText("               ");
        b25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b25ActionPerformed(evt);
            }
        });
        getContentPane().add(b25, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 133, 93, 52));

        b26.setText("               ");
        b26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b26ActionPerformed(evt);
            }
        });
        getContentPane().add(b26, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 133, 93, 52));

        b27.setText("               ");
        b27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b27ActionPerformed(evt);
            }
        });
        getContentPane().add(b27, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 133, 93, 52));

        //Formats the Lables and Text Fields in a similar way as the buttons. Gives the absolute position they should be at.
        jLabel1.setText("It is now the turn of:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));

        turnTF.setText("Player 1");
        getContentPane().add(turnTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, -1, -1));

        jLabel2.setText("Player 1 points:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, -1, -1));

        p1PointsTF.setText("0");
        getContentPane().add(p1PointsTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, -1, -1));

        jLabel3.setText("Player 2 points:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, -1, -1));

        p2PointsTF.setText("0");
        getContentPane().add(p2PointsTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18));
        jLabel4.setText("Selected Card Symbol:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 390, -1, -1));

        getContentPane().add(selectBTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 390, 100, 30));

        //Start game button - important
        jButton1.setText("START GAME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 377, 149, 54));

        pack();
    }                      
    
    /**
     * These methods are what will happen when the corresponding button is pressed. They are out of order because I was messing around with them A LOT and
     * putting them back in order would take too much unnecessary time.
     * 
     * Each button first calls upon the turn() method explained above, and it passes which button it is. Based on the return of that turn() method it may 
     * change its colour.
     */
    private void b28ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            //Calling on turn() method
            int outcome = turn(27);
            switch (outcome) {
                case 1:
                    //If it is the player's first card picked
                    b28.setBackground(green);
                    break;
                case 3:
                    //If it is the player's second card picked AND their guess was wrong
                    b28.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   
    
    //Each method is almost exactly the same so I will skip commenting on each one.
    private void b29ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(28);
            switch (outcome) {
                case 1:
                    b29.setBackground(green);
                    break;
                case 3:
                    b29.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b60ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(59);
            switch (outcome) {
                case 1:
                    b60.setBackground(green);
                    break;
                case 3:
                    b60.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b42ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(41);
            switch (outcome) {
                case 1:
                    b42.setBackground(green);
                    break;
                case 3:
                    b42.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b43ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(42);
            switch (outcome) {
                case 1:
                    b43.setBackground(green);
                    break;
                case 3:
                    b43.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b41ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(40);
            switch (outcome) {
                case 1:
                    b41.setBackground(green);
                    break;
                case 3:
                    b41.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b44ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(43);
            switch (outcome) {
                case 1:
                    b44.setBackground(green);
                    break;
                case 3:
                    b44.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b45ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(44);
            switch (outcome) {
                case 1:
                    b45.setBackground(green);
                    break;
                case 3:
                    b45.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b46ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(45);
            switch (outcome) {
                case 1:
                    b46.setBackground(green);
                    break;
                case 3:
                    b46.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b30ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(29);
            switch (outcome) {
                case 1:
                    b30.setBackground(green);
                    break;
                case 3:
                    b30.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b47ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(46);
            switch (outcome) {
                case 1:
                    b47.setBackground(green);
                    break;
                case 3:
                    b47.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b32ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(31);
            switch (outcome) {
                case 1:
                    b32.setBackground(green);
                    break;
                case 3:
                    b32.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b48ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(47);
            switch (outcome) {
                case 1:
                    b48.setBackground(green);
                    break;
                case 3:
                    b48.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b33ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(32);
            switch (outcome) {
                case 1:
                    b33.setBackground(green);
                    break;
                case 3:
                    b33.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b49ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(48);
            switch (outcome) {
                case 1:
                    b49.setBackground(green);
                    break;
                case 3:
                    b49.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b31ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(30);
            switch (outcome) {
                case 1:
                    b31.setBackground(green);
                    break;
                case 3:
                    b31.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b34ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(33);
            switch (outcome) {
                case 1:
                    b34.setBackground(green);
                    break;
                case 3:
                    b34.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b35ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(34);
            switch (outcome) {
                case 1:
                    b35.setBackground(green);
                    break;
                case 3:
                    b35.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b36ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(35);
            switch (outcome) {
                case 1:
                    b36.setBackground(green);
                    break;
                case 3:
                    b36.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b37ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(36);
            switch (outcome) {
                case 1:
                    b37.setBackground(green);
                    break;
                case 3:
                    b37.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b38ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(37);
            switch (outcome) {
                case 1:
                    b38.setBackground(green);
                    break;
                case 3:
                    b38.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b39ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(38);
            switch (outcome) {
                case 1:
                    b39.setBackground(green);
                    break;
                case 3:
                    b39.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b50ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(49);
            switch (outcome) {
                case 1:
                    b50.setBackground(green);
                    break;
                case 3:
                    b50.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        try {
            int outcome = turn(1);
            switch (outcome) {
                case 1:
                    b2.setBackground(green);
                    break;
                case 3:
                    b2.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                  

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        try {
            int outcome = turn(2);
            switch (outcome) {
                case 1:
                    b3.setBackground(green);
                    break;
                case 3:
                    b3.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                  

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        try {
            int outcome = turn(0);
            switch (outcome) {
                case 1:
                    b1.setBackground(green);
                    break;
                case 3:
                    b1.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                  

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        try {
            int outcome = turn(3);
            switch (outcome) {
                case 1:
                    b4.setBackground(green);
                    break;
                case 3:
                    b4.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                  

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        try {
            int outcome = turn(4);
            switch (outcome) {
                case 1:
                    b5.setBackground(green);
                    break;
                case 3:
                    b5.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                  

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        try {
            int outcome = turn(5);
            switch (outcome) {
                case 1:
                    b6.setBackground(green);
                    break;
                case 3:
                    b6.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                  

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        try {
            int outcome = turn(6);
            switch (outcome) {
                case 1:
                    b7.setBackground(green);
                    break;
                case 3:
                    b7.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                  

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        try {
            int outcome = turn(7);
            switch (outcome) {
                case 1:
                    b8.setBackground(green);
                    break;
                case 3:
                    b8.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                  

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        try {
            int outcome = turn(8);
            switch (outcome) {
                case 1:
                    b9.setBackground(green);
                    break;
                case 3:
                    b9.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                  

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(9);
            switch (outcome) {
                case 1:
                    b10.setBackground(green);
                    break;
                case 3:
                    b10.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(11);
            switch (outcome) {
                case 1:
                    b12.setBackground(green);
                    break;
                case 3:
                    b12.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(12);
            switch (outcome) {
                case 1:
                    b13.setBackground(green);
                    break;
                case 3:
                    b13.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(10);
            switch (outcome) {
                case 1:
                    b11.setBackground(green);
                    break;
                case 3:
                    b11.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(13);
            switch (outcome) {
                case 1:
                    b14.setBackground(green);
                    break;
                case 3:
                    b14.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(14);
            switch (outcome) {
                case 1:
                    b15.setBackground(green);
                    break;
                case 3:
                    b15.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(15);
            switch (outcome) {
                case 1:
                    b16.setBackground(green);
                    break;
                case 3:
                    b16.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(16);
            switch (outcome) {
                case 1:
                    b17.setBackground(green);
                    break;
                case 3:
                    b17.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(17);
            switch (outcome) {
                case 1:
                    b18.setBackground(green);
                    break;
                case 3:
                    b18.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b19ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(18);
            switch (outcome) {
                case 1:
                    b19.setBackground(green);
                    break;
                case 3:
                    b19.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b52ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(51);
            switch (outcome) {
                case 1:
                    b52.setBackground(green);
                    break;
                case 3:
                    b52.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b53ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(52);
            switch (outcome) {
                case 1:
                    b53.setBackground(green);
                    break;
                case 3:
                    b53.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b51ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(50);
            switch (outcome) {
                case 1:
                    b51.setBackground(green);
                    break;
                case 3:
                    b51.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b40ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(39);
            switch (outcome) {
                case 1:
                    b40.setBackground(green);
                    break;
                case 3:
                    b40.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b54ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(53);
            switch (outcome) {
                case 1:
                    b54.setBackground(green);
                    break;
                case 3:
                    b54.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b55ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(54);
            switch (outcome) {
                case 1:
                    b55.setBackground(green);
                    break;
                case 3:
                    b55.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b56ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(55);
            switch (outcome) {
                case 1:
                    b56.setBackground(green);
                    break;
                case 3:
                    b56.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b57ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(56);
            switch (outcome) {
                case 1:
                    b57.setBackground(green);
                    break;
                case 3:
                    b57.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b58ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(57);
            switch (outcome) {
                case 1:
                    b58.setBackground(green);
                    break;
                case 3:
                    b58.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b59ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(58);
            switch (outcome) {
                case 1:
                    b59.setBackground(green);
                    break;
                case 3:
                    b59.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(19);
            switch (outcome) {
                case 1:
                    b20.setBackground(green);
                    break;
                case 3:
                    b20.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(21);
            switch (outcome) {
                case 1:
                    b22.setBackground(green);
                    break;
                case 3:
                    b22.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b23ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(22);
            switch (outcome) {
                case 1:
                    b23.setBackground(green);
                    break;
                case 3:
                    b23.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(20);
            switch (outcome) {
                case 1:
                    b21.setBackground(green);
                    break;
                case 3:
                    b21.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b24ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(23);
            switch (outcome) {
                case 1:
                    b24.setBackground(green);
                    break;
                case 3:
                    b24.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b25ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(24);
            switch (outcome) {
                case 1:
                    b25.setBackground(green);
                    break;
                case 3:
                    b25.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b26ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(25);
            switch (outcome) {
                case 1:
                    b26.setBackground(green);
                    break;
                case 3:
                    b26.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void b27ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try {
            int outcome = turn(26);
            switch (outcome) {
                case 1:
                    b27.setBackground(green);
                    break;
                case 3:
                    b27.setBackground(red);
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   
    
    //Called upon when the user presses the Start Game button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        //Confirmation message
        int confirm = JOptionPane.showConfirmDialog(null, "Play Game?", "Yes", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            
            try {  
                //Reads text file
                clearAll();
                readFile(path);
                
                //Dupicates text file data
                for (int i=0; i<30;i++) {
                    symbolLoc[i] = textdata[i];
                    symbolLoc[59-i] = textdata[i];
                }
                //Scrambles the array
                Collections.shuffle(Arrays.asList(symbolLoc));
                   } catch (IOException ex) {
                Logger.getLogger(MemoryGame2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    }                                        
        
    //Method the delete a specified button. Called upon in turn() when the user guesses correctly. Given a int, it will delete the corresponding button
    public void deleteB(int i) {
        switch (i) {
            case 1:
                b1.setVisible(false);
                break;
            case 2:
                b2.setVisible(false);
                break;
            case 3:
                b3.setVisible(false);
                break;
            case 4:
                b4.setVisible(false);
                break;
            case 5:
                b5.setVisible(false);
                break;
            case 6:
                b6.setVisible(false);
                break;
            case 7:
                b7.setVisible(false);
                break;
            case 8:
                b8.setVisible(false);
                break;
            case 9:
                b9.setVisible(false);
                break;
            case 10:
                b10.setVisible(false);
                break;
            case 11:
                b11.setVisible(false);
                break;
            case 12:
                b12.setVisible(false);
                break;
            case 13:
                b13.setVisible(false);
                break;
            case 14:
                b14.setVisible(false);
                break;
            case 15:
                b15.setVisible(false);
                break;
            case 16:
                b16.setVisible(false);
                break;
            case 17:
                b17.setVisible(false);
                break;
            case 18:
                b18.setVisible(false);
                break;
            case 19:
                b19.setVisible(false);
                break;
            case 20:
                b20.setVisible(false);
                break;
            case 21:
                b21.setVisible(false);
                break;
            case 22:
                b22.setVisible(false);
                break;
            case 23:
                b23.setVisible(false);
                break;
            case 24:
                b24.setVisible(false);
                break;
            case 25:
                b25.setVisible(false);
                break;
            case 26:
                b26.setVisible(false);
                break;
            case 27:
                b27.setVisible(false);
                break;
            case 28:
                b28.setVisible(false);
                break;
            case 29:
                b29.setVisible(false);
                break;
            case 30:
                b30.setVisible(false);
                break;
            case 31:
                b31.setVisible(false);
                break;
            case 32:
                b32.setVisible(false);
                break;
            case 33:
                b33.setVisible(false);
                break;
            case 34:
                b34.setVisible(false);
                break;
            case 35:
                b35.setVisible(false);
                break;
            case 36:
                b36.setVisible(false);
                break;
            case 37:
                b37.setVisible(false);
                break;
            case 38:
                b38.setVisible(false);
                break;
            case 39:
                b39.setVisible(false);
                break;
            case 40:
                b40.setVisible(false);
                break;
            case 41:
                b41.setVisible(false);
                break;
            case 42:
                b42.setVisible(false);
                break;
            case 43:
                b43.setVisible(false);
                break;
            case 44:
                b44.setVisible(false);
                break;
            case 45:
                b45.setVisible(false);
                break;
            case 46:
                b46.setVisible(false);
                break;
            case 47:
                b47.setVisible(false);
                break;
            case 48:
                b48.setVisible(false);
                break;
            case 49:
                b49.setVisible(false);
                break;
            case 50:
                b50.setVisible(false);
                break;
            case 51:
                b51.setVisible(false);
                break;
            case 52:
                b52.setVisible(false);
                break;
            case 53:
                b53.setVisible(false);
                break;
            case 54:
                b54.setVisible(false);
                break;
            case 55:
                b55.setVisible(false);
                break;
            case 56:
                b56.setVisible(false);
                break;
            case 57:
                b57.setVisible(false);
                break;
            case 58:
                b58.setVisible(false);
                break;
            case 59:
                b59.setVisible(false);
                break;
            case 60:
                b60.setVisible(false);
                break;
            default:
                break;
        }
            
    }
        
    
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws IOException {
        
        //Displays this welcome message when program starts.
        JOptionPane.showMessageDialog(null, ""
                + "Welcome to my game! This game was created using java gui in order to make it more interactive and \n"
                + "not allow the players to cheat by viewing past square values. To begin, you MUST FIRST PRESS 'START \n"
                + "GAME' to start the game. Failure to do so will result in an error. Next, once you click on a box, it's \n"
                + "value will be displayed in the text box labelled 'Selected Card Symbol' in the bottom right. The \n"
                + "first box you select will always be green, and then the second one will turn red if it is not a match. \n"
                + "If it is a match, then both boxes will disappear from the board and award that player a point!");
        
        try {
            //Look and feel of GUI
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MemoryGame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemoryGame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemoryGame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemoryGame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Creates and Displays the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MemoryGame2().setVisible(true);
            }
        });
    }

    // Variables declaration                     
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b19;
    private javax.swing.JButton b2;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.JButton b24;
    private javax.swing.JButton b25;
    private javax.swing.JButton b26;
    private javax.swing.JButton b27;
    private javax.swing.JButton b28;
    private javax.swing.JButton b29;
    private javax.swing.JButton b3;
    private javax.swing.JButton b30;
    private javax.swing.JButton b31;
    private javax.swing.JButton b32;
    private javax.swing.JButton b33;
    private javax.swing.JButton b34;
    private javax.swing.JButton b35;
    private javax.swing.JButton b36;
    private javax.swing.JButton b37;
    private javax.swing.JButton b38;
    private javax.swing.JButton b39;
    private javax.swing.JButton b4;
    private javax.swing.JButton b40;
    private javax.swing.JButton b41;
    private javax.swing.JButton b42;
    private javax.swing.JButton b43;
    private javax.swing.JButton b44;
    private javax.swing.JButton b45;
    private javax.swing.JButton b46;
    private javax.swing.JButton b47;
    private javax.swing.JButton b48;
    private javax.swing.JButton b49;
    private javax.swing.JButton b5;
    private javax.swing.JButton b50;
    private javax.swing.JButton b51;
    private javax.swing.JButton b52;
    private javax.swing.JButton b53;
    private javax.swing.JButton b54;
    private javax.swing.JButton b55;
    private javax.swing.JButton b56;
    private javax.swing.JButton b57;
    private javax.swing.JButton b58;
    private javax.swing.JButton b59;
    private javax.swing.JButton b6;
    private javax.swing.JButton b60;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField p1PointsTF;
    private javax.swing.JTextField p2PointsTF;
    private javax.swing.JTextField selectBTF;
    private javax.swing.JTextField turnTF;
} //End of program!