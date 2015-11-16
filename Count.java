import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class Count extends JFrame implements ActionListener
{
static int count=0;
String ct;
JLabel c1,c2,c3,c4,c5,totaldocu,total,grace,binay,mar,miriam,marcos,most,topic;
JLabel binayn,binayp,miriamn,miriamp,marn,marp,marcosn,marcosp,poen,poep,n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
JLabel totalnegative,totalpositive,tn,tp;
JTextArea textarea;
JScrollPane scroll;
public static void main(String arg[])
{
    Count ti=new Count();
}

public Count()
{
    
    
    
   this.setSize(700,600);
    this.setLayout(null);
    c1=new JLabel("Binay");
    c2=new JLabel("Santiago");
    c3=new JLabel("Poe");
    c4=new JLabel("Roxas");
    c5=new JLabel("Marcos");
    most=new JLabel("");
    totaldocu=new JLabel("");
    grace=new JLabel("0");
    binay=new JLabel("0");
    mar=new JLabel("0");
    miriam=new JLabel("0");
    marcos=new JLabel("0");
    totaldocu=new JLabel("Total Documents");
    total= new JLabel("0");
    most = new JLabel("Most Topics:");
    topic = new JLabel("");
    textarea=new JTextArea("",5,20);
    binayn = new JLabel("0");
    binayp= new JLabel("0");
    miriamn= new JLabel("0");
    miriamp= new JLabel("0");
    marn = new JLabel("0");
    marp= new JLabel("0");
    marcosn = new JLabel("0");
    marcosp= new JLabel("0");
    poen= new JLabel("0");
    poep= new JLabel("0");
    n1 = new JLabel("Negative");
    n2 = new JLabel("Positive");
    n3 = new JLabel("Negative");
    n4 = new JLabel("Positive");
    n5 = new JLabel("Negative");
    n6 = new JLabel("Positive");
    n7  = new JLabel("Negative");
    n8 = new JLabel("Positive");
    n9 = new JLabel("Negative");
    n10 = new JLabel("Positive");
    totalnegative = new JLabel("Total Negative");
    totalpositive = new JLabel("Total Positive");
    tn = new JLabel ("0");
    tp = new JLabel ("0");
    
    JButton jb=new JButton("COUNT");
    scroll = new JScrollPane(textarea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    this.add(scroll);
    
   // j.add(def);
    this.add(textarea);
    this.add(c1);
    this.add(c2);
    this.add(c3);
    this.add(c4);
    this.add(c5);
    this.add(grace);
    this.add(binay);
    this.add(mar);
    this.add(miriam);
    this.add(marcos);
    this.add(most);
    this.add(totaldocu);
    this.add(total);
    this.add(most);
    this.add(topic);
    this.add(binayn);
    this.add(binayp);
    this.add(miriamn);
    this.add(miriamp);
    this.add(marn);
    this.add(marp);
    this.add(marcosn);
    this.add(marcosp);
    this.add(poen);
    this.add(poep);
    this.add(n1);
    this.add(n2);
    this.add(n3);
    this.add(n4);
    this.add(n5);
    this.add(n6);
    this.add(n7);
    this.add(n8);
    this.add(n9);
    this.add(n10);
    this.add(totalnegative);
    this.add(totalpositive);
    this.add(tp);
    this.add(tn);
    this.add(jb);
   
   textarea.setBounds(10,10,600,200);
    c1.setBounds(10,230,50,30);
    binay.setBounds(60,230,50,30);
    n1.setBounds(100,230,50,30);
    binayn.setBounds(160,230,50,30);
    n2.setBounds(210,230,50,30);
    binayp.setBounds(260,230,50,30);
    
    c2.setBounds(10,260,50,30);
    miriam.setBounds(80,260,50,30);
    n3.setBounds(100,260,50,30);
    miriamn.setBounds(160,260,50,30);
    n4.setBounds(210,260,50,30);
    miriamp.setBounds(260,260,50,30);
    
    c3.setBounds(10,290,50,30);
    grace.setBounds(60,290,50,30);
    n5.setBounds(100,290,50,30);
    poen.setBounds(160,290,50,30);
    n6.setBounds(210,290,50,30);
    poep.setBounds(260,290,50,30);
    
    c4.setBounds(10,320,50,30);
    mar.setBounds(60,320,50,30);
    n7.setBounds(100,320,50,30);
    marn.setBounds(160,320,50,30);
    n8.setBounds(210,320,50,30);
    marp.setBounds(260,320,50,30);
    
    c5.setBounds(10,350,50,30);
    marcos.setBounds(60,350,50,30);
    n9.setBounds(100,350,50,30);
    marcosn.setBounds(160,350,50,30);
    n10.setBounds(210,350,50,30);
    marcosp.setBounds(260,350,50,30);
    
    totaldocu.setBounds(10,380,100,30);
    total.setBounds(110,380,50,30);
    most.setBounds(10,410,100,30);
    topic.setBounds(110,410,50,30);
    
    totalnegative.setBounds(310,320,100,30);
    tn.setBounds(410,320,50,30);
    totalpositive.setBounds(310,350,100,30);
    tp.setBounds(400,350,50,30);
    
    jb.setBounds(10,500,100,50);
   // setSize(500,500);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    jb.addActionListener(this);
}
public void actionPerformed(ActionEvent ae){
    
String[] words=textarea.getText().toLowerCase().trim().split(" ");
String[] line=textarea.getText().toLowerCase().trim().split("\\n");
    String StringToFind="binay";
    String StringToFind2="miriam";
    String StringToFind3="roxas";
    String StringToFind4="marcos";
    String StringToFind5="poe";
    String positive = "+";
    String negative = "-";
    
    
    
    int binaycount=0;
    int miriamcount=0;
    int gracecount=0;
    int marcount=0;
    int marcoscount=0;
    int totaldocument=0;
    int binaypositive=0;
    int binaynegative=0;
    int miriampositive=0;
    int miriamnegative=0;
    int marnegative=0;
    int marpositive=0;
    int marcosnegative=0;
    int marcospositive=0;
    int poenegative=0;
    int poepositive=0;
    int totalp;
    int totaln;
   
    for(String l: line){
               
               
                 if(l.contains(StringToFind)&&!l.contains(positive)&&!l.contains(negative)){
                   binaycount = binaycount +1;
                   totaldocument = totaldocument + 1;
              
              
    }
               else if(l.contains(StringToFind)&&!l.contains(positive)&&l.contains(negative)){
                  binaynegative = binaynegative +1;
                 
              }
               else if(l.contains(StringToFind)&&l.contains(positive)&&!l.contains(negative)){
                  binaypositive = binaypositive +1;
                 
              }
                                           
              
            else if(l.contains(StringToFind2)&&!l.contains(positive)&&!l.contains(negative)){
                   miriamcount = miriamcount +1;
                   totaldocument = totaldocument + 1;
              
    }
              
              else if(l.contains(StringToFind2)&&!l.contains(positive)&&l.contains(negative)){
                  miriamnegative = miriamnegative +1;
                 
              }
               else if(l.contains(StringToFind2)&&l.contains(positive)&&!l.contains(negative)){
                  miriampositive = miriampositive +1;
                 
              }
              
              
     
                         else  if(l.contains(StringToFind3)&&!l.contains(positive)&&!l.contains(negative)){
                   marcount = marcount +1;
                   totaldocument = totaldocument + 1;
                //   marnegative = marnegative +1;
    }
                else if(l.contains(StringToFind3)&&!l.contains(positive)&&l.contains(negative)){
                  marnegative = marnegative +1;
                 
              }
               else if(l.contains(StringToFind3)&&l.contains(positive)&&!l.contains(negative)){
                  marpositive = marpositive +1;
                 
              }
                else  if(l.contains(StringToFind4)&&!l.contains(positive)&&!l.contains(negative)){
                   marcoscount = marcoscount +1;
                   totaldocument = totaldocument + 1;
               //    marcospositive = marcospositive +1;
    }
                else if(l.contains(StringToFind4)&&!l.contains(positive)&&l.contains(negative)){
                  marcosnegative = marcosnegative +1;
                 
              }
               else if(l.contains(StringToFind4)&&l.contains(positive)&&!l.contains(negative)){
                  marcospositive = marcospositive +1;
                 
              }
                         else  if(l.contains(StringToFind5)&&!l.contains(positive)&&!l.contains(negative)){
                   gracecount = gracecount +1;
                   totaldocument = totaldocument + 1;
                //   poenegative = poenegative +1;
    }
     else if(l.contains(StringToFind5)&&!l.contains(positive)&&l.contains(negative)){
                  poenegative = poenegative +1;
                 
              }
               else if(l.contains(StringToFind5)&&l.contains(positive)&&!l.contains(negative)){
                  poepositive = poepositive +1;
                 
              }
    }
    
    binay.setText(""+binaycount);
    miriam.setText(""+ miriamcount);
    grace.setText(""+ gracecount);
    mar.setText(""+ marcount);
    marcos.setText(""+ marcoscount);
    total.setText(""+ totaldocument);
    binayn.setText(""+binaynegative);
    binayp.setText(""+binaypositive);
    miriamn.setText(""+miriamnegative);
    miriamp.setText(""+miriampositive);
    marn.setText(""+marnegative);
    marp.setText(""+marpositive);
    marcosn.setText(""+marcosnegative);
    marcosp.setText(""+marcospositive);
    poen.setText(""+poenegative);
    poep.setText(""+poepositive);
    
    
    totaln = binaynegative + miriamnegative + marnegative + marcosnegative + poenegative;
    totalp = binaypositive + miriampositive + marpositive + marpositive + poepositive;
    
    tn.setText(""+totaln);
    tp.setText(""+totalp);
    
    
    
        if(binaycount>miriamcount&&binaycount>gracecount&&binaycount>marcount&&binaycount>marcoscount){
            topic.setText("Binay");
            
        }
        else if (miriamcount>binaycount&&miriamcount>gracecount&&miriamcount>marcount&&miriamcount>marcoscount){
            topic.setText("Santiago");
        }
        else if (gracecount>binaycount&&gracecount>miriamcount&&gracecount>marcount&&gracecount>marcoscount){
            topic.setText("Poe");
        }
        else if(marcount>binaycount&&marcount>miriamcount&&marcount>gracecount&&marcount>marcoscount){
            topic.setText("Roxas");
        }
        else if(marcoscount>binaycount&&marcoscount>miriamcount&&marcoscount>gracecount&&marcoscount>marcount){
            topic.setText("Marcos");
        }
        else if (binaycount==miriamcount){
            total.setText("Binay and Miriam");
        }
}
}
