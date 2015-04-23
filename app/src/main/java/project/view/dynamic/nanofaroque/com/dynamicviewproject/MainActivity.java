package project.view.dynamic.nanofaroque.com.dynamicviewproject;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    LinearLayout mainLayout;
    LayoutInflater inflater;
    int[] track=new int[100];
    int clickedPos=-1;
    View[] views=new View[100];
    LinearLayout[] layouts=new LinearLayout[100];
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainLayout=(LinearLayout)findViewById(R.id.main_view);
        inflater = (LayoutInflater)getApplicationContext().getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
        for(int i=0;i<10;i++){
            View view=inflater.inflate(R.layout.questiong,null);//layout for parent
            TextView tv=(TextView)view.findViewById(R.id.ques);//parent title
            tv.setText("Bangladesh");
            ImageView img=(ImageView)view.findViewById(R.id.icon);//parent icon
            view.setTag(i);
            answer=(TextView)view.findViewById(R.id.answer);
            answer.setText("Allstate");
            answer.setVisibility(View.GONE);
            views[i]=view;
            mainLayout.addView(view);
            view.setOnClickListener(this);
        }

    }
/*
    public class MyClickListener implements View.OnClickListener{
        Context mContext;
        int position;
        View mView;
        public MyClickListener(Context context,int pos,View view) {
            this.mContext=context;
            this.position=pos;
            this.mView=view;
        }

        @Override
        public void onClick(View v) {
           if(mView==views[position]){
                if(mView.findViewById(R.id.answer).getVisibility()==View.VISIBLE){
                    mView.findViewById(R.id.answer).setVisibility(View.GONE);
                }
                else {
                    mView.findViewById(R.id.answer).setVisibility(View.VISIBLE);
                }
            }


        }
    }
*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if(v.findViewById(R.id.answer).getVisibility()==View.VISIBLE){
            v.findViewById(R.id.answer).setVisibility(View.GONE);
        }
        else {
            v.findViewById(R.id.answer).setVisibility(View.VISIBLE);
        }
    }
}
