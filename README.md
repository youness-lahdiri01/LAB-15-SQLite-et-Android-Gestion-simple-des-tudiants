#  LAB 15 : SQLite et Android — Gestion des étudiants

##  Tâche 3 & 4 : Test et interface CRUD

---

##  Objectif
L’objectif de cette partie est de créer une interface Android permettant de gérer des étudiants avec SQLite.  
L’utilisateur peut ajouter, rechercher et supprimer des étudiants, tout en testant les opérations via Logcat.

---

##  Fonctionnalités
- Ajouter un étudiant avec nom et prénom  
- Rechercher un étudiant par son identifiant  
- Supprimer un étudiant  
- Afficher les résultats dans l’interface  
- Vérifier les données dans Logcat  

---

##  Technologies utilisées
- Java  
- Android SDK  
- SQLite  
- AndroidX (AppCompat)  

---

##  Correction importante
L’ancienne classe **ActionBarActivity** est obsolète.  
Elle doit être remplacée par **AppCompatActivity** afin d’assurer la compatibilité avec AndroidX.

---

##  Structure du projet
Le projet est organisé avec :
- Une activité principale (MainActivity)
- Une classe métier (Etudiant)
- Un service (EtudiantService) pour gérer SQLite

---

##  Description du fonctionnement

###  Ajout
L’utilisateur saisit le nom et le prénom puis clique sur le bouton Ajouter.  
Les données sont enregistrées dans SQLite, les champs sont vidés et les résultats sont affichés dans Logcat.

###  Recherche
L’utilisateur saisit un identifiant.  
Si l’étudiant existe, ses informations sont affichées.  
Sinon, un message indique qu’il est introuvable.

###  Suppression
L’utilisateur saisit un identifiant.  
Si l’étudiant existe, il est supprimé et un message de confirmation est affiché.

---

##  Tests
Après chaque insertion, les étudiants sont affichés dans Logcat afin de vérifier que les données sont bien enregistrées.

---

##  Vérification
- Ajout fonctionnel  
- Recherche par ID fonctionnelle  
- Suppression fonctionnelle  
- Messages affichés correctement  
- Aucune erreur à l’exécution  

---

##  Dépannage
- Si erreur avec ActionBarActivity → utiliser AppCompatActivity  
- Si problème avec R → vérifier XML, supprimer imports incorrects, rebuild project  

---

##  Conclusion
Cette étape permet de comprendre comment relier une interface utilisateur à une base de données SQLite en utilisant un service CRUD dans une application Android.
<img width="380" height="836" alt="Screenshot 2026-03-28 193201" src="https://github.com/user-attachments/assets/e073c1f8-8e75-4f55-846a-45d90696e7c7" />


<img width="449" height="876" alt="Screenshot 2026-03-28 193209" src="https://github.com/user-attachments/assets/c71be7b6-2a9d-4170-a7d8-a3e052affa55" />
