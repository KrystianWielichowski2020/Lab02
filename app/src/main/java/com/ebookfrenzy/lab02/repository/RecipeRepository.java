package com.ebookfrenzy.lab02.repository;

import com.ebookfrenzy.lab02.entity.Recipe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stud on 11/26/2017.
 */

public class RecipeRepository {
    private List<Recipe> recipesList;

    public RecipeRepository() {
        recipesList = new ArrayList<Recipe>();
        createSampleData();
    }

    public List<Recipe> getRecipesList() {
        return recipesList;
    }

    private void createSampleData(){
        recipesList.add(new Recipe("Pierogi ruskie", "jakis tam", false));
        recipesList.add(new Recipe("Pierogi z jagodami", "jakis tam", false));
        recipesList.add(new Recipe("Pierogi z serem", "jakis tam", false));
        recipesList.add(new Recipe("Pierogi z miesem", "jakis tam", true));
        recipesList.add(new Recipe("Kotlet schbowy", "jakis tam", true));
        recipesList.add(new Recipe("Kotlet mielony", "jakis tam", true));
    }
    public int size(){
        return recipesList.size();
    }

    public Recipe get(int i){
        return recipesList.get(i);
    }
}
