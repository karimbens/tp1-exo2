/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo2;

import java.util.Scanner;
import javafx.scene.control.Tab;

/**
 *
 * @author karim
 */
public class TestEtudiant {
    public static void main(String[] args) {
       
      
       Etudiant personne1 = new Etudiant();
       Etudiant karim; 
       
       /* Le problème rencontré est le que l'objet est privé, nous rajoutons alors les Getter */
       System.out.println("id : " + personne1.id + " prenom : " + personne1.prenom); 
       int n=0;
       float Tab[];
       Scanner sc = new Scanner(System.in);
       System.out.println("saisissez un entier positif");
       n = sc.nextInt();
       if (n<0){ 
                  System.out.println("votre valeur n'est pas positif");
                  System.exit(0);
           
       }
        Tab= new float [n];
        for(int i=0;i< Tab.length; i++){
                    System.out.println("veuillez saisir la taille de votre tableau");
                    Tab[i]=sc.nextFloat();
        }
       
        
        karim = new Etudiant(Tab);
        
        sc = new Scanner(System.in);
        System.out.println("veuillez saisir une valeur pour l'identifiant :");
        String id =  sc.nextLine();
        System.out.println("veuillez saisir une valeur pour le prénom :");
        String prenom = sc.nextLine();
        System.out.println("veuillez saisir une valeur pour le nom :");
        String nom = sc.nextLine();
        
        // ici on appelle la méthode modifier
        
        karim.Modifier(id, Tab, n, nom, prenom);
        
        System.out.println(karim.getId());
        System.out.println(karim.getNotesPos(1));
        System.out.println(karim.getTaille());
        System.out.println(karim.prenom);
        System.out.println(karim.nom);
        
        // On affiche les valeurs privées de l'objet karim
        for (int i = 0 ; i<karim.getTaille();i++){
            System.out.println(" valeur n°"+ i + " = " + karim.getNotesPos(i));
        }
        
        
        //On appel la méthode pour afficher les notes de l'objet karim
        karim.affichernotes();
        
        //On appel la méthode rand
        karim.rand();
        
        //On appel la méthode affichernotes 
        karim.affichernotes();
        
        //On appel la fonction Tri
        karim.tritableau();
        
        //On affiche le tableau de fin
        karim.affichernotes();
        
        karim.stat();
        
        
    }
}
