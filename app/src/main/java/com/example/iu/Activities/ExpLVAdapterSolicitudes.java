package com.example.iu.Activities;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;


import com.example.iu.DB.DBQueries;
import com.example.iu.Entities.Reserva;
import com.example.iu.Entities.Usuario;
import com.example.iu.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExpLVAdapterSolicitudes extends BaseExpandableListAdapter {

    private ArrayList<String> listCategoria;
    private Map<String, ArrayList<Integer>> mapChild;
    private Context context;
    private Usuario usuario;
    private List<Reserva> reservas;

    public ExpLVAdapterSolicitudes(ArrayList<String> listCategoria, Map<String, ArrayList<Integer>> mapChild, Context context, Usuario usuario, List<Reserva> reservas) {
        this.listCategoria = listCategoria;
        this.mapChild = mapChild;
        this.context = context;
        this.usuario = usuario;
        this.reservas = reservas;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    @Override
    public int getGroupCount() {
        return listCategoria.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return mapChild.get(listCategoria.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return listCategoria.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return mapChild.get(listCategoria.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return 0;
    }

    @Override
    public long getChildId(int i, int i1) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        String tituloCategoria = (String) getGroup(i);
        View convertView = LayoutInflater.from(context).inflate(R.layout.elv_group, null);
        TextView tvGroup = (TextView) convertView.findViewById(R.id.tvGroup);
        tvGroup.setText(tituloCategoria);
        return convertView;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.elv_child, null);
        }

        final Integer item = (Integer)getChild(i, i1);
        System.out.println(item);
        final Reserva reserva = (Reserva) DBQueries.getReserva(item, context);
        TextView textView = (TextView) view.findViewById(R.id.tvChild);
        textView.setText(reserva.getSala());
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usuario.getTipo().equals("admin")){
                    Intent intent = new Intent(context,SolicitudActivity.class);
                    intent.putExtra("reserva", reserva);
                    intent.putExtra("usuario_entidad", usuario);
                    context.startActivity(intent);
                }
            }
        });
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}


