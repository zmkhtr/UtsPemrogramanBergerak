package com.sipemandu.utspemrogramanbergerak.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.sipemandu.utspemrogramanbergerak.Model.Kategori;
import com.sipemandu.utspemrogramanbergerak.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "NotesRecyclerAdapter";

    private Context mContext;
    private List<Kategori> mKategori;
    private OnViewClick mOnViewClick;

    public RecyclerViewAdapter(Context mContext, List<Kategori> mKategori, OnViewClick mOnViewClick) {
        this.mContext = mContext;
        this.mKategori = mKategori;
        this.mOnViewClick = mOnViewClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout, parent, false);
        return new ViewHolder(view, mOnViewClick);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Kategori kategori = mKategori.get(position);
        holder.judul.setText(kategori.getJudul());
        holder.outlet.setText(kategori.getOutlet());
        holder.keterangan.setText(kategori.getKeterangan());

        RequestOptions myOptions = new RequestOptions()
                .override(125, 125);

        Glide.with(mContext)
                .asBitmap()
                .apply(myOptions)
                .load(kategori.getUrl())
                .into(holder.gambar);
    }

    @Override
    public int getItemCount() {
        return mKategori.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView judul;
        TextView outlet;
        TextView keterangan;
        ImageView gambar;
        OnViewClick mOnViewClick;

        ViewHolder(View itemView, OnViewClick onViewClick) {
            super(itemView);
            judul = itemView.findViewById(R.id.listJudulKategori);
            outlet = itemView.findViewById(R.id.listOutletKategori);
            keterangan = itemView.findViewById(R.id.listKeteranganKategori);
            gambar = itemView.findViewById(R.id.listImage);
            mOnViewClick = onViewClick;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Log.d(TAG, "onClick: " + getAdapterPosition());
            mOnViewClick.onViewClick(getAdapterPosition());
        }
    }

    public interface OnViewClick {
        void onViewClick(int position);
    }
}
