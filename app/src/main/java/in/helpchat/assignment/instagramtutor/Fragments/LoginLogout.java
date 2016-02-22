package in.helpchat.assignment.instagramtutor.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import in.helpchat.assignment.instagramtutor.Activity.MainActivity;
import in.helpchat.assignment.instagramtutor.Data.InstagramSession;
import in.helpchat.assignment.instagramtutor.R;

/**
 * Created by admin on 19/02/16.
 */
public class LoginLogout extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login_button_view, container, false);
        Button loginButton=(Button) view.findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Fragment fragment = new InstagramLogin();
                fragment.setArguments(null);
                ((MainActivity)getActivity()).switchContent(R.id.activity_main, fragment);
            }
        });
        return view;
    }
}
