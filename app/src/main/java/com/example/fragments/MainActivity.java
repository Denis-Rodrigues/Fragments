package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  private ConversasFragment conversasFragment = new ConversasFragment( );
  private ContatosFragment contatosFragment = new ContatosFragment();


  @Override
  protected void onCreate (Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //Remover sombra da ActionBar
    getSupportActionBar().setElevation(0);
    Button contatos = findViewById(R.id.buttonContatos);
    Button conversas = findViewById(R.id.buttonConversas);

    //Configurar objeto para o Fragmento
    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    transaction.replace(R.id.frameConteudo, conversasFragment);
    transaction.commit();

    contatos.setOnClickListener(new View.OnClickListener( ) {
      @Override
      public void onClick (View v) {
        contatosFragment = new ContatosFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, contatosFragment);
        transaction.commit();



      }
    });

    conversas.setOnClickListener(new View.OnClickListener( ) {
      @Override
      public void onClick (View v) {
        conversasFragment = new ConversasFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, conversasFragment);
        transaction.commit();



      }
    });








  }
}
