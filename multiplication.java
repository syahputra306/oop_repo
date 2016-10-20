/* Name: Math Quiz [by ShahdanLab]
Author: Mohd Shahdan Bin Addenan 
Date:  6 Nov 2016 */ 


import javax.swing.*; 

public class multiplication 
{ 
public static void main (String args[]) 
{ 
 
String[] okwords = {"Very good!", "Excellent!", "Nice work!", "Keep up the good work!"}; 
String[] wrongwords = {"No. Please try again.", "Wrong. Try once more.", "Dont give up.", "No. Keep trying"}; 


Double acnt=0.0; 
Double okpreper=0.0; 
String qualitysuffix = ""; 


int typeofq = 0; 
int gradeofquestion = 0; 
String[] oper = {"", "+", "-", "*", "/", "+-*/"}; 
String functionalitysuffix = " (prefix your answer with + to increase the difficulty of questions, suffix with sign + or * or / or - or ? to limit your answer to these types of questions)"; 

int value; 
int value2,Answer; 
int value3; 
int value4; 
int counter; 
int input; 
String word; 
String word2; 
String output = "", output1 = ""; 

JOptionPane.showMessageDialog (null, "Welcome. Press OK to begin", "Math Quiz [by ShahdanLab]", JOptionPane.QUESTION_MESSAGE); 
for (int counter2 = 1 ; counter2 <= 10 ; counter2++) 

{ 
if (gradeofquestion == 0) { 
value = 1 + (int) (Math.random () * 9); 
value2 = 1 + (int) (Math.random () * 9); 
} else { 
value = (1 + (int) (Math.random () * 9)) + (1 + (int) (Math.random () * 9)) * 10; 
value2 = (1 + (int) (Math.random () * 9)) + (1 + (int) (Math.random () * 9)) * 10; 
} 

do 

{ 
if (typeofq == 5) typeofq = - (1 + (int) (Math.random () * 4)); 
if ((Math.abs(typeofq) == 2 || Math.abs(typeofq) == 4) && value < value2) { 
Answer = value2; 
value2 = value; 
value = Answer; 
} 
if (Math.abs(typeofq) == 1) { 
Answer = value + value2; 
} else if (Math.abs(typeofq) == 2) { 
Answer = value - value2; 
} else if (Math.abs(typeofq) == 3) { 
Answer = value * value2; 
} else if (Math.abs(typeofq) == 4) { 
Answer = value / value2; 
value = Answer * value2; 
} else { 
Answer = value * value2; 
} 
output = value + " " + (oper[Math.abs(typeofq)] + "*").substring(0,1) + " " + value2 + functionalitysuffix; 
if (typeofq < 0) typeofq = 5; 
output1 = JOptionPane.showInputDialog ("How much is " + output + "?"); 
if (("@" + output1).indexOf("@+") != (0 - 1)) { 
gradeofquestion = 1; 
functionalitysuffix = " (suffix with sign + or * or / or - or ? to limit your answer to these types of questions)"; 
if (output1.indexOf("-") != (0 - 1)) { 
typeofq = 2; 
} else if (output1.indexOf("*") != (0 - 1)) { 
typeofq = 3; 
} else if (output1.indexOf("/") != (0 - 1)) { 
typeofq = 4; 
} else if (output1.indexOf("?") != (0 - 1)) { 
typeofq = 5; 
} else if (output1.substring(1).indexOf("+") != (0 - 1)) { 
typeofq = 1; 
} 
} else if (output1.indexOf("+") != (0 - 1)) { 
typeofq = 1; 
} else if (output1.indexOf("-") != (0 - 1)) { 
typeofq = 2; 
} else if (output1.indexOf("*") != (0 - 1)) { 
typeofq = 3; 
} else if (output1.indexOf("/") != (0 - 1)) { 
typeofq = 4; 
} else if (output1.indexOf("?") != (0 - 1)) { 
typeofq = 5; 
} 
input = Integer.parseInt (output1.replace("+","").replace("*", "").replace("-", "").replace("?", "").replace("/", "")); 


acnt = acnt + 1.0; 
if (input != Answer) { 
if (acnt >= 9.999 && ((okpreper / acnt) * 100.0) < 74.999) { 
qualitysuffix = " Sorry, you got "+okpreper*10+"%, please ask your teacher for extra help"; 
} else { 
qualitysuffix = ""; 
} 
JOptionPane.showMessageDialog (null, wrongwords[(int) (Math.random() * 4)], "FAIL", JOptionPane.ERROR_MESSAGE); 
} else { 
okpreper = okpreper + 1.0; 
if (acnt >= 9.999 && ((okpreper / acnt) * 100.0) > 74.999) { 
qualitysuffix = " Congratulations, you got "+okpreper*10+"% & you are ready to go to the next level"; 
} else { 
qualitysuffix = ""; 
} 
JOptionPane.showMessageDialog (null, okwords[(int) (Math.random() * 4)], "PASS", JOptionPane.INFORMATION_MESSAGE); 
} 
if (qualitysuffix != "") JOptionPane.showMessageDialog (null, qualitysuffix, "Math Quiz [by ShahdanLab]", JOptionPane.QUESTION_MESSAGE); 

} 
while (input != Answer); 
} 

System.exit (0); 
} 
}