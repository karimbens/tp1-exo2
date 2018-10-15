/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo2;

import java.util.Arrays;

/**
 *
 * @author karim
 */
public class Etudiant {
    
   
       String id;
       private float notes[];
       private float notescopy[];
       private int taille;
       public String nom;
       public String prenom;
    
    // C'est le Constructeur 1
    public Etudiant() {
        
    this.id = null;
    this.notes = null;
    this.taille = 0;
    }
    
    // C'est le constructeur 2
    public Etudiant(float tab[]) {
    
    this();
    this.taille=notes.length;
    }   
    
    // méthode Modifier 
    void Modifier(String id,float notes[],int taille,String nom, String prenom){
        this.id=id;
        this.notes=notes;
        this.taille=taille;
        this.nom=nom;
        this.prenom=prenom;
    }

    // retourne l'identifiant
    public String getId() {
        return id;
    }

    //retourne les notes 
    public float[] getNotes() {
        return notes;
    }

    //retourne la taille du tableau
    public int getTaille() {
        return taille;
    }
    
    // Methode qui retourne les valeurs privées du tableau de l'objet selon la position
    public float getNotesPos(int pos) {
            float note = notes[pos];
            return note;
    }
    
    // Méthode pour afficher les notes du tableau de l'objet
    void affichernotes(){
        for (int i = 0 ; i<taille;i++){
             System.out.println(" valeur n°"+i+" = "+notes[i]);
        }
    }
    
    //Méthode pour trier le tableau par ordre croissant
    void tritableau(){
        Arrays.sort(notes);
    }
    
    //Méthode pour remplir et retourner le tableau de valeurs aléatoires 
    void rand(){
        for (int i = 0 ; i< taille ;i++){
            notes[i]=(float) (Math.random() * 20);
        }
        affichernotes();
        
    }
    // retourne la valeur max
    float valmaxtab() {
        float mem = 0;
        for (int i = 0 ; i< notes.length ; i++){
                if ( notes [i] > mem){
                    mem = notes[i];
            }
        }
        return mem;
    }
    
    // retourne la valeur min
    float valmintab() {
        float mem = notes[0];
        for (int i = 0 ; i<notes.length ; i++){
                if (notes[i] < mem){
                     mem = notes[i];
            }
        }
        return mem;
    }
    
    //permet de retourner la moyenne des notes
    
    float moyenne(){
        float mem = 0;
        for (int i =0 ; i < notes.length ; i++){
            mem = (mem + notes[i]);
        }
        mem = mem / notes.length;
        return mem;
    }
    
    //méthode pour afficher les notes au dessus de 12
    double notesup12(){
        double compteur= 0;
        for (int i =0 ; i < notes.length ; i++){
            if (notes[i] > 12){
                compteur = compteur + 1;
            }
        }
        compteur = (compteur / notes.length) * 100;
        return compteur;
    }
    
    //méthode pour afficher les notes en dessous de 8
     double noteinf8(){
        double compteur= 0;
        for (int i =0 ; i < notes.length ; i++){
            if (notes[i] < 8){
                compteur = compteur + 1;
            }
        }
        compteur = (compteur / notes.length) * 100;
        return compteur;
    }
     // permet d'avoir les notes entre 8 et 12
     double noteinf8sup12(){
        double compteur= 0;
        for (int i =0 ; i < notes.length ; i++){
            if (notes[i] < 8 && notes[i] > 12){
                compteur = compteur + 1;
            }
        }
        compteur = (compteur / notes.length) * 100;
        return compteur;
    }
    //permet de retourner ces valeurs
    void stat(){
        float valmax = valmaxtab();
        float valmin = valmintab();
        float moyenne = moyenne();
        double sup12 = notesup12();
        double inf8 = noteinf8();
        double inf8sup12= noteinf8sup12();
        System.out.println("la moyenne est : " + moyenne);
        System.out.println("la note max est : "+ valmax);
        System.out.println("la note min est : "+ valmin);
        System.out.println("le pourcentage des notes au dessus de 8 est : "+sup12);
        System.out.println("le pourcentage des notes en dessous de 8 est : "+inf8);
        System.out.println("le pourcentage des notes entre 8 et 12 est : "+inf8sup12);
    }
        
// méthode pour tester si une valeur choisi est dans le tableau
    boolean verif(float x){
        boolean reponse = false;
        for (int i=0; i < notes.length;i++){
            if (notes[i] == x){
                reponse = true;
            }
        }
        return reponse;
    }
    
}