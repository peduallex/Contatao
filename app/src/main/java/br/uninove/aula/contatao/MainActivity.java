package br.uninove.aula.contatao;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    private ListView lvContatos;
    private ArrayList<Contato> lstContatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContatos = (ListView)findViewById(R.id.lvContatos);
        lstContatos = new ArrayList<>();

        lstContatos.add(new Contato(1, "João", "M", R.drawable.joao));
        lstContatos.add(new Contato(2, "Menino João", "M", R.drawable.menino_joao));
        lstContatos.add(new Contato(3, "Daniela", "F", R.drawable.dani));
        lstContatos.add(new Contato(4, "Tropeço", "F", R.drawable.trops));
        lstContatos.add(new Contato(5, "Wesley", "F", R.drawable.wesley));
        lstContatos.add(new Contato(6, "Para pai", "F", R.drawable.pai));
        lstContatos.add(new Contato(7, "Jeremias", "F", R.drawable.jeremias));

        ContatoAdapter adapter = new ContatoAdapter(this, lstContatos);

        lvContatos.setAdapter(adapter);


    }
}
