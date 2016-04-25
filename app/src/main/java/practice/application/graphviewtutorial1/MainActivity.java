package practice.application.graphviewtutorial1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MainActivity extends AppCompatActivity {

    LineGraphSeries<DataPoint> series;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        double y,x;
        x = -5.0;

        GraphView graph = (GraphView) findViewById(R.id.graph1);
        series = new LineGraphSeries<DataPoint>();
        for(int i =0; i<100; i++) {
            x = x + 0.1;
            y = Math.sin(x);
            series.appendData(new DataPoint(x, y), true, 100);
        }
        graph.addSeries(series);
    }


}
