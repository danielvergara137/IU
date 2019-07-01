package com.example.iu.Activities;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.iu.DB.DBQueries;
import com.example.iu.Entities.Sala;
import com.example.iu.Entities.Usuario;
import com.example.iu.R;

import java.util.ArrayList;
import java.util.Map;

public class ExpLVAdapterReserva extends BaseExpandableListAdapter {

    private ArrayList<String> listCategoria;
    private Map<String, ArrayList<String>> mapChild;
    private Context context;
    private Usuario usuario;
    private String ramo;
    private String motivo;
    private String horario;

    public ExpLVAdapterReserva(ArrayList<String> listCategoria, Map<String, ArrayList<String>> mapChild, Context context, Usuario usuario, String ramo, String motivo, String horario) {
        this.listCategoria = listCategoria;
        this.mapChild = mapChild;
        this.context = context;
        this.usuario = usuario;
        this.ramo = ramo;
        this.motivo = motivo;
        this.horario = horario;

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

        final String item = (String) getChild(i, i1);
        TextView textView = (TextView) view.findViewById(R.id.tvChild);
        textView.setText(item);


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
// Add the buttons
                builder.setPositiveButton("Solicitar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        if(DBQueries.reservar(usuario.getUsername(), item, ramo, motivo, horario, context)) {
                            Sala sala = DBQueries.getSala(item, context);
                            DBQueries.updateHorarioSala(horario, sala.getHorario(), sala.getNombre(), context);
                            Toast.makeText(context, "Reserva de sala " + item + " realizada con éxito", Toast.LENGTH_SHORT).show();
                            Intent DocenteActivity = new Intent(context, DocenteActivity.class);
                            DocenteActivity.putExtra("usuario_entidad", usuario);
                            context.startActivity(DocenteActivity);
                        }
                    }
                });
                builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                });
// Set other dialog properties
                builder.setMessage("Desea solicitar la sala "+ item +" ?")
                        .setTitle("Solicitud de sala");

// Create the AlertDialog
                AlertDialog dialog = builder.create();
                dialog.show();

                /*
                if(DBQueries.reservar(usuario.getUsername(), item, ramo, motivo, horario, context)) {
                    Sala sala = DBQueries.getSala(item, context);
                    DBQueries.updateHorarioSala(horario, sala.getHorario(), sala.getNombre(), context);
                    Toast.makeText(context, "Reserva de sala " + item + "realizada con éxito", Toast.LENGTH_SHORT).show();
                    Intent DocenteActivity = new Intent(context, DocenteActivity.class);
                    DocenteActivity.putExtra("usuario_entidad", usuario);
                    context.startActivity(DocenteActivity);
                }*/
            }
        });
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
