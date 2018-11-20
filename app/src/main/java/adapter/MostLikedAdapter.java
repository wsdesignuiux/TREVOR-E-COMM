package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wolfsoft.datingapp.R;

import java.util.ArrayList;

import modelclass.MostLikedModel;

/**
 * Created by wolfsoft4 on 22/8/18.
 */

public class MostLikedAdapter extends RecyclerView.Adapter<MostLikedAdapter.ViewHolder>{
    Context context;
    private ArrayList<MostLikedModel> mostLikedModelArrayList;
    boolean showingFirst = false;


    public MostLikedAdapter(Context context, ArrayList<MostLikedModel> mostLikedModelArrayList) {
        this.context = context;
        this.mostLikedModelArrayList = mostLikedModelArrayList;
    }

    @Override
    public MostLikedAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mostliked,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MostLikedAdapter.ViewHolder holder, int position) {
        holder.image1.setImageResource(mostLikedModelArrayList.get(position).getImage1());
        holder.image2.setImageResource(mostLikedModelArrayList.get(position).getImage2());
        holder.textoffer.setText(mostLikedModelArrayList.get(position).getTextoffer());
        holder.textprice.setText(mostLikedModelArrayList.get(position).getTextprice());
        holder.textshoes.setText(mostLikedModelArrayList.get(position).getTextshoes());

        holder.image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (showingFirst == true) {
                    holder.image1.setBackgroundResource(R.drawable.ic_like_heart_outline);
                    showingFirst = false;
                }else {
                    holder.image1.setBackgroundResource(R.drawable.ic_like);
                    showingFirst = true;
                }
            }
        });



    }

    @Override
    public int getItemCount() {
        return mostLikedModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image1,image2;
        TextView textoffer,textprice,textshoes;

        public ViewHolder(View itemView) {
            super(itemView);

            image1=itemView.findViewById(R.id.image1);
            image2=itemView.findViewById(R.id.image2);
            textoffer=itemView.findViewById(R.id.textoffer);
            textprice=itemView.findViewById(R.id.textprice);
            textshoes=itemView.findViewById(R.id.textshoes);






        }
    }



}
