package com.sipemandu.utspemrogramanbergerak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

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

//    private CompositeDisposable disposable = new CompositeDisposable();
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
    }

    public void initRecycler(){
        mKategori = DataSource.createKategoriList();
        mRecycler = findViewById(R.id.recyclerView);
        mRecycler.setHasFixedSize(true);
        mRecycler.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new RecyclerViewAdapter(mContext, mKategori,this);
        mRecycler.setAdapter(mAdapter);

    }


//    public void getData(){
//        Observable<Kategori> buffer = Observable
//                .fromIterable(DataSource.createKategoriList())
//                .subscribeOn(Schedulers.io());
//
//        buffer
//                .buffer(1)
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<List<Kategori>>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        disposable.add(d);
//                    }
//
//                    @Override
//                    public void onNext(List<Kategori> kategoris) {
//                        Log.d(TAG, "onNext: result-------" + kategoris);
//                        for(Kategori kategori : kategoris){
//                            Log.d(TAG, "onNext: " + kategori.getJudul());
//                        }
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Log.e(TAG, "onError: ", e);
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                });
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
