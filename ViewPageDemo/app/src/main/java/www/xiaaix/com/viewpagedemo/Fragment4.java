package www.xiaaix.com.viewpagedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Monster on 2016/2/20 0020.
 */
public class Fragment4 extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.view4,container,false);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Main", "我销毁了");
    }
}
