package com.example.mr_shareone.mvp.login;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.mr_shareone.mvp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,ILoginView{
    @BindView(R.id.login)
    Button loginBtn;
    @BindView(R.id.name)
    EditText nameEdt;
    @BindView(R.id.password)
    EditText passwordEdt;
    @BindView(R.id.progressbar)
    ProgressBar progressBar;
    @BindView(R.id.loginresult)
    TextView loginResult;

    ILoginPresenter loginPresenter;  //view要唤起presenter的操作
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
        ButterKnife.bind(this);
        loginPresenter = new MyPresenter(this);
    }

    @Override
    @OnClick({R.id.login})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login:
                loginPresenter.doLogin();
                break;
            default:
                break;
        }
    }

    @Override
    public String getName() {
        return nameEdt.getText().toString();
    }

    @Override
    public String getPassword() {
        return passwordEdt.getText().toString();
    }

    @Override
    public void showProgress(boolean b) {
        if(b){
            progressBar.setVisibility(View.VISIBLE);
        }else{
            progressBar.setVisibility(View.GONE);
        }
    }

    @Override
    public Context getContext() {
        return getApplicationContext();
    }

    @Override
    public void showLoginResult(boolean b) {
        loginResult.setText(b?"成功":"失败");
    }
}
