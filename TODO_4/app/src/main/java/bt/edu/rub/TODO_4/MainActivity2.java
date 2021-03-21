package bt.edu.rub.TODO_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public static final String EXTRA_REPLY = "bt.edu.rub.TODO_4";
    private EditText mReply;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mReply = findViewById(R.id.Edit_text2);
        Intent obj = getIntent();
        String msg = obj.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.text_message);
        textView.setText(msg);

    }

    public void Reply(View view) {
        String reply = mReply.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}