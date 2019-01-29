package trawinore.codexonic.com.tour;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login_screen extends AppCompatActivity {
    EditText userName, userPassword;
    Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        userName = findViewById(R.id.editText1);
        userPassword = findViewById(R.id.editText2);
        signIn = findViewById(R.id.signIn);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = userName.getText().toString().trim();
                String password = userPassword.getText().toString().trim();
                if (checkUserName(username) && checkPassword(password) == true) {
                    addNotification();
                    intentnew();
                }
            }
        });
    }

    private boolean checkUserName(String username) {
        if (TextUtils.isEmpty(username)) {
            userName.setError(getString(R.string.login_screen_username));
            return false;
        }
        return true;
    }

    private boolean checkPassword(String password) {
        if (TextUtils.isEmpty(password)) {
            userPassword.setError(getString(R.string.login_screen_password));
            return false;
        } else if (password.length() < 6) {
            userPassword.setError(getString(R.string.login_screen_password_length));
            return false;
        }
        return true;
    }

    private void addNotification() {
        int notId = 0;
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.icon)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.icon))
                .setContentTitle(getString(R.string.login_screen_NotificationTitle))
                .setContentText(getString(R.string.login_screen_NotificationText))
                .setAutoCancel(true)
                .setDefaults(NotificationCompat.DEFAULT_ALL);

        Uri path = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        builder.setSound(path);

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(notId, builder.build());
    }

    private void intentnew() {
        Intent intent_home_screen = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent_home_screen);
        this.finish();
    }
}
