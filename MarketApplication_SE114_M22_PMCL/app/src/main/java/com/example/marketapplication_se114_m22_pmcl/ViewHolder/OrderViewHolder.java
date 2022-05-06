package com.example.marketapplication_se114_m22_pmcl.ViewHolder;

import android.view.ContextMenu;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.marketapplication_se114_m22_pmcl.Interface.ItemClickListener;
import com.example.marketapplication_se114_m22_pmcl.R;

public class OrderViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnCreateContextMenuListener  {
    public TextView txtOrderID,txtOrderStatus,txtOrderPhone,txtOrderAddress;

    private ItemClickListener itemClickListener;

    public OrderViewHolder(View view){
        super(view);

        txtOrderID = (TextView) view.findViewById(R.id.order_name);
        txtOrderStatus = (TextView) view.findViewById(R.id.order_status);
        txtOrderPhone = (TextView) view.findViewById(R.id.order_phone);
        txtOrderAddress = (TextView) view.findViewById(R.id.order_ship_to);

        view.setOnClickListener(this);
        view.setOnCreateContextMenuListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) { itemClickListener.onClick(view,getAdapterPosition(), false); }

    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.setHeaderTitle("Select the action");

        contextMenu.add(0,0,getAdapterPosition(),"Update");
        contextMenu.add(0,1,getAdapterPosition(),"Update");
    }
}
