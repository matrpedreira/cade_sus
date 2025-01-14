package cadesus.co.cadesus.Cells;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import cadesus.co.cadesus.R;

/**
 * Created by fraps on 7/12/16.
 */
public class RemedioViewHolder extends RecyclerView.ViewHolder {

    private TextView    mName;
    private TextView    mQuantidade;
    private ImageView   mEdit;

    public RemedioViewHolder(View itemView) {
        super(itemView);
        prepateView(itemView);
    }

    private void prepateView(View v)
    {
        mName = (TextView)v.findViewById(R.id.cell_remedio_nome);
        mQuantidade = (TextView)v.findViewById(R.id.cell_remedio_quantidade);
        mEdit = (ImageView) v.findViewById(R.id.cell_remedio_edit);
    }
}
