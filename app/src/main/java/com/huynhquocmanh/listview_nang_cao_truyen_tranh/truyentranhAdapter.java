package com.huynhquocmanh.listview_nang_cao_truyen_tranh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class truyentranhAdapter extends BaseAdapter {
    int vitri = -1;
    ArrayList<Truyen_tranh> mangtruyentranh;
    Context context;

    //bắt sự kiện mỗi view trong item thì viết trong adapter
    public truyentranhAdapter(ArrayList<Truyen_tranh> mangtruyentranh, Context context, int simple_list_item_1, ArrayList<Truyen_tranh> truyen_tranhs) {
        this.mangtruyentranh = mangtruyentranh;
        this.context = context;
    }

    @Override
    public int getCount() {
        return mangtruyentranh.size();
    }

    @Override
    public Object getItem(int position) {
        return mangtruyentranh.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    //kiểm tra nếu view được khởi tạo rồi chỉ cần gắn dữ liệu lên thôi
    class Holder {
        TextView txttentruyen;
        TextView txtgiaban;
        TextView txtsotrang;
        ImageView imghinhanh;
        Button btnxoa;

    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        //đỡ tốn bộ nhớ và chạy nhanh hơn
        Holder holder = null;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.dong_truyen_tranh, null);
            holder = new Holder();
            holder.txttentruyen = convertView.findViewById(R.id.textviewten);
            holder.txtgiaban = convertView.findViewById(R.id.textviewgia);
            holder.txtsotrang = convertView.findViewById(R.id.textviewsotrang);
            holder.imghinhanh = convertView.findViewById(R.id.imagetruyentranh);
            holder.btnxoa = convertView.findViewById(R.id.Buttonxoa);
            convertView.setTag(holder);
        //lưu và lấy dữ liệu khi đang key vad veliu
        } else {
            holder = (Holder) convertView.getTag();
        }
        final Truyen_tranh truyentranh = mangtruyentranh.get(position);
        holder.txttentruyen.setText(truyentranh.getTentruyen());
        holder.txtgiaban.setText("Giá Bán: " + truyentranh.giaban + " VND");
        holder.txtsotrang.setText("Số trang" + truyentranh.getSotrang());
        holder.imghinhanh.setImageResource(truyentranh.getHinhanh());
        holder.btnxoa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //   dữ liẹu trên  server (dùng để cập nhật) (từ 1-n)
                // mangtruyentranh.remove(mangtruyentranh.get(position).getId());
                //duoi dang local (bắt đầu từ 0-n)
                mangtruyentranh.remove(position);
                notifyDataSetChanged();
            }
        });
        return convertView;
    }
}