package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.wolfsoft.datingapp.R;

import java.util.ArrayList;

import modelclass.Home_Model;


public class Home_Adapter extends RecyclerView.Adapter<Home_Adapter.ViewHolder> {

    Context context;
    ArrayList<Home_Model>home_models;
    boolean showingFirst = false;


    public Home_Adapter(Context context, ArrayList<Home_Model> home_models) {
        this.context = context;
        this.home_models = home_models;
    }

    @NonNull
    @Override
    public Home_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view =  LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final Home_Adapter.ViewHolder holder, int position) {
        holder.heart.setImageResource(home_models.get(position).getHeart());
        holder.imageshose.setImageResource(home_models.get(position).getImageshose());
        holder.discount.setText(home_models.get(position).getDiscount());
         holder.text1.setText(home_models.get(position).getText1());

         holder.heart.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if (showingFirst == true) {
                     holder.heart.setBackgroundResource(R.drawable.ic_like_heart_outline);
                     showingFirst = false;
                 }else {
                     holder.heart.setBackgroundResource(R.drawable.ic_like);
                     showingFirst = true;
                 }
             }
         });



    }

    @Override
    public int getItemCount() {
        return home_models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView heart,imageshose;
        TextView discount,text1;
        public ViewHolder(View itemView) {
            super(itemView);

            heart = itemView.findViewById(R.id.heart);
            imageshose = itemView.findViewById(R.id.imageshose);

            discount = itemView.findViewById(R.id.discount);
            text1 = itemView.findViewById(R.id.text1);
        }
    }
}
