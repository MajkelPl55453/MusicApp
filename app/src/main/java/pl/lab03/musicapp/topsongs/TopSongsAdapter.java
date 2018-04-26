package pl.lab03.musicapp.topsongs;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import pl.lab03.musicapp.R;
import pl.lab03.musicapp.api.TrendingList;
import pl.lab03.musicapp.api.TrendingSingle;

/**
 * Created by Majkel on 2018-04-26.
 */

public class TopSongsAdapter extends RecyclerView.Adapter<TopSongsAdapter.TopSongsViewHolder> {
    private List<TrendingSingle> trending;

    public TopSongsAdapter(List<TrendingSingle> trending){
        this.trending = trending;
    }

    @Override
    public TopSongsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_top_songs, parent, false);

        return new TopSongsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TopSongsViewHolder holder, int position) {
        TrendingSingle trendingSingle = trending.get(position);

        holder.tvPlace.setText(String.valueOf(trendingSingle.intChartPlace));
        holder.tvTrack.setText(trendingSingle.strTrack);
        holder.tvArtist.setText(trendingSingle.strArtist);
        holder.tvAlbum.setText(trendingSingle.strAlbum);
    }

    @Override
    public int getItemCount() {
        return this.trending != null ? this.trending.size() : 0;
    }

    public class TopSongsViewHolder extends RecyclerView.ViewHolder{
        TextView tvPlace;
        TextView tvTrack;
        TextView tvArtist;
        TextView tvAlbum;
        public TopSongsViewHolder(View itemView) {
            super(itemView);

            tvPlace = itemView.findViewById(R.id.tvPlace);
            tvTrack = itemView.findViewById(R.id.tvTrack);
            tvArtist = itemView.findViewById(R.id.tvArtist);
            tvAlbum = itemView.findViewById(R.id.tvAlbum);
        }
    }
}