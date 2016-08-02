package com.techiespk.conekt.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.techiespk.conekt.R;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by samar_000 on 6/6/2016.
 */
public class RegistrationFragment extends BaseFragment {

    private Unbinder unbinder;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_registration, container, false);
        unbinder = ButterKnife.bind(this, view);
        initComponents();
        return view;
    }

    private void initComponents() {

    }

    @OnClick(R.id.fragment_reg_btnReg)
    void onRegClick() {
        openFragment(R.id.activity_main_container, new LoginFragment());
    }

    @OnClick(R.id.fragment_reg_tvBack)
    void onBackClick() {
        openFragment(R.id.activity_main_container, new FragmentMain());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
