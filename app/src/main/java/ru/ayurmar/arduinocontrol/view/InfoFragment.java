package ru.ayurmar.arduinocontrol.view;


import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import ru.ayurmar.arduinocontrol.R;

public class InfoFragment extends DialogFragment{

    @Override
    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        super.onCreateDialog(savedInstanceState);
        View v = LayoutInflater.from(getActivity())
                .inflate(R.layout.dialog_info, null);
        Button okButton = v.findViewById(R.id.info_ok_button);
        okButton.setOnClickListener(view -> dismiss());

        return new AlertDialog.Builder(getActivity())
                .setView(v)
                .create();
    }
}
