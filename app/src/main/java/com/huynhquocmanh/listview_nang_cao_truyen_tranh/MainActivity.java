package com.huynhquocmanh.listview_nang_cao_truyen_tranh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    ListView lvtruyentranh;
    truyentranhAdapter truyentranhAdapter;
    ArrayList<Truyen_tranh> mangtruyentranh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvtruyentranh = findViewById(R.id.Listviewtruyen);
        mangtruyentranh = new ArrayList<>();
        mangtruyentranh.add(new Truyen_tranh("Black bird",0,190,R.drawable.black_bird1,18000 ));
        mangtruyentranh.add(new Truyen_tranh("CÔNG CHÚA SỨA",1,176,R.drawable.cong_chua_sua2,18000));
        mangtruyentranh.add(new Truyen_tranh("Black bird",2,120,R.drawable.hoc_vien_bong_da3,18000));
        mangtruyentranh.add(new Truyen_tranh("HUYỀN THOẠI VÕ SĨ ",3,182,R.drawable.huyen_thoai_vo_si4,18000));
        mangtruyentranh.add(new Truyen_tranh("LÃNH QUỶ HOZUKI NHỊ",4,130,R.drawable.lanh_quy_hozuki5,18000));
        mangtruyentranh.add(new Truyen_tranh("LỜI NÓI DỐI THÁNG TƯ",5,224,R.drawable.loi_noi_doi_thang_tu6,18000));
        mangtruyentranh.add(new Truyen_tranh("LỚP HỌC QUẢN GIA ",6,194,R.drawable.lop_hoc_quan_gia7,18000));
        truyentranhAdapter = new truyentranhAdapter(mangtruyentranh,this,android.R.layout.simple_list_item_1,mangtruyentranh);
        lvtruyentranh.setAdapter(truyentranhAdapter);


    }
}
