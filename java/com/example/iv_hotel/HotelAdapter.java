package com.example.iv_hotel;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.iv_hotel.Hotel;
import com.example.iv_hotel.R;

import java.util.ArrayList;
import java.util.List;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.HotelViewHolder> implements Filterable {

    private List<Hotel> hotelList;
    private List<Hotel> hotelListFull;
    private Context context;

    public HotelAdapter(Context context, List<Hotel> hotelList) {
        this.context = context;
        this.hotelList = hotelList;
        this.hotelListFull = new ArrayList<>(hotelList);
    }

    @NonNull
    @Override
    public HotelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.hotel_item, parent, false);
        return new HotelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelViewHolder holder, int position) {
        Hotel hotel = hotelList.get(position);
        holder.name.setText(hotel.getName());
        holder.rating.setText(String.valueOf(hotel.getRating()));
        holder.description.setText(hotel.getDescription());
        holder.price.setText(hotel.getPrice());
        Glide.with(context).load(hotel.getImageUrl()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return hotelList.size();
    }

    @Override
    public Filter getFilter() {
        return hotelFilter;
    }

    private final Filter hotelFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<Hotel> filteredList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(hotelListFull);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (Hotel hotel : hotelListFull) {
                    if (hotel.getName().toLowerCase().contains(filterPattern)) {
                        filteredList.add(hotel);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            hotelList.clear();
            hotelList.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };

    static class HotelViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name, rating, description, price;
        Button bookNow;

        public HotelViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.hotelImage);
            name = itemView.findViewById(R.id.hotelName);
            rating = itemView.findViewById(R.id.hotelRating);
            description = itemView.findViewById(R.id.hotelDescription);
            price = itemView.findViewById(R.id.hotelPrice);
            bookNow = itemView.findViewById(R.id.bookButton);
        }
    }
}
