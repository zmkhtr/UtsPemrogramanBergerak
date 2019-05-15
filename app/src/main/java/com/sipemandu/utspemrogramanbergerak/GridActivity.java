package com.sipemandu.utspemrogramanbergerak;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.sipemandu.utspemrogramanbergerak.Adapter.GridRecyclerAdapter;
import com.sipemandu.utspemrogramanbergerak.Adapter.RecyclerViewAdapter;
import com.sipemandu.utspemrogramanbergerak.Model.Kategori;
import com.sipemandu.utspemrogramanbergerak.Model.Restoran;

import java.util.List;

public class GridActivity extends AppCompatActivity implements GridRecyclerAdapter.OnViewClick {
    private static final String TAG = "GridActivity";

    private ImageView mImageCategori;
    private Context mContext;
    private TextView mJudul, mOutlet, mKeterangan;
    private GridRecyclerAdapter mAdapter;
    private RecyclerView mRecycler;
    private List<Restoran> mRestoran;
    private String judul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        initView();
        setData();
        initRecycler(judul);
        upButton();
    }

    public void initRecycler(String judul){
        if (judul.equals("Terpopuler Minggu Ini")){
            mRestoran = DataSource.createRestoranMingguIniList();
        } else if (judul.equals("Sarapan Pagi")) {
            mRestoran = DataSource.createRestoranSarapanPagiList();
        } else if (judul.equals("Jajanan Malam")) {
            mRestoran = DataSource.createRestoranJajananMalamList();
        }
        mRecycler = findViewById(R.id.gridRecycler);
        mRecycler.setHasFixedSize(true);
        mRecycler.setLayoutManager(new GridLayoutManager(this, 2));
        mAdapter = new GridRecyclerAdapter(mContext, mRestoran,this);
        mRecycler.setAdapter(mAdapter);

    }

    public void initView(){
        mContext = getApplicationContext();
        mImageCategori = findViewById(R.id.imgRestoranKategori);
        mJudul = findViewById(R.id.textRestoranJudul);
        mOutlet = findViewById(R.id.textRestoranOutlet);
        mKeterangan = findViewById(R.id.textRestoranKeterangan);
    }

    public void setData(){
        Intent i = getIntent();
        judul = i.getStringExtra("JUDUL_CAT");
        String outlet = i.getStringExtra("OUTLET_CAT");
        String keterangan = i.getStringExtra("KETERANGAN_CAT");
        mJudul.setText(judul);
        mOutlet.setText(outlet);
        mKeterangan.setText(keterangan);

        Glide.with(mContext)
                .asBitmap()
                .load(i.getStringExtra("URL_CAT"))
                .into(mImageCategori);

    }

    public void upButton(){
        ActionBar ab = getSupportActionBar();
        ab.setTitle("Zomato");
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setElevation(0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main_bar, menu);
        return true;
    }

    @Override
    public void onViewClick(int position) {
            Log.d(TAG, "onViewClick: " + position);
            Restoran restoran = mRestoran.get(position);
            Log.d(TAG, "onViewClick: " + restoran.getNamaResto());

            Intent i = new Intent(GridActivity.this, DetailActivity.class);
            i.putExtra("ALAMAT_RESTO", restoran.getAlamatResto());
            i.putExtra("JAMBUKA_RESTO", restoran.getJamBuka());
            i.putExtra("JENISMAKANAN_RESTO",restoran.getJenisMakanan());
            i.putExtra("PERKIRAANMAKANAN_RESTO",restoran.getPerkiraanHarga());
            i.putExtra("URLIMG_RESTO",restoran.getUrlImg());
            i.putExtra("RATING_RESTO",restoran.getRating());
        i.putExtra("NAMA_RESTO",restoran.getNamaResto());
            startActivity(i);
    }
}
