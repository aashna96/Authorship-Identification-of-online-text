/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btree;

import java.util.Scanner;

class Node
{
    String key;
    Node left, right;
 
    public Node(String item)
    {
        key = item;
        left = right = null;
    }
}
public class Btree {

    Node root;
    Btree(String key)
    {
        root = new Node(key);
    }
    
    Btree()
    {
        root = null;
    }
 
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String[] a = {"discrimin", "poverti", "employ", "equal", "freedom", "nation", "our", "american", "now", "oath"};
        String[] ar = new String[6];
        System.out.println("Enter the approximate age of the person:");
        ar[0] = s.nextLine();
        
for(int i=0;i<10;i++){

if(a[i]=="bully" || a[i]=="arrogant" || a[i]=="liar" || a[i]=="desperate" || a[i]=="rude" ||
a[i]=="weak" || a[i]=="pathetic" || a[i]=="offensive" || a[i]=="discrimin"|| a[i]=="lame" || a[i]=="defensive" ||
a[i]=="disrespectful" || a[i]=="obnoxious" || a[i]=="condescending" || a[i]=="women" ||
a[i]=="fake" || a[i]=="slavery")
{

System.out.println(" ");
System.out.println("Male");
ar[1]="Male";
System.out.println(" ");
System.out.println("Black");
ar[2]="Black";
System.out.println(" ");
System.out.println("employed");
ar[3]="employed";
System.out.println(" ");
System.out.println("opinion_leader");
ar[4]="opinion_leader";
System.out.println(" ");
System.out.println("Not regressive");
ar[5]="Not regressive";
System.out.println(" ");

break;
}


else if(a[i]=="awsome" || a[i]=="confident" || a[i]=="winning" || a[i]=="masterful" ||
a[i]=="brilliant" || a[i]=="leader" || a[i]=="president" || a[i]=="strong" || a[i]=="stellar" ||
a[i]=="solid" || a[i]=="budget" || a[i]=="energy" || a[i]=="cost" || a[i]=="health" || a[i]=="people"
|| a[i]=="companies")
{

System.out.println(" ");
System.out.println("White");
break;
}
}
        
        
        Btree tree = new Btree();
    /*create root*/
        tree.root = new Node("50");
 
        
        tree.root.left = new Node("Male");
        tree.root.right = new Node("Male");
 
        tree.root.left.left = new Node("Black");
        tree.root.left.right = new Node("Black");
        tree.root.right.left = new Node("Black");
        tree.root.right.right = new Node("Black");
        
        
        tree.root.left.left.left = new Node("employed");
        tree.root.left.left.right = new Node("employed");
        tree.root.left.right.left = new Node("employed");
        tree.root.left.right.right = new Node("employed");
        tree.root.right.left.left = new Node("employed");
        tree.root.right.left.right = new Node("employed");
        tree.root.right.right.left = new Node("employed");
        tree.root.right.right.right = new Node("employed");
        
        
        tree.root.left.left.left.left = new Node("opinion_leader");
        tree.root.left.left.left.right = new Node("opinion_leader");
        tree.root.left.left.right.left = new Node("opinion_leader");
        tree.root.left.left.right.right = new Node("opinion_leader");
        tree.root.left.right.left.left = new Node("opinion_leader");
        tree.root.left.right.left.right = new Node("opinion_leader");
        tree.root.left.right.right.left = new Node("opinion_leader");
        tree.root.left.right.right.right = new Node("opinion_leader");
        tree.root.right.left.left.left = new Node("opinion_leader");
        tree.root.right.left.left.right = new Node("opinion_leader");
        tree.root.right.left.right.left = new Node("opinion_leader");
        tree.root.right.left.right.right = new Node("opinion_leader");
        tree.root.right.right.left.left = new Node("opinion_leader");
        tree.root.right.right.left.right = new Node("opinion_leader");
        tree.root.right.right.right.left = new Node("opinion_leader");
        tree.root.right.right.right.right = new Node("opinion_leader");
        
        
        
        tree.root.left.left.left.left.left = new Node("regressive");
        tree.root.left.left.left.left.right = new Node("regressive");
        tree.root.left.left.left.right.left = new Node("regressive");
        tree.root.left.left.left.right.right = new Node("regressive");
        tree.root.left.left.right.left.left = new Node("regressive");
        tree.root.left.left.right.left.right = new Node("regressive");
        tree.root.left.left.right.right.left = new Node("regressive");
        tree.root.left.left.right.right.right = new Node("regressive");
        tree.root.left.right.left.left.left = new Node("regressive");
        tree.root.left.right.left.left.right = new Node("regressive");
        tree.root.left.right.left.right.left = new Node("regressive");
        tree.root.left.right.left.right.right = new Node("regressive");
        tree.root.left.right.right.left.left = new Node("regressive");
        tree.root.left.right.right.left.right = new Node("regressive");
        tree.root.right.left.left.left.left = new Node("regressive");
        tree.root.right.left.left.left.right = new Node("regressive");
        tree.root.right.left.left.right.left = new Node("regressive");
        tree.root.right.left.left.right.right = new Node("regressive");
        tree.root.right.left.right.left.left = new Node("regressive");
        tree.root.right.left.right.left.right = new Node("regressive");
        tree.root.right.left.right.right.left = new Node("regressive");
        tree.root.right.left.right.right.right = new Node("regressive");
        tree.root.right.right.left.left.left = new Node("regressive");
        tree.root.right.right.left.left.right = new Node("regressive");
        tree.root.right.right.left.right.left = new Node("regressive");
        tree.root.right.right.left.right.right = new Node("regressive");
        tree.root.right.right.left.left.left = new Node("regressive");
        tree.root.right.right.left.left.right = new Node("regressive");
        tree.root.right.right.left.right.left = new Node("regressive");
        tree.root.right.right.right.left.left = new Node("regressive");
        tree.root.right.right.right.left.right = new Node("regressive");
        tree.root.right.right.right.right.left = new Node("regressive");
        tree.root.right.right.right.right.right = new Node("regressive");
        
       
        
        
        tree.root.left.left.left.left.left.left = new Node("Modi");
        tree.root.left.left.left.left.left.right = new Node("Rahul");
        tree.root.left.left.left.left.right.left = new Node("Bihari Babu"); 
        tree.root.left.left.left.left.right.right = new Node("Ravi"); 
        tree.root.left.left.left.right.left.left = new Node("Johny");
        tree.root.left.left.left.right.left.right = new Node("Daniel");
        tree.root.left.left.left.right.right.left = new Node("Raayan");
        tree.root.left.left.left.right.right.right = new Node("Peter");
        tree.root.left.left.right.left.left.left = new Node("Disel");
        tree.root.left.left.right.left.left.right = new Node("Tramph");
        tree.root.left.left.right.left.right.left = new Node("Seizel");
        tree.root.left.left.right.left.right.right = new Node("Mr. Keith");
        tree.root.left.left.right.right.left.left = new Node("Rakesh");
        tree.root.left.left.right.right.left.right = new Node("Pradhan");
        tree.root.left.left.right.right.right.left = new Node("Keshav");
        tree.root.left.left.right.right.right.right = new Node("Dubey Shastri");
        tree.root.left.right.left.left.left.left = new Node("Tina");
        tree.root.left.right.left.left.left.right = new Node("Rosy");
        tree.root.left.right.left.left.right.left = new Node("Sarita");
        tree.root.left.right.left.left.right.right = new Node("Kaushal");
        tree.root.left.right.left.right.left.left = new Node("Crystal");
        tree.root.left.right.left.right.left.right = new Node("Kamohra");
        tree.root.left.right.left.right.right.left = new Node("Suuziee");
        tree.root.left.right.left.right.right.right = new Node("Amanda Gorman");
        tree.root.left.right.right.left.left.left = new Node("Bobily");
        tree.root.left.right.right.left.left.right = new Node("Lile");
        tree.root.left.right.right.left.right.left = new Node("Fraisel");
        tree.root.left.right.right.left.right.right = new Node("Kaiti");
        tree.root.right.left.left.left.left.left = new Node("Rosi");
        tree.root.right.left.left.left.left.right = new Node("Obama");
        tree.root.right.left.left.left.right.left = new Node("Jeiniya");
        tree.root.right.left.left.left.right.right = new Node("Ojaswini");
        tree.root.right.left.left.right.left.left = new Node("Modi");
        tree.root.right.left.left.right.left.right = new Node("Kejriwal");
        tree.root.right.left.left.right.right.left = new Node("Sanjay");
        tree.root.right.left.left.right.right.right = new Node("Vijay Rana");
        tree.root.right.left.right.left.left.left = new Node("Trump");
        tree.root.right.left.right.left.left.right = new Node("Dhananjay");
        tree.root.right.left.right.left.right.left = new Node("Sonu Gulati");
        tree.root.right.left.right.left.right.right = new Node("Dharam");
        tree.root.right.left.right.right.left.left = new Node("Trump");
        tree.root.right.left.right.right.left.right = new Node("Joj");
        tree.root.right.left.right.right.right.left = new Node("John");
        tree.root.right.left.right.right.right.right = new Node("Roy");
        tree.root.right.right.left.left.left.left = new Node("Peter");
        tree.root.right.right.left.left.left.right = new Node("Virein");
        tree.root.right.right.left.left.right.left = new Node("Joseph");
        tree.root.right.right.left.left.right.right = new Node("Muphin");
        tree.root.right.right.left.right.left.left = new Node("Sushma");
        tree.root.right.right.left.right.left.right = new Node("Nanda");
        tree.root.right.right.left.right.right.left = new Node("Lalita");
        tree.root.right.right.left.right.right.right = new Node("Ramwati");
        tree.root.right.right.left.left.left.left = new Node("Srishti");
        tree.root.right.right.left.left.left.right = new Node("Diya");
        tree.root.right.right.left.left.right.left = new Node("Yogita");
        tree.root.right.right.left.left.right.right = new Node("Eliana Masur");
        tree.root.right.right.left.left.right.left = new Node("Kiran");
        tree.root.right.right.left.left.right.right = new Node("Laxmi");
        tree.root.right.right.left.right.left.left = new Node("Saraswati");
        tree.root.right.right.left.right.left.right = new Node("Shobha");
        tree.root.right.right.right.left.left.left = new Node("katty");
        tree.root.right.right.right.left.left.right = new Node("Sameera");
        tree.root.right.right.right.left.right.left = new Node("Eliaana");
        tree.root.right.right.right.left.right.right = new Node("Elieza");
        tree.root.right.right.right.right.left.left = new Node("Kim");
        tree.root.right.right.right.right.left.right = new Node("Moreshis");
        tree.root.right.right.right.right.right.left = new Node("Quante");
        tree.root.right.right.right.right.right.right = new Node("Romeela");
        
        
    //Scanner s = new Scanner(System.in);
    
    //System.out.println("Enter strings");
   // for (int i = 0; i < ar.length; i++) {
   //     ar[i] = s.nextLine();
   // }
    //System.out.println(a[0]);
    if(Integer.parseInt(ar[0])<= Integer.parseInt(tree.root.key))
       tree.root = tree.root.left; 
    else
        tree.root = tree.root.right;
    
    if(ar[1].equals(tree.root.key) )
        tree.root = tree.root.left;
    else
        tree.root = tree.root.right;
    
     if(ar[2].equals(tree.root.key))    
        tree.root = tree.root.left;
     else
        tree.root = tree.root.right;
     
     if(ar[3].equals(tree.root.key))    
        tree.root = tree.root.left;
     else
        tree.root = tree.root.right;
     
     if(ar[4].equals(tree.root.key))    
        tree.root = tree.root.left;
     else
        tree.root = tree.root.right;
     
     if(ar[5].equals(tree.root.key))    
        tree.root = tree.root.left;
     else
        tree.root = tree.root.right;
     
     System.out.println("As per the analysis the name of author is:" +tree.root.key);
    }
    
}

