package com.ebookfrenzy.lab03.presentation;

import android.widget.TextView;

import com.ebookfrenzy.lab03.entity.Recipe;
import com.ebookfrenzy.lab03.interfaces.RecipeView;
import com.ebookfrenzy.lab03.repository.RecipeRepository;

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
