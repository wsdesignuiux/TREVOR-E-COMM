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

import modelclass.PromoteModel;

/**
 * Created by wolfsoft4 on 21/8/18.
 */

public class PromoteAdapter extends RecyclerView.Adapter<PromoteAdapter.ViewHolder> {
    Context context;
    private ArrayList<PromoteModel> promoteModelArrayList;
    boolean showingFirst = false;

    public PromoteAdapter(Context context, ArrayList<PromoteModel> promoteModelArrayList) {
        this.context = context;
        this.promoteModelArrayList = promoteModelArrayList;
    }

    @Override
    public PromoteAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_promote,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final PromoteAdapter.ViewHolder holder, int position) {
        holder.i1.setImageResource(promoteModelArrayList.get(position).getI1());
        holder.i1.setImageResource(R.drawable.ic_like_heart_outline);
        holder.i2.setImageResource(promoteModelArrayList.get(position).getI2());
        holder.txtoffer.setText(promoteModelArrayList.get(position).getTxtoffer());
        holder.txtprice.setText(promoteModelArrayList.get(position).getTxtprice());
        holder.txtcutprice.setText(promoteModelArrayList.get(position).getTxtcutprice());
        holder.txtshoes.setText(promoteModelArrayList.get(position).getTxtshoes());


        holder.i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (showingFirst == true) {
                    holder.i1.setBackgroundResource(R.drawable.ic_like_heart_outline);
                    showingFirst = false;
                }else {
                    holder.i1.setBackgroundResource(R.drawable.ic_like);
                    showingFirst = true;
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return promoteModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView i1,i2;
        TextView txtoffer,txtprice,txtcutprice,txtshoes;
        public ViewHolder(View itemView) {
            super(itemView);

            i1=itemView.findViewById(R.id.i1);
            i2=itemView.findViewById(R.id.i2);
            txtoffer=itemView.findViewById(R.id.txtoffer);
            txtprice=itemView.findViewById(R.id.txtprice);
            txtcutprice=itemView.findViewById(R.id.txtcutprice);
            txtshoes=itemView.findViewById(R.id.txtshoes);


        }
    }
}
