package com.example.iu.Utilities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.iu.R;

import java.util.ArrayList;
import java.util.Map;

public class ExpLVAdapter extends BaseExpandableListAdapter {

    private ArrayList<String> listCategoria;
    private Map<String, ArrayList<String>> mapChild;
    private Context context;

    public ExpLVAdapter(ArrayList<String> listCategoria, Map<String, ArrayList<String>> mapChild, Context context) {
        this.listCategoria = listCategoria;
        this.mapChild = mapChild;
        this.context = context;
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
        String item = (String) getChild(i, i1);
        View convertView = LayoutInflater.from(context).inflate(R.layout.elv_child, null);
        TextView tvChild = (TextView) convertView.findViewById(R.id.tvChild);
        tvChild.setText(item);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}

