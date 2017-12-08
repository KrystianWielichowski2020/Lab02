package com.ebookfrenzy.lab02.presentation;

import android.os.Bundle;
import android.widget.TextView;

import com.ebookfrenzy.lab02.R;
import com.ebookfrenzy.lab02.entity.Recipe;
import com.ebookfrenzy.lab02.interfaces.RecipeView;
import com.ebookfrenzy.lab02.repository.RecipeRepository;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Krystian on 03.12.2017.
 */

public class RecipePresenter implements RecipeView {

    RecipeView recipeView;
    RecipeRepository recipeRepository;
    TextView recipeTextView;


    public RecipePresenter() {
        recipeRepository = new RecipeRepository();
    }


    public void onAttach(RecipeView recipeView){
        this.recipeView = recipeView;
    }
    public void onDetach(){
        recipeView = null;
    }
    public void setRecipeTextView(TextView recipeTextView){
        this.recipeTextView = recipeTextView;
    }

    @Override
    public void showRecipes(boolean isWithMeat) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<recipeRepository.size(); i++){
            Recipe recipe = recipeRepository.get(i);
            if(recipe.isWithMeat() == isWithMeat){
                sb.append(recipe + "\n");
            }
        }

        recipeTextView.setText(sb.toString());

    }
}
