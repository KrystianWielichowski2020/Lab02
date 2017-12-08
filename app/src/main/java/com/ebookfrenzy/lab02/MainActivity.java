package com.ebookfrenzy.lab03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.ebookfrenzy.lab02.R;
import com.ebookfrenzy.lab03.interfaces.RecipeView;
import com.ebookfrenzy.lab03.presentation.RecipePresenter;

public class MainActivity extends AppCompatActivity implements RecipeView{

    RecipePresenter recipePresenter;
    Button refreshButton;
    CheckBox isWithMeatCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recipePresenter = new RecipePresenter();
        TextView recipeTextView = (TextView) findViewById(R.id.recipeTextView);
        recipePresenter.setRecipeTextView(recipeTextView);
        recipePresenter.onAttach(this);

        isWithMeatCheckBox = (CheckBox) findViewById(R.id.isWithMeatCheckBox);
        refreshButton = (Button) findViewById(R.id.refreshButton);
        refreshButton.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                recipePresenter.showRecipes(isWithMeatCheckBox.isChecked());
            }
        });
    }

    protected void onDestroy(){
        super.onDestroy();
        recipePresenter.onDetach();
    }
    @Override
    public void showRecipes(boolean isWithMeat) {

    }
}
