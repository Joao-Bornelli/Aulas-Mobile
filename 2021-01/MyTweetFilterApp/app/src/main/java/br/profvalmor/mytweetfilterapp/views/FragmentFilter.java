package br.profvalmor.mytweetfilterapp.views;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import br.profvalmor.mytweetfilterapp.R;
import br.profvalmor.mytweetfilterapp.model.Authenticator;
import br.profvalmor.mytweetfilterapp.model.connection.RequestManager;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class FragmentFilter extends Fragment {

    public FragmentFilter() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_filter, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @org.jetbrains.annotations.NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btReport = view.findViewById(R.id.btReport);
        btReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ((MainActivity)getActivity()).navegar(FragmentTweets.class.getSimpleName());
                MainActivity.twitterManager.getAuthenticator().requestTweets();
            }
        });
    }
}