package cards.materialdesign.interra.com.cards;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class CardDefault extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Pokemon> pokemonList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_default);



        recyclerView = findViewById(R.id.recyclerView);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);



        pokemonList = new ArrayList<>();
        Pokemon poki = new Pokemon("Pikachu", "Electric", "Static", R.drawable.pikachu);
        pokemonList.add(poki);
        poki = new Pokemon("Squirtle", "Water", "Torrent", R.drawable.squirtle);
        pokemonList.add(poki);
        poki = new Pokemon("Charmander", "Fire", "Blaze", R.drawable.charmander);
        pokemonList.add(poki);
        poki = new Pokemon("Bulbasaur", "Grass,\nPoison", "Overgrow", R.drawable.bulbasaur);
        pokemonList.add(poki);
        poki = new Pokemon("Butterfree", "Bug,\nFlying", "Compound\nEyes", R.drawable.butterfree);
        pokemonList.add(poki);
        poki = new Pokemon("Pidgey", "Normal,\nFlying", "Keen\nEye", R.drawable.pidgey);
        pokemonList.add(poki);
        poki = new Pokemon("Rattata", "Normal", "Run\nAway", R.drawable.rattata);
        pokemonList.add(poki);
        poki = new Pokemon("Jigglypuff", "Normal,\nFairy", "Cute\nCharm", R.drawable.jigglypuff);
        pokemonList.add(poki);
        poki = new Pokemon("Oddish", "Grass\nPoison", "Chlorophyll", R.drawable.oddish);
        pokemonList.add(poki);
        poki = new Pokemon("Meowth", "Normal", "Pickup\nTechnician", R.drawable.meowth);
        pokemonList.add(poki);
        poki = new Pokemon("Cubone", "Ground", "Rocking\nHead", R.drawable.cubone);
        pokemonList.add(poki);
        poki = new Pokemon("Lickitung", "Normal", "Oblivious", R.drawable.lickitung);
        pokemonList.add(poki);
        poki = new Pokemon("Koffing", "Poison", "Levitate", R.drawable.koffing);
        pokemonList.add(poki);
        poki = new Pokemon("Mr. Mime", "Psychic,\nFairy", "Sound\nproof", R.drawable.mr_mime);
        pokemonList.add(poki);
        poki = new Pokemon("Snorlax", "Normal", "Thick\nFat", R.drawable.snorlax);
        pokemonList.add(poki);
        poki = new Pokemon("Togepi", "Fairy", "Serene\nGrace", R.drawable.togepi);
        pokemonList.add(poki);
        poki = new Pokemon("Sunflora", "Grass", "Chlorophyll\n", R.drawable.sunflora);
        pokemonList.add(poki);
        poki = new Pokemon("Quagsire", "Water,\nGround", "Damp", R.drawable.quagsire);
        pokemonList.add(poki);
        poki = new Pokemon("Grimer", "Poison", "Stench", R.drawable.grimer);
        pokemonList.add(poki);
        poki = new Pokemon("Seel", "Water", "Thick\nFat", R.drawable.seel);
        pokemonList.add(poki);


        PokemonAdapter pokiAdapter = new PokemonAdapter(getParent(), pokemonList);
        recyclerView.setAdapter(pokiAdapter);



    }

}
