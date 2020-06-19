package com.example.dyplome.activityes.ui.main;

import android.content.Context;
import android.widget.Button;
import android.widget.EditText;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.example.dyplome.db.DataBaseHelper;
import com.example.dyplome.db.DbCreator;

public class PageViewModel extends ViewModel {

//    Context context;

    public PageViewModel(/*Context context*/) {
//        this.context = context;
    }

    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {
//            DbCreator creator = new DbCreator(DataBaseHelper.getInstance(context).getWritableDatabase());
            return "Hello world from section: " + input;
//            return creator.getResources(input).toString();
        }
    });

    public void  setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getStoredResources() {
        return mText;
    }
}