package com.sipemandu.utspemrogramanbergerak;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;

import com.sipemandu.utspemrogramanbergerak.Adapter.RecyclerViewAdapter;
import com.sipemandu.utspemrogramanbergerak.Model.Kategori;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.OnViewClick {
    private static final String TAG = "MainActivity";

    private CompositeDisposable disposable = new CompositeDisposable();
    private RecyclerViewAdapter mAdapter;
    private RecyclerView mRecycler;
    private Context mContext;
    private List<Kategori> mKategori;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = getApplicationContext();
        initRecycler();
        upButton();
    }

    public void initRecycler(){
        mKategori = DataSource.createKategoriList();
        mRecycler = findViewById(R.id.recyclerView);
        mRecycler.setHasFixedSize(true);
        mRecycler.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new RecyclerViewAdapter(mContext, mKategori,this);
        mRecycler.setAdapter(mAdapter);

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


//    public void getData(){
//        Observable<Kategori> buffer = Observable
//                .fromIterable(DataSource.createKategoriList())
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<Kategori>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//
//                    }
//
//                    @Override
//                    public void onNext(Kategori kategori) {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                };
//    }

    @Override
    public void onViewClick(int position) {
        Log.d(TAG, "onViewClick: " + position);
        Kategori kategori = mKategori.get(position);
        Log.d(TAG, "onViewClick: " + kategori.getJudul());

        Intent i = new Intent(MainActivity.this, GridActivity.class);
        i.putExtra("JUDUL_CAT", kategori.getJudul());
        i.putExtra("OUTLET_CAT", kategori.getOutlet());
        i.putExtra("KETERANGAN_CAT",kategori.getKeterangan());
        i.putExtra("URL_CAT",kategori.getUrl());
        startActivity(i);
    }
}
