package sg.edu.rp.c346.basicmathformular;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMath;
    ArrayList<fomulaList> alFormula;
    CustomAdapter caFormula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMath = findViewById(R.id.listViewFormular);
        alFormula = new ArrayList<>();

        fomulaList list1 = new fomulaList("Area of rectangle","Length x Length", "Formula type is: Area");
        fomulaList list2 = new fomulaList("Area of triangle","(Length of base x Length)/2","Formula type is: Area");
        fomulaList list3 = new fomulaList("Volume of cube","Length x Length x Length","Formula type is: Volume");

        alFormula.add(list1);
        alFormula.add(list2);
        alFormula.add(list3);

        caFormula = new CustomAdapter(this, R.layout.math_list,alFormula);
        lvMath.setAdapter(caFormula);

    }
}
