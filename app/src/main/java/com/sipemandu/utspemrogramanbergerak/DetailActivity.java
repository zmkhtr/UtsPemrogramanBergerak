package com.sipemandu.utspemrogramanbergerak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {
    private static final String TAG = "DetailActivity";

    private TextView mNama, mAlamat, mJenisMakanan, mJamBuka, mRating;
    private ImageView mImage;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initVieww();
        setData();
    }

    public void initVieww(){
        mContext = getApplicationContext();
        mImage = findViewById(R.id.imageDetailGambar);
        mNama = findViewById(R.id.textDetailNamaResto);
        mAlamat = findViewById(R.id.textDetailAlamat);
        mJenisMakanan = findViewById(R.id.textDetailJenisMakanan);
        mJamBuka = findViewById(R.id.textDetailJamBuka);
        mRating = findViewById(R.id.textDetailRating);
    }

    public void setData(){

        Intent i = getIntent();
        String alamat = i.getStringExtra("ALAMAT_RESTO");
        String jambuka = i.getStringExtra("JAMBUKA_RESTO");
        String jenismakanan = i.getStringExtra("JENISMAKANAN_RESTO");
//        String perkiraanharga = i.getStringExtra("PERKIRAANMAKANAN_RESTO");
        String urlimg = i.getStringExtra("URLIMG_RESTO");
        String rating = i.getStringExtra("RATING_RESTO");
        String nama = i.getStringExtra("NAMA_RESTO");
        mAlamat.setText(alamat);
        mNama.setText(nama);
        mJamBuka.setText(jambuka);
        mJenisMakanan.setText(jenismakanan);
//        .setText(jambuka);
        mRating.setText(rating);

        Glide.with(mContext)
                .asBitmap()
                .load(urlimg)
                .into(mImage);

    }
}
