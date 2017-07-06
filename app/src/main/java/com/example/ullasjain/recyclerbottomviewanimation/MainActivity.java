package com.example.ullasjain.recyclerbottomviewanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.ullasjain.recyclerbottomviewanimation.scrollhandling.RecyclerViewScrollAnimationStateHandler;
import com.example.ullasjain.recyclerbottomviewanimation.scrollhandling.RecyclerViewScrollAnimationViewHandler;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        View bottomView = findViewById(R.id.bottom_view);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(dataForAdapter(), this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        /*
         * Just adding this line in your class for the bottom view animation to happen
         */
        new RecyclerViewScrollAnimationStateHandler(recyclerView, new RecyclerViewScrollAnimationViewHandler(bottomView));
    }

    private List<String> dataForAdapter(){
        List<String> stringList = new ArrayList<>();
        stringList.add("United states of America");
        stringList.add("London");
        stringList.add("Isreal");
        stringList.add("Bangladesh");
        stringList.add("Malaysia");
        stringList.add("India");
        stringList.add("Nepal");
        stringList.add("Germany");
        stringList.add("Sudan");
        stringList.add("France");
        stringList.add("SriLanka");
        stringList.add("United kingdom");
        stringList.add("Sweden");
        stringList.add("Bangkok");
        stringList.add("Switzerland");
        stringList.add("Thailand");
        stringList.add("Norway");

        stringList.addAll(stringList);
        stringList.addAll(stringList);

        return stringList;
    }

}
