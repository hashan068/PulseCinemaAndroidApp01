package com.example.pulsecinemaandroidapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import com.example.pulsecinemaandroidapp.R;
import com.example.pulsecinemaandroidapp.model.Seat;

import java.util.List;
// IM/2020/048-Sudeera
public class SeatAdapter extends BaseAdapter {

    private final List<Seat> seatList;
    private final Context context;

    public SeatAdapter(Context context, List<Seat> seatList) {
        this.context = context;
        this.seatList = seatList;
    }

    @Override
    public int getCount() {
        return seatList.size();
    }

    @Override
    public Object getItem(int position) {
        return seatList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SeatItemViewHolder holder;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.item_seat, parent, false);
            holder = new SeatItemViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (SeatItemViewHolder) convertView.getTag();
        }

        final Seat currentSeat = seatList.get(position);

        holder.button.setText(String.valueOf(currentSeat.getSeatNumber()));
        holder.button.setSelected(currentSeat.isSelected());

        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentSeat.setSelected(!currentSeat.isSelected());
                notifyDataSetChanged();
            }
        });

        return convertView;
    }

    private static class SeatItemViewHolder {
        Button button;

        SeatItemViewHolder(View view) {
            button = view.findViewById(R.id.seatButton);
        }
    }
}
