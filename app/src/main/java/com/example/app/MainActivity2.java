package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private TextView tvRecap;
    private Button btnRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Liaison des composants XML
        tvRecap = findViewById(R.id.recap);
        btnRetour = findViewById(R.id.btnRetour);

        // Récupérer les données envoyées depuis MainActivity
        Intent intent = getIntent();
        String nom = intent.getStringExtra("nom");
        String email = intent.getStringExtra("email");
        String phone = intent.getStringExtra("phone");
        String adresse = intent.getStringExtra("adresse");
        String ville = intent.getStringExtra("ville");

        // Afficher les informations de manière formatée
        tvRecap.setText(formatterTexte(nom, email, phone, adresse, ville));

        // Action du bouton Retour
        btnRetour.setOnClickListener(v -> finish());
    }

    /**
     * Méthode pour formater et construire le texte récapitulatif
     */
    private String formatterTexte(String nom, String email, String phone, String adresse, String ville) {
        return "Nom : " + formatValeur(nom) + "\n" +
                "Email : " + formatValeur(email) + "\n" +
                "Téléphone : " + formatValeur(phone) + "\n" +
                "Adresse : " + formatValeur(adresse) + "\n" +
                "Ville : " + formatValeur(ville);
    }

    /**
     * Méthode utilitaire pour éviter les valeurs nulles ou vides
     */
    private String formatValeur(String value) {
        return (value == null || value.trim().isEmpty()) ? "—" : value.trim();
    }
}
