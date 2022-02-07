package com.example.autori;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private Context context = this;
    private AutorAdapter autorAdapter;
    private ArrayList<Autor> autorList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = findViewById(R.id.lista);
        layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        autorList = getAutorList();
        autorAdapter = new AutorAdapter(autorList);

        recyclerView.setAdapter(autorAdapter);

        // ToDo: pristupiti RecyclerView-u, kreirati LayouManager i adapter, postaviti adapter na recyclerView
        // ToDo: kreirati listu autora i poslati tu listu adapteru
    }

    private ArrayList<Autor> getAutorList() {
        ArrayList<Autor> autors = new ArrayList<>();

        Autor autor = new Autor();
        autor.setFirstName("William");
        autor.setLastName("Shakespeare");
        autor.setNumberOfPublishedBooks(96);
        autor.setBestseller("Hamlet");
        autor.setNumberOfSelledBestsellerBooks(1200000);
        autors.add(autor);

        autor = new Autor();
        autor.setFirstName("Nura");
        autor.setLastName("Bazdulj-Hubijar");
        autor.setNumberOfPublishedBooks(52);
        autor.setBestseller("Ljubav je sihirbaz, babo");
        autor.setNumberOfSelledBestsellerBooks(570000);
        autors.add(autor);

        autor = new Autor();
        autor.setFirstName("Bisera");
        autor.setLastName("Alikadić");
        autor.setNumberOfPublishedBooks(20);
        autor.setBestseller("Larva");
        autor.setNumberOfSelledBestsellerBooks(120000);
        autors.add(autor);

        autor = new Autor();
        autor.setFirstName("Agatha");
        autor.setLastName("Christie");
        autor.setNumberOfPublishedBooks(50);
        autor.setBestseller("And Then There Were None");
        autor.setNumberOfSelledBestsellerBooks(21230000);
        autors.add(autor);

        autor = new Autor();
        autor.setFirstName("Abdulah");
        autor.setLastName("Sidran");
        autor.setNumberOfPublishedBooks(37);
        autor.setBestseller("Otkup Sirove Kože");
        autor.setNumberOfSelledBestsellerBooks(60000);
        autors.add(autor);

        autor = new Autor();
        autor.setFirstName("J. K.");
        autor.setLastName("Rowling");
        autor.setNumberOfPublishedBooks(40);
        autor.setBestseller("Harry Potter");
        autor.setNumberOfSelledBestsellerBooks(25490000);
        autors.add(autor);

        autor = new Autor();
        autor.setFirstName("Musa Ćazim");
        autor.setLastName("Ćatić");
        autor.setNumberOfPublishedBooks(48);
        autor.setBestseller("Teubei-Nesuh");
        autor.setNumberOfSelledBestsellerBooks(245000);
        autors.add(autor);

        autor = new Autor();
        autor.setFirstName("Lev");
        autor.setLastName("Nikolayevich Tolstoy");
        autor.setNumberOfPublishedBooks(60);
        autor.setBestseller("War and Peace");
        autor.setNumberOfSelledBestsellerBooks(1230000);
        autors.add(autor);

        autor = new Autor();
        autor.setFirstName("Stephen");
        autor.setLastName("King");
        autor.setNumberOfPublishedBooks(74);
        autor.setBestseller("The Shining");
        autor.setNumberOfSelledBestsellerBooks(45320000);
        autors.add(autor);

        autor = new Autor();
        autor.setFirstName("Paulo");
        autor.setLastName("Coelho");
        autor.setNumberOfPublishedBooks(32);
        autor.setBestseller("The Alchemist");
        autor.setNumberOfSelledBestsellerBooks(65000000);
        autors.add(autor);

        return autors;
    }
}
