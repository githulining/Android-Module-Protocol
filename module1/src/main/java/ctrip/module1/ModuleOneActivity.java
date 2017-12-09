package ctrip.module1;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import ctrip.business.event.EventBus;
import ctrip.business.M;

public class ModuleOneActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        TextView one = (TextView) findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventBus.turn2Acitivity(ModuleOneActivity.this, M.MODULE2_PAY);
            }
        });
    }
}
