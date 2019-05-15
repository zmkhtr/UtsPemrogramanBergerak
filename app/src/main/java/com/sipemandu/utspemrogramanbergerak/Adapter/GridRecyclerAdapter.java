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
import com.sipemandu.utspemrogramanbergerak.Model.Restoran;
import com.sipemandu.utspemrogramanbergerak.R;

import java.util.List;

public class GridRecyclerAdapter extends RecyclerView.Adapter<GridRecyclerAdapter.ViewHolder> {

    private static final String TAG = "NotesRecyclerAdapter";

    private Context mContext;
    private List<Restoran> mRestoran;
    private OnViewClick mOnViewClick;

    public GridRecyclerAdapter(Context mContext, List<Restoran> mRestoran, OnViewClick mOnViewClick) {
        this.mContext = mContext;
        this.mRestoran = mRestoran;
        this.mOnViewClick = mOnViewClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_layout, parent, false);
        return new ViewHolder(view, mOnViewClick);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Restoran restoran = mRestoran.get(position);
        holder.namaResto.setText(restoran.getNamaResto());
        holder.alamatResto.setText(restoran.getAlamatResto());
        holder.jenisMakanan.setText(restoran.getJenisMakanan());
        holder.rating.setText(restoran.getRating());

//        RequestOptions myOptions = new RequestOptions()
//                .override(125, 125);

        Glide.with(mContext)
                .asBitmap()
//                .apply(myOptions)
                .load(restoran.getUrlImg())
                .into(holder.gambar);
    }

    @Override
    public int getItemCount() {
        return mRestoran.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView namaResto;
        TextView alamatResto;
        TextView jenisMakanan;
        TextView perkiraanHarga;
        TextView rating;
//        TextView jamBuka;
        ImageView gambar;
        OnViewClick mOnViewClick;

        ViewHolder(View itemView, OnViewClick onViewClick) {
            super(itemView);
            namaResto = itemView.findViewById(R.id.textGridJudul);
            alamatResto = itemView.findViewById(R.id.textGridAlamat);
            jenisMakanan = itemView.findViewById(R.id.textGridJenisMakanan);
            perkiraanHarga = itemView.findViewById(R.id.textGridPerkiraanHarga);
            rating = itemView.findViewById(R.id.textGridRating);
//            jamBuka = itemView.findViewById(R.id.gri);
            gambar = itemView.findViewById(R.id.imgGridGambar);
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
