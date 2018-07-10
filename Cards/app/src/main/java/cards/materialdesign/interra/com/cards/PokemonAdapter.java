package cards.materialdesign.interra.com.cards;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.button.MaterialButton;
import android.support.design.card.MaterialCardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder> {

    private Context mContext;
    private List<Pokemon> mList;

    PokemonAdapter (Context mContext, List mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @NonNull
    @Override
    public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.default_material_card_view, parent, false);

        return new PokemonViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final PokemonViewHolder holder, final int position) {


        final Pokemon model = mList.get(position);

        holder.mImage.setImageResource(model.getImage());
        holder.mName.setText(model.getName());
        holder.mType.setText(model.getType());
        holder.mAbility.setText(model.getAbility());


        boolean state = model.getState();
        if(state) {
            holder.mButton.setImageResource(R.drawable.ic_favorite_black_24dp);
        }else {
            holder.mButton.setImageResource(R.drawable.ic_favorite_border_black_24dp);
        }

        holder.mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean state = model.getState();
                if(state) {
                    model.setState(false);
                    holder.mButton.setImageResource(R.drawable.ic_favorite_border_black_24dp);
                }else {
                    model.setState(true);
                    holder.mButton.setImageResource(R.drawable.ic_favorite_black_24dp);
                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


    class PokemonViewHolder extends RecyclerView.ViewHolder {
        ImageView mImage;
        TextView mName, mType, mAbility;
        ImageButton mButton;
        MaterialButton materialButton;



        PokemonViewHolder(View itemView) {
            super(itemView);

            mImage = itemView.findViewById(R.id.pokemonImage);
            mName = itemView.findViewById(R.id.name);
            mType = itemView.findViewById(R.id.type);
            mAbility = itemView.findViewById(R.id.ability);
            mButton = itemView.findViewById(R.id.imageButton);
            materialButton = itemView.findViewById(R.id.textButtonExplore);
        }
    }
}
