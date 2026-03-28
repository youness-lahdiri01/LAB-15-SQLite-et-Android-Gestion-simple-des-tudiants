package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Champs du formulaire
    private EditText etNom, etEmail, etPhone, etAdresse, etVille;
    private Button btnAjouter, btnChercher, btnSupprimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Liaison des vues XML avec le code Java
        etNom = findViewById(R.id.nom);
        etEmail = findViewById(R.id.email);
        etPhone = findViewById(R.id.phone);
        etAdresse = findViewById(R.id.adresse);
        etVille = findViewById(R.id.ville);
        btnAjouter = findViewById(R.id.btnAjouter);
        btnChercher = findViewById(R.id.btnChercher);
        btnSupprimer = findViewById(R.id.btnSupprimer);

        // Définition du comportement du bouton Ajouter (anciennement Envoyer)
        btnAjouter.setOnClickListener(view -> envoyerDonnees());

        // Placeholders pour les autres actions
        btnChercher.setOnClickListener(view -> 
            Toast.makeText(this, "Action: Chercher", Toast.LENGTH_SHORT).show());
        
        btnSupprimer.setOnClickListener(view -> 
            Toast.makeText(this, "Action: Supprimer", Toast.LENGTH_SHORT).show());
    }

    /**
     * Méthode pour récupérer les données et lancer l'écran récapitulatif
     */
    private void envoyerDonnees() {
        // Récupérer les valeurs saisies
        String nom = etNom.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String phone = etPhone.getText().toString().trim();
        String adresse = etAdresse.getText().toString().trim();
        String ville = etVille.getText().toString().trim();

        // Validation simple
        if (nom.isEmpty() || email.isEmpty()) {
            Toast.makeText(this, "Nom et Email sont obligatoires.", Toast.LENGTH_SHORT).show();
            return;
        }

        // Création de l'intent pour passer à l'écran 2
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("nom", nom);
        intent.putExtra("email", email);
        intent.putExtra("phone", phone);
        intent.putExtra("adresse", adresse);
        intent.putExtra("ville", ville);

        // Lancer l'activité Screen2
        startActivity(intent);
    }
}
