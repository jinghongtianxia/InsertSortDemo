package com.example.insertsortdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int[] unsorted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mainButton = (Button) findViewById(R.id.main_button);
        mainButton.setOnClickListener(this);
        unsorted = new int[]{45, 12, 644, 138, 13, 1, 35, 69, 5, 40};
    }

    @Override
    public void onClick(View v) {
//        sortArray(unsorted);
        unsortedArray(unsorted);
//        System.out.println("已排列数组：" + Arrays.toString(unsorted));
    }

    public void sortArray(int[] array) {
        if (array.length <= 1) {
            System.out.println(Arrays.toString(array));
        } else {
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int j = i;
                    int key = array[i];

                    while (j > 0 && array[j - 1] > array[i]) {
                        array[j] = array[j - 1];
                        j--;
                    }
                    array[j] = key;
                }
            }
        }
    }

    public void sortUnsorted(int[] array) {
        if (array.length <= 1) {
            System.out.println(Arrays.toString(array));
        } else {
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int j = i;
                    int key = array[i];
                    while (j > 0 && array[j - 1] > key) {
                        array[j] = array[j - 1];
                        j--;
                    }
                    array[j] = key;
                }
            }
        }
    }

    public void unsortedArray(int[] array) {
        int i = 1;
        if (array.length <= 1) {
            System.out.println(Arrays.toString(array));
        } else {
//            for (int i = 1; i < array.length; i++) {
//                while (array[i-1]>array[i]) {
//                    int key = array[i];
//                    array[i]=array[i-1];
//                    array[i-1]=key;
//
//                }
//            }

            //{45, 12, 644, 138, 13, 1, 35, 69, 5, 40}
            while (array[i - 1] > array[i]) {
                int key = array[i];
                array[i] = array[i - 1];
                array[i - 1] = key;
                ++i;
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
