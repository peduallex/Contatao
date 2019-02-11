package br.uninove.aula.contatao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContatoAdapter extends BaseAdapter{
    ArrayList<Contato> lstContatos;
    LayoutInflater myInflater;

    public ContatoAdapter(Context context, ArrayList<Contato> lstContatos) {
        this.myInflater = LayoutInflater.from(context);
        this.lstContatos = lstContatos;
    }

    @Override
    public int getCount() {
        return this.lstContatos.size();
    }

    @Override
    public Contato getItem(int position) {
        return this.lstContatos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = myInflater.inflate(R.layout.contato_layout, null);
        Contato contato = this.getItem(position);
        ((ImageView)convertView.findViewById(R.id.fotoContato)).setImageResource(contato.getFoto());
        ((TextView)convertView.findViewById(R.id.nomeContato)).setText(contato.getNome());
        return convertView;
    }
}
