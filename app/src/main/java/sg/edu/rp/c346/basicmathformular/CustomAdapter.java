package sg.edu.rp.c346.basicmathformular;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16039013 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<fomulaList> formulaList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<fomulaList> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        formulaList = objects;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rowView;
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(layout_id, parent, false);

        }
        else {
            rowView = convertView;
        }
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvFormula = rowView.findViewById(R.id.textViewFormula);
        TextView tvType = rowView.findViewById(R.id.textViewType);

        fomulaList currentItem = formulaList.get(position);

        String title = currentItem.getTitle();
        String formular = currentItem.getFormula();
        String type = currentItem.getType();

        tvTitle.setText(title);
        tvFormula.setText(formular);
        tvType.setText(type);

        return rowView;

    }
}
